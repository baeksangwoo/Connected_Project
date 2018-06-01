package cronjob;

public class paging {
	  private final static int pageSize = 4; //4개씩 보여줄것이다.
	  private final static int pageGroupSize = 3; //3개씩 묶겠다.
	  String pageNum = request.getParameter("pageNum"); //지금 현재 페이지 번호
	  if (pageNum == null) {
	        pageNum = "1"; //1부터 시작
	   }  
	  int currentPage = Integer.parseInt(pageNum);
	  int startRow = (currentPage - 1) * pageSize + 1;//한 페이지의 시작글 번호 계산
	  int endRow = currentPage * pageSize;//한 페이지의 마지막 글번호 
	  int count = 0;
	  int number=0;
	  ArrayList articleList = new ArrayList();
	  BoardDAO dbPro = BoardDAO.getInstance();//DB연동
	  count = dbPro.getTotalCnt();//전체 글의 수
	  if (count > 0) {        
	                 if(endRow>count)
	                         endRow = count;
	              articleList = dbPro.select(startRow,endRow);//현재 페이지에 해당하는 글 목록  
	        } else {
	            articleList = null;
	        }   
	  number=count-(currentPage-1)*pageSize;//글목록에 표시할 글번호         
	                //페이지그룹의 갯수 
	               //ex) pageGroupSize가 3일 경우 '[1][2][3]'가 pageGroupCount 개 만큼 있다.  
	                 int pageGroupCount = count/(pageSize*pageGroupSize)+( count % (pageSize*pageGroupSize) == 0 ? 0 : 1);
	                  //페이지 그룹 번호 
	                   //ex) pageGroupSize가 3일 경우  '[1][2][3]'의 페이지그룹번호는 1 이고  '[2][3][4]'의 페이지그룹번호는 2 이다.
	                int numPageGroup = (int) Math.ceil((double)currentPage/pageGroupSize);

	            //해당 뷰에서 사용할 속성
	         request.setAttribute("currentPage", new Integer(currentPage));
	         request.setAttribute("startRow", new Integer(startRow));
	        request.setAttribute("endRow", new Integer(endRow));
	       request.setAttribute("count", new Integer(count));
	       request.setAttribute("pageSize", new Integer(pageSize));

	       request.setAttribute("number", new Integer(number));
	       request.setAttribute("pageGroupSize", new Integer(pageGroupSize));
	       request.setAttribute("numPageGroup", new Integer(numPageGroup));
	         request.setAttribute("pageGroupCount", new Integer(pageGroupCount));
	        request.setAttribute("articleList", articleList);
	       
	           return "./list.jsp";//해당 뷰

	  [ JSP 부분 ]
			  
	  <c:if test="${count > 0}">
	     <c:set var="pageCount" value="${count / pageSize + ( count % pageSize == 0 ? 0 : 1)}"/>
	     <c:set var="startPage" value="${pageGroupSize*(numPageGroup-1)+1}"/>
	     <c:set var="endPage" value="${startPage + pageGroupSize-1}"/>
	     
	     <c:if test="${endPage > pageCount}" >
	       <c:set var="endPage" value="${pageCount}" />
	     </c:if>
	            
	     <c:if test="${numPageGroup > 1}">
	          <a href="./list.do?pageNum=${(numPageGroup-2)*pageGroupSize+1 }">[이전]</a>
	     </c:if>


	     <c:forEach var="i" begin="${startPage}" end="${endPage}">
	         <a href="list.do?pageNum=${i}">[
	          <font color="#000000" />
	            <c:if test="${currentPage == i}">
	            <font color="#bbbbbb" />
	          </c:if>
	          ${i}
	         </font>]
	         </a>
	     </c:forEach>

	     <c:if test="${numPageGroup < pageGroupCount}">
	          <a href="./list.do?pageNum=${numPageGroup*pageGroupSize+1}">[다음]</a>
	     </c:if>
	  </c:if>

}
