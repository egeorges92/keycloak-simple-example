package com.example.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.model.Answer;
import com.example.model.Question;
import com.example.repository.AnswerRepository;
import com.example.repository.QuestionRepository;

@Component
public class InitData implements CommandLineRunner {

	private static final transient Logger LOGGER = LoggerFactory.getLogger(InitData.class);

	@Autowired
	private QuestionRepository questionRepository;

	@Autowired
	private AnswerRepository answerRepository;

	@Override
	public void run(String... args) throws Exception {
		LOGGER.info("Loading data ...");
		for (int i = 0; i < 50; i++) {
			Question question = new Question();
			question.setTitle("title - " + i);
			question.setDescription("description");
			question = questionRepository.save(question);
			Answer answer = new Answer();
			answer.setQuestion(question);
			answer.setText("text");
			answerRepository.save(answer);
		}

	}

}
