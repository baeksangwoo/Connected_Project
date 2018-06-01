package cronjob;

public class paging {
	  private final static int pageSize = 4; //4���� �����ٰ��̴�.
	  private final static int pageGroupSize = 3; //3���� ���ڴ�.
	  String pageNum = request.getParameter("pageNum"); //���� ���� ������ ��ȣ
	  if (pageNum == null) {
	        pageNum = "1"; //1���� ����
	   }  
	  int currentPage = Integer.parseInt(pageNum);
	  int startRow = (currentPage - 1) * pageSize + 1;//�� �������� ���۱� ��ȣ ���
	  int endRow = currentPage * pageSize;//�� �������� ������ �۹�ȣ 
	  int count = 0;
	  int number=0;
	  ArrayList articleList = new ArrayList();
	  BoardDAO dbPro = BoardDAO.getInstance();//DB����
	  count = dbPro.getTotalCnt();//��ü ���� ��
	  if (count > 0) {        
	                 if(endRow>count)
	                         endRow = count;
	              articleList = dbPro.select(startRow,endRow);//���� �������� �ش��ϴ� �� ���  
	        } else {
	            articleList = null;
	        }   
	  number=count-(currentPage-1)*pageSize;//�۸�Ͽ� ǥ���� �۹�ȣ         
	                //�������׷��� ���� 
	               //ex) pageGroupSize�� 3�� ��� '[1][2][3]'�� pageGroupCount �� ��ŭ �ִ�.  
	                 int pageGroupCount = count/(pageSize*pageGroupSize)+( count % (pageSize*pageGroupSize) == 0 ? 0 : 1);
	                  //������ �׷� ��ȣ 
	                   //ex) pageGroupSize�� 3�� ���  '[1][2][3]'�� �������׷��ȣ�� 1 �̰�  '[2][3][4]'�� �������׷��ȣ�� 2 �̴�.
	                int numPageGroup = (int) Math.ceil((double)currentPage/pageGroupSize);

	            //�ش� �信�� ����� �Ӽ�
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
	       
	           return "./list.jsp";//�ش� ��

	  [ JSP �κ� ]
			  
	  <c:if test="${count > 0}">
	     <c:set var="pageCount" value="${count / pageSize + ( count % pageSize == 0 ? 0 : 1)}"/>
	     <c:set var="startPage" value="${pageGroupSize*(numPageGroup-1)+1}"/>
	     <c:set var="endPage" value="${startPage + pageGroupSize-1}"/>
	     
	     <c:if test="${endPage > pageCount}" >
	       <c:set var="endPage" value="${pageCount}" />
	     </c:if>
	            
	     <c:if test="${numPageGroup > 1}">
	          <a href="./list.do?pageNum=${(numPageGroup-2)*pageGroupSize+1 }">[����]</a>
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
	          <a href="./list.do?pageNum=${numPageGroup*pageGroupSize+1}">[����]</a>
	     </c:if>
	  </c:if>

}
