package open.source.paging;

public class PageNavigator {
	private Paging paging;
	private boolean previous = false;
	private int previousLastPage = 0;
	private boolean next = false;
	private int nextFirstPage;
	private int totalPageCount;
	private int beginPage;
	private int endPage;

	public PageNavigator(Paging paging, int totalCount, int pageItemCountOfPageNavigator) {
		super();
		this.paging = paging;

		if (totalCount % paging.getCountPerPage() > 0) {
			totalPageCount = totalCount / paging.getCountPerPage() + 1;
		} else {
			totalPageCount = totalCount / paging.getCountPerPage();
		}

		previousLastPage = (int)Math.floor((paging.getPage() - 1) / (float)pageItemCountOfPageNavigator)
			* pageItemCountOfPageNavigator;
		if (previousLastPage > 0) {
			previous = true;
		}

		nextFirstPage = previousLastPage + pageItemCountOfPageNavigator + 1;
		if (nextFirstPage <= totalPageCount) {
			next = true;
		}

		beginPage = previousLastPage + 1;
		endPage = previousLastPage + pageItemCountOfPageNavigator;
		if (endPage > totalPageCount) {
			endPage = totalPageCount;
		}
	}

	public Paging getPaging() {
		return paging;
	}

	public boolean isPrevious() {
		return previous;
	}

	public int getPreviousLastPage() {
		return previousLastPage;
	}

	public boolean isNext() {
		return next;
	}

	public int getNextFirstPage() {
		return nextFirstPage;
	}

	public int getTotalPageCount() {
		return totalPageCount;
	}

	public int getBeginPage() {
		return beginPage;
	}

	public int getEndPage() {
		return endPage;
	}

}
