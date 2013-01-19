/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package flashcard;

/**
 *
 * @author GiantChiprel
 */
public class Model {

    public int deckSelected = 1;
    public int deckSize = 0;
    public int rightAnswers = 0;
    public int QuestionNumber = 0;
    public String Question = "This is a default question";
    public String answerA = "Choice A";
    public String answerB = "Choice B";
    public String answerC = "Choice C";
    public int rightAnswer = 1;

    public Model()
    {
        deckSelected =1;
        deckSize = 0;
        QuestionNumber = 0;
        Question = "This is a default question";
        answerA = "Choice A";
        answerB = "Choice B";
        answerC = "Choice C";
        rightAnswer = 1;
    }

}
