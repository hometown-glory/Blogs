package com.yun.weblog.admin.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;
/**
 * @author 云言月
 * 2024/11/10 20:25
 */
@Getter
public class ReadArticleEvent extends ApplicationEvent {

    /**
     * 文章 ID
     */
    private Long articleId;

    public ReadArticleEvent(Object source, Long articleId) {
        super(source);
        this.articleId = articleId;
    }
}
