package open.source.paging;

public class Paging {
	private int page = 1;
	private int countPerPage = 10;
	
	public Paging(int page, int countPerPage) {
		super();
		this.page = page;
		this.countPerPage = countPerPage;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getCountPerPage() {
		return countPerPage;
	}

	public void setCountPerPage(int countPerPage) {
		this.countPerPage = countPerPage;
	}

	/**
	 * start 값을 반환한다.
	 * @return
	 */
	public int getStartIndex() {
		if (getPage() == 1) {
			return 0;
		}
		
		return (getPage() - 1 ) * getCountPerPage();  
	}
	
	/**
	 * end 값을 반환한다.
	 * @return
	 */
	public int getEndIndex() {
		if (getPage() <= 1) {
			return getCountPerPage();
		}
		
		return getPage() * getCountPerPage();  
	}
}
