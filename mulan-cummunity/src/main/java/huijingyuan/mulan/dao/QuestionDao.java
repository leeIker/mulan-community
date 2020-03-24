package huijingyuan.mulan.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import huijingyuan.mulan.model.Question;

@Mapper
public interface QuestionDao {
	@Insert("insert into question (title,content,user_id)values(#{title},#{content},#{user_id})")
	public int insertQuestion(Question question);
}
