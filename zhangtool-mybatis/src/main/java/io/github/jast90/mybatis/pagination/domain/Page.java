package io.github.jast90.mybatis.pagination.domain;

import java.util.List;

public class Page<T> {
    private long total;
    private List<T> content;
    private PageRequest pageRequest;

    public Page() {
    }

    public Page(long total, List<T> content, PageRequest pageRequest) {
        this.total = total;
        this.content = content;
        this.pageRequest = pageRequest;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getContent() {
        return content;
    }

    public void setContent(List<T> content) {
        this.content = content;
    }

    public PageRequest getPageRequest() {
        return pageRequest;
    }

    public void setPageRequest(PageRequest pageRequest) {
        this.pageRequest = pageRequest;
    }
}
