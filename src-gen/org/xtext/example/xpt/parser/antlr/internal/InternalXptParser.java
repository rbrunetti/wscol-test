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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BOOLEAN", "RULE_ID", "RULE_NUMBER", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'let'", "'='", "'||'", "'&&'", "'('", "')'", "'!'", "'.'", "'['", "']'", "'in'", "','", "'/'", "'!='", "'<'", "'<='", "'>'", "'>='", "'forall'", "'exists'", "'numOf'", "'sum'", "'avg'", "'min'", "'max'", "'product'", "'$'"
    };
    public static final int RULE_BOOLEAN=4;
    public static final int RULE_ID=5;
    public static final int T__40=40;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=7;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int RULE_NUMBER=6;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=8;
    public static final int RULE_WS=11;

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

                if ( (LA1_0==14) ) {
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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleModel165); 

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:137:1: ruleDeclaration returns [EObject current=null] : (otherlv_0= 'let' ( (lv_var_1_0= ruleVariable ) ) otherlv_2= '=' ( ( (lv_assert_3_1= ruleAssertion | lv_assert_3_2= ruleAssertionQuantifiedBoolean ) ) ) otherlv_4= ';' ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_var_1_0 = null;

        EObject lv_assert_3_1 = null;

        EObject lv_assert_3_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:140:28: ( (otherlv_0= 'let' ( (lv_var_1_0= ruleVariable ) ) otherlv_2= '=' ( ( (lv_assert_3_1= ruleAssertion | lv_assert_3_2= ruleAssertionQuantifiedBoolean ) ) ) otherlv_4= ';' ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:141:1: (otherlv_0= 'let' ( (lv_var_1_0= ruleVariable ) ) otherlv_2= '=' ( ( (lv_assert_3_1= ruleAssertion | lv_assert_3_2= ruleAssertionQuantifiedBoolean ) ) ) otherlv_4= ';' )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:141:1: (otherlv_0= 'let' ( (lv_var_1_0= ruleVariable ) ) otherlv_2= '=' ( ( (lv_assert_3_1= ruleAssertion | lv_assert_3_2= ruleAssertionQuantifiedBoolean ) ) ) otherlv_4= ';' )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:141:3: otherlv_0= 'let' ( (lv_var_1_0= ruleVariable ) ) otherlv_2= '=' ( ( (lv_assert_3_1= ruleAssertion | lv_assert_3_2= ruleAssertionQuantifiedBoolean ) ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleDeclaration248); 

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

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleDeclaration281); 

                	newLeafNode(otherlv_2, grammarAccess.getDeclarationAccess().getEqualsSignKeyword_2());
                
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:167:1: ( ( (lv_assert_3_1= ruleAssertion | lv_assert_3_2= ruleAssertionQuantifiedBoolean ) ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:168:1: ( (lv_assert_3_1= ruleAssertion | lv_assert_3_2= ruleAssertionQuantifiedBoolean ) )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:168:1: ( (lv_assert_3_1= ruleAssertion | lv_assert_3_2= ruleAssertionQuantifiedBoolean ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:169:1: (lv_assert_3_1= ruleAssertion | lv_assert_3_2= ruleAssertionQuantifiedBoolean )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:169:1: (lv_assert_3_1= ruleAssertion | lv_assert_3_2= ruleAssertionQuantifiedBoolean )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_BOOLEAN||(LA2_0>=RULE_NUMBER && LA2_0<=RULE_STRING)||LA2_0==18||LA2_0==22||LA2_0==26||(LA2_0>=34 && LA2_0<=40)) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=32 && LA2_0<=33)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:170:3: lv_assert_3_1= ruleAssertion
                    {
                     
                    	        newCompositeNode(grammarAccess.getDeclarationAccess().getAssertAssertionParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAssertion_in_ruleDeclaration304);
                    lv_assert_3_1=ruleAssertion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
                    	        }
                           		set(
                           			current, 
                           			"assert",
                            		lv_assert_3_1, 
                            		"Assertion");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:185:8: lv_assert_3_2= ruleAssertionQuantifiedBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getDeclarationAccess().getAssertAssertionQuantifiedBooleanParserRuleCall_3_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleAssertionQuantifiedBoolean_in_ruleDeclaration323);
                    lv_assert_3_2=ruleAssertionQuantifiedBoolean();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
                    	        }
                           		set(
                           			current, 
                           			"assert",
                            		lv_assert_3_2, 
                            		"AssertionQuantifiedBoolean");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleDeclaration338); 

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:215:1: entryRuleAssertionOr returns [EObject current=null] : iv_ruleAssertionOr= ruleAssertionOr EOF ;
    public final EObject entryRuleAssertionOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertionOr = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:216:2: (iv_ruleAssertionOr= ruleAssertionOr EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:217:2: iv_ruleAssertionOr= ruleAssertionOr EOF
            {
             newCompositeNode(grammarAccess.getAssertionOrRule()); 
            pushFollow(FOLLOW_ruleAssertionOr_in_entryRuleAssertionOr374);
            iv_ruleAssertionOr=ruleAssertionOr();

            state._fsp--;

             current =iv_ruleAssertionOr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertionOr384); 

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:224:1: ruleAssertionOr returns [EObject current=null] : (this_AssertionAnd_0= ruleAssertionAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAssertionAnd ) ) )* ) ;
    public final EObject ruleAssertionOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AssertionAnd_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:227:28: ( (this_AssertionAnd_0= ruleAssertionAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAssertionAnd ) ) )* ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:228:1: (this_AssertionAnd_0= ruleAssertionAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAssertionAnd ) ) )* )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:228:1: (this_AssertionAnd_0= ruleAssertionAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAssertionAnd ) ) )* )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:229:5: this_AssertionAnd_0= ruleAssertionAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAssertionAnd ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAssertionOrAccess().getAssertionAndParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAssertionAnd_in_ruleAssertionOr431);
            this_AssertionAnd_0=ruleAssertionAnd();

            state._fsp--;

             
                    current = this_AssertionAnd_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:237:1: ( () otherlv_2= '||' ( (lv_right_3_0= ruleAssertionAnd ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:237:2: () otherlv_2= '||' ( (lv_right_3_0= ruleAssertionAnd ) )
            	    {
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:237:2: ()
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:238:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAssertionOrAccess().getAssertionOrLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleAssertionOr452); 

            	        	newLeafNode(otherlv_2, grammarAccess.getAssertionOrAccess().getVerticalLineVerticalLineKeyword_1_1());
            	        
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:247:1: ( (lv_right_3_0= ruleAssertionAnd ) )
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:248:1: (lv_right_3_0= ruleAssertionAnd )
            	    {
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:248:1: (lv_right_3_0= ruleAssertionAnd )
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:249:3: lv_right_3_0= ruleAssertionAnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAssertionOrAccess().getRightAssertionAndParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAssertionAnd_in_ruleAssertionOr473);
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
    // $ANTLR end "ruleAssertionOr"


    // $ANTLR start "entryRuleAssertionAnd"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:273:1: entryRuleAssertionAnd returns [EObject current=null] : iv_ruleAssertionAnd= ruleAssertionAnd EOF ;
    public final EObject entryRuleAssertionAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertionAnd = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:274:2: (iv_ruleAssertionAnd= ruleAssertionAnd EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:275:2: iv_ruleAssertionAnd= ruleAssertionAnd EOF
            {
             newCompositeNode(grammarAccess.getAssertionAndRule()); 
            pushFollow(FOLLOW_ruleAssertionAnd_in_entryRuleAssertionAnd511);
            iv_ruleAssertionAnd=ruleAssertionAnd();

            state._fsp--;

             current =iv_ruleAssertionAnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertionAnd521); 

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:282:1: ruleAssertionAnd returns [EObject current=null] : (this_HighProrityAssertion_0= ruleHighProrityAssertion ( () otherlv_2= '&&' ( (lv_right_3_0= ruleHighProrityAssertion ) ) )* ) ;
    public final EObject ruleAssertionAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_HighProrityAssertion_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:285:28: ( (this_HighProrityAssertion_0= ruleHighProrityAssertion ( () otherlv_2= '&&' ( (lv_right_3_0= ruleHighProrityAssertion ) ) )* ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:286:1: (this_HighProrityAssertion_0= ruleHighProrityAssertion ( () otherlv_2= '&&' ( (lv_right_3_0= ruleHighProrityAssertion ) ) )* )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:286:1: (this_HighProrityAssertion_0= ruleHighProrityAssertion ( () otherlv_2= '&&' ( (lv_right_3_0= ruleHighProrityAssertion ) ) )* )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:287:5: this_HighProrityAssertion_0= ruleHighProrityAssertion ( () otherlv_2= '&&' ( (lv_right_3_0= ruleHighProrityAssertion ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAssertionAndAccess().getHighProrityAssertionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleHighProrityAssertion_in_ruleAssertionAnd568);
            this_HighProrityAssertion_0=ruleHighProrityAssertion();

            state._fsp--;

             
                    current = this_HighProrityAssertion_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:295:1: ( () otherlv_2= '&&' ( (lv_right_3_0= ruleHighProrityAssertion ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:295:2: () otherlv_2= '&&' ( (lv_right_3_0= ruleHighProrityAssertion ) )
            	    {
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:295:2: ()
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:296:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAssertionAndAccess().getAssertionAndLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleAssertionAnd589); 

            	        	newLeafNode(otherlv_2, grammarAccess.getAssertionAndAccess().getAmpersandAmpersandKeyword_1_1());
            	        
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:305:1: ( (lv_right_3_0= ruleHighProrityAssertion ) )
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:306:1: (lv_right_3_0= ruleHighProrityAssertion )
            	    {
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:306:1: (lv_right_3_0= ruleHighProrityAssertion )
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:307:3: lv_right_3_0= ruleHighProrityAssertion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAssertionAndAccess().getRightHighProrityAssertionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleHighProrityAssertion_in_ruleAssertionAnd610);
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
            	    break loop4;
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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:331:1: entryRuleHighProrityAssertion returns [EObject current=null] : iv_ruleHighProrityAssertion= ruleHighProrityAssertion EOF ;
    public final EObject entryRuleHighProrityAssertion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHighProrityAssertion = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:332:2: (iv_ruleHighProrityAssertion= ruleHighProrityAssertion EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:333:2: iv_ruleHighProrityAssertion= ruleHighProrityAssertion EOF
            {
             newCompositeNode(grammarAccess.getHighProrityAssertionRule()); 
            pushFollow(FOLLOW_ruleHighProrityAssertion_in_entryRuleHighProrityAssertion648);
            iv_ruleHighProrityAssertion=ruleHighProrityAssertion();

            state._fsp--;

             current =iv_ruleHighProrityAssertion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHighProrityAssertion658); 

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:340:1: ruleHighProrityAssertion returns [EObject current=null] : (this_AssertionNot_0= ruleAssertionNot | this_AssertionBraced_1= ruleAssertionBraced | this_AssertionForm_2= ruleAssertionForm ) ;
    public final EObject ruleHighProrityAssertion() throws RecognitionException {
        EObject current = null;

        EObject this_AssertionNot_0 = null;

        EObject this_AssertionBraced_1 = null;

        EObject this_AssertionForm_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:343:28: ( (this_AssertionNot_0= ruleAssertionNot | this_AssertionBraced_1= ruleAssertionBraced | this_AssertionForm_2= ruleAssertionForm ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:344:1: (this_AssertionNot_0= ruleAssertionNot | this_AssertionBraced_1= ruleAssertionBraced | this_AssertionForm_2= ruleAssertionForm )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:344:1: (this_AssertionNot_0= ruleAssertionNot | this_AssertionBraced_1= ruleAssertionBraced | this_AssertionForm_2= ruleAssertionForm )
            int alt5=3;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:345:5: this_AssertionNot_0= ruleAssertionNot
                    {
                     
                            newCompositeNode(grammarAccess.getHighProrityAssertionAccess().getAssertionNotParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAssertionNot_in_ruleHighProrityAssertion705);
                    this_AssertionNot_0=ruleAssertionNot();

                    state._fsp--;

                     
                            current = this_AssertionNot_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:355:5: this_AssertionBraced_1= ruleAssertionBraced
                    {
                     
                            newCompositeNode(grammarAccess.getHighProrityAssertionAccess().getAssertionBracedParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAssertionBraced_in_ruleHighProrityAssertion732);
                    this_AssertionBraced_1=ruleAssertionBraced();

                    state._fsp--;

                     
                            current = this_AssertionBraced_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:365:5: this_AssertionForm_2= ruleAssertionForm
                    {
                     
                            newCompositeNode(grammarAccess.getHighProrityAssertionAccess().getAssertionFormParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleAssertionForm_in_ruleHighProrityAssertion759);
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


    // $ANTLR start "entryRuleAssertionBraced"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:381:1: entryRuleAssertionBraced returns [EObject current=null] : iv_ruleAssertionBraced= ruleAssertionBraced EOF ;
    public final EObject entryRuleAssertionBraced() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertionBraced = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:382:2: (iv_ruleAssertionBraced= ruleAssertionBraced EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:383:2: iv_ruleAssertionBraced= ruleAssertionBraced EOF
            {
             newCompositeNode(grammarAccess.getAssertionBracedRule()); 
            pushFollow(FOLLOW_ruleAssertionBraced_in_entryRuleAssertionBraced794);
            iv_ruleAssertionBraced=ruleAssertionBraced();

            state._fsp--;

             current =iv_ruleAssertionBraced; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertionBraced804); 

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:390:1: ruleAssertionBraced returns [EObject current=null] : (otherlv_0= '(' ( (lv_innerFormula_1_0= ruleAssertionOr ) ) otherlv_2= ')' ) ;
    public final EObject ruleAssertionBraced() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_innerFormula_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:393:28: ( (otherlv_0= '(' ( (lv_innerFormula_1_0= ruleAssertionOr ) ) otherlv_2= ')' ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:394:1: (otherlv_0= '(' ( (lv_innerFormula_1_0= ruleAssertionOr ) ) otherlv_2= ')' )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:394:1: (otherlv_0= '(' ( (lv_innerFormula_1_0= ruleAssertionOr ) ) otherlv_2= ')' )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:394:3: otherlv_0= '(' ( (lv_innerFormula_1_0= ruleAssertionOr ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleAssertionBraced841); 

                	newLeafNode(otherlv_0, grammarAccess.getAssertionBracedAccess().getLeftParenthesisKeyword_0());
                
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:398:1: ( (lv_innerFormula_1_0= ruleAssertionOr ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:399:1: (lv_innerFormula_1_0= ruleAssertionOr )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:399:1: (lv_innerFormula_1_0= ruleAssertionOr )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:400:3: lv_innerFormula_1_0= ruleAssertionOr
            {
             
            	        newCompositeNode(grammarAccess.getAssertionBracedAccess().getInnerFormulaAssertionOrParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAssertionOr_in_ruleAssertionBraced862);
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

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleAssertionBraced874); 

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:428:1: entryRuleAssertionNot returns [EObject current=null] : iv_ruleAssertionNot= ruleAssertionNot EOF ;
    public final EObject entryRuleAssertionNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertionNot = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:429:2: (iv_ruleAssertionNot= ruleAssertionNot EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:430:2: iv_ruleAssertionNot= ruleAssertionNot EOF
            {
             newCompositeNode(grammarAccess.getAssertionNotRule()); 
            pushFollow(FOLLOW_ruleAssertionNot_in_entryRuleAssertionNot910);
            iv_ruleAssertionNot=ruleAssertionNot();

            state._fsp--;

             current =iv_ruleAssertionNot; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertionNot920); 

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:437:1: ruleAssertionNot returns [EObject current=null] : (otherlv_0= '!' otherlv_1= '(' ( (lv_innerFormula_2_0= ruleAssertionOr ) ) otherlv_3= ')' ) ;
    public final EObject ruleAssertionNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_innerFormula_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:440:28: ( (otherlv_0= '!' otherlv_1= '(' ( (lv_innerFormula_2_0= ruleAssertionOr ) ) otherlv_3= ')' ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:441:1: (otherlv_0= '!' otherlv_1= '(' ( (lv_innerFormula_2_0= ruleAssertionOr ) ) otherlv_3= ')' )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:441:1: (otherlv_0= '!' otherlv_1= '(' ( (lv_innerFormula_2_0= ruleAssertionOr ) ) otherlv_3= ')' )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:441:3: otherlv_0= '!' otherlv_1= '(' ( (lv_innerFormula_2_0= ruleAssertionOr ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleAssertionNot957); 

                	newLeafNode(otherlv_0, grammarAccess.getAssertionNotAccess().getExclamationMarkKeyword_0());
                
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleAssertionNot969); 

                	newLeafNode(otherlv_1, grammarAccess.getAssertionNotAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:449:1: ( (lv_innerFormula_2_0= ruleAssertionOr ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:450:1: (lv_innerFormula_2_0= ruleAssertionOr )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:450:1: (lv_innerFormula_2_0= ruleAssertionOr )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:451:3: lv_innerFormula_2_0= ruleAssertionOr
            {
             
            	        newCompositeNode(grammarAccess.getAssertionNotAccess().getInnerFormulaAssertionOrParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAssertionOr_in_ruleAssertionNot990);
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

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleAssertionNot1002); 

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


    // $ANTLR start "entryRuleAssertionForm"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:479:1: entryRuleAssertionForm returns [EObject current=null] : iv_ruleAssertionForm= ruleAssertionForm EOF ;
    public final EObject entryRuleAssertionForm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertionForm = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:480:2: (iv_ruleAssertionForm= ruleAssertionForm EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:481:2: iv_ruleAssertionForm= ruleAssertionForm EOF
            {
             newCompositeNode(grammarAccess.getAssertionFormRule()); 
            pushFollow(FOLLOW_ruleAssertionForm_in_entryRuleAssertionForm1038);
            iv_ruleAssertionForm=ruleAssertionForm();

            state._fsp--;

             current =iv_ruleAssertionForm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertionForm1048); 

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:488:1: ruleAssertionForm returns [EObject current=null] : ( ( ( (lv_leftAssert_0_0= ruleAssertion ) ) ( (lv_op_1_0= ruleRop ) ) ( (lv_rightAssert_2_0= ruleAssertion ) ) ) | ( (lv_leftAssert_3_0= ruleAssertionQuantifiedBoolean ) ) ) ;
    public final EObject ruleAssertionForm() throws RecognitionException {
        EObject current = null;

        EObject lv_leftAssert_0_0 = null;

        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_rightAssert_2_0 = null;

        EObject lv_leftAssert_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:491:28: ( ( ( ( (lv_leftAssert_0_0= ruleAssertion ) ) ( (lv_op_1_0= ruleRop ) ) ( (lv_rightAssert_2_0= ruleAssertion ) ) ) | ( (lv_leftAssert_3_0= ruleAssertionQuantifiedBoolean ) ) ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:492:1: ( ( ( (lv_leftAssert_0_0= ruleAssertion ) ) ( (lv_op_1_0= ruleRop ) ) ( (lv_rightAssert_2_0= ruleAssertion ) ) ) | ( (lv_leftAssert_3_0= ruleAssertionQuantifiedBoolean ) ) )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:492:1: ( ( ( (lv_leftAssert_0_0= ruleAssertion ) ) ( (lv_op_1_0= ruleRop ) ) ( (lv_rightAssert_2_0= ruleAssertion ) ) ) | ( (lv_leftAssert_3_0= ruleAssertionQuantifiedBoolean ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_BOOLEAN||(LA6_0>=RULE_NUMBER && LA6_0<=RULE_STRING)||LA6_0==18||LA6_0==22||LA6_0==26||(LA6_0>=34 && LA6_0<=40)) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=32 && LA6_0<=33)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:492:2: ( ( (lv_leftAssert_0_0= ruleAssertion ) ) ( (lv_op_1_0= ruleRop ) ) ( (lv_rightAssert_2_0= ruleAssertion ) ) )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:492:2: ( ( (lv_leftAssert_0_0= ruleAssertion ) ) ( (lv_op_1_0= ruleRop ) ) ( (lv_rightAssert_2_0= ruleAssertion ) ) )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:492:3: ( (lv_leftAssert_0_0= ruleAssertion ) ) ( (lv_op_1_0= ruleRop ) ) ( (lv_rightAssert_2_0= ruleAssertion ) )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:492:3: ( (lv_leftAssert_0_0= ruleAssertion ) )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:493:1: (lv_leftAssert_0_0= ruleAssertion )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:493:1: (lv_leftAssert_0_0= ruleAssertion )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:494:3: lv_leftAssert_0_0= ruleAssertion
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssertionFormAccess().getLeftAssertAssertionParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAssertion_in_ruleAssertionForm1095);
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

                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:510:2: ( (lv_op_1_0= ruleRop ) )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:511:1: (lv_op_1_0= ruleRop )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:511:1: (lv_op_1_0= ruleRop )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:512:3: lv_op_1_0= ruleRop
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssertionFormAccess().getOpRopParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRop_in_ruleAssertionForm1116);
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

                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:528:2: ( (lv_rightAssert_2_0= ruleAssertion ) )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:529:1: (lv_rightAssert_2_0= ruleAssertion )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:529:1: (lv_rightAssert_2_0= ruleAssertion )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:530:3: lv_rightAssert_2_0= ruleAssertion
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssertionFormAccess().getRightAssertAssertionParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAssertion_in_ruleAssertionForm1137);
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
                    break;
                case 2 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:547:6: ( (lv_leftAssert_3_0= ruleAssertionQuantifiedBoolean ) )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:547:6: ( (lv_leftAssert_3_0= ruleAssertionQuantifiedBoolean ) )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:548:1: (lv_leftAssert_3_0= ruleAssertionQuantifiedBoolean )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:548:1: (lv_leftAssert_3_0= ruleAssertionQuantifiedBoolean )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:549:3: lv_leftAssert_3_0= ruleAssertionQuantifiedBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssertionFormAccess().getLeftAssertAssertionQuantifiedBooleanParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAssertionQuantifiedBoolean_in_ruleAssertionForm1165);
                    lv_leftAssert_3_0=ruleAssertionQuantifiedBoolean();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssertionFormRule());
                    	        }
                           		set(
                           			current, 
                           			"leftAssert",
                            		lv_leftAssert_3_0, 
                            		"AssertionQuantifiedBoolean");
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
    // $ANTLR end "ruleAssertionForm"


    // $ANTLR start "entryRuleAssertion"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:573:1: entryRuleAssertion returns [EObject current=null] : iv_ruleAssertion= ruleAssertion EOF ;
    public final EObject entryRuleAssertion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertion = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:574:2: (iv_ruleAssertion= ruleAssertion EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:575:2: iv_ruleAssertion= ruleAssertion EOF
            {
             newCompositeNode(grammarAccess.getAssertionRule()); 
            pushFollow(FOLLOW_ruleAssertion_in_entryRuleAssertion1201);
            iv_ruleAssertion=ruleAssertion();

            state._fsp--;

             current =iv_ruleAssertion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertion1211); 

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:582:1: ruleAssertion returns [EObject current=null] : ( ( ( (lv_query_0_0= ruleQuery ) ) (otherlv_1= '.' ( (lv_function_2_0= ruleFunction ) ) )? ) | this_AssertionQuantifiedNumeric_3= ruleAssertionQuantifiedNumeric | ( (lv_constant_4_0= ruleConstant ) ) | ( (lv_boolean_5_0= RULE_BOOLEAN ) ) | (otherlv_6= '[' ( (lv_values_7_0= ruleValues ) ) otherlv_8= ']' ) ) ;
    public final EObject ruleAssertion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_boolean_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_query_0_0 = null;

        EObject lv_function_2_0 = null;

        EObject this_AssertionQuantifiedNumeric_3 = null;

        EObject lv_constant_4_0 = null;

        EObject lv_values_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:585:28: ( ( ( ( (lv_query_0_0= ruleQuery ) ) (otherlv_1= '.' ( (lv_function_2_0= ruleFunction ) ) )? ) | this_AssertionQuantifiedNumeric_3= ruleAssertionQuantifiedNumeric | ( (lv_constant_4_0= ruleConstant ) ) | ( (lv_boolean_5_0= RULE_BOOLEAN ) ) | (otherlv_6= '[' ( (lv_values_7_0= ruleValues ) ) otherlv_8= ']' ) ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:586:1: ( ( ( (lv_query_0_0= ruleQuery ) ) (otherlv_1= '.' ( (lv_function_2_0= ruleFunction ) ) )? ) | this_AssertionQuantifiedNumeric_3= ruleAssertionQuantifiedNumeric | ( (lv_constant_4_0= ruleConstant ) ) | ( (lv_boolean_5_0= RULE_BOOLEAN ) ) | (otherlv_6= '[' ( (lv_values_7_0= ruleValues ) ) otherlv_8= ']' ) )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:586:1: ( ( ( (lv_query_0_0= ruleQuery ) ) (otherlv_1= '.' ( (lv_function_2_0= ruleFunction ) ) )? ) | this_AssertionQuantifiedNumeric_3= ruleAssertionQuantifiedNumeric | ( (lv_constant_4_0= ruleConstant ) ) | ( (lv_boolean_5_0= RULE_BOOLEAN ) ) | (otherlv_6= '[' ( (lv_values_7_0= ruleValues ) ) otherlv_8= ']' ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 18:
            case 26:
            case 40:
                {
                alt8=1;
                }
                break;
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
                {
                alt8=2;
                }
                break;
            case RULE_NUMBER:
            case RULE_STRING:
                {
                alt8=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt8=4;
                }
                break;
            case 22:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:586:2: ( ( (lv_query_0_0= ruleQuery ) ) (otherlv_1= '.' ( (lv_function_2_0= ruleFunction ) ) )? )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:586:2: ( ( (lv_query_0_0= ruleQuery ) ) (otherlv_1= '.' ( (lv_function_2_0= ruleFunction ) ) )? )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:586:3: ( (lv_query_0_0= ruleQuery ) ) (otherlv_1= '.' ( (lv_function_2_0= ruleFunction ) ) )?
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:586:3: ( (lv_query_0_0= ruleQuery ) )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:587:1: (lv_query_0_0= ruleQuery )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:587:1: (lv_query_0_0= ruleQuery )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:588:3: lv_query_0_0= ruleQuery
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssertionAccess().getQueryQueryParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQuery_in_ruleAssertion1258);
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

                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:604:2: (otherlv_1= '.' ( (lv_function_2_0= ruleFunction ) ) )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==21) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:604:4: otherlv_1= '.' ( (lv_function_2_0= ruleFunction ) )
                            {
                            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleAssertion1271); 

                                	newLeafNode(otherlv_1, grammarAccess.getAssertionAccess().getFullStopKeyword_0_1_0());
                                
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:608:1: ( (lv_function_2_0= ruleFunction ) )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:609:1: (lv_function_2_0= ruleFunction )
                            {
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:609:1: (lv_function_2_0= ruleFunction )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:610:3: lv_function_2_0= ruleFunction
                            {
                             
                            	        newCompositeNode(grammarAccess.getAssertionAccess().getFunctionFunctionParserRuleCall_0_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleFunction_in_ruleAssertion1292);
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
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:628:5: this_AssertionQuantifiedNumeric_3= ruleAssertionQuantifiedNumeric
                    {
                     
                            newCompositeNode(grammarAccess.getAssertionAccess().getAssertionQuantifiedNumericParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAssertionQuantifiedNumeric_in_ruleAssertion1323);
                    this_AssertionQuantifiedNumeric_3=ruleAssertionQuantifiedNumeric();

                    state._fsp--;

                     
                            current = this_AssertionQuantifiedNumeric_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:637:6: ( (lv_constant_4_0= ruleConstant ) )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:637:6: ( (lv_constant_4_0= ruleConstant ) )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:638:1: (lv_constant_4_0= ruleConstant )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:638:1: (lv_constant_4_0= ruleConstant )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:639:3: lv_constant_4_0= ruleConstant
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssertionAccess().getConstantConstantParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConstant_in_ruleAssertion1349);
                    lv_constant_4_0=ruleConstant();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssertionRule());
                    	        }
                           		set(
                           			current, 
                           			"constant",
                            		lv_constant_4_0, 
                            		"Constant");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:656:6: ( (lv_boolean_5_0= RULE_BOOLEAN ) )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:656:6: ( (lv_boolean_5_0= RULE_BOOLEAN ) )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:657:1: (lv_boolean_5_0= RULE_BOOLEAN )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:657:1: (lv_boolean_5_0= RULE_BOOLEAN )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:658:3: lv_boolean_5_0= RULE_BOOLEAN
                    {
                    lv_boolean_5_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleAssertion1372); 

                    			newLeafNode(lv_boolean_5_0, grammarAccess.getAssertionAccess().getBooleanBOOLEANTerminalRuleCall_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAssertionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"boolean",
                            		lv_boolean_5_0, 
                            		"BOOLEAN");
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:675:6: (otherlv_6= '[' ( (lv_values_7_0= ruleValues ) ) otherlv_8= ']' )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:675:6: (otherlv_6= '[' ( (lv_values_7_0= ruleValues ) ) otherlv_8= ']' )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:675:8: otherlv_6= '[' ( (lv_values_7_0= ruleValues ) ) otherlv_8= ']'
                    {
                    otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleAssertion1396); 

                        	newLeafNode(otherlv_6, grammarAccess.getAssertionAccess().getLeftSquareBracketKeyword_4_0());
                        
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:679:1: ( (lv_values_7_0= ruleValues ) )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:680:1: (lv_values_7_0= ruleValues )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:680:1: (lv_values_7_0= ruleValues )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:681:3: lv_values_7_0= ruleValues
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssertionAccess().getValuesValuesParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValues_in_ruleAssertion1417);
                    lv_values_7_0=ruleValues();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssertionRule());
                    	        }
                           		set(
                           			current, 
                           			"values",
                            		lv_values_7_0, 
                            		"Values");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,23,FOLLOW_23_in_ruleAssertion1429); 

                        	newLeafNode(otherlv_8, grammarAccess.getAssertionAccess().getRightSquareBracketKeyword_4_2());
                        

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


    // $ANTLR start "entryRuleAssertionQuantifiedBoolean"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:709:1: entryRuleAssertionQuantifiedBoolean returns [EObject current=null] : iv_ruleAssertionQuantifiedBoolean= ruleAssertionQuantifiedBoolean EOF ;
    public final EObject entryRuleAssertionQuantifiedBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertionQuantifiedBoolean = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:710:2: (iv_ruleAssertionQuantifiedBoolean= ruleAssertionQuantifiedBoolean EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:711:2: iv_ruleAssertionQuantifiedBoolean= ruleAssertionQuantifiedBoolean EOF
            {
             newCompositeNode(grammarAccess.getAssertionQuantifiedBooleanRule()); 
            pushFollow(FOLLOW_ruleAssertionQuantifiedBoolean_in_entryRuleAssertionQuantifiedBoolean1466);
            iv_ruleAssertionQuantifiedBoolean=ruleAssertionQuantifiedBoolean();

            state._fsp--;

             current =iv_ruleAssertionQuantifiedBoolean; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertionQuantifiedBoolean1476); 

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
    // $ANTLR end "entryRuleAssertionQuantifiedBoolean"


    // $ANTLR start "ruleAssertionQuantifiedBoolean"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:718:1: ruleAssertionQuantifiedBoolean returns [EObject current=null] : ( ( (lv_quantifier_0_0= ruleBoolQuantifier ) ) otherlv_1= '(' ( (lv_alias_2_0= ruleVariable ) ) otherlv_3= 'in' ( (lv_var_4_0= ruleVariable ) ) otherlv_5= ',' ( (lv_conditions_6_0= ruleAssertionOr ) ) otherlv_7= ')' ) ;
    public final EObject ruleAssertionQuantifiedBoolean() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_quantifier_0_0 = null;

        AntlrDatatypeRuleToken lv_alias_2_0 = null;

        AntlrDatatypeRuleToken lv_var_4_0 = null;

        EObject lv_conditions_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:721:28: ( ( ( (lv_quantifier_0_0= ruleBoolQuantifier ) ) otherlv_1= '(' ( (lv_alias_2_0= ruleVariable ) ) otherlv_3= 'in' ( (lv_var_4_0= ruleVariable ) ) otherlv_5= ',' ( (lv_conditions_6_0= ruleAssertionOr ) ) otherlv_7= ')' ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:722:1: ( ( (lv_quantifier_0_0= ruleBoolQuantifier ) ) otherlv_1= '(' ( (lv_alias_2_0= ruleVariable ) ) otherlv_3= 'in' ( (lv_var_4_0= ruleVariable ) ) otherlv_5= ',' ( (lv_conditions_6_0= ruleAssertionOr ) ) otherlv_7= ')' )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:722:1: ( ( (lv_quantifier_0_0= ruleBoolQuantifier ) ) otherlv_1= '(' ( (lv_alias_2_0= ruleVariable ) ) otherlv_3= 'in' ( (lv_var_4_0= ruleVariable ) ) otherlv_5= ',' ( (lv_conditions_6_0= ruleAssertionOr ) ) otherlv_7= ')' )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:722:2: ( (lv_quantifier_0_0= ruleBoolQuantifier ) ) otherlv_1= '(' ( (lv_alias_2_0= ruleVariable ) ) otherlv_3= 'in' ( (lv_var_4_0= ruleVariable ) ) otherlv_5= ',' ( (lv_conditions_6_0= ruleAssertionOr ) ) otherlv_7= ')'
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:722:2: ( (lv_quantifier_0_0= ruleBoolQuantifier ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:723:1: (lv_quantifier_0_0= ruleBoolQuantifier )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:723:1: (lv_quantifier_0_0= ruleBoolQuantifier )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:724:3: lv_quantifier_0_0= ruleBoolQuantifier
            {
             
            	        newCompositeNode(grammarAccess.getAssertionQuantifiedBooleanAccess().getQuantifierBoolQuantifierParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolQuantifier_in_ruleAssertionQuantifiedBoolean1522);
            lv_quantifier_0_0=ruleBoolQuantifier();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssertionQuantifiedBooleanRule());
            	        }
                   		set(
                   			current, 
                   			"quantifier",
                    		lv_quantifier_0_0, 
                    		"BoolQuantifier");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleAssertionQuantifiedBoolean1534); 

                	newLeafNode(otherlv_1, grammarAccess.getAssertionQuantifiedBooleanAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:744:1: ( (lv_alias_2_0= ruleVariable ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:745:1: (lv_alias_2_0= ruleVariable )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:745:1: (lv_alias_2_0= ruleVariable )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:746:3: lv_alias_2_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getAssertionQuantifiedBooleanAccess().getAliasVariableParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVariable_in_ruleAssertionQuantifiedBoolean1555);
            lv_alias_2_0=ruleVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssertionQuantifiedBooleanRule());
            	        }
                   		set(
                   			current, 
                   			"alias",
                    		lv_alias_2_0, 
                    		"Variable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleAssertionQuantifiedBoolean1567); 

                	newLeafNode(otherlv_3, grammarAccess.getAssertionQuantifiedBooleanAccess().getInKeyword_3());
                
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:766:1: ( (lv_var_4_0= ruleVariable ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:767:1: (lv_var_4_0= ruleVariable )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:767:1: (lv_var_4_0= ruleVariable )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:768:3: lv_var_4_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getAssertionQuantifiedBooleanAccess().getVarVariableParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleVariable_in_ruleAssertionQuantifiedBoolean1588);
            lv_var_4_0=ruleVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssertionQuantifiedBooleanRule());
            	        }
                   		set(
                   			current, 
                   			"var",
                    		lv_var_4_0, 
                    		"Variable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleAssertionQuantifiedBoolean1600); 

                	newLeafNode(otherlv_5, grammarAccess.getAssertionQuantifiedBooleanAccess().getCommaKeyword_5());
                
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:788:1: ( (lv_conditions_6_0= ruleAssertionOr ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:789:1: (lv_conditions_6_0= ruleAssertionOr )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:789:1: (lv_conditions_6_0= ruleAssertionOr )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:790:3: lv_conditions_6_0= ruleAssertionOr
            {
             
            	        newCompositeNode(grammarAccess.getAssertionQuantifiedBooleanAccess().getConditionsAssertionOrParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleAssertionOr_in_ruleAssertionQuantifiedBoolean1621);
            lv_conditions_6_0=ruleAssertionOr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssertionQuantifiedBooleanRule());
            	        }
                   		set(
                   			current, 
                   			"conditions",
                    		lv_conditions_6_0, 
                    		"AssertionOr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleAssertionQuantifiedBoolean1633); 

                	newLeafNode(otherlv_7, grammarAccess.getAssertionQuantifiedBooleanAccess().getRightParenthesisKeyword_7());
                

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
    // $ANTLR end "ruleAssertionQuantifiedBoolean"


    // $ANTLR start "entryRuleAssertionQuantifiedNumeric"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:818:1: entryRuleAssertionQuantifiedNumeric returns [EObject current=null] : iv_ruleAssertionQuantifiedNumeric= ruleAssertionQuantifiedNumeric EOF ;
    public final EObject entryRuleAssertionQuantifiedNumeric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertionQuantifiedNumeric = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:819:2: (iv_ruleAssertionQuantifiedNumeric= ruleAssertionQuantifiedNumeric EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:820:2: iv_ruleAssertionQuantifiedNumeric= ruleAssertionQuantifiedNumeric EOF
            {
             newCompositeNode(grammarAccess.getAssertionQuantifiedNumericRule()); 
            pushFollow(FOLLOW_ruleAssertionQuantifiedNumeric_in_entryRuleAssertionQuantifiedNumeric1669);
            iv_ruleAssertionQuantifiedNumeric=ruleAssertionQuantifiedNumeric();

            state._fsp--;

             current =iv_ruleAssertionQuantifiedNumeric; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertionQuantifiedNumeric1679); 

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
    // $ANTLR end "entryRuleAssertionQuantifiedNumeric"


    // $ANTLR start "ruleAssertionQuantifiedNumeric"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:827:1: ruleAssertionQuantifiedNumeric returns [EObject current=null] : ( ( (lv_quantifier_0_0= ruleNumbQuantifier ) ) otherlv_1= '(' ( (lv_alias_2_0= ruleVariable ) ) otherlv_3= 'in' ( (lv_var_4_0= ruleVariable ) ) otherlv_5= ',' ( (lv_conditions_6_0= ruleAssertionOr ) ) otherlv_7= ')' ) ;
    public final EObject ruleAssertionQuantifiedNumeric() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_quantifier_0_0 = null;

        AntlrDatatypeRuleToken lv_alias_2_0 = null;

        AntlrDatatypeRuleToken lv_var_4_0 = null;

        EObject lv_conditions_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:830:28: ( ( ( (lv_quantifier_0_0= ruleNumbQuantifier ) ) otherlv_1= '(' ( (lv_alias_2_0= ruleVariable ) ) otherlv_3= 'in' ( (lv_var_4_0= ruleVariable ) ) otherlv_5= ',' ( (lv_conditions_6_0= ruleAssertionOr ) ) otherlv_7= ')' ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:831:1: ( ( (lv_quantifier_0_0= ruleNumbQuantifier ) ) otherlv_1= '(' ( (lv_alias_2_0= ruleVariable ) ) otherlv_3= 'in' ( (lv_var_4_0= ruleVariable ) ) otherlv_5= ',' ( (lv_conditions_6_0= ruleAssertionOr ) ) otherlv_7= ')' )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:831:1: ( ( (lv_quantifier_0_0= ruleNumbQuantifier ) ) otherlv_1= '(' ( (lv_alias_2_0= ruleVariable ) ) otherlv_3= 'in' ( (lv_var_4_0= ruleVariable ) ) otherlv_5= ',' ( (lv_conditions_6_0= ruleAssertionOr ) ) otherlv_7= ')' )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:831:2: ( (lv_quantifier_0_0= ruleNumbQuantifier ) ) otherlv_1= '(' ( (lv_alias_2_0= ruleVariable ) ) otherlv_3= 'in' ( (lv_var_4_0= ruleVariable ) ) otherlv_5= ',' ( (lv_conditions_6_0= ruleAssertionOr ) ) otherlv_7= ')'
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:831:2: ( (lv_quantifier_0_0= ruleNumbQuantifier ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:832:1: (lv_quantifier_0_0= ruleNumbQuantifier )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:832:1: (lv_quantifier_0_0= ruleNumbQuantifier )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:833:3: lv_quantifier_0_0= ruleNumbQuantifier
            {
             
            	        newCompositeNode(grammarAccess.getAssertionQuantifiedNumericAccess().getQuantifierNumbQuantifierParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleNumbQuantifier_in_ruleAssertionQuantifiedNumeric1725);
            lv_quantifier_0_0=ruleNumbQuantifier();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssertionQuantifiedNumericRule());
            	        }
                   		set(
                   			current, 
                   			"quantifier",
                    		lv_quantifier_0_0, 
                    		"NumbQuantifier");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleAssertionQuantifiedNumeric1737); 

                	newLeafNode(otherlv_1, grammarAccess.getAssertionQuantifiedNumericAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:853:1: ( (lv_alias_2_0= ruleVariable ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:854:1: (lv_alias_2_0= ruleVariable )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:854:1: (lv_alias_2_0= ruleVariable )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:855:3: lv_alias_2_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getAssertionQuantifiedNumericAccess().getAliasVariableParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVariable_in_ruleAssertionQuantifiedNumeric1758);
            lv_alias_2_0=ruleVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssertionQuantifiedNumericRule());
            	        }
                   		set(
                   			current, 
                   			"alias",
                    		lv_alias_2_0, 
                    		"Variable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleAssertionQuantifiedNumeric1770); 

                	newLeafNode(otherlv_3, grammarAccess.getAssertionQuantifiedNumericAccess().getInKeyword_3());
                
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:875:1: ( (lv_var_4_0= ruleVariable ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:876:1: (lv_var_4_0= ruleVariable )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:876:1: (lv_var_4_0= ruleVariable )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:877:3: lv_var_4_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getAssertionQuantifiedNumericAccess().getVarVariableParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleVariable_in_ruleAssertionQuantifiedNumeric1791);
            lv_var_4_0=ruleVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssertionQuantifiedNumericRule());
            	        }
                   		set(
                   			current, 
                   			"var",
                    		lv_var_4_0, 
                    		"Variable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleAssertionQuantifiedNumeric1803); 

                	newLeafNode(otherlv_5, grammarAccess.getAssertionQuantifiedNumericAccess().getCommaKeyword_5());
                
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:897:1: ( (lv_conditions_6_0= ruleAssertionOr ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:898:1: (lv_conditions_6_0= ruleAssertionOr )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:898:1: (lv_conditions_6_0= ruleAssertionOr )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:899:3: lv_conditions_6_0= ruleAssertionOr
            {
             
            	        newCompositeNode(grammarAccess.getAssertionQuantifiedNumericAccess().getConditionsAssertionOrParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleAssertionOr_in_ruleAssertionQuantifiedNumeric1824);
            lv_conditions_6_0=ruleAssertionOr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssertionQuantifiedNumericRule());
            	        }
                   		set(
                   			current, 
                   			"conditions",
                    		lv_conditions_6_0, 
                    		"AssertionOr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleAssertionQuantifiedNumeric1836); 

                	newLeafNode(otherlv_7, grammarAccess.getAssertionQuantifiedNumericAccess().getRightParenthesisKeyword_7());
                

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
    // $ANTLR end "ruleAssertionQuantifiedNumeric"


    // $ANTLR start "entryRuleQuery"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:927:1: entryRuleQuery returns [EObject current=null] : iv_ruleQuery= ruleQuery EOF ;
    public final EObject entryRuleQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuery = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:928:2: (iv_ruleQuery= ruleQuery EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:929:2: iv_ruleQuery= ruleQuery EOF
            {
             newCompositeNode(grammarAccess.getQueryRule()); 
            pushFollow(FOLLOW_ruleQuery_in_entryRuleQuery1872);
            iv_ruleQuery=ruleQuery();

            state._fsp--;

             current =iv_ruleQuery; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuery1882); 

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:936:1: ruleQuery returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_steps_1_0= ruleStep ) )+ otherlv_2= ')' ) | ( (lv_steps_3_0= ruleStep ) )+ ) ;
    public final EObject ruleQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_steps_1_0 = null;

        EObject lv_steps_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:939:28: ( ( (otherlv_0= '(' ( (lv_steps_1_0= ruleStep ) )+ otherlv_2= ')' ) | ( (lv_steps_3_0= ruleStep ) )+ ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:940:1: ( (otherlv_0= '(' ( (lv_steps_1_0= ruleStep ) )+ otherlv_2= ')' ) | ( (lv_steps_3_0= ruleStep ) )+ )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:940:1: ( (otherlv_0= '(' ( (lv_steps_1_0= ruleStep ) )+ otherlv_2= ')' ) | ( (lv_steps_3_0= ruleStep ) )+ )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            else if ( (LA11_0==26||LA11_0==40) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:940:2: (otherlv_0= '(' ( (lv_steps_1_0= ruleStep ) )+ otherlv_2= ')' )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:940:2: (otherlv_0= '(' ( (lv_steps_1_0= ruleStep ) )+ otherlv_2= ')' )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:940:4: otherlv_0= '(' ( (lv_steps_1_0= ruleStep ) )+ otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleQuery1920); 

                        	newLeafNode(otherlv_0, grammarAccess.getQueryAccess().getLeftParenthesisKeyword_0_0());
                        
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:944:1: ( (lv_steps_1_0= ruleStep ) )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==26||LA9_0==40) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:945:1: (lv_steps_1_0= ruleStep )
                    	    {
                    	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:945:1: (lv_steps_1_0= ruleStep )
                    	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:946:3: lv_steps_1_0= ruleStep
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getQueryAccess().getStepsStepParserRuleCall_0_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleStep_in_ruleQuery1941);
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
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);

                    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleQuery1954); 

                        	newLeafNode(otherlv_2, grammarAccess.getQueryAccess().getRightParenthesisKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:967:6: ( (lv_steps_3_0= ruleStep ) )+
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:967:6: ( (lv_steps_3_0= ruleStep ) )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==26||LA10_0==40) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:968:1: (lv_steps_3_0= ruleStep )
                    	    {
                    	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:968:1: (lv_steps_3_0= ruleStep )
                    	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:969:3: lv_steps_3_0= ruleStep
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getQueryAccess().getStepsStepParserRuleCall_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleStep_in_ruleQuery1982);
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
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:993:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:994:2: (iv_ruleStep= ruleStep EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:995:2: iv_ruleStep= ruleStep EOF
            {
             newCompositeNode(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_ruleStep_in_entryRuleStep2019);
            iv_ruleStep=ruleStep();

            state._fsp--;

             current =iv_ruleStep; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStep2029); 

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1002:1: ruleStep returns [EObject current=null] : ( (otherlv_0= '/' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_attribute_3_0= ruleAttribute ) ) otherlv_4= ']' )? ) | ( (lv_placeholder_5_0= ruleVariable ) ) ) ;
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
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1005:28: ( ( (otherlv_0= '/' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_attribute_3_0= ruleAttribute ) ) otherlv_4= ']' )? ) | ( (lv_placeholder_5_0= ruleVariable ) ) ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1006:1: ( (otherlv_0= '/' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_attribute_3_0= ruleAttribute ) ) otherlv_4= ']' )? ) | ( (lv_placeholder_5_0= ruleVariable ) ) )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1006:1: ( (otherlv_0= '/' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_attribute_3_0= ruleAttribute ) ) otherlv_4= ']' )? ) | ( (lv_placeholder_5_0= ruleVariable ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            else if ( (LA13_0==40) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1006:2: (otherlv_0= '/' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_attribute_3_0= ruleAttribute ) ) otherlv_4= ']' )? )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1006:2: (otherlv_0= '/' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_attribute_3_0= ruleAttribute ) ) otherlv_4= ']' )? )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1006:4: otherlv_0= '/' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_attribute_3_0= ruleAttribute ) ) otherlv_4= ']' )?
                    {
                    otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleStep2067); 

                        	newLeafNode(otherlv_0, grammarAccess.getStepAccess().getSolidusKeyword_0_0());
                        
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1010:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1011:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1011:1: (lv_name_1_0= RULE_ID )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1012:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStep2084); 

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

                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1028:2: (otherlv_2= '[' ( (lv_attribute_3_0= ruleAttribute ) ) otherlv_4= ']' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==22) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1028:4: otherlv_2= '[' ( (lv_attribute_3_0= ruleAttribute ) ) otherlv_4= ']'
                            {
                            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleStep2102); 

                                	newLeafNode(otherlv_2, grammarAccess.getStepAccess().getLeftSquareBracketKeyword_0_2_0());
                                
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1032:1: ( (lv_attribute_3_0= ruleAttribute ) )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1033:1: (lv_attribute_3_0= ruleAttribute )
                            {
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1033:1: (lv_attribute_3_0= ruleAttribute )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1034:3: lv_attribute_3_0= ruleAttribute
                            {
                             
                            	        newCompositeNode(grammarAccess.getStepAccess().getAttributeAttributeParserRuleCall_0_2_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleAttribute_in_ruleStep2123);
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

                            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleStep2135); 

                                	newLeafNode(otherlv_4, grammarAccess.getStepAccess().getRightSquareBracketKeyword_0_2_2());
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1055:6: ( (lv_placeholder_5_0= ruleVariable ) )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1055:6: ( (lv_placeholder_5_0= ruleVariable ) )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1056:1: (lv_placeholder_5_0= ruleVariable )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1056:1: (lv_placeholder_5_0= ruleVariable )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1057:3: lv_placeholder_5_0= ruleVariable
                    {
                     
                    	        newCompositeNode(grammarAccess.getStepAccess().getPlaceholderVariableParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariable_in_ruleStep2165);
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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1081:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1082:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1083:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute2201);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute2211); 

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1090:1: ruleAttribute returns [EObject current=null] : ( ( ( (lv_property_0_0= RULE_ID ) ) ( ( ( (lv_op_1_0= ruleRop ) ) ( (lv_numberValue_2_0= RULE_NUMBER ) ) ) | ( ( (lv_op_3_0= ruleStringRop ) ) ( (lv_strValue_4_0= RULE_STRING ) ) ) ) ) | ( (lv_number_5_0= RULE_NUMBER ) ) ) ;
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
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1093:28: ( ( ( ( (lv_property_0_0= RULE_ID ) ) ( ( ( (lv_op_1_0= ruleRop ) ) ( (lv_numberValue_2_0= RULE_NUMBER ) ) ) | ( ( (lv_op_3_0= ruleStringRop ) ) ( (lv_strValue_4_0= RULE_STRING ) ) ) ) ) | ( (lv_number_5_0= RULE_NUMBER ) ) ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1094:1: ( ( ( (lv_property_0_0= RULE_ID ) ) ( ( ( (lv_op_1_0= ruleRop ) ) ( (lv_numberValue_2_0= RULE_NUMBER ) ) ) | ( ( (lv_op_3_0= ruleStringRop ) ) ( (lv_strValue_4_0= RULE_STRING ) ) ) ) ) | ( (lv_number_5_0= RULE_NUMBER ) ) )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1094:1: ( ( ( (lv_property_0_0= RULE_ID ) ) ( ( ( (lv_op_1_0= ruleRop ) ) ( (lv_numberValue_2_0= RULE_NUMBER ) ) ) | ( ( (lv_op_3_0= ruleStringRop ) ) ( (lv_strValue_4_0= RULE_STRING ) ) ) ) ) | ( (lv_number_5_0= RULE_NUMBER ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_NUMBER) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1094:2: ( ( (lv_property_0_0= RULE_ID ) ) ( ( ( (lv_op_1_0= ruleRop ) ) ( (lv_numberValue_2_0= RULE_NUMBER ) ) ) | ( ( (lv_op_3_0= ruleStringRop ) ) ( (lv_strValue_4_0= RULE_STRING ) ) ) ) )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1094:2: ( ( (lv_property_0_0= RULE_ID ) ) ( ( ( (lv_op_1_0= ruleRop ) ) ( (lv_numberValue_2_0= RULE_NUMBER ) ) ) | ( ( (lv_op_3_0= ruleStringRop ) ) ( (lv_strValue_4_0= RULE_STRING ) ) ) ) )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1094:3: ( (lv_property_0_0= RULE_ID ) ) ( ( ( (lv_op_1_0= ruleRop ) ) ( (lv_numberValue_2_0= RULE_NUMBER ) ) ) | ( ( (lv_op_3_0= ruleStringRop ) ) ( (lv_strValue_4_0= RULE_STRING ) ) ) )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1094:3: ( (lv_property_0_0= RULE_ID ) )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1095:1: (lv_property_0_0= RULE_ID )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1095:1: (lv_property_0_0= RULE_ID )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1096:3: lv_property_0_0= RULE_ID
                    {
                    lv_property_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute2254); 

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

                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1112:2: ( ( ( (lv_op_1_0= ruleRop ) ) ( (lv_numberValue_2_0= RULE_NUMBER ) ) ) | ( ( (lv_op_3_0= ruleStringRop ) ) ( (lv_strValue_4_0= RULE_STRING ) ) ) )
                    int alt14=2;
                    switch ( input.LA(1) ) {
                    case 15:
                        {
                        int LA14_1 = input.LA(2);

                        if ( (LA14_1==RULE_NUMBER) ) {
                            alt14=1;
                        }
                        else if ( (LA14_1==RULE_STRING) ) {
                            alt14=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 14, 1, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 27:
                        {
                        int LA14_2 = input.LA(2);

                        if ( (LA14_2==RULE_NUMBER) ) {
                            alt14=1;
                        }
                        else if ( (LA14_2==RULE_STRING) ) {
                            alt14=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 14, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                        {
                        alt14=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }

                    switch (alt14) {
                        case 1 :
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1112:3: ( ( (lv_op_1_0= ruleRop ) ) ( (lv_numberValue_2_0= RULE_NUMBER ) ) )
                            {
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1112:3: ( ( (lv_op_1_0= ruleRop ) ) ( (lv_numberValue_2_0= RULE_NUMBER ) ) )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1112:4: ( (lv_op_1_0= ruleRop ) ) ( (lv_numberValue_2_0= RULE_NUMBER ) )
                            {
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1112:4: ( (lv_op_1_0= ruleRop ) )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1113:1: (lv_op_1_0= ruleRop )
                            {
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1113:1: (lv_op_1_0= ruleRop )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1114:3: lv_op_1_0= ruleRop
                            {
                             
                            	        newCompositeNode(grammarAccess.getAttributeAccess().getOpRopParserRuleCall_0_1_0_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleRop_in_ruleAttribute2282);
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

                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1130:2: ( (lv_numberValue_2_0= RULE_NUMBER ) )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1131:1: (lv_numberValue_2_0= RULE_NUMBER )
                            {
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1131:1: (lv_numberValue_2_0= RULE_NUMBER )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1132:3: lv_numberValue_2_0= RULE_NUMBER
                            {
                            lv_numberValue_2_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleAttribute2299); 

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
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1149:6: ( ( (lv_op_3_0= ruleStringRop ) ) ( (lv_strValue_4_0= RULE_STRING ) ) )
                            {
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1149:6: ( ( (lv_op_3_0= ruleStringRop ) ) ( (lv_strValue_4_0= RULE_STRING ) ) )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1149:7: ( (lv_op_3_0= ruleStringRop ) ) ( (lv_strValue_4_0= RULE_STRING ) )
                            {
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1149:7: ( (lv_op_3_0= ruleStringRop ) )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1150:1: (lv_op_3_0= ruleStringRop )
                            {
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1150:1: (lv_op_3_0= ruleStringRop )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1151:3: lv_op_3_0= ruleStringRop
                            {
                             
                            	        newCompositeNode(grammarAccess.getAttributeAccess().getOpStringRopParserRuleCall_0_1_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleStringRop_in_ruleAttribute2333);
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

                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1167:2: ( (lv_strValue_4_0= RULE_STRING ) )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1168:1: (lv_strValue_4_0= RULE_STRING )
                            {
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1168:1: (lv_strValue_4_0= RULE_STRING )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1169:3: lv_strValue_4_0= RULE_STRING
                            {
                            lv_strValue_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute2350); 

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
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1186:6: ( (lv_number_5_0= RULE_NUMBER ) )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1186:6: ( (lv_number_5_0= RULE_NUMBER ) )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1187:1: (lv_number_5_0= RULE_NUMBER )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1187:1: (lv_number_5_0= RULE_NUMBER )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1188:3: lv_number_5_0= RULE_NUMBER
                    {
                    lv_number_5_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleAttribute2381); 

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1212:1: entryRuleStringRop returns [String current=null] : iv_ruleStringRop= ruleStringRop EOF ;
    public final String entryRuleStringRop() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringRop = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1213:2: (iv_ruleStringRop= ruleStringRop EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1214:2: iv_ruleStringRop= ruleStringRop EOF
            {
             newCompositeNode(grammarAccess.getStringRopRule()); 
            pushFollow(FOLLOW_ruleStringRop_in_entryRuleStringRop2423);
            iv_ruleStringRop=ruleStringRop();

            state._fsp--;

             current =iv_ruleStringRop.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringRop2434); 

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1221:1: ruleStringRop returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleStringRop() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1224:28: ( (kw= '=' | kw= '!=' ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1225:1: (kw= '=' | kw= '!=' )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1225:1: (kw= '=' | kw= '!=' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==15) ) {
                alt16=1;
            }
            else if ( (LA16_0==27) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1226:2: kw= '='
                    {
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleStringRop2472); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStringRopAccess().getEqualsSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1233:2: kw= '!='
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleStringRop2491); 

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1246:1: entryRuleRop returns [String current=null] : iv_ruleRop= ruleRop EOF ;
    public final String entryRuleRop() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRop = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1247:2: (iv_ruleRop= ruleRop EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1248:2: iv_ruleRop= ruleRop EOF
            {
             newCompositeNode(grammarAccess.getRopRule()); 
            pushFollow(FOLLOW_ruleRop_in_entryRuleRop2532);
            iv_ruleRop=ruleRop();

            state._fsp--;

             current =iv_ruleRop.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRop2543); 

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1255:1: ruleRop returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_StringRop_0= ruleStringRop | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' ) ;
    public final AntlrDatatypeRuleToken ruleRop() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_StringRop_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1258:28: ( (this_StringRop_0= ruleStringRop | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1259:1: (this_StringRop_0= ruleStringRop | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1259:1: (this_StringRop_0= ruleStringRop | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' )
            int alt17=5;
            switch ( input.LA(1) ) {
            case 15:
            case 27:
                {
                alt17=1;
                }
                break;
            case 28:
                {
                alt17=2;
                }
                break;
            case 29:
                {
                alt17=3;
                }
                break;
            case 30:
                {
                alt17=4;
                }
                break;
            case 31:
                {
                alt17=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1260:5: this_StringRop_0= ruleStringRop
                    {
                     
                            newCompositeNode(grammarAccess.getRopAccess().getStringRopParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStringRop_in_ruleRop2590);
                    this_StringRop_0=ruleStringRop();

                    state._fsp--;


                    		current.merge(this_StringRop_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1272:2: kw= '<'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleRop2614); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRopAccess().getLessThanSignKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1279:2: kw= '<='
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleRop2633); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRopAccess().getLessThanSignEqualsSignKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1286:2: kw= '>'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleRop2652); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRopAccess().getGreaterThanSignKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1293:2: kw= '>='
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleRop2671); 

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1306:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1307:2: (iv_ruleFunction= ruleFunction EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1308:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction2711);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction2721); 

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1315:1: ruleFunction returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_params_2_0= ruleValues ) )? otherlv_3= ')' ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_params_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1318:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_params_2_0= ruleValues ) )? otherlv_3= ')' ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1319:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_params_2_0= ruleValues ) )? otherlv_3= ')' )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1319:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_params_2_0= ruleValues ) )? otherlv_3= ')' )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1319:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_params_2_0= ruleValues ) )? otherlv_3= ')'
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1319:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1320:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1320:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1321:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunction2763); 

            			newLeafNode(lv_name_0_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFunctionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleFunction2780); 

                	newLeafNode(otherlv_1, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1341:1: ( (lv_params_2_0= ruleValues ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_NUMBER && LA18_0<=RULE_STRING)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1342:1: (lv_params_2_0= ruleValues )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1342:1: (lv_params_2_0= ruleValues )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1343:3: lv_params_2_0= ruleValues
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionAccess().getParamsValuesParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValues_in_ruleFunction2801);
                    lv_params_2_0=ruleValues();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionRule());
                    	        }
                           		set(
                           			current, 
                           			"params",
                            		lv_params_2_0, 
                            		"Values");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleFunction2814); 

                	newLeafNode(otherlv_3, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_3());
                

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


    // $ANTLR start "entryRuleBoolQuantifier"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1371:1: entryRuleBoolQuantifier returns [String current=null] : iv_ruleBoolQuantifier= ruleBoolQuantifier EOF ;
    public final String entryRuleBoolQuantifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolQuantifier = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1372:2: (iv_ruleBoolQuantifier= ruleBoolQuantifier EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1373:2: iv_ruleBoolQuantifier= ruleBoolQuantifier EOF
            {
             newCompositeNode(grammarAccess.getBoolQuantifierRule()); 
            pushFollow(FOLLOW_ruleBoolQuantifier_in_entryRuleBoolQuantifier2851);
            iv_ruleBoolQuantifier=ruleBoolQuantifier();

            state._fsp--;

             current =iv_ruleBoolQuantifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolQuantifier2862); 

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
    // $ANTLR end "entryRuleBoolQuantifier"


    // $ANTLR start "ruleBoolQuantifier"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1380:1: ruleBoolQuantifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'forall' | kw= 'exists' ) ;
    public final AntlrDatatypeRuleToken ruleBoolQuantifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1383:28: ( (kw= 'forall' | kw= 'exists' ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1384:1: (kw= 'forall' | kw= 'exists' )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1384:1: (kw= 'forall' | kw= 'exists' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==32) ) {
                alt19=1;
            }
            else if ( (LA19_0==33) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1385:2: kw= 'forall'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleBoolQuantifier2900); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBoolQuantifierAccess().getForallKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1392:2: kw= 'exists'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleBoolQuantifier2919); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBoolQuantifierAccess().getExistsKeyword_1()); 
                        

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
    // $ANTLR end "ruleBoolQuantifier"


    // $ANTLR start "entryRuleNumbQuantifier"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1405:1: entryRuleNumbQuantifier returns [String current=null] : iv_ruleNumbQuantifier= ruleNumbQuantifier EOF ;
    public final String entryRuleNumbQuantifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumbQuantifier = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1406:2: (iv_ruleNumbQuantifier= ruleNumbQuantifier EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1407:2: iv_ruleNumbQuantifier= ruleNumbQuantifier EOF
            {
             newCompositeNode(grammarAccess.getNumbQuantifierRule()); 
            pushFollow(FOLLOW_ruleNumbQuantifier_in_entryRuleNumbQuantifier2960);
            iv_ruleNumbQuantifier=ruleNumbQuantifier();

            state._fsp--;

             current =iv_ruleNumbQuantifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumbQuantifier2971); 

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
    // $ANTLR end "entryRuleNumbQuantifier"


    // $ANTLR start "ruleNumbQuantifier"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1414:1: ruleNumbQuantifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'numOf' | kw= 'sum' | kw= 'avg' | kw= 'min' | kw= 'max' | kw= 'product' ) ;
    public final AntlrDatatypeRuleToken ruleNumbQuantifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1417:28: ( (kw= 'numOf' | kw= 'sum' | kw= 'avg' | kw= 'min' | kw= 'max' | kw= 'product' ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1418:1: (kw= 'numOf' | kw= 'sum' | kw= 'avg' | kw= 'min' | kw= 'max' | kw= 'product' )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1418:1: (kw= 'numOf' | kw= 'sum' | kw= 'avg' | kw= 'min' | kw= 'max' | kw= 'product' )
            int alt20=6;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt20=1;
                }
                break;
            case 35:
                {
                alt20=2;
                }
                break;
            case 36:
                {
                alt20=3;
                }
                break;
            case 37:
                {
                alt20=4;
                }
                break;
            case 38:
                {
                alt20=5;
                }
                break;
            case 39:
                {
                alt20=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1419:2: kw= 'numOf'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleNumbQuantifier3009); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNumbQuantifierAccess().getNumOfKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1426:2: kw= 'sum'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleNumbQuantifier3028); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNumbQuantifierAccess().getSumKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1433:2: kw= 'avg'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleNumbQuantifier3047); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNumbQuantifierAccess().getAvgKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1440:2: kw= 'min'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleNumbQuantifier3066); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNumbQuantifierAccess().getMinKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1447:2: kw= 'max'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleNumbQuantifier3085); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNumbQuantifierAccess().getMaxKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1454:2: kw= 'product'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleNumbQuantifier3104); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNumbQuantifierAccess().getProductKeyword_5()); 
                        

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
    // $ANTLR end "ruleNumbQuantifier"


    // $ANTLR start "entryRuleVariable"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1467:1: entryRuleVariable returns [String current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final String entryRuleVariable() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVariable = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1468:2: (iv_ruleVariable= ruleVariable EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1469:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable3145);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable3156); 

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1476:1: ruleVariable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '$' (this_ID_1= RULE_ID | this_BoolQuantifier_2= ruleBoolQuantifier | this_NumbQuantifier_3= ruleNumbQuantifier ) ) ;
    public final AntlrDatatypeRuleToken ruleVariable() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        AntlrDatatypeRuleToken this_BoolQuantifier_2 = null;

        AntlrDatatypeRuleToken this_NumbQuantifier_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1479:28: ( (kw= '$' (this_ID_1= RULE_ID | this_BoolQuantifier_2= ruleBoolQuantifier | this_NumbQuantifier_3= ruleNumbQuantifier ) ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1480:1: (kw= '$' (this_ID_1= RULE_ID | this_BoolQuantifier_2= ruleBoolQuantifier | this_NumbQuantifier_3= ruleNumbQuantifier ) )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1480:1: (kw= '$' (this_ID_1= RULE_ID | this_BoolQuantifier_2= ruleBoolQuantifier | this_NumbQuantifier_3= ruleNumbQuantifier ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1481:2: kw= '$' (this_ID_1= RULE_ID | this_BoolQuantifier_2= ruleBoolQuantifier | this_NumbQuantifier_3= ruleNumbQuantifier )
            {
            kw=(Token)match(input,40,FOLLOW_40_in_ruleVariable3194); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVariableAccess().getDollarSignKeyword_0()); 
                
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1486:1: (this_ID_1= RULE_ID | this_BoolQuantifier_2= ruleBoolQuantifier | this_NumbQuantifier_3= ruleNumbQuantifier )
            int alt21=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt21=1;
                }
                break;
            case 32:
            case 33:
                {
                alt21=2;
                }
                break;
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1486:6: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable3210); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getVariableAccess().getIDTerminalRuleCall_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1495:5: this_BoolQuantifier_2= ruleBoolQuantifier
                    {
                     
                            newCompositeNode(grammarAccess.getVariableAccess().getBoolQuantifierParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleBoolQuantifier_in_ruleVariable3243);
                    this_BoolQuantifier_2=ruleBoolQuantifier();

                    state._fsp--;


                    		current.merge(this_BoolQuantifier_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1507:5: this_NumbQuantifier_3= ruleNumbQuantifier
                    {
                     
                            newCompositeNode(grammarAccess.getVariableAccess().getNumbQuantifierParserRuleCall_1_2()); 
                        
                    pushFollow(FOLLOW_ruleNumbQuantifier_in_ruleVariable3276);
                    this_NumbQuantifier_3=ruleNumbQuantifier();

                    state._fsp--;


                    		current.merge(this_NumbQuantifier_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleValues"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1525:1: entryRuleValues returns [EObject current=null] : iv_ruleValues= ruleValues EOF ;
    public final EObject entryRuleValues() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValues = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1526:2: (iv_ruleValues= ruleValues EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1527:2: iv_ruleValues= ruleValues EOF
            {
             newCompositeNode(grammarAccess.getValuesRule()); 
            pushFollow(FOLLOW_ruleValues_in_entryRuleValues3322);
            iv_ruleValues=ruleValues();

            state._fsp--;

             current =iv_ruleValues; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValues3332); 

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1534:1: ruleValues returns [EObject current=null] : ( ( (lv_value_0_0= ruleConstant ) ) (otherlv_1= ',' ( (lv_value_2_0= ruleConstant ) ) )* ) ;
    public final EObject ruleValues() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1537:28: ( ( ( (lv_value_0_0= ruleConstant ) ) (otherlv_1= ',' ( (lv_value_2_0= ruleConstant ) ) )* ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1538:1: ( ( (lv_value_0_0= ruleConstant ) ) (otherlv_1= ',' ( (lv_value_2_0= ruleConstant ) ) )* )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1538:1: ( ( (lv_value_0_0= ruleConstant ) ) (otherlv_1= ',' ( (lv_value_2_0= ruleConstant ) ) )* )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1538:2: ( (lv_value_0_0= ruleConstant ) ) (otherlv_1= ',' ( (lv_value_2_0= ruleConstant ) ) )*
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1538:2: ( (lv_value_0_0= ruleConstant ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1539:1: (lv_value_0_0= ruleConstant )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1539:1: (lv_value_0_0= ruleConstant )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1540:3: lv_value_0_0= ruleConstant
            {
             
            	        newCompositeNode(grammarAccess.getValuesAccess().getValueConstantParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleConstant_in_ruleValues3378);
            lv_value_0_0=ruleConstant();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getValuesRule());
            	        }
                   		add(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"Constant");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1556:2: (otherlv_1= ',' ( (lv_value_2_0= ruleConstant ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==25) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1556:4: otherlv_1= ',' ( (lv_value_2_0= ruleConstant ) )
            	    {
            	    otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleValues3391); 

            	        	newLeafNode(otherlv_1, grammarAccess.getValuesAccess().getCommaKeyword_1_0());
            	        
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1560:1: ( (lv_value_2_0= ruleConstant ) )
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1561:1: (lv_value_2_0= ruleConstant )
            	    {
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1561:1: (lv_value_2_0= ruleConstant )
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1562:3: lv_value_2_0= ruleConstant
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getValuesAccess().getValueConstantParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConstant_in_ruleValues3412);
            	    lv_value_2_0=ruleConstant();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getValuesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"value",
            	            		lv_value_2_0, 
            	            		"Constant");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // $ANTLR end "ruleValues"


    // $ANTLR start "entryRuleConstant"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1586:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1587:2: (iv_ruleConstant= ruleConstant EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1588:2: iv_ruleConstant= ruleConstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_ruleConstant_in_entryRuleConstant3450);
            iv_ruleConstant=ruleConstant();

            state._fsp--;

             current =iv_ruleConstant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstant3460); 

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1595:1: ruleConstant returns [EObject current=null] : ( ( (lv_number_0_0= RULE_NUMBER ) ) | ( (lv_string_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token lv_number_0_0=null;
        Token lv_string_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1598:28: ( ( ( (lv_number_0_0= RULE_NUMBER ) ) | ( (lv_string_1_0= RULE_STRING ) ) ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1599:1: ( ( (lv_number_0_0= RULE_NUMBER ) ) | ( (lv_string_1_0= RULE_STRING ) ) )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1599:1: ( ( (lv_number_0_0= RULE_NUMBER ) ) | ( (lv_string_1_0= RULE_STRING ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_NUMBER) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_STRING) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1599:2: ( (lv_number_0_0= RULE_NUMBER ) )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1599:2: ( (lv_number_0_0= RULE_NUMBER ) )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1600:1: (lv_number_0_0= RULE_NUMBER )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1600:1: (lv_number_0_0= RULE_NUMBER )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1601:3: lv_number_0_0= RULE_NUMBER
                    {
                    lv_number_0_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleConstant3502); 

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
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1618:6: ( (lv_string_1_0= RULE_STRING ) )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1618:6: ( (lv_string_1_0= RULE_STRING ) )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1619:1: (lv_string_1_0= RULE_STRING )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1619:1: (lv_string_1_0= RULE_STRING )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1620:3: lv_string_1_0= RULE_STRING
                    {
                    lv_string_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConstant3530); 

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

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\35\uffff";
    static final String DFA5_eofS =
        "\35\uffff";
    static final String DFA5_minS =
        "\1\4\1\uffff\1\4\2\uffff\2\5\12\17\1\5\1\17\1\27\6\6\1\17\2\27";
    static final String DFA5_maxS =
        "\1\50\1\uffff\1\50\2\uffff\1\5\1\47\12\50\1\6\1\37\1\27\2\7\4\6"+
        "\1\50\2\27";
    static final String DFA5_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\2\30\uffff";
    static final String DFA5_specialS =
        "\35\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\3\1\uffff\2\3\12\uffff\1\2\1\uffff\1\1\1\uffff\1\3\3\uffff"+
            "\1\3\5\uffff\11\3",
            "",
            "\1\4\1\uffff\2\4\12\uffff\1\4\1\uffff\1\4\1\uffff\1\4\3\uffff"+
            "\1\5\5\uffff\10\4\1\6",
            "",
            "",
            "\1\7",
            "\1\10\32\uffff\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20",
            "\1\4\3\uffff\1\3\1\uffff\1\4\1\21\3\uffff\1\5\5\4\10\uffff"+
            "\1\6",
            "\1\4\3\uffff\1\3\1\uffff\1\4\4\uffff\1\5\5\4\10\uffff\1\6",
            "\1\4\3\uffff\1\3\1\uffff\1\4\4\uffff\1\5\5\4\10\uffff\1\6",
            "\1\4\3\uffff\1\3\1\uffff\1\4\4\uffff\1\5\5\4\10\uffff\1\6",
            "\1\4\3\uffff\1\3\1\uffff\1\4\4\uffff\1\5\5\4\10\uffff\1\6",
            "\1\4\3\uffff\1\3\1\uffff\1\4\4\uffff\1\5\5\4\10\uffff\1\6",
            "\1\4\3\uffff\1\3\1\uffff\1\4\4\uffff\1\5\5\4\10\uffff\1\6",
            "\1\4\3\uffff\1\3\1\uffff\1\4\4\uffff\1\5\5\4\10\uffff\1\6",
            "\1\4\3\uffff\1\3\1\uffff\1\4\4\uffff\1\5\5\4\10\uffff\1\6",
            "\1\4\3\uffff\1\3\1\uffff\1\4\4\uffff\1\5\5\4\10\uffff\1\6",
            "\1\22\1\23",
            "\1\24\13\uffff\1\25\1\26\1\27\1\30\1\31",
            "\1\32",
            "\1\34\1\33",
            "\1\34\1\33",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\4\3\uffff\1\3\1\uffff\1\4\4\uffff\1\5\5\4\10\uffff\1\6",
            "\1\32",
            "\1\32"
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "344:1: (this_AssertionNot_0= ruleAssertionNot | this_AssertionBraced_1= ruleAssertionBraced | this_AssertionForm_2= ruleAssertionForm )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleModel131 = new BitSet(new long[]{0x000001FF045440D0L});
    public static final BitSet FOLLOW_ruleAssertionOr_in_ruleModel153 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleModel165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleDeclaration248 = new BitSet(new long[]{0x0000010004040000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleDeclaration269 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDeclaration281 = new BitSet(new long[]{0x000001FF045400D0L});
    public static final BitSet FOLLOW_ruleAssertion_in_ruleDeclaration304 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleAssertionQuantifiedBoolean_in_ruleDeclaration323 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDeclaration338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionOr_in_entryRuleAssertionOr374 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertionOr384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionAnd_in_ruleAssertionOr431 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleAssertionOr452 = new BitSet(new long[]{0x000001FF045400D0L});
    public static final BitSet FOLLOW_ruleAssertionAnd_in_ruleAssertionOr473 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleAssertionAnd_in_entryRuleAssertionAnd511 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertionAnd521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHighProrityAssertion_in_ruleAssertionAnd568 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleAssertionAnd589 = new BitSet(new long[]{0x000001FF045400D0L});
    public static final BitSet FOLLOW_ruleHighProrityAssertion_in_ruleAssertionAnd610 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleHighProrityAssertion_in_entryRuleHighProrityAssertion648 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHighProrityAssertion658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionNot_in_ruleHighProrityAssertion705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionBraced_in_ruleHighProrityAssertion732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionForm_in_ruleHighProrityAssertion759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionBraced_in_entryRuleAssertionBraced794 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertionBraced804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleAssertionBraced841 = new BitSet(new long[]{0x000001FF045400D0L});
    public static final BitSet FOLLOW_ruleAssertionOr_in_ruleAssertionBraced862 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAssertionBraced874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionNot_in_entryRuleAssertionNot910 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertionNot920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleAssertionNot957 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAssertionNot969 = new BitSet(new long[]{0x000001FF045400D0L});
    public static final BitSet FOLLOW_ruleAssertionOr_in_ruleAssertionNot990 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAssertionNot1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionForm_in_entryRuleAssertionForm1038 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertionForm1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertion_in_ruleAssertionForm1095 = new BitSet(new long[]{0x00000000F8008000L});
    public static final BitSet FOLLOW_ruleRop_in_ruleAssertionForm1116 = new BitSet(new long[]{0x000001FC044400D0L});
    public static final BitSet FOLLOW_ruleAssertion_in_ruleAssertionForm1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionQuantifiedBoolean_in_ruleAssertionForm1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertion_in_entryRuleAssertion1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertion1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuery_in_ruleAssertion1258 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleAssertion1271 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleAssertion1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionQuantifiedNumeric_in_ruleAssertion1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleAssertion1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleAssertion1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleAssertion1396 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleValues_in_ruleAssertion1417 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleAssertion1429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionQuantifiedBoolean_in_entryRuleAssertionQuantifiedBoolean1466 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertionQuantifiedBoolean1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolQuantifier_in_ruleAssertionQuantifiedBoolean1522 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAssertionQuantifiedBoolean1534 = new BitSet(new long[]{0x0000010004040000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleAssertionQuantifiedBoolean1555 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleAssertionQuantifiedBoolean1567 = new BitSet(new long[]{0x0000010004040000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleAssertionQuantifiedBoolean1588 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleAssertionQuantifiedBoolean1600 = new BitSet(new long[]{0x000001FF045400D0L});
    public static final BitSet FOLLOW_ruleAssertionOr_in_ruleAssertionQuantifiedBoolean1621 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAssertionQuantifiedBoolean1633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionQuantifiedNumeric_in_entryRuleAssertionQuantifiedNumeric1669 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertionQuantifiedNumeric1679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumbQuantifier_in_ruleAssertionQuantifiedNumeric1725 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAssertionQuantifiedNumeric1737 = new BitSet(new long[]{0x0000010004040000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleAssertionQuantifiedNumeric1758 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleAssertionQuantifiedNumeric1770 = new BitSet(new long[]{0x0000010004040000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleAssertionQuantifiedNumeric1791 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleAssertionQuantifiedNumeric1803 = new BitSet(new long[]{0x000001FF045400D0L});
    public static final BitSet FOLLOW_ruleAssertionOr_in_ruleAssertionQuantifiedNumeric1824 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAssertionQuantifiedNumeric1836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuery_in_entryRuleQuery1872 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuery1882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleQuery1920 = new BitSet(new long[]{0x0000010004040000L});
    public static final BitSet FOLLOW_ruleStep_in_ruleQuery1941 = new BitSet(new long[]{0x00000100040C0000L});
    public static final BitSet FOLLOW_19_in_ruleQuery1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_ruleQuery1982 = new BitSet(new long[]{0x0000010004040002L});
    public static final BitSet FOLLOW_ruleStep_in_entryRuleStep2019 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStep2029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleStep2067 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStep2084 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleStep2102 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleStep2123 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleStep2135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleStep2165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute2201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute2211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute2254 = new BitSet(new long[]{0x00000000F8008000L});
    public static final BitSet FOLLOW_ruleRop_in_ruleAttribute2282 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleAttribute2299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringRop_in_ruleAttribute2333 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute2350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleAttribute2381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringRop_in_entryRuleStringRop2423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringRop2434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleStringRop2472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleStringRop2491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRop_in_entryRuleRop2532 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRop2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringRop_in_ruleRop2590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleRop2614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleRop2633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleRop2652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleRop2671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction2711 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction2721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunction2763 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunction2780 = new BitSet(new long[]{0x00000000000800C0L});
    public static final BitSet FOLLOW_ruleValues_in_ruleFunction2801 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleFunction2814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolQuantifier_in_entryRuleBoolQuantifier2851 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolQuantifier2862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleBoolQuantifier2900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleBoolQuantifier2919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumbQuantifier_in_entryRuleNumbQuantifier2960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumbQuantifier2971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleNumbQuantifier3009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleNumbQuantifier3028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleNumbQuantifier3047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleNumbQuantifier3066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleNumbQuantifier3085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleNumbQuantifier3104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable3145 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable3156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleVariable3194 = new BitSet(new long[]{0x000001FF045400F0L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable3210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolQuantifier_in_ruleVariable3243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumbQuantifier_in_ruleVariable3276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValues_in_entryRuleValues3322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValues3332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleValues3378 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleValues3391 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleValues3412 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant3450 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstant3460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleConstant3502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConstant3530 = new BitSet(new long[]{0x0000000000000002L});

}