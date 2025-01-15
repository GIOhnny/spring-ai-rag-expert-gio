package ro.giohnny.springairagexpert.services;


import ro.giohnny.springairagexpert.model.Answer;
import ro.giohnny.springairagexpert.model.Question;

/**
 * Created by jt, Spring Framework Guru.
 */
public interface OpenAIService {

    Answer getAnswer(Question question);
}
