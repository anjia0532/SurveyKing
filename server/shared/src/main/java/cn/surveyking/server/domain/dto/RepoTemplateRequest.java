package cn.surveyking.server.domain.dto;

import lombok.Data;

import java.util.List;

/**
 * @author javahuang
 * @date 2022/4/27
 */
@Data
public class RepoTemplateRequest {

	private String repoId;

	private List<TemplateRequest> templates;

	private List<String> ids;

}
