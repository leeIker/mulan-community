package huijingyuan.mulan.servive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import huijingyuan.mulan.dao.UserDao;
import huijingyuan.mulan.model.Question;

@Service
public class QuestionService {
	@Autowired
	UserDao userDao;
	public Question addData(Question question,String user_token) {
		int id=userDao.queryUserByToken(user_token);
		question.setUser_id(id);
		return question;
	}
}
