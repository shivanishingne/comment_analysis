package com.feedback.nlp;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;


    public class SentimentAnalysis {

        public static void main(String[] args) {

            StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();

            //add feedback comment
            String text = "The interviewer should have asked tougher questions. Nobody was on time. Would be better if people maintain punctuality.";

            CoreDocument coreDocument = new CoreDocument(text);

            stanfordCoreNLP.annotate(coreDocument);

            List<CoreSentence> sentences = coreDocument.sentences();

            for(CoreSentence sentence : sentences) {

                String sentiment = sentence.sentiment();
                System.out.println(sentiment + ": \t" + sentence);
            }
        }
    }


