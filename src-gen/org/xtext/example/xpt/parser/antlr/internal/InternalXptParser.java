package org.xtext.example.xpt.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.xpt.services.XptGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXptParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NUMBER", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'let'", "'='", "'||'", "'&&'", "'!'", "'('", "')'", "'.'", "'/'", "'['", "']'", "'!='", "'<'", "'<='", "'>'", "'>='", "'uppercase'", "'length'", "'$'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_NUMBER=5;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=7;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalXptParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalXptParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalXptParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g"; }



     	private XptGrammarAccess grammarAccess;
     	
        public InternalXptParser(TokenStream input, XptGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected XptGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_declarations_0_0= ruleDeclaration ) )* ( (lv_assertionSet_1_0= ruleAssertionSet ) ) otherlv_2= ';' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_declarations_0_0 = null;

        EObject lv_assertionSet_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:79:28: ( ( ( (lv_declarations_0_0= ruleDeclaration ) )* ( (lv_assertionSet_1_0= ruleAssertionSet ) ) otherlv_2= ';' ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:80:1: ( ( (lv_declarations_0_0= ruleDeclaration ) )* ( (lv_assertionSet_1_0= ruleAssertionSet ) ) otherlv_2= ';' )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:80:1: ( ( (lv_declarations_0_0= ruleDeclaration ) )* ( (lv_assertionSet_1_0= ruleAssertionSet ) ) otherlv_2= ';' )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:80:2: ( (lv_declarations_0_0= ruleDeclaration ) )* ( (lv_assertionSet_1_0= ruleAssertionSet ) ) otherlv_2= ';'
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:80:2: ( (lv_declarations_0_0= ruleDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:81:1: (lv_declarations_0_0= ruleDeclaration )
            	    {
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:81:1: (lv_declarations_0_0= ruleDeclaration )
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:82:3: lv_declarations_0_0= ruleDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getDeclarationsDeclarationParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDeclaration_in_ruleModel131);
            	    lv_declarations_0_0=ruleDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"declarations",
            	            		lv_declarations_0_0, 
            	            		"Declaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:98:3: ( (lv_assertionSet_1_0= ruleAssertionSet ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:99:1: (lv_assertionSet_1_0= ruleAssertionSet )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:99:1: (lv_assertionSet_1_0= ruleAssertionSet )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:100:3: lv_assertionSet_1_0= ruleAssertionSet
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getAssertionSetAssertionSetParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAssertionSet_in_ruleModel153);
            lv_assertionSet_1_0=ruleAssertionSet();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		set(
                   			current, 
                   			"assertionSet",
                    		lv_assertionSet_1_0, 
                    		"AssertionSet");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleModel165); 

                	newLeafNode(otherlv_2, grammarAccess.getModelAccess().getSemicolonKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDeclaration"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:128:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:129:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:130:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration201);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration211); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:137:1: ruleDeclaration returns [EObject current=null] : (otherlv_0= 'let' ( (lv_var_1_0= ruleVariable ) ) otherlv_2= '=' ( (lv_assert_3_0= ruleAssertion ) ) otherlv_4= ';' ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_var_1_0 = null;

        EObject lv_assert_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:140:28: ( (otherlv_0= 'let' ( (lv_var_1_0= ruleVariable ) ) otherlv_2= '=' ( (lv_assert_3_0= ruleAssertion ) ) otherlv_4= ';' ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:141:1: (otherlv_0= 'let' ( (lv_var_1_0= ruleVariable ) ) otherlv_2= '=' ( (lv_assert_3_0= ruleAssertion ) ) otherlv_4= ';' )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:141:1: (otherlv_0= 'let' ( (lv_var_1_0= ruleVariable ) ) otherlv_2= '=' ( (lv_assert_3_0= ruleAssertion ) ) otherlv_4= ';' )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:141:3: otherlv_0= 'let' ( (lv_var_1_0= ruleVariable ) ) otherlv_2= '=' ( (lv_assert_3_0= ruleAssertion ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleDeclaration248); 

                	newLeafNode(otherlv_0, grammarAccess.getDeclarationAccess().getLetKeyword_0());
                
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:145:1: ( (lv_var_1_0= ruleVariable ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:146:1: (lv_var_1_0= ruleVariable )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:146:1: (lv_var_1_0= ruleVariable )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:147:3: lv_var_1_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getDeclarationAccess().getVarVariableParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariable_in_ruleDeclaration269);
            lv_var_1_0=ruleVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"var",
                    		lv_var_1_0, 
                    		"Variable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleDeclaration281); 

                	newLeafNode(otherlv_2, grammarAccess.getDeclarationAccess().getEqualsSignKeyword_2());
                
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:167:1: ( (lv_assert_3_0= ruleAssertion ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:168:1: (lv_assert_3_0= ruleAssertion )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:168:1: (lv_assert_3_0= ruleAssertion )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:169:3: lv_assert_3_0= ruleAssertion
            {
             
            	        newCompositeNode(grammarAccess.getDeclarationAccess().getAssertAssertionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAssertion_in_ruleDeclaration302);
            lv_assert_3_0=ruleAssertion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"assert",
                    		lv_assert_3_0, 
                    		"Assertion");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleDeclaration314); 

                	newLeafNode(otherlv_4, grammarAccess.getDeclarationAccess().getSemicolonKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleAssertionSet"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:197:1: entryRuleAssertionSet returns [EObject current=null] : iv_ruleAssertionSet= ruleAssertionSet EOF ;
    public final EObject entryRuleAssertionSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertionSet = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:198:2: (iv_ruleAssertionSet= ruleAssertionSet EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:199:2: iv_ruleAssertionSet= ruleAssertionSet EOF
            {
             newCompositeNode(grammarAccess.getAssertionSetRule()); 
            pushFollow(FOLLOW_ruleAssertionSet_in_entryRuleAssertionSet350);
            iv_ruleAssertionSet=ruleAssertionSet();

            state._fsp--;

             current =iv_ruleAssertionSet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertionSet360); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssertionSet"


    // $ANTLR start "ruleAssertionSet"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:206:1: ruleAssertionSet returns [EObject current=null] : (this_AssertionAnd_0= ruleAssertionAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAssertionAnd ) ) )* ) ;
    public final EObject ruleAssertionSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AssertionAnd_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:209:28: ( (this_AssertionAnd_0= ruleAssertionAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAssertionAnd ) ) )* ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:210:1: (this_AssertionAnd_0= ruleAssertionAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAssertionAnd ) ) )* )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:210:1: (this_AssertionAnd_0= ruleAssertionAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAssertionAnd ) ) )* )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:211:5: this_AssertionAnd_0= ruleAssertionAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAssertionAnd ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAssertionSetAccess().getAssertionAndParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAssertionAnd_in_ruleAssertionSet407);
            this_AssertionAnd_0=ruleAssertionAnd();

            state._fsp--;

             
                    current = this_AssertionAnd_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:219:1: ( () otherlv_2= '||' ( (lv_right_3_0= ruleAssertionAnd ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:219:2: () otherlv_2= '||' ( (lv_right_3_0= ruleAssertionAnd ) )
            	    {
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:219:2: ()
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:220:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAssertionSetAccess().getAssertionSetLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleAssertionSet428); 

            	        	newLeafNode(otherlv_2, grammarAccess.getAssertionSetAccess().getVerticalLineVerticalLineKeyword_1_1());
            	        
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:229:1: ( (lv_right_3_0= ruleAssertionAnd ) )
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:230:1: (lv_right_3_0= ruleAssertionAnd )
            	    {
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:230:1: (lv_right_3_0= ruleAssertionAnd )
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:231:3: lv_right_3_0= ruleAssertionAnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAssertionSetAccess().getRightAssertionAndParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAssertionAnd_in_ruleAssertionSet449);
            	    lv_right_3_0=ruleAssertionAnd();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAssertionSetRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"AssertionAnd");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssertionSet"


    // $ANTLR start "entryRuleAssertionAnd"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:255:1: entryRuleAssertionAnd returns [EObject current=null] : iv_ruleAssertionAnd= ruleAssertionAnd EOF ;
    public final EObject entryRuleAssertionAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertionAnd = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:256:2: (iv_ruleAssertionAnd= ruleAssertionAnd EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:257:2: iv_ruleAssertionAnd= ruleAssertionAnd EOF
            {
             newCompositeNode(grammarAccess.getAssertionAndRule()); 
            pushFollow(FOLLOW_ruleAssertionAnd_in_entryRuleAssertionAnd487);
            iv_ruleAssertionAnd=ruleAssertionAnd();

            state._fsp--;

             current =iv_ruleAssertionAnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertionAnd497); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssertionAnd"


    // $ANTLR start "ruleAssertionAnd"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:264:1: ruleAssertionAnd returns [EObject current=null] : (this_HighProrityAssertion_0= ruleHighProrityAssertion ( () otherlv_2= '&&' ( (lv_right_3_0= ruleHighProrityAssertion ) ) )* ) ;
    public final EObject ruleAssertionAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_HighProrityAssertion_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:267:28: ( (this_HighProrityAssertion_0= ruleHighProrityAssertion ( () otherlv_2= '&&' ( (lv_right_3_0= ruleHighProrityAssertion ) ) )* ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:268:1: (this_HighProrityAssertion_0= ruleHighProrityAssertion ( () otherlv_2= '&&' ( (lv_right_3_0= ruleHighProrityAssertion ) ) )* )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:268:1: (this_HighProrityAssertion_0= ruleHighProrityAssertion ( () otherlv_2= '&&' ( (lv_right_3_0= ruleHighProrityAssertion ) ) )* )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:269:5: this_HighProrityAssertion_0= ruleHighProrityAssertion ( () otherlv_2= '&&' ( (lv_right_3_0= ruleHighProrityAssertion ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAssertionAndAccess().getHighProrityAssertionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleHighProrityAssertion_in_ruleAssertionAnd544);
            this_HighProrityAssertion_0=ruleHighProrityAssertion();

            state._fsp--;

             
                    current = this_HighProrityAssertion_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:277:1: ( () otherlv_2= '&&' ( (lv_right_3_0= ruleHighProrityAssertion ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:277:2: () otherlv_2= '&&' ( (lv_right_3_0= ruleHighProrityAssertion ) )
            	    {
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:277:2: ()
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:278:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAssertionAndAccess().getAssertionAndLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleAssertionAnd565); 

            	        	newLeafNode(otherlv_2, grammarAccess.getAssertionAndAccess().getAmpersandAmpersandKeyword_1_1());
            	        
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:287:1: ( (lv_right_3_0= ruleHighProrityAssertion ) )
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:288:1: (lv_right_3_0= ruleHighProrityAssertion )
            	    {
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:288:1: (lv_right_3_0= ruleHighProrityAssertion )
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:289:3: lv_right_3_0= ruleHighProrityAssertion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAssertionAndAccess().getRightHighProrityAssertionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleHighProrityAssertion_in_ruleAssertionAnd586);
            	    lv_right_3_0=ruleHighProrityAssertion();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAssertionAndRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"HighProrityAssertion");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssertionAnd"


    // $ANTLR start "entryRuleHighProrityAssertion"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:313:1: entryRuleHighProrityAssertion returns [EObject current=null] : iv_ruleHighProrityAssertion= ruleHighProrityAssertion EOF ;
    public final EObject entryRuleHighProrityAssertion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHighProrityAssertion = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:314:2: (iv_ruleHighProrityAssertion= ruleHighProrityAssertion EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:315:2: iv_ruleHighProrityAssertion= ruleHighProrityAssertion EOF
            {
             newCompositeNode(grammarAccess.getHighProrityAssertionRule()); 
            pushFollow(FOLLOW_ruleHighProrityAssertion_in_entryRuleHighProrityAssertion624);
            iv_ruleHighProrityAssertion=ruleHighProrityAssertion();

            state._fsp--;

             current =iv_ruleHighProrityAssertion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHighProrityAssertion634); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHighProrityAssertion"


    // $ANTLR start "ruleHighProrityAssertion"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:322:1: ruleHighProrityAssertion returns [EObject current=null] : (this_NegatedFormula_0= ruleNegatedFormula | this_BracedFormula_1= ruleBracedFormula | this_AssertionForm_2= ruleAssertionForm ) ;
    public final EObject ruleHighProrityAssertion() throws RecognitionException {
        EObject current = null;

        EObject this_NegatedFormula_0 = null;

        EObject this_BracedFormula_1 = null;

        EObject this_AssertionForm_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:325:28: ( (this_NegatedFormula_0= ruleNegatedFormula | this_BracedFormula_1= ruleBracedFormula | this_AssertionForm_2= ruleAssertionForm ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:326:1: (this_NegatedFormula_0= ruleNegatedFormula | this_BracedFormula_1= ruleBracedFormula | this_AssertionForm_2= ruleAssertionForm )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:326:1: (this_NegatedFormula_0= ruleNegatedFormula | this_BracedFormula_1= ruleBracedFormula | this_AssertionForm_2= ruleAssertionForm )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:327:5: this_NegatedFormula_0= ruleNegatedFormula
                    {
                     
                            newCompositeNode(grammarAccess.getHighProrityAssertionAccess().getNegatedFormulaParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNegatedFormula_in_ruleHighProrityAssertion681);
                    this_NegatedFormula_0=ruleNegatedFormula();

                    state._fsp--;

                     
                            current = this_NegatedFormula_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:337:5: this_BracedFormula_1= ruleBracedFormula
                    {
                     
                            newCompositeNode(grammarAccess.getHighProrityAssertionAccess().getBracedFormulaParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBracedFormula_in_ruleHighProrityAssertion708);
                    this_BracedFormula_1=ruleBracedFormula();

                    state._fsp--;

                     
                            current = this_BracedFormula_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:347:5: this_AssertionForm_2= ruleAssertionForm
                    {
                     
                            newCompositeNode(grammarAccess.getHighProrityAssertionAccess().getAssertionFormParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleAssertionForm_in_ruleHighProrityAssertion735);
                    this_AssertionForm_2=ruleAssertionForm();

                    state._fsp--;

                     
                            current = this_AssertionForm_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHighProrityAssertion"


    // $ANTLR start "entryRuleNegatedFormula"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:363:1: entryRuleNegatedFormula returns [EObject current=null] : iv_ruleNegatedFormula= ruleNegatedFormula EOF ;
    public final EObject entryRuleNegatedFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegatedFormula = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:364:2: (iv_ruleNegatedFormula= ruleNegatedFormula EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:365:2: iv_ruleNegatedFormula= ruleNegatedFormula EOF
            {
             newCompositeNode(grammarAccess.getNegatedFormulaRule()); 
            pushFollow(FOLLOW_ruleNegatedFormula_in_entryRuleNegatedFormula770);
            iv_ruleNegatedFormula=ruleNegatedFormula();

            state._fsp--;

             current =iv_ruleNegatedFormula; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegatedFormula780); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNegatedFormula"


    // $ANTLR start "ruleNegatedFormula"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:372:1: ruleNegatedFormula returns [EObject current=null] : (otherlv_0= '!' ( (lv_innerFormula_1_0= ruleAssertionSet ) ) ) ;
    public final EObject ruleNegatedFormula() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_innerFormula_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:375:28: ( (otherlv_0= '!' ( (lv_innerFormula_1_0= ruleAssertionSet ) ) ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:376:1: (otherlv_0= '!' ( (lv_innerFormula_1_0= ruleAssertionSet ) ) )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:376:1: (otherlv_0= '!' ( (lv_innerFormula_1_0= ruleAssertionSet ) ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:376:3: otherlv_0= '!' ( (lv_innerFormula_1_0= ruleAssertionSet ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleNegatedFormula817); 

                	newLeafNode(otherlv_0, grammarAccess.getNegatedFormulaAccess().getExclamationMarkKeyword_0());
                
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:380:1: ( (lv_innerFormula_1_0= ruleAssertionSet ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:381:1: (lv_innerFormula_1_0= ruleAssertionSet )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:381:1: (lv_innerFormula_1_0= ruleAssertionSet )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:382:3: lv_innerFormula_1_0= ruleAssertionSet
            {
             
            	        newCompositeNode(grammarAccess.getNegatedFormulaAccess().getInnerFormulaAssertionSetParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAssertionSet_in_ruleNegatedFormula838);
            lv_innerFormula_1_0=ruleAssertionSet();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNegatedFormulaRule());
            	        }
                   		set(
                   			current, 
                   			"innerFormula",
                    		lv_innerFormula_1_0, 
                    		"AssertionSet");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNegatedFormula"


    // $ANTLR start "entryRuleBracedFormula"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:406:1: entryRuleBracedFormula returns [EObject current=null] : iv_ruleBracedFormula= ruleBracedFormula EOF ;
    public final EObject entryRuleBracedFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBracedFormula = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:407:2: (iv_ruleBracedFormula= ruleBracedFormula EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:408:2: iv_ruleBracedFormula= ruleBracedFormula EOF
            {
             newCompositeNode(grammarAccess.getBracedFormulaRule()); 
            pushFollow(FOLLOW_ruleBracedFormula_in_entryRuleBracedFormula874);
            iv_ruleBracedFormula=ruleBracedFormula();

            state._fsp--;

             current =iv_ruleBracedFormula; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBracedFormula884); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBracedFormula"


    // $ANTLR start "ruleBracedFormula"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:415:1: ruleBracedFormula returns [EObject current=null] : (otherlv_0= '(' this_AssertionSet_1= ruleAssertionSet otherlv_2= ')' ) ;
    public final EObject ruleBracedFormula() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_AssertionSet_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:418:28: ( (otherlv_0= '(' this_AssertionSet_1= ruleAssertionSet otherlv_2= ')' ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:419:1: (otherlv_0= '(' this_AssertionSet_1= ruleAssertionSet otherlv_2= ')' )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:419:1: (otherlv_0= '(' this_AssertionSet_1= ruleAssertionSet otherlv_2= ')' )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:419:3: otherlv_0= '(' this_AssertionSet_1= ruleAssertionSet otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleBracedFormula921); 

                	newLeafNode(otherlv_0, grammarAccess.getBracedFormulaAccess().getLeftParenthesisKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getBracedFormulaAccess().getAssertionSetParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleAssertionSet_in_ruleBracedFormula943);
            this_AssertionSet_1=ruleAssertionSet();

            state._fsp--;

             
                    current = this_AssertionSet_1; 
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleBracedFormula954); 

                	newLeafNode(otherlv_2, grammarAccess.getBracedFormulaAccess().getRightParenthesisKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBracedFormula"


    // $ANTLR start "entryRuleAssertionForm"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:444:1: entryRuleAssertionForm returns [EObject current=null] : iv_ruleAssertionForm= ruleAssertionForm EOF ;
    public final EObject entryRuleAssertionForm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertionForm = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:445:2: (iv_ruleAssertionForm= ruleAssertionForm EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:446:2: iv_ruleAssertionForm= ruleAssertionForm EOF
            {
             newCompositeNode(grammarAccess.getAssertionFormRule()); 
            pushFollow(FOLLOW_ruleAssertionForm_in_entryRuleAssertionForm990);
            iv_ruleAssertionForm=ruleAssertionForm();

            state._fsp--;

             current =iv_ruleAssertionForm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertionForm1000); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssertionForm"


    // $ANTLR start "ruleAssertionForm"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:453:1: ruleAssertionForm returns [EObject current=null] : ( ( (lv_leftAssert_0_0= ruleAssertion ) ) ( (lv_op_1_0= ruleRop ) ) ( (lv_rightAssert_2_0= ruleAssertion ) ) ) ;
    public final EObject ruleAssertionForm() throws RecognitionException {
        EObject current = null;

        EObject lv_leftAssert_0_0 = null;

        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_rightAssert_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:456:28: ( ( ( (lv_leftAssert_0_0= ruleAssertion ) ) ( (lv_op_1_0= ruleRop ) ) ( (lv_rightAssert_2_0= ruleAssertion ) ) ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:457:1: ( ( (lv_leftAssert_0_0= ruleAssertion ) ) ( (lv_op_1_0= ruleRop ) ) ( (lv_rightAssert_2_0= ruleAssertion ) ) )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:457:1: ( ( (lv_leftAssert_0_0= ruleAssertion ) ) ( (lv_op_1_0= ruleRop ) ) ( (lv_rightAssert_2_0= ruleAssertion ) ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:457:2: ( (lv_leftAssert_0_0= ruleAssertion ) ) ( (lv_op_1_0= ruleRop ) ) ( (lv_rightAssert_2_0= ruleAssertion ) )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:457:2: ( (lv_leftAssert_0_0= ruleAssertion ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:458:1: (lv_leftAssert_0_0= ruleAssertion )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:458:1: (lv_leftAssert_0_0= ruleAssertion )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:459:3: lv_leftAssert_0_0= ruleAssertion
            {
             
            	        newCompositeNode(grammarAccess.getAssertionFormAccess().getLeftAssertAssertionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAssertion_in_ruleAssertionForm1046);
            lv_leftAssert_0_0=ruleAssertion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssertionFormRule());
            	        }
                   		set(
                   			current, 
                   			"leftAssert",
                    		lv_leftAssert_0_0, 
                    		"Assertion");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:475:2: ( (lv_op_1_0= ruleRop ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:476:1: (lv_op_1_0= ruleRop )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:476:1: (lv_op_1_0= ruleRop )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:477:3: lv_op_1_0= ruleRop
            {
             
            	        newCompositeNode(grammarAccess.getAssertionFormAccess().getOpRopParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleRop_in_ruleAssertionForm1067);
            lv_op_1_0=ruleRop();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssertionFormRule());
            	        }
                   		set(
                   			current, 
                   			"op",
                    		lv_op_1_0, 
                    		"Rop");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:493:2: ( (lv_rightAssert_2_0= ruleAssertion ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:494:1: (lv_rightAssert_2_0= ruleAssertion )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:494:1: (lv_rightAssert_2_0= ruleAssertion )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:495:3: lv_rightAssert_2_0= ruleAssertion
            {
             
            	        newCompositeNode(grammarAccess.getAssertionFormAccess().getRightAssertAssertionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAssertion_in_ruleAssertionForm1088);
            lv_rightAssert_2_0=ruleAssertion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssertionFormRule());
            	        }
                   		set(
                   			current, 
                   			"rightAssert",
                    		lv_rightAssert_2_0, 
                    		"Assertion");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssertionForm"


    // $ANTLR start "entryRuleAssertion"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:519:1: entryRuleAssertion returns [EObject current=null] : iv_ruleAssertion= ruleAssertion EOF ;
    public final EObject entryRuleAssertion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertion = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:520:2: (iv_ruleAssertion= ruleAssertion EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:521:2: iv_ruleAssertion= ruleAssertion EOF
            {
             newCompositeNode(grammarAccess.getAssertionRule()); 
            pushFollow(FOLLOW_ruleAssertion_in_entryRuleAssertion1124);
            iv_ruleAssertion=ruleAssertion();

            state._fsp--;

             current =iv_ruleAssertion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertion1134); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssertion"


    // $ANTLR start "ruleAssertion"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:528:1: ruleAssertion returns [EObject current=null] : ( ( ( (lv_query_0_0= ruleQuery ) ) (otherlv_1= '.' ( (lv_function_2_0= ruleFunction ) ) )? ) | ( (lv_constant_3_0= ruleConstant ) ) ) ;
    public final EObject ruleAssertion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_query_0_0 = null;

        AntlrDatatypeRuleToken lv_function_2_0 = null;

        EObject lv_constant_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:531:28: ( ( ( ( (lv_query_0_0= ruleQuery ) ) (otherlv_1= '.' ( (lv_function_2_0= ruleFunction ) ) )? ) | ( (lv_constant_3_0= ruleConstant ) ) ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:532:1: ( ( ( (lv_query_0_0= ruleQuery ) ) (otherlv_1= '.' ( (lv_function_2_0= ruleFunction ) ) )? ) | ( (lv_constant_3_0= ruleConstant ) ) )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:532:1: ( ( ( (lv_query_0_0= ruleQuery ) ) (otherlv_1= '.' ( (lv_function_2_0= ruleFunction ) ) )? ) | ( (lv_constant_3_0= ruleConstant ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18||LA6_0==21||LA6_0==31) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=RULE_NUMBER && LA6_0<=RULE_STRING)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:532:2: ( ( (lv_query_0_0= ruleQuery ) ) (otherlv_1= '.' ( (lv_function_2_0= ruleFunction ) ) )? )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:532:2: ( ( (lv_query_0_0= ruleQuery ) ) (otherlv_1= '.' ( (lv_function_2_0= ruleFunction ) ) )? )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:532:3: ( (lv_query_0_0= ruleQuery ) ) (otherlv_1= '.' ( (lv_function_2_0= ruleFunction ) ) )?
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:532:3: ( (lv_query_0_0= ruleQuery ) )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:533:1: (lv_query_0_0= ruleQuery )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:533:1: (lv_query_0_0= ruleQuery )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:534:3: lv_query_0_0= ruleQuery
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssertionAccess().getQueryQueryParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQuery_in_ruleAssertion1181);
                    lv_query_0_0=ruleQuery();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssertionRule());
                    	        }
                           		set(
                           			current, 
                           			"query",
                            		lv_query_0_0, 
                            		"Query");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:550:2: (otherlv_1= '.' ( (lv_function_2_0= ruleFunction ) ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==20) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:550:4: otherlv_1= '.' ( (lv_function_2_0= ruleFunction ) )
                            {
                            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleAssertion1194); 

                                	newLeafNode(otherlv_1, grammarAccess.getAssertionAccess().getFullStopKeyword_0_1_0());
                                
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:554:1: ( (lv_function_2_0= ruleFunction ) )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:555:1: (lv_function_2_0= ruleFunction )
                            {
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:555:1: (lv_function_2_0= ruleFunction )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:556:3: lv_function_2_0= ruleFunction
                            {
                             
                            	        newCompositeNode(grammarAccess.getAssertionAccess().getFunctionFunctionParserRuleCall_0_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleFunction_in_ruleAssertion1215);
                            lv_function_2_0=ruleFunction();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getAssertionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"function",
                                    		lv_function_2_0, 
                                    		"Function");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:573:6: ( (lv_constant_3_0= ruleConstant ) )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:573:6: ( (lv_constant_3_0= ruleConstant ) )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:574:1: (lv_constant_3_0= ruleConstant )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:574:1: (lv_constant_3_0= ruleConstant )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:575:3: lv_constant_3_0= ruleConstant
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssertionAccess().getConstantConstantParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConstant_in_ruleAssertion1245);
                    lv_constant_3_0=ruleConstant();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssertionRule());
                    	        }
                           		set(
                           			current, 
                           			"constant",
                            		lv_constant_3_0, 
                            		"Constant");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssertion"


    // $ANTLR start "entryRuleQuery"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:599:1: entryRuleQuery returns [EObject current=null] : iv_ruleQuery= ruleQuery EOF ;
    public final EObject entryRuleQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuery = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:600:2: (iv_ruleQuery= ruleQuery EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:601:2: iv_ruleQuery= ruleQuery EOF
            {
             newCompositeNode(grammarAccess.getQueryRule()); 
            pushFollow(FOLLOW_ruleQuery_in_entryRuleQuery1281);
            iv_ruleQuery=ruleQuery();

            state._fsp--;

             current =iv_ruleQuery; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuery1291); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuery"


    // $ANTLR start "ruleQuery"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:608:1: ruleQuery returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_steps_1_0= ruleStep ) )+ otherlv_2= ')' ) | ( (lv_steps_3_0= ruleStep ) )+ ) ;
    public final EObject ruleQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_steps_1_0 = null;

        EObject lv_steps_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:611:28: ( ( (otherlv_0= '(' ( (lv_steps_1_0= ruleStep ) )+ otherlv_2= ')' ) | ( (lv_steps_3_0= ruleStep ) )+ ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:612:1: ( (otherlv_0= '(' ( (lv_steps_1_0= ruleStep ) )+ otherlv_2= ')' ) | ( (lv_steps_3_0= ruleStep ) )+ )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:612:1: ( (otherlv_0= '(' ( (lv_steps_1_0= ruleStep ) )+ otherlv_2= ')' ) | ( (lv_steps_3_0= ruleStep ) )+ )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            else if ( (LA9_0==21||LA9_0==31) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:612:2: (otherlv_0= '(' ( (lv_steps_1_0= ruleStep ) )+ otherlv_2= ')' )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:612:2: (otherlv_0= '(' ( (lv_steps_1_0= ruleStep ) )+ otherlv_2= ')' )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:612:4: otherlv_0= '(' ( (lv_steps_1_0= ruleStep ) )+ otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleQuery1329); 

                        	newLeafNode(otherlv_0, grammarAccess.getQueryAccess().getLeftParenthesisKeyword_0_0());
                        
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:616:1: ( (lv_steps_1_0= ruleStep ) )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==21||LA7_0==31) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:617:1: (lv_steps_1_0= ruleStep )
                    	    {
                    	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:617:1: (lv_steps_1_0= ruleStep )
                    	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:618:3: lv_steps_1_0= ruleStep
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getQueryAccess().getStepsStepParserRuleCall_0_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleStep_in_ruleQuery1350);
                    	    lv_steps_1_0=ruleStep();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getQueryRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"steps",
                    	            		lv_steps_1_0, 
                    	            		"Step");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);

                    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleQuery1363); 

                        	newLeafNode(otherlv_2, grammarAccess.getQueryAccess().getRightParenthesisKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:639:6: ( (lv_steps_3_0= ruleStep ) )+
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:639:6: ( (lv_steps_3_0= ruleStep ) )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==21||LA8_0==31) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:640:1: (lv_steps_3_0= ruleStep )
                    	    {
                    	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:640:1: (lv_steps_3_0= ruleStep )
                    	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:641:3: lv_steps_3_0= ruleStep
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getQueryAccess().getStepsStepParserRuleCall_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleStep_in_ruleQuery1391);
                    	    lv_steps_3_0=ruleStep();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getQueryRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"steps",
                    	            		lv_steps_3_0, 
                    	            		"Step");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuery"


    // $ANTLR start "entryRuleStep"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:665:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:666:2: (iv_ruleStep= ruleStep EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:667:2: iv_ruleStep= ruleStep EOF
            {
             newCompositeNode(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_ruleStep_in_entryRuleStep1428);
            iv_ruleStep=ruleStep();

            state._fsp--;

             current =iv_ruleStep; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStep1438); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStep"


    // $ANTLR start "ruleStep"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:674:1: ruleStep returns [EObject current=null] : ( (otherlv_0= '/' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_attribute_3_0= ruleAttribute ) ) otherlv_4= ']' )? ) | ( (lv_placeholder_5_0= ruleVariable ) ) ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_attribute_3_0 = null;

        AntlrDatatypeRuleToken lv_placeholder_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:677:28: ( ( (otherlv_0= '/' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_attribute_3_0= ruleAttribute ) ) otherlv_4= ']' )? ) | ( (lv_placeholder_5_0= ruleVariable ) ) ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:678:1: ( (otherlv_0= '/' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_attribute_3_0= ruleAttribute ) ) otherlv_4= ']' )? ) | ( (lv_placeholder_5_0= ruleVariable ) ) )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:678:1: ( (otherlv_0= '/' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_attribute_3_0= ruleAttribute ) ) otherlv_4= ']' )? ) | ( (lv_placeholder_5_0= ruleVariable ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            else if ( (LA11_0==31) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:678:2: (otherlv_0= '/' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_attribute_3_0= ruleAttribute ) ) otherlv_4= ']' )? )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:678:2: (otherlv_0= '/' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_attribute_3_0= ruleAttribute ) ) otherlv_4= ']' )? )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:678:4: otherlv_0= '/' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_attribute_3_0= ruleAttribute ) ) otherlv_4= ']' )?
                    {
                    otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleStep1476); 

                        	newLeafNode(otherlv_0, grammarAccess.getStepAccess().getSolidusKeyword_0_0());
                        
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:682:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:683:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:683:1: (lv_name_1_0= RULE_ID )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:684:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStep1493); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getStepAccess().getNameIDTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStepRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:700:2: (otherlv_2= '[' ( (lv_attribute_3_0= ruleAttribute ) ) otherlv_4= ']' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==22) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:700:4: otherlv_2= '[' ( (lv_attribute_3_0= ruleAttribute ) ) otherlv_4= ']'
                            {
                            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleStep1511); 

                                	newLeafNode(otherlv_2, grammarAccess.getStepAccess().getLeftSquareBracketKeyword_0_2_0());
                                
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:704:1: ( (lv_attribute_3_0= ruleAttribute ) )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:705:1: (lv_attribute_3_0= ruleAttribute )
                            {
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:705:1: (lv_attribute_3_0= ruleAttribute )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:706:3: lv_attribute_3_0= ruleAttribute
                            {
                             
                            	        newCompositeNode(grammarAccess.getStepAccess().getAttributeAttributeParserRuleCall_0_2_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleAttribute_in_ruleStep1532);
                            lv_attribute_3_0=ruleAttribute();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getStepRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"attribute",
                                    		lv_attribute_3_0, 
                                    		"Attribute");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleStep1544); 

                                	newLeafNode(otherlv_4, grammarAccess.getStepAccess().getRightSquareBracketKeyword_0_2_2());
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:727:6: ( (lv_placeholder_5_0= ruleVariable ) )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:727:6: ( (lv_placeholder_5_0= ruleVariable ) )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:728:1: (lv_placeholder_5_0= ruleVariable )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:728:1: (lv_placeholder_5_0= ruleVariable )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:729:3: lv_placeholder_5_0= ruleVariable
                    {
                     
                    	        newCompositeNode(grammarAccess.getStepAccess().getPlaceholderVariableParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariable_in_ruleStep1574);
                    lv_placeholder_5_0=ruleVariable();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStepRule());
                    	        }
                           		set(
                           			current, 
                           			"placeholder",
                            		lv_placeholder_5_0, 
                            		"Variable");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStep"


    // $ANTLR start "entryRuleAttribute"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:753:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:754:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:755:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute1610);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute1620); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:762:1: ruleAttribute returns [EObject current=null] : ( ( ( (lv_property_0_0= RULE_ID ) ) ( ( ( (lv_op_1_0= ruleRop ) ) ( (lv_intValue_2_0= RULE_NUMBER ) ) ) | ( ( (lv_op_3_0= ruleStringRop ) ) ( (lv_strValue_4_0= RULE_STRING ) ) ) ) ) | ( (lv_int_5_0= RULE_NUMBER ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_property_0_0=null;
        Token lv_intValue_2_0=null;
        Token lv_strValue_4_0=null;
        Token lv_int_5_0=null;
        AntlrDatatypeRuleToken lv_op_1_0 = null;

        AntlrDatatypeRuleToken lv_op_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:765:28: ( ( ( ( (lv_property_0_0= RULE_ID ) ) ( ( ( (lv_op_1_0= ruleRop ) ) ( (lv_intValue_2_0= RULE_NUMBER ) ) ) | ( ( (lv_op_3_0= ruleStringRop ) ) ( (lv_strValue_4_0= RULE_STRING ) ) ) ) ) | ( (lv_int_5_0= RULE_NUMBER ) ) ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:766:1: ( ( ( (lv_property_0_0= RULE_ID ) ) ( ( ( (lv_op_1_0= ruleRop ) ) ( (lv_intValue_2_0= RULE_NUMBER ) ) ) | ( ( (lv_op_3_0= ruleStringRop ) ) ( (lv_strValue_4_0= RULE_STRING ) ) ) ) ) | ( (lv_int_5_0= RULE_NUMBER ) ) )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:766:1: ( ( ( (lv_property_0_0= RULE_ID ) ) ( ( ( (lv_op_1_0= ruleRop ) ) ( (lv_intValue_2_0= RULE_NUMBER ) ) ) | ( ( (lv_op_3_0= ruleStringRop ) ) ( (lv_strValue_4_0= RULE_STRING ) ) ) ) ) | ( (lv_int_5_0= RULE_NUMBER ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_NUMBER) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:766:2: ( ( (lv_property_0_0= RULE_ID ) ) ( ( ( (lv_op_1_0= ruleRop ) ) ( (lv_intValue_2_0= RULE_NUMBER ) ) ) | ( ( (lv_op_3_0= ruleStringRop ) ) ( (lv_strValue_4_0= RULE_STRING ) ) ) ) )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:766:2: ( ( (lv_property_0_0= RULE_ID ) ) ( ( ( (lv_op_1_0= ruleRop ) ) ( (lv_intValue_2_0= RULE_NUMBER ) ) ) | ( ( (lv_op_3_0= ruleStringRop ) ) ( (lv_strValue_4_0= RULE_STRING ) ) ) ) )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:766:3: ( (lv_property_0_0= RULE_ID ) ) ( ( ( (lv_op_1_0= ruleRop ) ) ( (lv_intValue_2_0= RULE_NUMBER ) ) ) | ( ( (lv_op_3_0= ruleStringRop ) ) ( (lv_strValue_4_0= RULE_STRING ) ) ) )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:766:3: ( (lv_property_0_0= RULE_ID ) )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:767:1: (lv_property_0_0= RULE_ID )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:767:1: (lv_property_0_0= RULE_ID )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:768:3: lv_property_0_0= RULE_ID
                    {
                    lv_property_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute1663); 

                    			newLeafNode(lv_property_0_0, grammarAccess.getAttributeAccess().getPropertyIDTerminalRuleCall_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"property",
                            		lv_property_0_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:784:2: ( ( ( (lv_op_1_0= ruleRop ) ) ( (lv_intValue_2_0= RULE_NUMBER ) ) ) | ( ( (lv_op_3_0= ruleStringRop ) ) ( (lv_strValue_4_0= RULE_STRING ) ) ) )
                    int alt12=2;
                    switch ( input.LA(1) ) {
                    case 14:
                        {
                        int LA12_1 = input.LA(2);

                        if ( (LA12_1==RULE_NUMBER) ) {
                            alt12=1;
                        }
                        else if ( (LA12_1==RULE_STRING) ) {
                            alt12=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 12, 1, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 24:
                        {
                        int LA12_2 = input.LA(2);

                        if ( (LA12_2==RULE_NUMBER) ) {
                            alt12=1;
                        }
                        else if ( (LA12_2==RULE_STRING) ) {
                            alt12=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 12, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        {
                        alt12=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;
                    }

                    switch (alt12) {
                        case 1 :
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:784:3: ( ( (lv_op_1_0= ruleRop ) ) ( (lv_intValue_2_0= RULE_NUMBER ) ) )
                            {
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:784:3: ( ( (lv_op_1_0= ruleRop ) ) ( (lv_intValue_2_0= RULE_NUMBER ) ) )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:784:4: ( (lv_op_1_0= ruleRop ) ) ( (lv_intValue_2_0= RULE_NUMBER ) )
                            {
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:784:4: ( (lv_op_1_0= ruleRop ) )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:785:1: (lv_op_1_0= ruleRop )
                            {
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:785:1: (lv_op_1_0= ruleRop )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:786:3: lv_op_1_0= ruleRop
                            {
                             
                            	        newCompositeNode(grammarAccess.getAttributeAccess().getOpRopParserRuleCall_0_1_0_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleRop_in_ruleAttribute1691);
                            lv_op_1_0=ruleRop();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getAttributeRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"op",
                                    		lv_op_1_0, 
                                    		"Rop");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:802:2: ( (lv_intValue_2_0= RULE_NUMBER ) )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:803:1: (lv_intValue_2_0= RULE_NUMBER )
                            {
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:803:1: (lv_intValue_2_0= RULE_NUMBER )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:804:3: lv_intValue_2_0= RULE_NUMBER
                            {
                            lv_intValue_2_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleAttribute1708); 

                            			newLeafNode(lv_intValue_2_0, grammarAccess.getAttributeAccess().getIntValueNUMBERTerminalRuleCall_0_1_0_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getAttributeRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"intValue",
                                    		lv_intValue_2_0, 
                                    		"NUMBER");
                            	    

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:821:6: ( ( (lv_op_3_0= ruleStringRop ) ) ( (lv_strValue_4_0= RULE_STRING ) ) )
                            {
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:821:6: ( ( (lv_op_3_0= ruleStringRop ) ) ( (lv_strValue_4_0= RULE_STRING ) ) )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:821:7: ( (lv_op_3_0= ruleStringRop ) ) ( (lv_strValue_4_0= RULE_STRING ) )
                            {
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:821:7: ( (lv_op_3_0= ruleStringRop ) )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:822:1: (lv_op_3_0= ruleStringRop )
                            {
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:822:1: (lv_op_3_0= ruleStringRop )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:823:3: lv_op_3_0= ruleStringRop
                            {
                             
                            	        newCompositeNode(grammarAccess.getAttributeAccess().getOpStringRopParserRuleCall_0_1_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleStringRop_in_ruleAttribute1742);
                            lv_op_3_0=ruleStringRop();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getAttributeRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"op",
                                    		lv_op_3_0, 
                                    		"StringRop");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:839:2: ( (lv_strValue_4_0= RULE_STRING ) )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:840:1: (lv_strValue_4_0= RULE_STRING )
                            {
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:840:1: (lv_strValue_4_0= RULE_STRING )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:841:3: lv_strValue_4_0= RULE_STRING
                            {
                            lv_strValue_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute1759); 

                            			newLeafNode(lv_strValue_4_0, grammarAccess.getAttributeAccess().getStrValueSTRINGTerminalRuleCall_0_1_1_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getAttributeRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"strValue",
                                    		lv_strValue_4_0, 
                                    		"STRING");
                            	    

                            }


                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:858:6: ( (lv_int_5_0= RULE_NUMBER ) )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:858:6: ( (lv_int_5_0= RULE_NUMBER ) )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:859:1: (lv_int_5_0= RULE_NUMBER )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:859:1: (lv_int_5_0= RULE_NUMBER )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:860:3: lv_int_5_0= RULE_NUMBER
                    {
                    lv_int_5_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleAttribute1790); 

                    			newLeafNode(lv_int_5_0, grammarAccess.getAttributeAccess().getIntNUMBERTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"int",
                            		lv_int_5_0, 
                            		"NUMBER");
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleStringRop"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:884:1: entryRuleStringRop returns [String current=null] : iv_ruleStringRop= ruleStringRop EOF ;
    public final String entryRuleStringRop() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringRop = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:885:2: (iv_ruleStringRop= ruleStringRop EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:886:2: iv_ruleStringRop= ruleStringRop EOF
            {
             newCompositeNode(grammarAccess.getStringRopRule()); 
            pushFollow(FOLLOW_ruleStringRop_in_entryRuleStringRop1832);
            iv_ruleStringRop=ruleStringRop();

            state._fsp--;

             current =iv_ruleStringRop.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringRop1843); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringRop"


    // $ANTLR start "ruleStringRop"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:893:1: ruleStringRop returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleStringRop() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:896:28: ( (kw= '=' | kw= '!=' ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:897:1: (kw= '=' | kw= '!=' )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:897:1: (kw= '=' | kw= '!=' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==14) ) {
                alt14=1;
            }
            else if ( (LA14_0==24) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:898:2: kw= '='
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleStringRop1881); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStringRopAccess().getEqualsSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:905:2: kw= '!='
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleStringRop1900); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStringRopAccess().getExclamationMarkEqualsSignKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringRop"


    // $ANTLR start "entryRuleRop"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:918:1: entryRuleRop returns [String current=null] : iv_ruleRop= ruleRop EOF ;
    public final String entryRuleRop() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRop = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:919:2: (iv_ruleRop= ruleRop EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:920:2: iv_ruleRop= ruleRop EOF
            {
             newCompositeNode(grammarAccess.getRopRule()); 
            pushFollow(FOLLOW_ruleRop_in_entryRuleRop1941);
            iv_ruleRop=ruleRop();

            state._fsp--;

             current =iv_ruleRop.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRop1952); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRop"


    // $ANTLR start "ruleRop"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:927:1: ruleRop returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_StringRop_0= ruleStringRop | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' ) ;
    public final AntlrDatatypeRuleToken ruleRop() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_StringRop_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:930:28: ( (this_StringRop_0= ruleStringRop | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:931:1: (this_StringRop_0= ruleStringRop | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:931:1: (this_StringRop_0= ruleStringRop | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' )
            int alt15=5;
            switch ( input.LA(1) ) {
            case 14:
            case 24:
                {
                alt15=1;
                }
                break;
            case 25:
                {
                alt15=2;
                }
                break;
            case 26:
                {
                alt15=3;
                }
                break;
            case 27:
                {
                alt15=4;
                }
                break;
            case 28:
                {
                alt15=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:932:5: this_StringRop_0= ruleStringRop
                    {
                     
                            newCompositeNode(grammarAccess.getRopAccess().getStringRopParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStringRop_in_ruleRop1999);
                    this_StringRop_0=ruleStringRop();

                    state._fsp--;


                    		current.merge(this_StringRop_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:944:2: kw= '<'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleRop2023); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRopAccess().getLessThanSignKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:951:2: kw= '<='
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleRop2042); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRopAccess().getLessThanSignEqualsSignKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:958:2: kw= '>'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleRop2061); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRopAccess().getGreaterThanSignKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:965:2: kw= '>='
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleRop2080); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRopAccess().getGreaterThanSignEqualsSignKeyword_4()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRop"


    // $ANTLR start "entryRuleFunction"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:978:1: entryRuleFunction returns [String current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final String entryRuleFunction() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunction = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:979:2: (iv_ruleFunction= ruleFunction EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:980:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction2121);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction2132); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:987:1: ruleFunction returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'uppercase' | kw= 'length' | this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleFunction() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:990:28: ( (kw= 'uppercase' | kw= 'length' | this_ID_2= RULE_ID ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:991:1: (kw= 'uppercase' | kw= 'length' | this_ID_2= RULE_ID )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:991:1: (kw= 'uppercase' | kw= 'length' | this_ID_2= RULE_ID )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt16=1;
                }
                break;
            case 30:
                {
                alt16=2;
                }
                break;
            case RULE_ID:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:992:2: kw= 'uppercase'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleFunction2170); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionAccess().getUppercaseKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:999:2: kw= 'length'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleFunction2189); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionAccess().getLengthKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1005:10: this_ID_2= RULE_ID
                    {
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunction2210); 

                    		current.merge(this_ID_2);
                        
                     
                        newLeafNode(this_ID_2, grammarAccess.getFunctionAccess().getIDTerminalRuleCall_2()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleConstant"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1020:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1021:2: (iv_ruleConstant= ruleConstant EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1022:2: iv_ruleConstant= ruleConstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_ruleConstant_in_entryRuleConstant2255);
            iv_ruleConstant=ruleConstant();

            state._fsp--;

             current =iv_ruleConstant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstant2265); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1029:1: ruleConstant returns [EObject current=null] : ( () ( ( (lv_int_1_0= RULE_NUMBER ) ) | ( (lv_string_2_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token lv_int_1_0=null;
        Token lv_string_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1032:28: ( ( () ( ( (lv_int_1_0= RULE_NUMBER ) ) | ( (lv_string_2_0= RULE_STRING ) ) ) ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1033:1: ( () ( ( (lv_int_1_0= RULE_NUMBER ) ) | ( (lv_string_2_0= RULE_STRING ) ) ) )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1033:1: ( () ( ( (lv_int_1_0= RULE_NUMBER ) ) | ( (lv_string_2_0= RULE_STRING ) ) ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1033:2: () ( ( (lv_int_1_0= RULE_NUMBER ) ) | ( (lv_string_2_0= RULE_STRING ) ) )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1033:2: ()
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1034:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getConstantAccess().getConstantAction_0(),
                        current);
                

            }

            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1039:2: ( ( (lv_int_1_0= RULE_NUMBER ) ) | ( (lv_string_2_0= RULE_STRING ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_NUMBER) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_STRING) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1039:3: ( (lv_int_1_0= RULE_NUMBER ) )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1039:3: ( (lv_int_1_0= RULE_NUMBER ) )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1040:1: (lv_int_1_0= RULE_NUMBER )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1040:1: (lv_int_1_0= RULE_NUMBER )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1041:3: lv_int_1_0= RULE_NUMBER
                    {
                    lv_int_1_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleConstant2317); 

                    			newLeafNode(lv_int_1_0, grammarAccess.getConstantAccess().getIntNUMBERTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstantRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"int",
                            		lv_int_1_0, 
                            		"NUMBER");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1058:6: ( (lv_string_2_0= RULE_STRING ) )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1058:6: ( (lv_string_2_0= RULE_STRING ) )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1059:1: (lv_string_2_0= RULE_STRING )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1059:1: (lv_string_2_0= RULE_STRING )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1060:3: lv_string_2_0= RULE_STRING
                    {
                    lv_string_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConstant2345); 

                    			newLeafNode(lv_string_2_0, grammarAccess.getConstantAccess().getStringSTRINGTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstantRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"string",
                            		lv_string_2_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleVariable"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1084:1: entryRuleVariable returns [String current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final String entryRuleVariable() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVariable = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1085:2: (iv_ruleVariable= ruleVariable EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1086:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable2388);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable2399); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1093:1: ruleVariable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '$' this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleVariable() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1096:28: ( (kw= '$' this_ID_1= RULE_ID ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1097:1: (kw= '$' this_ID_1= RULE_ID )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1097:1: (kw= '$' this_ID_1= RULE_ID )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1098:2: kw= '$' this_ID_1= RULE_ID
            {
            kw=(Token)match(input,31,FOLLOW_31_in_ruleVariable2437); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVariableAccess().getDollarSignKeyword_0()); 
                
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable2452); 

            		current.merge(this_ID_1);
                
             
                newLeafNode(this_ID_1, grammarAccess.getVariableAccess().getIDTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\25\uffff";
    static final String DFA4_eofS =
        "\25\uffff";
    static final String DFA4_minS =
        "\1\5\1\uffff\1\5\1\uffff\2\4\1\uffff\2\16\1\4\1\16\1\27\6\5\1\16"+
        "\2\27";
    static final String DFA4_maxS =
        "\1\37\1\uffff\1\37\1\uffff\2\4\1\uffff\2\37\1\5\1\34\1\27\2\6\4"+
        "\5\1\37\2\27";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\2\uffff\1\2\16\uffff";
    static final String DFA4_specialS =
        "\25\uffff}>";
    static final String[] DFA4_transitionS = {
            "\2\3\12\uffff\1\1\1\2\2\uffff\1\3\11\uffff\1\3",
            "",
            "\2\6\12\uffff\2\6\2\uffff\1\4\11\uffff\1\5",
            "",
            "\1\7",
            "\1\10",
            "",
            "\1\6\4\uffff\1\3\1\6\1\4\1\11\1\uffff\5\6\2\uffff\1\5",
            "\1\6\4\uffff\1\3\1\6\1\4\2\uffff\5\6\2\uffff\1\5",
            "\1\12\1\13",
            "\1\14\11\uffff\1\15\1\16\1\17\1\20\1\21",
            "\1\22",
            "\1\23\1\24",
            "\1\23\1\24",
            "\1\23",
            "\1\23",
            "\1\23",
            "\1\23",
            "\1\6\4\uffff\1\3\1\6\1\4\2\uffff\5\6\2\uffff\1\5",
            "\1\22",
            "\1\22"
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "326:1: (this_NegatedFormula_0= ruleNegatedFormula | this_BracedFormula_1= ruleBracedFormula | this_AssertionForm_2= ruleAssertionForm )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleModel131 = new BitSet(new long[]{0x0000000080262060L});
    public static final BitSet FOLLOW_ruleAssertionSet_in_ruleModel153 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleModel165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleDeclaration248 = new BitSet(new long[]{0x0000000080240000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleDeclaration269 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDeclaration281 = new BitSet(new long[]{0x0000000080260060L});
    public static final BitSet FOLLOW_ruleAssertion_in_ruleDeclaration302 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDeclaration314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionSet_in_entryRuleAssertionSet350 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertionSet360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionAnd_in_ruleAssertionSet407 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleAssertionSet428 = new BitSet(new long[]{0x0000000080260060L});
    public static final BitSet FOLLOW_ruleAssertionAnd_in_ruleAssertionSet449 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleAssertionAnd_in_entryRuleAssertionAnd487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertionAnd497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHighProrityAssertion_in_ruleAssertionAnd544 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleAssertionAnd565 = new BitSet(new long[]{0x0000000080260060L});
    public static final BitSet FOLLOW_ruleHighProrityAssertion_in_ruleAssertionAnd586 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleHighProrityAssertion_in_entryRuleHighProrityAssertion624 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHighProrityAssertion634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegatedFormula_in_ruleHighProrityAssertion681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBracedFormula_in_ruleHighProrityAssertion708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionForm_in_ruleHighProrityAssertion735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegatedFormula_in_entryRuleNegatedFormula770 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegatedFormula780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleNegatedFormula817 = new BitSet(new long[]{0x0000000080260060L});
    public static final BitSet FOLLOW_ruleAssertionSet_in_ruleNegatedFormula838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBracedFormula_in_entryRuleBracedFormula874 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBracedFormula884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleBracedFormula921 = new BitSet(new long[]{0x0000000080260060L});
    public static final BitSet FOLLOW_ruleAssertionSet_in_ruleBracedFormula943 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleBracedFormula954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionForm_in_entryRuleAssertionForm990 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertionForm1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertion_in_ruleAssertionForm1046 = new BitSet(new long[]{0x000000001F004000L});
    public static final BitSet FOLLOW_ruleRop_in_ruleAssertionForm1067 = new BitSet(new long[]{0x0000000080260060L});
    public static final BitSet FOLLOW_ruleAssertion_in_ruleAssertionForm1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertion_in_entryRuleAssertion1124 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertion1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuery_in_ruleAssertion1181 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleAssertion1194 = new BitSet(new long[]{0x0000000060000010L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleAssertion1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleAssertion1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuery_in_entryRuleQuery1281 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuery1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleQuery1329 = new BitSet(new long[]{0x0000000080240000L});
    public static final BitSet FOLLOW_ruleStep_in_ruleQuery1350 = new BitSet(new long[]{0x00000000802C0000L});
    public static final BitSet FOLLOW_19_in_ruleQuery1363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_ruleQuery1391 = new BitSet(new long[]{0x0000000080240002L});
    public static final BitSet FOLLOW_ruleStep_in_entryRuleStep1428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStep1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleStep1476 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStep1493 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleStep1511 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleStep1532 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleStep1544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleStep1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute1610 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute1620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute1663 = new BitSet(new long[]{0x000000001F004000L});
    public static final BitSet FOLLOW_ruleRop_in_ruleAttribute1691 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleAttribute1708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringRop_in_ruleAttribute1742 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute1759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleAttribute1790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringRop_in_entryRuleStringRop1832 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringRop1843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleStringRop1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleStringRop1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRop_in_entryRuleRop1941 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRop1952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringRop_in_ruleRop1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleRop2023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleRop2042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleRop2061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleRop2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction2121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction2132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleFunction2170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleFunction2189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunction2210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant2255 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstant2265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleConstant2317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConstant2345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable2388 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable2399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleVariable2437 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable2452 = new BitSet(new long[]{0x0000000000000002L});

}