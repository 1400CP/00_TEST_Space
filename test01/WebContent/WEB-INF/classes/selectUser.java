import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.kh.test.user.model.vo.User;

/**
 * Servlet implementation class selectUser
 */
@WebServlet("/selectUser")
public class selectUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public selectUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    
// 1. index에서 form action="/select" 가 아닌,
// form action="/selectUser" method="get" 을 입력해야 한다.
// 2. UserService userService = new UserService(); 에서
//    UserService 라는 클래스?? 메소드??가 없다 아무리 찾아봐도.
//    User인듯?
//    Controller에서 DB의 자료를 새로 가져오기 위함.
//    User userService = new() User;
// 3. <input type="text" placeholder="회원 번호 입력">
//    <input type="number" placeholder="회원 번호 입력">
// 4. int userNo = request.getParameter("userNo");
//    int userNo = Integer.parseInt(request.getParameter("userNo"));
    

	public class SelectUserServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
//	이게 무슨 의미일까??

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int userNo = Integer.parseInt(request.getParameter("userNo"));

//		UserService userService = new UserService();

//		User user userService.selectUser(userNo);

		request.setAttribute("UserNo", userNo);

		RequestDispatcher rd = null;

			if(userNo == 0) {
				rd = request.getRequestDispatcher("views/searchFail.jsp");
			}else {
				rd = request.getRequestDispatcher("views/searchSuccess.jsp");
			}
		}
//	}​
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
