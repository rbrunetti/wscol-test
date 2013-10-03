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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NUMBER", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'let'", "'='", "'||'", "'&&'", "'('", "')'", "'!'", "'in'", "','", "'.'", "'/'", "'['", "']'", "'!='", "'<'", "'<='", "'>'", "'>='", "'uppercase'", "'length'", "'forall'", "'exists'", "'numOf'", "'$'"
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
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_declarations_0_0= ruleDeclaration ) )* ( (lv_assertionSet_1_0= ruleAssertionOr ) ) otherlv_2= ';' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_declarations_0_0 = null;

        EObject lv_assertionSet_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:79:28: ( ( ( (lv_declarations_0_0= ruleDeclaration ) )* ( (lv_assertionSet_1_0= ruleAssertionOr ) ) otherlv_2= ';' ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:80:1: ( ( (lv_declarations_0_0= ruleDeclaration ) )* ( (lv_assertionSet_1_0= ruleAssertionOr ) ) otherlv_2= ';' )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:80:1: ( ( (lv_declarations_0_0= ruleDeclaration ) )* ( (lv_assertionSet_1_0= ruleAssertionOr ) ) otherlv_2= ';' )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:80:2: ( (lv_declarations_0_0= ruleDeclaration ) )* ( (lv_assertionSet_1_0= ruleAssertionOr ) ) otherlv_2= ';'
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

            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:98:3: ( (lv_assertionSet_1_0= ruleAssertionOr ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:99:1: (lv_assertionSet_1_0= ruleAssertionOr )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:99:1: (lv_assertionSet_1_0= ruleAssertionOr )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:100:3: lv_assertionSet_1_0= ruleAssertionOr
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getAssertionSetAssertionOrParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAssertionOr_in_ruleModel153);
            lv_assertionSet_1_0=ruleAssertionOr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		set(
                   			current, 
                   			"assertionSet",
                    		lv_assertionSet_1_0, 
                    		"AssertionOr");
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


    // $ANTLR start "entryRuleAssertionOr"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:197:1: entryRuleAssertionOr returns [EObject current=null] : iv_ruleAssertionOr= ruleAssertionOr EOF ;
    public final EObject entryRuleAssertionOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertionOr = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:198:2: (iv_ruleAssertionOr= ruleAssertionOr EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:199:2: iv_ruleAssertionOr= ruleAssertionOr EOF
            {
             newCompositeNode(grammarAccess.getAssertionOrRule()); 
            pushFollow(FOLLOW_ruleAssertionOr_in_entryRuleAssertionOr350);
            iv_ruleAssertionOr=ruleAssertionOr();

            state._fsp--;

             current =iv_ruleAssertionOr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertionOr360); 

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
    // $ANTLR end "entryRuleAssertionOr"


    // $ANTLR start "ruleAssertionOr"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:206:1: ruleAssertionOr returns [EObject current=null] : (this_AssertionAnd_0= ruleAssertionAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAssertionAnd ) ) )* ) ;
    public final EObject ruleAssertionOr() throws RecognitionException {
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
             
                    newCompositeNode(grammarAccess.getAssertionOrAccess().getAssertionAndParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAssertionAnd_in_ruleAssertionOr407);
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
            	                grammarAccess.getAssertionOrAccess().getAssertionOrLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleAssertionOr428); 

            	        	newLeafNode(otherlv_2, grammarAccess.getAssertionOrAccess().getVerticalLineVerticalLineKeyword_1_1());
            	        
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:229:1: ( (lv_right_3_0= ruleAssertionAnd ) )
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:230:1: (lv_right_3_0= ruleAssertionAnd )
            	    {
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:230:1: (lv_right_3_0= ruleAssertionAnd )
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:231:3: lv_right_3_0= ruleAssertionAnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAssertionOrAccess().getRightAssertionAndParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAssertionAnd_in_ruleAssertionOr449);
            	    lv_right_3_0=ruleAssertionAnd();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAssertionOrRule());
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
    // $ANTLR end "ruleAssertionOr"


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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:322:1: ruleHighProrityAssertion returns [EObject current=null] : (this_AssertionNot_0= ruleAssertionNot | this_AssertionForm_1= ruleAssertionForm | this_AssertionBraced_2= ruleAssertionBraced | this_AssertionQuantified_3= ruleAssertionQuantified ) ;
    public final EObject ruleHighProrityAssertion() throws RecognitionException {
        EObject current = null;

        EObject this_AssertionNot_0 = null;

        EObject this_AssertionForm_1 = null;

        EObject this_AssertionBraced_2 = null;

        EObject this_AssertionQuantified_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:325:28: ( (this_AssertionNot_0= ruleAssertionNot | this_AssertionForm_1= ruleAssertionForm | this_AssertionBraced_2= ruleAssertionBraced | this_AssertionQuantified_3= ruleAssertionQuantified ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:326:1: (this_AssertionNot_0= ruleAssertionNot | this_AssertionForm_1= ruleAssertionForm | this_AssertionBraced_2= ruleAssertionBraced | this_AssertionQuantified_3= ruleAssertionQuantified )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:326:1: (this_AssertionNot_0= ruleAssertionNot | this_AssertionForm_1= ruleAssertionForm | this_AssertionBraced_2= ruleAssertionBraced | this_AssertionQuantified_3= ruleAssertionQuantified )
            int alt4=4;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:327:5: this_AssertionNot_0= ruleAssertionNot
                    {
                     
                            newCompositeNode(grammarAccess.getHighProrityAssertionAccess().getAssertionNotParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAssertionNot_in_ruleHighProrityAssertion681);
                    this_AssertionNot_0=ruleAssertionNot();

                    state._fsp--;

                     
                            current = this_AssertionNot_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:337:5: this_AssertionForm_1= ruleAssertionForm
                    {
                     
                            newCompositeNode(grammarAccess.getHighProrityAssertionAccess().getAssertionFormParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAssertionForm_in_ruleHighProrityAssertion708);
                    this_AssertionForm_1=ruleAssertionForm();

                    state._fsp--;

                     
                            current = this_AssertionForm_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:347:5: this_AssertionBraced_2= ruleAssertionBraced
                    {
                     
                            newCompositeNode(grammarAccess.getHighProrityAssertionAccess().getAssertionBracedParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleAssertionBraced_in_ruleHighProrityAssertion735);
                    this_AssertionBraced_2=ruleAssertionBraced();

                    state._fsp--;

                     
                            current = this_AssertionBraced_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:357:5: this_AssertionQuantified_3= ruleAssertionQuantified
                    {
                     
                            newCompositeNode(grammarAccess.getHighProrityAssertionAccess().getAssertionQuantifiedParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleAssertionQuantified_in_ruleHighProrityAssertion762);
                    this_AssertionQuantified_3=ruleAssertionQuantified();

                    state._fsp--;

                     
                            current = this_AssertionQuantified_3; 
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


    // $ANTLR start "entryRuleAssertionBraced"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:373:1: entryRuleAssertionBraced returns [EObject current=null] : iv_ruleAssertionBraced= ruleAssertionBraced EOF ;
    public final EObject entryRuleAssertionBraced() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertionBraced = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:374:2: (iv_ruleAssertionBraced= ruleAssertionBraced EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:375:2: iv_ruleAssertionBraced= ruleAssertionBraced EOF
            {
             newCompositeNode(grammarAccess.getAssertionBracedRule()); 
            pushFollow(FOLLOW_ruleAssertionBraced_in_entryRuleAssertionBraced797);
            iv_ruleAssertionBraced=ruleAssertionBraced();

            state._fsp--;

             current =iv_ruleAssertionBraced; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertionBraced807); 

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
    // $ANTLR end "entryRuleAssertionBraced"


    // $ANTLR start "ruleAssertionBraced"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:382:1: ruleAssertionBraced returns [EObject current=null] : (otherlv_0= '(' ( (lv_innerFormula_1_0= ruleAssertionOr ) ) otherlv_2= ')' ) ;
    public final EObject ruleAssertionBraced() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_innerFormula_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:385:28: ( (otherlv_0= '(' ( (lv_innerFormula_1_0= ruleAssertionOr ) ) otherlv_2= ')' ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:386:1: (otherlv_0= '(' ( (lv_innerFormula_1_0= ruleAssertionOr ) ) otherlv_2= ')' )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:386:1: (otherlv_0= '(' ( (lv_innerFormula_1_0= ruleAssertionOr ) ) otherlv_2= ')' )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:386:3: otherlv_0= '(' ( (lv_innerFormula_1_0= ruleAssertionOr ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleAssertionBraced844); 

                	newLeafNode(otherlv_0, grammarAccess.getAssertionBracedAccess().getLeftParenthesisKeyword_0());
                
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:390:1: ( (lv_innerFormula_1_0= ruleAssertionOr ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:391:1: (lv_innerFormula_1_0= ruleAssertionOr )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:391:1: (lv_innerFormula_1_0= ruleAssertionOr )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:392:3: lv_innerFormula_1_0= ruleAssertionOr
            {
             
            	        newCompositeNode(grammarAccess.getAssertionBracedAccess().getInnerFormulaAssertionOrParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAssertionOr_in_ruleAssertionBraced865);
            lv_innerFormula_1_0=ruleAssertionOr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssertionBracedRule());
            	        }
                   		set(
                   			current, 
                   			"innerFormula",
                    		lv_innerFormula_1_0, 
                    		"AssertionOr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleAssertionBraced877); 

                	newLeafNode(otherlv_2, grammarAccess.getAssertionBracedAccess().getRightParenthesisKeyword_2());
                

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
    // $ANTLR end "ruleAssertionBraced"


    // $ANTLR start "entryRuleAssertionNot"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:420:1: entryRuleAssertionNot returns [EObject current=null] : iv_ruleAssertionNot= ruleAssertionNot EOF ;
    public final EObject entryRuleAssertionNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertionNot = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:421:2: (iv_ruleAssertionNot= ruleAssertionNot EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:422:2: iv_ruleAssertionNot= ruleAssertionNot EOF
            {
             newCompositeNode(grammarAccess.getAssertionNotRule()); 
            pushFollow(FOLLOW_ruleAssertionNot_in_entryRuleAssertionNot913);
            iv_ruleAssertionNot=ruleAssertionNot();

            state._fsp--;

             current =iv_ruleAssertionNot; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertionNot923); 

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
    // $ANTLR end "entryRuleAssertionNot"


    // $ANTLR start "ruleAssertionNot"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:429:1: ruleAssertionNot returns [EObject current=null] : (otherlv_0= '!' otherlv_1= '(' ( (lv_innerFormula_2_0= ruleAssertionOr ) ) otherlv_3= ')' ) ;
    public final EObject ruleAssertionNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_innerFormula_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:432:28: ( (otherlv_0= '!' otherlv_1= '(' ( (lv_innerFormula_2_0= ruleAssertionOr ) ) otherlv_3= ')' ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:433:1: (otherlv_0= '!' otherlv_1= '(' ( (lv_innerFormula_2_0= ruleAssertionOr ) ) otherlv_3= ')' )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:433:1: (otherlv_0= '!' otherlv_1= '(' ( (lv_innerFormula_2_0= ruleAssertionOr ) ) otherlv_3= ')' )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:433:3: otherlv_0= '!' otherlv_1= '(' ( (lv_innerFormula_2_0= ruleAssertionOr ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleAssertionNot960); 

                	newLeafNode(otherlv_0, grammarAccess.getAssertionNotAccess().getExclamationMarkKeyword_0());
                
            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleAssertionNot972); 

                	newLeafNode(otherlv_1, grammarAccess.getAssertionNotAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:441:1: ( (lv_innerFormula_2_0= ruleAssertionOr ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:442:1: (lv_innerFormula_2_0= ruleAssertionOr )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:442:1: (lv_innerFormula_2_0= ruleAssertionOr )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:443:3: lv_innerFormula_2_0= ruleAssertionOr
            {
             
            	        newCompositeNode(grammarAccess.getAssertionNotAccess().getInnerFormulaAssertionOrParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAssertionOr_in_ruleAssertionNot993);
            lv_innerFormula_2_0=ruleAssertionOr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssertionNotRule());
            	        }
                   		set(
                   			current, 
                   			"innerFormula",
                    		lv_innerFormula_2_0, 
                    		"AssertionOr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleAssertionNot1005); 

                	newLeafNode(otherlv_3, grammarAccess.getAssertionNotAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleAssertionNot"


    // $ANTLR start "entryRuleAssertionQuantified"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:471:1: entryRuleAssertionQuantified returns [EObject current=null] : iv_ruleAssertionQuantified= ruleAssertionQuantified EOF ;
    public final EObject entryRuleAssertionQuantified() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertionQuantified = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:472:2: (iv_ruleAssertionQuantified= ruleAssertionQuantified EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:473:2: iv_ruleAssertionQuantified= ruleAssertionQuantified EOF
            {
             newCompositeNode(grammarAccess.getAssertionQuantifiedRule()); 
            pushFollow(FOLLOW_ruleAssertionQuantified_in_entryRuleAssertionQuantified1041);
            iv_ruleAssertionQuantified=ruleAssertionQuantified();

            state._fsp--;

             current =iv_ruleAssertionQuantified; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertionQuantified1051); 

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
    // $ANTLR end "entryRuleAssertionQuantified"


    // $ANTLR start "ruleAssertionQuantified"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:480:1: ruleAssertionQuantified returns [EObject current=null] : ( ( (lv_quantifier_0_0= ruleQuantifier ) ) otherlv_1= '(' ( (lv_alias_2_0= ruleVariable ) ) otherlv_3= 'in' ( (lv_values_4_0= ruleVariable ) ) otherlv_5= ',' ( (lv_conditions_6_0= ruleAssertionOr ) ) otherlv_7= ')' ) ;
    public final EObject ruleAssertionQuantified() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_quantifier_0_0 = null;

        AntlrDatatypeRuleToken lv_alias_2_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;

        EObject lv_conditions_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:483:28: ( ( ( (lv_quantifier_0_0= ruleQuantifier ) ) otherlv_1= '(' ( (lv_alias_2_0= ruleVariable ) ) otherlv_3= 'in' ( (lv_values_4_0= ruleVariable ) ) otherlv_5= ',' ( (lv_conditions_6_0= ruleAssertionOr ) ) otherlv_7= ')' ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:484:1: ( ( (lv_quantifier_0_0= ruleQuantifier ) ) otherlv_1= '(' ( (lv_alias_2_0= ruleVariable ) ) otherlv_3= 'in' ( (lv_values_4_0= ruleVariable ) ) otherlv_5= ',' ( (lv_conditions_6_0= ruleAssertionOr ) ) otherlv_7= ')' )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:484:1: ( ( (lv_quantifier_0_0= ruleQuantifier ) ) otherlv_1= '(' ( (lv_alias_2_0= ruleVariable ) ) otherlv_3= 'in' ( (lv_values_4_0= ruleVariable ) ) otherlv_5= ',' ( (lv_conditions_6_0= ruleAssertionOr ) ) otherlv_7= ')' )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:484:2: ( (lv_quantifier_0_0= ruleQuantifier ) ) otherlv_1= '(' ( (lv_alias_2_0= ruleVariable ) ) otherlv_3= 'in' ( (lv_values_4_0= ruleVariable ) ) otherlv_5= ',' ( (lv_conditions_6_0= ruleAssertionOr ) ) otherlv_7= ')'
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:484:2: ( (lv_quantifier_0_0= ruleQuantifier ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:485:1: (lv_quantifier_0_0= ruleQuantifier )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:485:1: (lv_quantifier_0_0= ruleQuantifier )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:486:3: lv_quantifier_0_0= ruleQuantifier
            {
             
            	        newCompositeNode(grammarAccess.getAssertionQuantifiedAccess().getQuantifierQuantifierParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQuantifier_in_ruleAssertionQuantified1097);
            lv_quantifier_0_0=ruleQuantifier();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssertionQuantifiedRule());
            	        }
                   		set(
                   			current, 
                   			"quantifier",
                    		lv_quantifier_0_0, 
                    		"Quantifier");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleAssertionQuantified1109); 

                	newLeafNode(otherlv_1, grammarAccess.getAssertionQuantifiedAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:506:1: ( (lv_alias_2_0= ruleVariable ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:507:1: (lv_alias_2_0= ruleVariable )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:507:1: (lv_alias_2_0= ruleVariable )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:508:3: lv_alias_2_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getAssertionQuantifiedAccess().getAliasVariableParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVariable_in_ruleAssertionQuantified1130);
            lv_alias_2_0=ruleVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssertionQuantifiedRule());
            	        }
                   		set(
                   			current, 
                   			"alias",
                    		lv_alias_2_0, 
                    		"Variable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleAssertionQuantified1142); 

                	newLeafNode(otherlv_3, grammarAccess.getAssertionQuantifiedAccess().getInKeyword_3());
                
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:528:1: ( (lv_values_4_0= ruleVariable ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:529:1: (lv_values_4_0= ruleVariable )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:529:1: (lv_values_4_0= ruleVariable )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:530:3: lv_values_4_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getAssertionQuantifiedAccess().getValuesVariableParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleVariable_in_ruleAssertionQuantified1163);
            lv_values_4_0=ruleVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssertionQuantifiedRule());
            	        }
                   		set(
                   			current, 
                   			"values",
                    		lv_values_4_0, 
                    		"Variable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleAssertionQuantified1175); 

                	newLeafNode(otherlv_5, grammarAccess.getAssertionQuantifiedAccess().getCommaKeyword_5());
                
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:550:1: ( (lv_conditions_6_0= ruleAssertionOr ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:551:1: (lv_conditions_6_0= ruleAssertionOr )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:551:1: (lv_conditions_6_0= ruleAssertionOr )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:552:3: lv_conditions_6_0= ruleAssertionOr
            {
             
            	        newCompositeNode(grammarAccess.getAssertionQuantifiedAccess().getConditionsAssertionOrParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleAssertionOr_in_ruleAssertionQuantified1196);
            lv_conditions_6_0=ruleAssertionOr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssertionQuantifiedRule());
            	        }
                   		add(
                   			current, 
                   			"conditions",
                    		lv_conditions_6_0, 
                    		"AssertionOr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleAssertionQuantified1208); 

                	newLeafNode(otherlv_7, grammarAccess.getAssertionQuantifiedAccess().getRightParenthesisKeyword_7());
                

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
    // $ANTLR end "ruleAssertionQuantified"


    // $ANTLR start "entryRuleAssertionForm"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:580:1: entryRuleAssertionForm returns [EObject current=null] : iv_ruleAssertionForm= ruleAssertionForm EOF ;
    public final EObject entryRuleAssertionForm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertionForm = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:581:2: (iv_ruleAssertionForm= ruleAssertionForm EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:582:2: iv_ruleAssertionForm= ruleAssertionForm EOF
            {
             newCompositeNode(grammarAccess.getAssertionFormRule()); 
            pushFollow(FOLLOW_ruleAssertionForm_in_entryRuleAssertionForm1244);
            iv_ruleAssertionForm=ruleAssertionForm();

            state._fsp--;

             current =iv_ruleAssertionForm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertionForm1254); 

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:589:1: ruleAssertionForm returns [EObject current=null] : ( ( (lv_leftAssert_0_0= ruleAssertion ) ) ( (lv_op_1_0= ruleRop ) ) ( (lv_rightAssert_2_0= ruleAssertion ) ) ) ;
    public final EObject ruleAssertionForm() throws RecognitionException {
        EObject current = null;

        EObject lv_leftAssert_0_0 = null;

        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_rightAssert_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:592:28: ( ( ( (lv_leftAssert_0_0= ruleAssertion ) ) ( (lv_op_1_0= ruleRop ) ) ( (lv_rightAssert_2_0= ruleAssertion ) ) ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:593:1: ( ( (lv_leftAssert_0_0= ruleAssertion ) ) ( (lv_op_1_0= ruleRop ) ) ( (lv_rightAssert_2_0= ruleAssertion ) ) )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:593:1: ( ( (lv_leftAssert_0_0= ruleAssertion ) ) ( (lv_op_1_0= ruleRop ) ) ( (lv_rightAssert_2_0= ruleAssertion ) ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:593:2: ( (lv_leftAssert_0_0= ruleAssertion ) ) ( (lv_op_1_0= ruleRop ) ) ( (lv_rightAssert_2_0= ruleAssertion ) )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:593:2: ( (lv_leftAssert_0_0= ruleAssertion ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:594:1: (lv_leftAssert_0_0= ruleAssertion )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:594:1: (lv_leftAssert_0_0= ruleAssertion )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:595:3: lv_leftAssert_0_0= ruleAssertion
            {
             
            	        newCompositeNode(grammarAccess.getAssertionFormAccess().getLeftAssertAssertionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAssertion_in_ruleAssertionForm1300);
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

            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:611:2: ( (lv_op_1_0= ruleRop ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:612:1: (lv_op_1_0= ruleRop )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:612:1: (lv_op_1_0= ruleRop )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:613:3: lv_op_1_0= ruleRop
            {
             
            	        newCompositeNode(grammarAccess.getAssertionFormAccess().getOpRopParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleRop_in_ruleAssertionForm1321);
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

            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:629:2: ( (lv_rightAssert_2_0= ruleAssertion ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:630:1: (lv_rightAssert_2_0= ruleAssertion )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:630:1: (lv_rightAssert_2_0= ruleAssertion )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:631:3: lv_rightAssert_2_0= ruleAssertion
            {
             
            	        newCompositeNode(grammarAccess.getAssertionFormAccess().getRightAssertAssertionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAssertion_in_ruleAssertionForm1342);
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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:655:1: entryRuleAssertion returns [EObject current=null] : iv_ruleAssertion= ruleAssertion EOF ;
    public final EObject entryRuleAssertion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertion = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:656:2: (iv_ruleAssertion= ruleAssertion EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:657:2: iv_ruleAssertion= ruleAssertion EOF
            {
             newCompositeNode(grammarAccess.getAssertionRule()); 
            pushFollow(FOLLOW_ruleAssertion_in_entryRuleAssertion1378);
            iv_ruleAssertion=ruleAssertion();

            state._fsp--;

             current =iv_ruleAssertion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertion1388); 

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:664:1: ruleAssertion returns [EObject current=null] : ( ( ( (lv_query_0_0= ruleQuery ) ) (otherlv_1= '.' ( (lv_function_2_0= ruleFunction ) ) )? ) | ( (lv_constant_3_0= ruleConstant ) ) | ( (lv_values_4_0= ruleValues ) ) ) ;
    public final EObject ruleAssertion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_query_0_0 = null;

        AntlrDatatypeRuleToken lv_function_2_0 = null;

        EObject lv_constant_3_0 = null;

        EObject lv_values_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:667:28: ( ( ( ( (lv_query_0_0= ruleQuery ) ) (otherlv_1= '.' ( (lv_function_2_0= ruleFunction ) ) )? ) | ( (lv_constant_3_0= ruleConstant ) ) | ( (lv_values_4_0= ruleValues ) ) ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:668:1: ( ( ( (lv_query_0_0= ruleQuery ) ) (otherlv_1= '.' ( (lv_function_2_0= ruleFunction ) ) )? ) | ( (lv_constant_3_0= ruleConstant ) ) | ( (lv_values_4_0= ruleValues ) ) )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:668:1: ( ( ( (lv_query_0_0= ruleQuery ) ) (otherlv_1= '.' ( (lv_function_2_0= ruleFunction ) ) )? ) | ( (lv_constant_3_0= ruleConstant ) ) | ( (lv_values_4_0= ruleValues ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 17:
            case 23:
            case 36:
                {
                alt6=1;
                }
                break;
            case RULE_NUMBER:
            case RULE_STRING:
                {
                alt6=2;
                }
                break;
            case 24:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:668:2: ( ( (lv_query_0_0= ruleQuery ) ) (otherlv_1= '.' ( (lv_function_2_0= ruleFunction ) ) )? )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:668:2: ( ( (lv_query_0_0= ruleQuery ) ) (otherlv_1= '.' ( (lv_function_2_0= ruleFunction ) ) )? )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:668:3: ( (lv_query_0_0= ruleQuery ) ) (otherlv_1= '.' ( (lv_function_2_0= ruleFunction ) ) )?
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:668:3: ( (lv_query_0_0= ruleQuery ) )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:669:1: (lv_query_0_0= ruleQuery )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:669:1: (lv_query_0_0= ruleQuery )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:670:3: lv_query_0_0= ruleQuery
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssertionAccess().getQueryQueryParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQuery_in_ruleAssertion1435);
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

                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:686:2: (otherlv_1= '.' ( (lv_function_2_0= ruleFunction ) ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==22) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:686:4: otherlv_1= '.' ( (lv_function_2_0= ruleFunction ) )
                            {
                            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleAssertion1448); 

                                	newLeafNode(otherlv_1, grammarAccess.getAssertionAccess().getFullStopKeyword_0_1_0());
                                
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:690:1: ( (lv_function_2_0= ruleFunction ) )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:691:1: (lv_function_2_0= ruleFunction )
                            {
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:691:1: (lv_function_2_0= ruleFunction )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:692:3: lv_function_2_0= ruleFunction
                            {
                             
                            	        newCompositeNode(grammarAccess.getAssertionAccess().getFunctionFunctionParserRuleCall_0_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleFunction_in_ruleAssertion1469);
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
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:709:6: ( (lv_constant_3_0= ruleConstant ) )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:709:6: ( (lv_constant_3_0= ruleConstant ) )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:710:1: (lv_constant_3_0= ruleConstant )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:710:1: (lv_constant_3_0= ruleConstant )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:711:3: lv_constant_3_0= ruleConstant
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssertionAccess().getConstantConstantParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConstant_in_ruleAssertion1499);
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
                case 3 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:728:6: ( (lv_values_4_0= ruleValues ) )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:728:6: ( (lv_values_4_0= ruleValues ) )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:729:1: (lv_values_4_0= ruleValues )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:729:1: (lv_values_4_0= ruleValues )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:730:3: lv_values_4_0= ruleValues
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssertionAccess().getValuesValuesParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValues_in_ruleAssertion1526);
                    lv_values_4_0=ruleValues();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssertionRule());
                    	        }
                           		set(
                           			current, 
                           			"values",
                            		lv_values_4_0, 
                            		"Values");
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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:754:1: entryRuleQuery returns [EObject current=null] : iv_ruleQuery= ruleQuery EOF ;
    public final EObject entryRuleQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuery = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:755:2: (iv_ruleQuery= ruleQuery EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:756:2: iv_ruleQuery= ruleQuery EOF
            {
             newCompositeNode(grammarAccess.getQueryRule()); 
            pushFollow(FOLLOW_ruleQuery_in_entryRuleQuery1562);
            iv_ruleQuery=ruleQuery();

            state._fsp--;

             current =iv_ruleQuery; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuery1572); 

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:763:1: ruleQuery returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_steps_1_0= ruleStep ) )+ otherlv_2= ')' ) | ( (lv_steps_3_0= ruleStep ) )+ ) ;
    public final EObject ruleQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_steps_1_0 = null;

        EObject lv_steps_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:766:28: ( ( (otherlv_0= '(' ( (lv_steps_1_0= ruleStep ) )+ otherlv_2= ')' ) | ( (lv_steps_3_0= ruleStep ) )+ ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:767:1: ( (otherlv_0= '(' ( (lv_steps_1_0= ruleStep ) )+ otherlv_2= ')' ) | ( (lv_steps_3_0= ruleStep ) )+ )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:767:1: ( (otherlv_0= '(' ( (lv_steps_1_0= ruleStep ) )+ otherlv_2= ')' ) | ( (lv_steps_3_0= ruleStep ) )+ )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            else if ( (LA9_0==23||LA9_0==36) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:767:2: (otherlv_0= '(' ( (lv_steps_1_0= ruleStep ) )+ otherlv_2= ')' )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:767:2: (otherlv_0= '(' ( (lv_steps_1_0= ruleStep ) )+ otherlv_2= ')' )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:767:4: otherlv_0= '(' ( (lv_steps_1_0= ruleStep ) )+ otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleQuery1610); 

                        	newLeafNode(otherlv_0, grammarAccess.getQueryAccess().getLeftParenthesisKeyword_0_0());
                        
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:771:1: ( (lv_steps_1_0= ruleStep ) )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==23||LA7_0==36) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:772:1: (lv_steps_1_0= ruleStep )
                    	    {
                    	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:772:1: (lv_steps_1_0= ruleStep )
                    	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:773:3: lv_steps_1_0= ruleStep
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getQueryAccess().getStepsStepParserRuleCall_0_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleStep_in_ruleQuery1631);
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

                    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleQuery1644); 

                        	newLeafNode(otherlv_2, grammarAccess.getQueryAccess().getRightParenthesisKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:794:6: ( (lv_steps_3_0= ruleStep ) )+
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:794:6: ( (lv_steps_3_0= ruleStep ) )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==23||LA8_0==36) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:795:1: (lv_steps_3_0= ruleStep )
                    	    {
                    	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:795:1: (lv_steps_3_0= ruleStep )
                    	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:796:3: lv_steps_3_0= ruleStep
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getQueryAccess().getStepsStepParserRuleCall_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleStep_in_ruleQuery1672);
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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:820:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:821:2: (iv_ruleStep= ruleStep EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:822:2: iv_ruleStep= ruleStep EOF
            {
             newCompositeNode(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_ruleStep_in_entryRuleStep1709);
            iv_ruleStep=ruleStep();

            state._fsp--;

             current =iv_ruleStep; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStep1719); 

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:829:1: ruleStep returns [EObject current=null] : ( (otherlv_0= '/' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_attribute_3_0= ruleAttribute ) ) otherlv_4= ']' )? ) | ( (lv_placeholder_5_0= ruleVariable ) ) ) ;
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
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:832:28: ( ( (otherlv_0= '/' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_attribute_3_0= ruleAttribute ) ) otherlv_4= ']' )? ) | ( (lv_placeholder_5_0= ruleVariable ) ) ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:833:1: ( (otherlv_0= '/' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_attribute_3_0= ruleAttribute ) ) otherlv_4= ']' )? ) | ( (lv_placeholder_5_0= ruleVariable ) ) )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:833:1: ( (otherlv_0= '/' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_attribute_3_0= ruleAttribute ) ) otherlv_4= ']' )? ) | ( (lv_placeholder_5_0= ruleVariable ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            else if ( (LA11_0==36) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:833:2: (otherlv_0= '/' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_attribute_3_0= ruleAttribute ) ) otherlv_4= ']' )? )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:833:2: (otherlv_0= '/' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_attribute_3_0= ruleAttribute ) ) otherlv_4= ']' )? )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:833:4: otherlv_0= '/' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_attribute_3_0= ruleAttribute ) ) otherlv_4= ']' )?
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleStep1757); 

                        	newLeafNode(otherlv_0, grammarAccess.getStepAccess().getSolidusKeyword_0_0());
                        
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:837:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:838:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:838:1: (lv_name_1_0= RULE_ID )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:839:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStep1774); 

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

                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:855:2: (otherlv_2= '[' ( (lv_attribute_3_0= ruleAttribute ) ) otherlv_4= ']' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==24) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:855:4: otherlv_2= '[' ( (lv_attribute_3_0= ruleAttribute ) ) otherlv_4= ']'
                            {
                            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleStep1792); 

                                	newLeafNode(otherlv_2, grammarAccess.getStepAccess().getLeftSquareBracketKeyword_0_2_0());
                                
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:859:1: ( (lv_attribute_3_0= ruleAttribute ) )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:860:1: (lv_attribute_3_0= ruleAttribute )
                            {
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:860:1: (lv_attribute_3_0= ruleAttribute )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:861:3: lv_attribute_3_0= ruleAttribute
                            {
                             
                            	        newCompositeNode(grammarAccess.getStepAccess().getAttributeAttributeParserRuleCall_0_2_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleAttribute_in_ruleStep1813);
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

                            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleStep1825); 

                                	newLeafNode(otherlv_4, grammarAccess.getStepAccess().getRightSquareBracketKeyword_0_2_2());
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:882:6: ( (lv_placeholder_5_0= ruleVariable ) )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:882:6: ( (lv_placeholder_5_0= ruleVariable ) )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:883:1: (lv_placeholder_5_0= ruleVariable )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:883:1: (lv_placeholder_5_0= ruleVariable )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:884:3: lv_placeholder_5_0= ruleVariable
                    {
                     
                    	        newCompositeNode(grammarAccess.getStepAccess().getPlaceholderVariableParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariable_in_ruleStep1855);
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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:908:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:909:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:910:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute1891);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute1901); 

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:917:1: ruleAttribute returns [EObject current=null] : ( ( ( (lv_property_0_0= RULE_ID ) ) ( ( ( (lv_op_1_0= ruleRop ) ) ( (lv_numberValue_2_0= RULE_NUMBER ) ) ) | ( ( (lv_op_3_0= ruleStringRop ) ) ( (lv_strValue_4_0= RULE_STRING ) ) ) ) ) | ( (lv_number_5_0= RULE_NUMBER ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_property_0_0=null;
        Token lv_numberValue_2_0=null;
        Token lv_strValue_4_0=null;
        Token lv_number_5_0=null;
        AntlrDatatypeRuleToken lv_op_1_0 = null;

        AntlrDatatypeRuleToken lv_op_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:920:28: ( ( ( ( (lv_property_0_0= RULE_ID ) ) ( ( ( (lv_op_1_0= ruleRop ) ) ( (lv_numberValue_2_0= RULE_NUMBER ) ) ) | ( ( (lv_op_3_0= ruleStringRop ) ) ( (lv_strValue_4_0= RULE_STRING ) ) ) ) ) | ( (lv_number_5_0= RULE_NUMBER ) ) ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:921:1: ( ( ( (lv_property_0_0= RULE_ID ) ) ( ( ( (lv_op_1_0= ruleRop ) ) ( (lv_numberValue_2_0= RULE_NUMBER ) ) ) | ( ( (lv_op_3_0= ruleStringRop ) ) ( (lv_strValue_4_0= RULE_STRING ) ) ) ) ) | ( (lv_number_5_0= RULE_NUMBER ) ) )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:921:1: ( ( ( (lv_property_0_0= RULE_ID ) ) ( ( ( (lv_op_1_0= ruleRop ) ) ( (lv_numberValue_2_0= RULE_NUMBER ) ) ) | ( ( (lv_op_3_0= ruleStringRop ) ) ( (lv_strValue_4_0= RULE_STRING ) ) ) ) ) | ( (lv_number_5_0= RULE_NUMBER ) ) )
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
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:921:2: ( ( (lv_property_0_0= RULE_ID ) ) ( ( ( (lv_op_1_0= ruleRop ) ) ( (lv_numberValue_2_0= RULE_NUMBER ) ) ) | ( ( (lv_op_3_0= ruleStringRop ) ) ( (lv_strValue_4_0= RULE_STRING ) ) ) ) )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:921:2: ( ( (lv_property_0_0= RULE_ID ) ) ( ( ( (lv_op_1_0= ruleRop ) ) ( (lv_numberValue_2_0= RULE_NUMBER ) ) ) | ( ( (lv_op_3_0= ruleStringRop ) ) ( (lv_strValue_4_0= RULE_STRING ) ) ) ) )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:921:3: ( (lv_property_0_0= RULE_ID ) ) ( ( ( (lv_op_1_0= ruleRop ) ) ( (lv_numberValue_2_0= RULE_NUMBER ) ) ) | ( ( (lv_op_3_0= ruleStringRop ) ) ( (lv_strValue_4_0= RULE_STRING ) ) ) )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:921:3: ( (lv_property_0_0= RULE_ID ) )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:922:1: (lv_property_0_0= RULE_ID )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:922:1: (lv_property_0_0= RULE_ID )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:923:3: lv_property_0_0= RULE_ID
                    {
                    lv_property_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute1944); 

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

                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:939:2: ( ( ( (lv_op_1_0= ruleRop ) ) ( (lv_numberValue_2_0= RULE_NUMBER ) ) ) | ( ( (lv_op_3_0= ruleStringRop ) ) ( (lv_strValue_4_0= RULE_STRING ) ) ) )
                    int alt12=2;
                    switch ( input.LA(1) ) {
                    case 14:
                        {
                        int LA12_1 = input.LA(2);

                        if ( (LA12_1==RULE_STRING) ) {
                            alt12=2;
                        }
                        else if ( (LA12_1==RULE_NUMBER) ) {
                            alt12=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 12, 1, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 26:
                        {
                        int LA12_2 = input.LA(2);

                        if ( (LA12_2==RULE_STRING) ) {
                            alt12=2;
                        }
                        else if ( (LA12_2==RULE_NUMBER) ) {
                            alt12=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 12, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 27:
                    case 28:
                    case 29:
                    case 30:
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
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:939:3: ( ( (lv_op_1_0= ruleRop ) ) ( (lv_numberValue_2_0= RULE_NUMBER ) ) )
                            {
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:939:3: ( ( (lv_op_1_0= ruleRop ) ) ( (lv_numberValue_2_0= RULE_NUMBER ) ) )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:939:4: ( (lv_op_1_0= ruleRop ) ) ( (lv_numberValue_2_0= RULE_NUMBER ) )
                            {
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:939:4: ( (lv_op_1_0= ruleRop ) )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:940:1: (lv_op_1_0= ruleRop )
                            {
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:940:1: (lv_op_1_0= ruleRop )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:941:3: lv_op_1_0= ruleRop
                            {
                             
                            	        newCompositeNode(grammarAccess.getAttributeAccess().getOpRopParserRuleCall_0_1_0_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleRop_in_ruleAttribute1972);
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

                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:957:2: ( (lv_numberValue_2_0= RULE_NUMBER ) )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:958:1: (lv_numberValue_2_0= RULE_NUMBER )
                            {
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:958:1: (lv_numberValue_2_0= RULE_NUMBER )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:959:3: lv_numberValue_2_0= RULE_NUMBER
                            {
                            lv_numberValue_2_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleAttribute1989); 

                            			newLeafNode(lv_numberValue_2_0, grammarAccess.getAttributeAccess().getNumberValueNUMBERTerminalRuleCall_0_1_0_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getAttributeRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"numberValue",
                                    		lv_numberValue_2_0, 
                                    		"NUMBER");
                            	    

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:976:6: ( ( (lv_op_3_0= ruleStringRop ) ) ( (lv_strValue_4_0= RULE_STRING ) ) )
                            {
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:976:6: ( ( (lv_op_3_0= ruleStringRop ) ) ( (lv_strValue_4_0= RULE_STRING ) ) )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:976:7: ( (lv_op_3_0= ruleStringRop ) ) ( (lv_strValue_4_0= RULE_STRING ) )
                            {
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:976:7: ( (lv_op_3_0= ruleStringRop ) )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:977:1: (lv_op_3_0= ruleStringRop )
                            {
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:977:1: (lv_op_3_0= ruleStringRop )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:978:3: lv_op_3_0= ruleStringRop
                            {
                             
                            	        newCompositeNode(grammarAccess.getAttributeAccess().getOpStringRopParserRuleCall_0_1_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleStringRop_in_ruleAttribute2023);
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

                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:994:2: ( (lv_strValue_4_0= RULE_STRING ) )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:995:1: (lv_strValue_4_0= RULE_STRING )
                            {
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:995:1: (lv_strValue_4_0= RULE_STRING )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:996:3: lv_strValue_4_0= RULE_STRING
                            {
                            lv_strValue_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute2040); 

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
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1013:6: ( (lv_number_5_0= RULE_NUMBER ) )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1013:6: ( (lv_number_5_0= RULE_NUMBER ) )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1014:1: (lv_number_5_0= RULE_NUMBER )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1014:1: (lv_number_5_0= RULE_NUMBER )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1015:3: lv_number_5_0= RULE_NUMBER
                    {
                    lv_number_5_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleAttribute2071); 

                    			newLeafNode(lv_number_5_0, grammarAccess.getAttributeAccess().getNumberNUMBERTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"number",
                            		lv_number_5_0, 
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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1039:1: entryRuleStringRop returns [String current=null] : iv_ruleStringRop= ruleStringRop EOF ;
    public final String entryRuleStringRop() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringRop = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1040:2: (iv_ruleStringRop= ruleStringRop EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1041:2: iv_ruleStringRop= ruleStringRop EOF
            {
             newCompositeNode(grammarAccess.getStringRopRule()); 
            pushFollow(FOLLOW_ruleStringRop_in_entryRuleStringRop2113);
            iv_ruleStringRop=ruleStringRop();

            state._fsp--;

             current =iv_ruleStringRop.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringRop2124); 

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1048:1: ruleStringRop returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleStringRop() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1051:28: ( (kw= '=' | kw= '!=' ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1052:1: (kw= '=' | kw= '!=' )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1052:1: (kw= '=' | kw= '!=' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==14) ) {
                alt14=1;
            }
            else if ( (LA14_0==26) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1053:2: kw= '='
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleStringRop2162); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStringRopAccess().getEqualsSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1060:2: kw= '!='
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleStringRop2181); 

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1073:1: entryRuleRop returns [String current=null] : iv_ruleRop= ruleRop EOF ;
    public final String entryRuleRop() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRop = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1074:2: (iv_ruleRop= ruleRop EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1075:2: iv_ruleRop= ruleRop EOF
            {
             newCompositeNode(grammarAccess.getRopRule()); 
            pushFollow(FOLLOW_ruleRop_in_entryRuleRop2222);
            iv_ruleRop=ruleRop();

            state._fsp--;

             current =iv_ruleRop.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRop2233); 

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1082:1: ruleRop returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_StringRop_0= ruleStringRop | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' ) ;
    public final AntlrDatatypeRuleToken ruleRop() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_StringRop_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1085:28: ( (this_StringRop_0= ruleStringRop | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1086:1: (this_StringRop_0= ruleStringRop | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1086:1: (this_StringRop_0= ruleStringRop | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' )
            int alt15=5;
            switch ( input.LA(1) ) {
            case 14:
            case 26:
                {
                alt15=1;
                }
                break;
            case 27:
                {
                alt15=2;
                }
                break;
            case 28:
                {
                alt15=3;
                }
                break;
            case 29:
                {
                alt15=4;
                }
                break;
            case 30:
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
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1087:5: this_StringRop_0= ruleStringRop
                    {
                     
                            newCompositeNode(grammarAccess.getRopAccess().getStringRopParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStringRop_in_ruleRop2280);
                    this_StringRop_0=ruleStringRop();

                    state._fsp--;


                    		current.merge(this_StringRop_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1099:2: kw= '<'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleRop2304); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRopAccess().getLessThanSignKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1106:2: kw= '<='
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleRop2323); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRopAccess().getLessThanSignEqualsSignKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1113:2: kw= '>'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleRop2342); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRopAccess().getGreaterThanSignKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1120:2: kw= '>='
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleRop2361); 

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1133:1: entryRuleFunction returns [String current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final String entryRuleFunction() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunction = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1134:2: (iv_ruleFunction= ruleFunction EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1135:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction2402);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction2413); 

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1142:1: ruleFunction returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'uppercase' | kw= 'length' | this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleFunction() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1145:28: ( (kw= 'uppercase' | kw= 'length' | this_ID_2= RULE_ID ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1146:1: (kw= 'uppercase' | kw= 'length' | this_ID_2= RULE_ID )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1146:1: (kw= 'uppercase' | kw= 'length' | this_ID_2= RULE_ID )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt16=1;
                }
                break;
            case 32:
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
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1147:2: kw= 'uppercase'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleFunction2451); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionAccess().getUppercaseKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1154:2: kw= 'length'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleFunction2470); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionAccess().getLengthKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1160:10: this_ID_2= RULE_ID
                    {
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunction2491); 

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1175:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1176:2: (iv_ruleConstant= ruleConstant EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1177:2: iv_ruleConstant= ruleConstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_ruleConstant_in_entryRuleConstant2536);
            iv_ruleConstant=ruleConstant();

            state._fsp--;

             current =iv_ruleConstant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstant2546); 

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1184:1: ruleConstant returns [EObject current=null] : ( ( (lv_number_0_0= RULE_NUMBER ) ) | ( (lv_string_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token lv_number_0_0=null;
        Token lv_string_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1187:28: ( ( ( (lv_number_0_0= RULE_NUMBER ) ) | ( (lv_string_1_0= RULE_STRING ) ) ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1188:1: ( ( (lv_number_0_0= RULE_NUMBER ) ) | ( (lv_string_1_0= RULE_STRING ) ) )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1188:1: ( ( (lv_number_0_0= RULE_NUMBER ) ) | ( (lv_string_1_0= RULE_STRING ) ) )
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
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1188:2: ( (lv_number_0_0= RULE_NUMBER ) )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1188:2: ( (lv_number_0_0= RULE_NUMBER ) )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1189:1: (lv_number_0_0= RULE_NUMBER )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1189:1: (lv_number_0_0= RULE_NUMBER )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1190:3: lv_number_0_0= RULE_NUMBER
                    {
                    lv_number_0_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleConstant2588); 

                    			newLeafNode(lv_number_0_0, grammarAccess.getConstantAccess().getNumberNUMBERTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstantRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"number",
                            		lv_number_0_0, 
                            		"NUMBER");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1207:6: ( (lv_string_1_0= RULE_STRING ) )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1207:6: ( (lv_string_1_0= RULE_STRING ) )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1208:1: (lv_string_1_0= RULE_STRING )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1208:1: (lv_string_1_0= RULE_STRING )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1209:3: lv_string_1_0= RULE_STRING
                    {
                    lv_string_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConstant2616); 

                    			newLeafNode(lv_string_1_0, grammarAccess.getConstantAccess().getStringSTRINGTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstantRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"string",
                            		lv_string_1_0, 
                            		"STRING");
                    	    

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
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleQuantifier"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1233:1: entryRuleQuantifier returns [String current=null] : iv_ruleQuantifier= ruleQuantifier EOF ;
    public final String entryRuleQuantifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQuantifier = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1234:2: (iv_ruleQuantifier= ruleQuantifier EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1235:2: iv_ruleQuantifier= ruleQuantifier EOF
            {
             newCompositeNode(grammarAccess.getQuantifierRule()); 
            pushFollow(FOLLOW_ruleQuantifier_in_entryRuleQuantifier2658);
            iv_ruleQuantifier=ruleQuantifier();

            state._fsp--;

             current =iv_ruleQuantifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuantifier2669); 

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
    // $ANTLR end "entryRuleQuantifier"


    // $ANTLR start "ruleQuantifier"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1242:1: ruleQuantifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'forall' | kw= 'exists' | kw= 'numOf' ) ;
    public final AntlrDatatypeRuleToken ruleQuantifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1245:28: ( (kw= 'forall' | kw= 'exists' | kw= 'numOf' ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1246:1: (kw= 'forall' | kw= 'exists' | kw= 'numOf' )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1246:1: (kw= 'forall' | kw= 'exists' | kw= 'numOf' )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt18=1;
                }
                break;
            case 34:
                {
                alt18=2;
                }
                break;
            case 35:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1247:2: kw= 'forall'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleQuantifier2707); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQuantifierAccess().getForallKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1254:2: kw= 'exists'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleQuantifier2726); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQuantifierAccess().getExistsKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1261:2: kw= 'numOf'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleQuantifier2745); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQuantifierAccess().getNumOfKeyword_2()); 
                        

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
    // $ANTLR end "ruleQuantifier"


    // $ANTLR start "entryRuleVariable"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1274:1: entryRuleVariable returns [String current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final String entryRuleVariable() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVariable = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1275:2: (iv_ruleVariable= ruleVariable EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1276:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable2786);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable2797); 

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1283:1: ruleVariable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '$' this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleVariable() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1286:28: ( (kw= '$' this_ID_1= RULE_ID ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1287:1: (kw= '$' this_ID_1= RULE_ID )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1287:1: (kw= '$' this_ID_1= RULE_ID )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1288:2: kw= '$' this_ID_1= RULE_ID
            {
            kw=(Token)match(input,36,FOLLOW_36_in_ruleVariable2835); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVariableAccess().getDollarSignKeyword_0()); 
                
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable2850); 

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


    // $ANTLR start "entryRuleValues"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1308:1: entryRuleValues returns [EObject current=null] : iv_ruleValues= ruleValues EOF ;
    public final EObject entryRuleValues() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValues = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1309:2: (iv_ruleValues= ruleValues EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1310:2: iv_ruleValues= ruleValues EOF
            {
             newCompositeNode(grammarAccess.getValuesRule()); 
            pushFollow(FOLLOW_ruleValues_in_entryRuleValues2895);
            iv_ruleValues=ruleValues();

            state._fsp--;

             current =iv_ruleValues; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValues2905); 

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
    // $ANTLR end "entryRuleValues"


    // $ANTLR start "ruleValues"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1317:1: ruleValues returns [EObject current=null] : (otherlv_0= '[' ( (lv_value_1_0= ruleConstant ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleConstant ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleValues() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_1_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1320:28: ( (otherlv_0= '[' ( (lv_value_1_0= ruleConstant ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleConstant ) ) )* otherlv_4= ']' ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1321:1: (otherlv_0= '[' ( (lv_value_1_0= ruleConstant ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleConstant ) ) )* otherlv_4= ']' )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1321:1: (otherlv_0= '[' ( (lv_value_1_0= ruleConstant ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleConstant ) ) )* otherlv_4= ']' )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1321:3: otherlv_0= '[' ( (lv_value_1_0= ruleConstant ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleConstant ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleValues2942); 

                	newLeafNode(otherlv_0, grammarAccess.getValuesAccess().getLeftSquareBracketKeyword_0());
                
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1325:1: ( (lv_value_1_0= ruleConstant ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1326:1: (lv_value_1_0= ruleConstant )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1326:1: (lv_value_1_0= ruleConstant )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1327:3: lv_value_1_0= ruleConstant
            {
             
            	        newCompositeNode(grammarAccess.getValuesAccess().getValueConstantParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleConstant_in_ruleValues2963);
            lv_value_1_0=ruleConstant();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getValuesRule());
            	        }
                   		add(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"Constant");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1343:2: (otherlv_2= ',' ( (lv_value_3_0= ruleConstant ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==21) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1343:4: otherlv_2= ',' ( (lv_value_3_0= ruleConstant ) )
            	    {
            	    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleValues2976); 

            	        	newLeafNode(otherlv_2, grammarAccess.getValuesAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1347:1: ( (lv_value_3_0= ruleConstant ) )
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1348:1: (lv_value_3_0= ruleConstant )
            	    {
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1348:1: (lv_value_3_0= ruleConstant )
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1349:3: lv_value_3_0= ruleConstant
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getValuesAccess().getValueConstantParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConstant_in_ruleValues2997);
            	    lv_value_3_0=ruleConstant();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getValuesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"value",
            	            		lv_value_3_0, 
            	            		"Constant");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleValues3011); 

                	newLeafNode(otherlv_4, grammarAccess.getValuesAccess().getRightSquareBracketKeyword_3());
                

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
    // $ANTLR end "ruleValues"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\26\uffff";
    static final String DFA4_eofS =
        "\26\uffff";
    static final String DFA4_minS =
        "\1\5\1\uffff\1\5\2\uffff\2\4\1\uffff\2\16\1\4\1\16\1\31\6\5\1\16"+
        "\2\31";
    static final String DFA4_maxS =
        "\1\44\1\uffff\1\44\2\uffff\2\4\1\uffff\2\44\1\5\1\36\1\31\2\6\4"+
        "\5\1\44\2\31";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\1\4\2\uffff\1\3\16\uffff";
    static final String DFA4_specialS =
        "\26\uffff}>";
    static final String[] DFA4_transitionS = {
            "\2\3\12\uffff\1\2\1\uffff\1\1\3\uffff\2\3\10\uffff\3\4\1\3",
            "",
            "\2\7\12\uffff\1\7\1\uffff\1\7\3\uffff\1\5\1\7\10\uffff\3\7"+
            "\1\6",
            "",
            "",
            "\1\10",
            "\1\11",
            "",
            "\1\7\3\uffff\1\3\3\uffff\1\7\1\5\1\12\1\uffff\5\7\5\uffff\1"+
            "\6",
            "\1\7\3\uffff\1\3\3\uffff\1\7\1\5\2\uffff\5\7\5\uffff\1\6",
            "\1\13\1\14",
            "\1\15\13\uffff\1\16\1\17\1\20\1\21\1\22",
            "\1\23",
            "\1\25\1\24",
            "\1\25\1\24",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\7\3\uffff\1\3\3\uffff\1\7\1\5\2\uffff\5\7\5\uffff\1\6",
            "\1\23",
            "\1\23"
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
            return "326:1: (this_AssertionNot_0= ruleAssertionNot | this_AssertionForm_1= ruleAssertionForm | this_AssertionBraced_2= ruleAssertionBraced | this_AssertionQuantified_3= ruleAssertionQuantified )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleModel131 = new BitSet(new long[]{0x0000001E018A2060L});
    public static final BitSet FOLLOW_ruleAssertionOr_in_ruleModel153 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleModel165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleDeclaration248 = new BitSet(new long[]{0x0000001000820000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleDeclaration269 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDeclaration281 = new BitSet(new long[]{0x0000001001820060L});
    public static final BitSet FOLLOW_ruleAssertion_in_ruleDeclaration302 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDeclaration314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionOr_in_entryRuleAssertionOr350 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertionOr360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionAnd_in_ruleAssertionOr407 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleAssertionOr428 = new BitSet(new long[]{0x0000001E018A0060L});
    public static final BitSet FOLLOW_ruleAssertionAnd_in_ruleAssertionOr449 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleAssertionAnd_in_entryRuleAssertionAnd487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertionAnd497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHighProrityAssertion_in_ruleAssertionAnd544 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleAssertionAnd565 = new BitSet(new long[]{0x0000001E018A0060L});
    public static final BitSet FOLLOW_ruleHighProrityAssertion_in_ruleAssertionAnd586 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleHighProrityAssertion_in_entryRuleHighProrityAssertion624 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHighProrityAssertion634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionNot_in_ruleHighProrityAssertion681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionForm_in_ruleHighProrityAssertion708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionBraced_in_ruleHighProrityAssertion735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionQuantified_in_ruleHighProrityAssertion762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionBraced_in_entryRuleAssertionBraced797 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertionBraced807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleAssertionBraced844 = new BitSet(new long[]{0x0000001E018A0060L});
    public static final BitSet FOLLOW_ruleAssertionOr_in_ruleAssertionBraced865 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAssertionBraced877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionNot_in_entryRuleAssertionNot913 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertionNot923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleAssertionNot960 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAssertionNot972 = new BitSet(new long[]{0x0000001E018A0060L});
    public static final BitSet FOLLOW_ruleAssertionOr_in_ruleAssertionNot993 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAssertionNot1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionQuantified_in_entryRuleAssertionQuantified1041 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertionQuantified1051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantifier_in_ruleAssertionQuantified1097 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAssertionQuantified1109 = new BitSet(new long[]{0x0000001000820000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleAssertionQuantified1130 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleAssertionQuantified1142 = new BitSet(new long[]{0x0000001000820000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleAssertionQuantified1163 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleAssertionQuantified1175 = new BitSet(new long[]{0x0000001E018A0060L});
    public static final BitSet FOLLOW_ruleAssertionOr_in_ruleAssertionQuantified1196 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAssertionQuantified1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionForm_in_entryRuleAssertionForm1244 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertionForm1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertion_in_ruleAssertionForm1300 = new BitSet(new long[]{0x000000007C004000L});
    public static final BitSet FOLLOW_ruleRop_in_ruleAssertionForm1321 = new BitSet(new long[]{0x0000001001820060L});
    public static final BitSet FOLLOW_ruleAssertion_in_ruleAssertionForm1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertion_in_entryRuleAssertion1378 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertion1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuery_in_ruleAssertion1435 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleAssertion1448 = new BitSet(new long[]{0x0000000180000010L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleAssertion1469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleAssertion1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValues_in_ruleAssertion1526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuery_in_entryRuleQuery1562 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuery1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleQuery1610 = new BitSet(new long[]{0x0000001000820000L});
    public static final BitSet FOLLOW_ruleStep_in_ruleQuery1631 = new BitSet(new long[]{0x0000001000860000L});
    public static final BitSet FOLLOW_18_in_ruleQuery1644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_ruleQuery1672 = new BitSet(new long[]{0x0000001000820002L});
    public static final BitSet FOLLOW_ruleStep_in_entryRuleStep1709 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStep1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleStep1757 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStep1774 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleStep1792 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleStep1813 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleStep1825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleStep1855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute1891 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute1901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute1944 = new BitSet(new long[]{0x000000007C004000L});
    public static final BitSet FOLLOW_ruleRop_in_ruleAttribute1972 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleAttribute1989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringRop_in_ruleAttribute2023 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute2040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleAttribute2071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringRop_in_entryRuleStringRop2113 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringRop2124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleStringRop2162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleStringRop2181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRop_in_entryRuleRop2222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRop2233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringRop_in_ruleRop2280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleRop2304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleRop2323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleRop2342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleRop2361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction2402 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction2413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleFunction2451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleFunction2470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunction2491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant2536 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstant2546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleConstant2588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConstant2616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantifier_in_entryRuleQuantifier2658 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuantifier2669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleQuantifier2707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleQuantifier2726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleQuantifier2745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable2786 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable2797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleVariable2835 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable2850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValues_in_entryRuleValues2895 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValues2905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleValues2942 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleValues2963 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_21_in_ruleValues2976 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleValues2997 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_25_in_ruleValues3011 = new BitSet(new long[]{0x0000000000000002L});

}