package cn.jast.mybatis.pagination.domain;

public class PageRequest {
    /**
     * 页号
     */
    private long pageNumber;
    /**
     * 每页大小
     */
    private long pageSize;

    public long getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(long pageNumber) {
        this.pageNumber = pageNumber;
    }

    public long getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public long getOffset() {
        /**
         *  第1页，每页15条：offset=0
         *  第2页，每页15条：offset=15
         *  第3页，每页15条：offset=30
         */
        return (pageNumber-1) * pageSize;
    }
}
