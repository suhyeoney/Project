package edu.spring.project.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.spring.project.domain.Member;
import edu.spring.project.service.MemberService;

@Controller
@RequestMapping(value = "/member")
public class MemberController {
	private static final Logger logger =
			LoggerFactory.getLogger(MemberController.class);
	
	@Autowired private MemberService memberService;
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public void register() {
		logger.info("register() 호출");
		
	} // end register()

	@RequestMapping(value = "/checkUserid",
			method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Boolean> checkUserid(String userid) {
		logger.info("checkUserid(userid: {})", userid);
		Member m = memberService.read(userid);
		Boolean result = null;
		if (m == null) {
			result = true; // 사용할 수 있는 아이디
		} else {
			result = false; // 사용할 수 없는 아이디
		}
		
		ResponseEntity<Boolean> entity =
				new ResponseEntity<Boolean>(result, HttpStatus.OK);
		
		return entity;
	} // end checkUserid()
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(Member member, RedirectAttributes attr) {
		logger.info("register(userid: {}, pwd: {})",
				member.getId(), member.getPassword());
		int result = memberService.create(member);
		if (result == 1) { // 회원 가입 성공
			attr.addFlashAttribute("registerResult", "success");
		}
		
		return "redirect:/";
	} // end register(member)
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public void login(String target, Model model) {
		logger.info("login(target: {}) 호출", target);
		model.addAttribute("targetUrl", target);
	} // end login()
	
	@RequestMapping(value = "/login-post", 
			method = RequestMethod.POST)
	public void login(Member member, Model model) {
		logger.info("login(userid: {}, pwd: {})",
				member.getId(), member.getPassword());
		Member loginResult = memberService.read(member);
		model.addAttribute("loginResult", loginResult);
		// loginResult가 null인지 아닌지를 체크해서
		// null이 아니면 session에 로그인 정보를 저장하고 target으로 redirect
		// -> 콘트롤러에서 직접 담당하지 않고, LoginInterceptor에서 담당하도록
	
	} // end login(member)
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		logger.info("logout() 호출");
		session.removeAttribute("loginId");
		session.invalidate();
		
		return "redirect:/member/login";
	} // end logout()
	
} // end class MemberController

















