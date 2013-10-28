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
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalXptParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NUMBER", "RULE_STRING", "RULE_BOOLEAN", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'let'", "'='", "'||'", "'&&'", "'('", "')'", "'!'", "'.'", "'['", "']'", "'in'", "','", "'/'", "'contains'", "'startsWith'", "'endsWith'", "'$'", "'forall'", "'exists'", "'numOf'", "'sum'", "'avg'", "'min'", "'max'", "'product'", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='"
    };
    public static final int RULE_BOOLEAN=7;
    public static final int RULE_ID=4;
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
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_NUMBER=5;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=8;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__44=44;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=6;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
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
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); if (state.failed) return current;

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
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getDeclarationsDeclarationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDeclaration_in_ruleModel131);
            	    lv_declarations_0_0=ruleDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getModelAccess().getAssertionSetAssertionOrParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAssertionOr_in_ruleModel153);
            lv_assertionSet_1_0=ruleAssertionOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleModel165); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getModelAccess().getSemicolonKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration201);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration211); if (state.failed) return current;

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
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleDeclaration248); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDeclarationAccess().getLetKeyword_0());
                  
            }
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:145:1: ( (lv_var_1_0= ruleVariable ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:146:1: (lv_var_1_0= ruleVariable )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:146:1: (lv_var_1_0= ruleVariable )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:147:3: lv_var_1_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDeclarationAccess().getVarVariableParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleDeclaration269);
            lv_var_1_0=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleDeclaration281); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDeclarationAccess().getEqualsSignKeyword_2());
                  
            }
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:167:1: ( ( (lv_assert_3_1= ruleAssertion | lv_assert_3_2= ruleAssertionQuantifiedBoolean ) ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:168:1: ( (lv_assert_3_1= ruleAssertion | lv_assert_3_2= ruleAssertionQuantifiedBoolean ) )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:168:1: ( (lv_assert_3_1= ruleAssertion | lv_assert_3_2= ruleAssertionQuantifiedBoolean ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:169:1: (lv_assert_3_1= ruleAssertion | lv_assert_3_2= ruleAssertionQuantifiedBoolean )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:169:1: (lv_assert_3_1= ruleAssertion | lv_assert_3_2= ruleAssertionQuantifiedBoolean )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_NUMBER && LA2_0<=RULE_STRING)||LA2_0==22||LA2_0==26||LA2_0==30||(LA2_0>=33 && LA2_0<=38)) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=31 && LA2_0<=32)) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:170:3: lv_assert_3_1= ruleAssertion
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDeclarationAccess().getAssertAssertionParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAssertion_in_ruleDeclaration304);
                    lv_assert_3_1=ruleAssertion();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:185:8: lv_assert_3_2= ruleAssertionQuantifiedBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDeclarationAccess().getAssertAssertionQuantifiedBooleanParserRuleCall_3_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAssertionQuantifiedBoolean_in_ruleDeclaration323);
                    lv_assert_3_2=ruleAssertionQuantifiedBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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

                    }
                    break;

            }


            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleDeclaration338); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getDeclarationAccess().getSemicolonKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssertionOrRule()); 
            }
            pushFollow(FOLLOW_ruleAssertionOr_in_entryRuleAssertionOr374);
            iv_ruleAssertionOr=ruleAssertionOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssertionOr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertionOr384); if (state.failed) return current;

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
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAssertionOrAccess().getAssertionAndParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAssertionAnd_in_ruleAssertionOr431);
            this_AssertionAnd_0=ruleAssertionAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AssertionAnd_0; 
                      afterParserOrEnumRuleCall();
                  
            }
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
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAssertionOrAccess().getAssertionOrLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleAssertionOr452); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getAssertionOrAccess().getVerticalLineVerticalLineKeyword_1_1());
            	          
            	    }
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:247:1: ( (lv_right_3_0= ruleAssertionAnd ) )
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:248:1: (lv_right_3_0= ruleAssertionAnd )
            	    {
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:248:1: (lv_right_3_0= ruleAssertionAnd )
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:249:3: lv_right_3_0= ruleAssertionAnd
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssertionOrAccess().getRightAssertionAndParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAssertionAnd_in_ruleAssertionOr473);
            	    lv_right_3_0=ruleAssertionAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssertionAndRule()); 
            }
            pushFollow(FOLLOW_ruleAssertionAnd_in_entryRuleAssertionAnd511);
            iv_ruleAssertionAnd=ruleAssertionAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssertionAnd; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertionAnd521); if (state.failed) return current;

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:282:1: ruleAssertionAnd returns [EObject current=null] : (this_AssertionHP_0= ruleAssertionHP ( () otherlv_2= '&&' ( (lv_right_3_0= ruleAssertionHP ) ) )* ) ;
    public final EObject ruleAssertionAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AssertionHP_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:285:28: ( (this_AssertionHP_0= ruleAssertionHP ( () otherlv_2= '&&' ( (lv_right_3_0= ruleAssertionHP ) ) )* ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:286:1: (this_AssertionHP_0= ruleAssertionHP ( () otherlv_2= '&&' ( (lv_right_3_0= ruleAssertionHP ) ) )* )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:286:1: (this_AssertionHP_0= ruleAssertionHP ( () otherlv_2= '&&' ( (lv_right_3_0= ruleAssertionHP ) ) )* )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:287:5: this_AssertionHP_0= ruleAssertionHP ( () otherlv_2= '&&' ( (lv_right_3_0= ruleAssertionHP ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAssertionAndAccess().getAssertionHPParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAssertionHP_in_ruleAssertionAnd568);
            this_AssertionHP_0=ruleAssertionHP();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AssertionHP_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:295:1: ( () otherlv_2= '&&' ( (lv_right_3_0= ruleAssertionHP ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:295:2: () otherlv_2= '&&' ( (lv_right_3_0= ruleAssertionHP ) )
            	    {
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:295:2: ()
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:296:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAssertionAndAccess().getAssertionAndLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleAssertionAnd589); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getAssertionAndAccess().getAmpersandAmpersandKeyword_1_1());
            	          
            	    }
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:305:1: ( (lv_right_3_0= ruleAssertionHP ) )
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:306:1: (lv_right_3_0= ruleAssertionHP )
            	    {
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:306:1: (lv_right_3_0= ruleAssertionHP )
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:307:3: lv_right_3_0= ruleAssertionHP
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssertionAndAccess().getRightAssertionHPParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAssertionHP_in_ruleAssertionAnd610);
            	    lv_right_3_0=ruleAssertionHP();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAssertionAndRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"AssertionHP");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

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

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAssertionAnd"


    // $ANTLR start "entryRuleAssertionHP"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:331:1: entryRuleAssertionHP returns [EObject current=null] : iv_ruleAssertionHP= ruleAssertionHP EOF ;
    public final EObject entryRuleAssertionHP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertionHP = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:332:2: (iv_ruleAssertionHP= ruleAssertionHP EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:333:2: iv_ruleAssertionHP= ruleAssertionHP EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssertionHPRule()); 
            }
            pushFollow(FOLLOW_ruleAssertionHP_in_entryRuleAssertionHP648);
            iv_ruleAssertionHP=ruleAssertionHP();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssertionHP; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertionHP658); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAssertionHP"


    // $ANTLR start "ruleAssertionHP"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:340:1: ruleAssertionHP returns [EObject current=null] : (this_AssertionNot_0= ruleAssertionNot | this_AssertionBraced_1= ruleAssertionBraced | this_AssertionForm_2= ruleAssertionForm ) ;
    public final EObject ruleAssertionHP() throws RecognitionException {
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
            switch ( input.LA(1) ) {
            case 20:
                {
                alt5=1;
                }
                break;
            case 18:
                {
                alt5=2;
                }
                break;
            case RULE_NUMBER:
            case RULE_STRING:
            case 22:
            case 26:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
                {
                alt5=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:345:5: this_AssertionNot_0= ruleAssertionNot
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAssertionHPAccess().getAssertionNotParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAssertionNot_in_ruleAssertionHP705);
                    this_AssertionNot_0=ruleAssertionNot();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AssertionNot_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:355:5: this_AssertionBraced_1= ruleAssertionBraced
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAssertionHPAccess().getAssertionBracedParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAssertionBraced_in_ruleAssertionHP732);
                    this_AssertionBraced_1=ruleAssertionBraced();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AssertionBraced_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:365:5: this_AssertionForm_2= ruleAssertionForm
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAssertionHPAccess().getAssertionFormParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAssertionForm_in_ruleAssertionHP759);
                    this_AssertionForm_2=ruleAssertionForm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AssertionForm_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAssertionHP"


    // $ANTLR start "entryRuleAssertionBraced"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:381:1: entryRuleAssertionBraced returns [EObject current=null] : iv_ruleAssertionBraced= ruleAssertionBraced EOF ;
    public final EObject entryRuleAssertionBraced() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertionBraced = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:382:2: (iv_ruleAssertionBraced= ruleAssertionBraced EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:383:2: iv_ruleAssertionBraced= ruleAssertionBraced EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssertionBracedRule()); 
            }
            pushFollow(FOLLOW_ruleAssertionBraced_in_entryRuleAssertionBraced794);
            iv_ruleAssertionBraced=ruleAssertionBraced();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssertionBraced; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertionBraced804); if (state.failed) return current;

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
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleAssertionBraced841); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAssertionBracedAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:398:1: ( (lv_innerFormula_1_0= ruleAssertionOr ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:399:1: (lv_innerFormula_1_0= ruleAssertionOr )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:399:1: (lv_innerFormula_1_0= ruleAssertionOr )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:400:3: lv_innerFormula_1_0= ruleAssertionOr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssertionBracedAccess().getInnerFormulaAssertionOrParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAssertionOr_in_ruleAssertionBraced862);
            lv_innerFormula_1_0=ruleAssertionOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleAssertionBraced874); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getAssertionBracedAccess().getRightParenthesisKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssertionNotRule()); 
            }
            pushFollow(FOLLOW_ruleAssertionNot_in_entryRuleAssertionNot910);
            iv_ruleAssertionNot=ruleAssertionNot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssertionNot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertionNot920); if (state.failed) return current;

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
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleAssertionNot957); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAssertionNotAccess().getExclamationMarkKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleAssertionNot969); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAssertionNotAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:449:1: ( (lv_innerFormula_2_0= ruleAssertionOr ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:450:1: (lv_innerFormula_2_0= ruleAssertionOr )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:450:1: (lv_innerFormula_2_0= ruleAssertionOr )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:451:3: lv_innerFormula_2_0= ruleAssertionOr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssertionNotAccess().getInnerFormulaAssertionOrParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAssertionOr_in_ruleAssertionNot990);
            lv_innerFormula_2_0=ruleAssertionOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleAssertionNot1002); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getAssertionNotAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssertionFormRule()); 
            }
            pushFollow(FOLLOW_ruleAssertionForm_in_entryRuleAssertionForm1038);
            iv_ruleAssertionForm=ruleAssertionForm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssertionForm; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertionForm1048); if (state.failed) return current;

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:488:1: ruleAssertionForm returns [EObject current=null] : ( ( ( ruleAssertionStdCmp )=>this_AssertionStdCmp_0= ruleAssertionStdCmp ) | this_AssertionQuantifiedBoolean_1= ruleAssertionQuantifiedBoolean | this_AssertionBoolean_2= ruleAssertionBoolean ) ;
    public final EObject ruleAssertionForm() throws RecognitionException {
        EObject current = null;

        EObject this_AssertionStdCmp_0 = null;

        EObject this_AssertionQuantifiedBoolean_1 = null;

        EObject this_AssertionBoolean_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:491:28: ( ( ( ( ruleAssertionStdCmp )=>this_AssertionStdCmp_0= ruleAssertionStdCmp ) | this_AssertionQuantifiedBoolean_1= ruleAssertionQuantifiedBoolean | this_AssertionBoolean_2= ruleAssertionBoolean ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:492:1: ( ( ( ruleAssertionStdCmp )=>this_AssertionStdCmp_0= ruleAssertionStdCmp ) | this_AssertionQuantifiedBoolean_1= ruleAssertionQuantifiedBoolean | this_AssertionBoolean_2= ruleAssertionBoolean )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:492:1: ( ( ( ruleAssertionStdCmp )=>this_AssertionStdCmp_0= ruleAssertionStdCmp ) | this_AssertionQuantifiedBoolean_1= ruleAssertionQuantifiedBoolean | this_AssertionBoolean_2= ruleAssertionBoolean )
            int alt6=3;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:492:2: ( ( ruleAssertionStdCmp )=>this_AssertionStdCmp_0= ruleAssertionStdCmp )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:492:2: ( ( ruleAssertionStdCmp )=>this_AssertionStdCmp_0= ruleAssertionStdCmp )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:492:3: ( ruleAssertionStdCmp )=>this_AssertionStdCmp_0= ruleAssertionStdCmp
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAssertionFormAccess().getAssertionStdCmpParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAssertionStdCmp_in_ruleAssertionForm1101);
                    this_AssertionStdCmp_0=ruleAssertionStdCmp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AssertionStdCmp_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:503:5: this_AssertionQuantifiedBoolean_1= ruleAssertionQuantifiedBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAssertionFormAccess().getAssertionQuantifiedBooleanParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAssertionQuantifiedBoolean_in_ruleAssertionForm1129);
                    this_AssertionQuantifiedBoolean_1=ruleAssertionQuantifiedBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AssertionQuantifiedBoolean_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:513:5: this_AssertionBoolean_2= ruleAssertionBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAssertionFormAccess().getAssertionBooleanParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAssertionBoolean_in_ruleAssertionForm1156);
                    this_AssertionBoolean_2=ruleAssertionBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AssertionBoolean_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAssertionForm"


    // $ANTLR start "entryRuleAssertionStdCmp"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:529:1: entryRuleAssertionStdCmp returns [EObject current=null] : iv_ruleAssertionStdCmp= ruleAssertionStdCmp EOF ;
    public final EObject entryRuleAssertionStdCmp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertionStdCmp = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:530:2: (iv_ruleAssertionStdCmp= ruleAssertionStdCmp EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:531:2: iv_ruleAssertionStdCmp= ruleAssertionStdCmp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssertionStdCmpRule()); 
            }
            pushFollow(FOLLOW_ruleAssertionStdCmp_in_entryRuleAssertionStdCmp1191);
            iv_ruleAssertionStdCmp=ruleAssertionStdCmp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssertionStdCmp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertionStdCmp1201); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAssertionStdCmp"


    // $ANTLR start "ruleAssertionStdCmp"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:538:1: ruleAssertionStdCmp returns [EObject current=null] : ( ( (lv_leftAssert_0_0= ruleAssertion ) ) ( (lv_op_1_0= ruleRop ) ) ( (lv_rightAssert_2_0= ruleAssertion ) ) ) ;
    public final EObject ruleAssertionStdCmp() throws RecognitionException {
        EObject current = null;

        EObject lv_leftAssert_0_0 = null;

        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_rightAssert_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:541:28: ( ( ( (lv_leftAssert_0_0= ruleAssertion ) ) ( (lv_op_1_0= ruleRop ) ) ( (lv_rightAssert_2_0= ruleAssertion ) ) ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:542:1: ( ( (lv_leftAssert_0_0= ruleAssertion ) ) ( (lv_op_1_0= ruleRop ) ) ( (lv_rightAssert_2_0= ruleAssertion ) ) )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:542:1: ( ( (lv_leftAssert_0_0= ruleAssertion ) ) ( (lv_op_1_0= ruleRop ) ) ( (lv_rightAssert_2_0= ruleAssertion ) ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:542:2: ( (lv_leftAssert_0_0= ruleAssertion ) ) ( (lv_op_1_0= ruleRop ) ) ( (lv_rightAssert_2_0= ruleAssertion ) )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:542:2: ( (lv_leftAssert_0_0= ruleAssertion ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:543:1: (lv_leftAssert_0_0= ruleAssertion )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:543:1: (lv_leftAssert_0_0= ruleAssertion )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:544:3: lv_leftAssert_0_0= ruleAssertion
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssertionStdCmpAccess().getLeftAssertAssertionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAssertion_in_ruleAssertionStdCmp1247);
            lv_leftAssert_0_0=ruleAssertion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssertionStdCmpRule());
              	        }
                     		set(
                     			current, 
                     			"leftAssert",
                      		lv_leftAssert_0_0, 
                      		"Assertion");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:560:2: ( (lv_op_1_0= ruleRop ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:561:1: (lv_op_1_0= ruleRop )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:561:1: (lv_op_1_0= ruleRop )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:562:3: lv_op_1_0= ruleRop
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssertionStdCmpAccess().getOpRopParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleRop_in_ruleAssertionStdCmp1268);
            lv_op_1_0=ruleRop();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssertionStdCmpRule());
              	        }
                     		set(
                     			current, 
                     			"op",
                      		lv_op_1_0, 
                      		"Rop");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:578:2: ( (lv_rightAssert_2_0= ruleAssertion ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:579:1: (lv_rightAssert_2_0= ruleAssertion )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:579:1: (lv_rightAssert_2_0= ruleAssertion )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:580:3: lv_rightAssert_2_0= ruleAssertion
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssertionStdCmpAccess().getRightAssertAssertionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAssertion_in_ruleAssertionStdCmp1289);
            lv_rightAssert_2_0=ruleAssertion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssertionStdCmpRule());
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


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAssertionStdCmp"


    // $ANTLR start "entryRuleAssertion"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:604:1: entryRuleAssertion returns [EObject current=null] : iv_ruleAssertion= ruleAssertion EOF ;
    public final EObject entryRuleAssertion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertion = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:605:2: (iv_ruleAssertion= ruleAssertion EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:606:2: iv_ruleAssertion= ruleAssertion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssertionRule()); 
            }
            pushFollow(FOLLOW_ruleAssertion_in_entryRuleAssertion1325);
            iv_ruleAssertion=ruleAssertion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssertion; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertion1335); if (state.failed) return current;

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:613:1: ruleAssertion returns [EObject current=null] : ( ( ( (lv_steps_0_0= ruleStep ) )+ (otherlv_1= '.' ( (lv_functions_2_0= ruleFunction ) ) )* ) | this_AssertionQuantifiedNumeric_3= ruleAssertionQuantifiedNumeric | (otherlv_4= '[' ( (lv_values_5_0= ruleValues ) ) otherlv_6= ']' ) | ( (lv_constant_7_0= ruleConstant ) ) ) ;
    public final EObject ruleAssertion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_steps_0_0 = null;

        EObject lv_functions_2_0 = null;

        EObject this_AssertionQuantifiedNumeric_3 = null;

        EObject lv_values_5_0 = null;

        EObject lv_constant_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:616:28: ( ( ( ( (lv_steps_0_0= ruleStep ) )+ (otherlv_1= '.' ( (lv_functions_2_0= ruleFunction ) ) )* ) | this_AssertionQuantifiedNumeric_3= ruleAssertionQuantifiedNumeric | (otherlv_4= '[' ( (lv_values_5_0= ruleValues ) ) otherlv_6= ']' ) | ( (lv_constant_7_0= ruleConstant ) ) ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:617:1: ( ( ( (lv_steps_0_0= ruleStep ) )+ (otherlv_1= '.' ( (lv_functions_2_0= ruleFunction ) ) )* ) | this_AssertionQuantifiedNumeric_3= ruleAssertionQuantifiedNumeric | (otherlv_4= '[' ( (lv_values_5_0= ruleValues ) ) otherlv_6= ']' ) | ( (lv_constant_7_0= ruleConstant ) ) )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:617:1: ( ( ( (lv_steps_0_0= ruleStep ) )+ (otherlv_1= '.' ( (lv_functions_2_0= ruleFunction ) ) )* ) | this_AssertionQuantifiedNumeric_3= ruleAssertionQuantifiedNumeric | (otherlv_4= '[' ( (lv_values_5_0= ruleValues ) ) otherlv_6= ']' ) | ( (lv_constant_7_0= ruleConstant ) ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 26:
            case 30:
                {
                alt9=1;
                }
                break;
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
                {
                alt9=2;
                }
                break;
            case 22:
                {
                alt9=3;
                }
                break;
            case RULE_NUMBER:
            case RULE_STRING:
                {
                alt9=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:617:2: ( ( (lv_steps_0_0= ruleStep ) )+ (otherlv_1= '.' ( (lv_functions_2_0= ruleFunction ) ) )* )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:617:2: ( ( (lv_steps_0_0= ruleStep ) )+ (otherlv_1= '.' ( (lv_functions_2_0= ruleFunction ) ) )* )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:617:3: ( (lv_steps_0_0= ruleStep ) )+ (otherlv_1= '.' ( (lv_functions_2_0= ruleFunction ) ) )*
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:617:3: ( (lv_steps_0_0= ruleStep ) )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==26||LA7_0==30) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:618:1: (lv_steps_0_0= ruleStep )
                    	    {
                    	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:618:1: (lv_steps_0_0= ruleStep )
                    	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:619:3: lv_steps_0_0= ruleStep
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAssertionAccess().getStepsStepParserRuleCall_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleStep_in_ruleAssertion1382);
                    	    lv_steps_0_0=ruleStep();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getAssertionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"steps",
                    	              		lv_steps_0_0, 
                    	              		"Step");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);

                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:635:3: (otherlv_1= '.' ( (lv_functions_2_0= ruleFunction ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==21) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:635:5: otherlv_1= '.' ( (lv_functions_2_0= ruleFunction ) )
                    	    {
                    	    otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleAssertion1396); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_1, grammarAccess.getAssertionAccess().getFullStopKeyword_0_1_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:639:1: ( (lv_functions_2_0= ruleFunction ) )
                    	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:640:1: (lv_functions_2_0= ruleFunction )
                    	    {
                    	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:640:1: (lv_functions_2_0= ruleFunction )
                    	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:641:3: lv_functions_2_0= ruleFunction
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAssertionAccess().getFunctionsFunctionParserRuleCall_0_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleFunction_in_ruleAssertion1417);
                    	    lv_functions_2_0=ruleFunction();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getAssertionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"functions",
                    	              		lv_functions_2_0, 
                    	              		"Function");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:659:5: this_AssertionQuantifiedNumeric_3= ruleAssertionQuantifiedNumeric
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAssertionAccess().getAssertionQuantifiedNumericParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAssertionQuantifiedNumeric_in_ruleAssertion1448);
                    this_AssertionQuantifiedNumeric_3=ruleAssertionQuantifiedNumeric();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AssertionQuantifiedNumeric_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:668:6: (otherlv_4= '[' ( (lv_values_5_0= ruleValues ) ) otherlv_6= ']' )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:668:6: (otherlv_4= '[' ( (lv_values_5_0= ruleValues ) ) otherlv_6= ']' )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:668:8: otherlv_4= '[' ( (lv_values_5_0= ruleValues ) ) otherlv_6= ']'
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleAssertion1466); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getAssertionAccess().getLeftSquareBracketKeyword_2_0());
                          
                    }
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:672:1: ( (lv_values_5_0= ruleValues ) )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:673:1: (lv_values_5_0= ruleValues )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:673:1: (lv_values_5_0= ruleValues )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:674:3: lv_values_5_0= ruleValues
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAssertionAccess().getValuesValuesParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValues_in_ruleAssertion1487);
                    lv_values_5_0=ruleValues();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAssertionRule());
                      	        }
                             		set(
                             			current, 
                             			"values",
                              		lv_values_5_0, 
                              		"Values");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleAssertion1499); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getAssertionAccess().getRightSquareBracketKeyword_2_2());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:695:6: ( (lv_constant_7_0= ruleConstant ) )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:695:6: ( (lv_constant_7_0= ruleConstant ) )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:696:1: (lv_constant_7_0= ruleConstant )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:696:1: (lv_constant_7_0= ruleConstant )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:697:3: lv_constant_7_0= ruleConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAssertionAccess().getConstantConstantParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConstant_in_ruleAssertion1527);
                    lv_constant_7_0=ruleConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAssertionRule());
                      	        }
                             		set(
                             			current, 
                             			"constant",
                              		lv_constant_7_0, 
                              		"Constant");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAssertion"


    // $ANTLR start "entryRuleAssertionBoolean"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:721:1: entryRuleAssertionBoolean returns [EObject current=null] : iv_ruleAssertionBoolean= ruleAssertionBoolean EOF ;
    public final EObject entryRuleAssertionBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertionBoolean = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:722:2: (iv_ruleAssertionBoolean= ruleAssertionBoolean EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:723:2: iv_ruleAssertionBoolean= ruleAssertionBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssertionBooleanRule()); 
            }
            pushFollow(FOLLOW_ruleAssertionBoolean_in_entryRuleAssertionBoolean1563);
            iv_ruleAssertionBoolean=ruleAssertionBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssertionBoolean; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertionBoolean1573); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAssertionBoolean"


    // $ANTLR start "ruleAssertionBoolean"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:730:1: ruleAssertionBoolean returns [EObject current=null] : ( ( (lv_steps_0_0= ruleStep ) )+ (otherlv_1= '.' ( (lv_functions_2_0= ruleFunction ) ) )* otherlv_3= '.' ( (lv_functions_4_0= ruleFunctionBoolean ) ) ) ;
    public final EObject ruleAssertionBoolean() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_steps_0_0 = null;

        EObject lv_functions_2_0 = null;

        EObject lv_functions_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:733:28: ( ( ( (lv_steps_0_0= ruleStep ) )+ (otherlv_1= '.' ( (lv_functions_2_0= ruleFunction ) ) )* otherlv_3= '.' ( (lv_functions_4_0= ruleFunctionBoolean ) ) ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:734:1: ( ( (lv_steps_0_0= ruleStep ) )+ (otherlv_1= '.' ( (lv_functions_2_0= ruleFunction ) ) )* otherlv_3= '.' ( (lv_functions_4_0= ruleFunctionBoolean ) ) )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:734:1: ( ( (lv_steps_0_0= ruleStep ) )+ (otherlv_1= '.' ( (lv_functions_2_0= ruleFunction ) ) )* otherlv_3= '.' ( (lv_functions_4_0= ruleFunctionBoolean ) ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:734:2: ( (lv_steps_0_0= ruleStep ) )+ (otherlv_1= '.' ( (lv_functions_2_0= ruleFunction ) ) )* otherlv_3= '.' ( (lv_functions_4_0= ruleFunctionBoolean ) )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:734:2: ( (lv_steps_0_0= ruleStep ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==26||LA10_0==30) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:735:1: (lv_steps_0_0= ruleStep )
            	    {
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:735:1: (lv_steps_0_0= ruleStep )
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:736:3: lv_steps_0_0= ruleStep
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssertionBooleanAccess().getStepsStepParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStep_in_ruleAssertionBoolean1619);
            	    lv_steps_0_0=ruleStep();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAssertionBooleanRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"steps",
            	              		lv_steps_0_0, 
            	              		"Step");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:752:3: (otherlv_1= '.' ( (lv_functions_2_0= ruleFunction ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==21) ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1==RULE_ID) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:752:5: otherlv_1= '.' ( (lv_functions_2_0= ruleFunction ) )
            	    {
            	    otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleAssertionBoolean1633); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getAssertionBooleanAccess().getFullStopKeyword_1_0());
            	          
            	    }
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:756:1: ( (lv_functions_2_0= ruleFunction ) )
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:757:1: (lv_functions_2_0= ruleFunction )
            	    {
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:757:1: (lv_functions_2_0= ruleFunction )
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:758:3: lv_functions_2_0= ruleFunction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssertionBooleanAccess().getFunctionsFunctionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFunction_in_ruleAssertionBoolean1654);
            	    lv_functions_2_0=ruleFunction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAssertionBooleanRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"functions",
            	              		lv_functions_2_0, 
            	              		"Function");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleAssertionBoolean1668); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getAssertionBooleanAccess().getFullStopKeyword_2());
                  
            }
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:778:1: ( (lv_functions_4_0= ruleFunctionBoolean ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:779:1: (lv_functions_4_0= ruleFunctionBoolean )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:779:1: (lv_functions_4_0= ruleFunctionBoolean )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:780:3: lv_functions_4_0= ruleFunctionBoolean
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssertionBooleanAccess().getFunctionsFunctionBooleanParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFunctionBoolean_in_ruleAssertionBoolean1689);
            lv_functions_4_0=ruleFunctionBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssertionBooleanRule());
              	        }
                     		add(
                     			current, 
                     			"functions",
                      		lv_functions_4_0, 
                      		"FunctionBoolean");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAssertionBoolean"


    // $ANTLR start "entryRuleAssertionQuantifiedBoolean"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:804:1: entryRuleAssertionQuantifiedBoolean returns [EObject current=null] : iv_ruleAssertionQuantifiedBoolean= ruleAssertionQuantifiedBoolean EOF ;
    public final EObject entryRuleAssertionQuantifiedBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertionQuantifiedBoolean = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:805:2: (iv_ruleAssertionQuantifiedBoolean= ruleAssertionQuantifiedBoolean EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:806:2: iv_ruleAssertionQuantifiedBoolean= ruleAssertionQuantifiedBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssertionQuantifiedBooleanRule()); 
            }
            pushFollow(FOLLOW_ruleAssertionQuantifiedBoolean_in_entryRuleAssertionQuantifiedBoolean1725);
            iv_ruleAssertionQuantifiedBoolean=ruleAssertionQuantifiedBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssertionQuantifiedBoolean; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertionQuantifiedBoolean1735); if (state.failed) return current;

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:813:1: ruleAssertionQuantifiedBoolean returns [EObject current=null] : ( ( (lv_quantifier_0_0= ruleBoolQuantifier ) ) otherlv_1= '(' ( (lv_alias_2_0= ruleVariable ) ) otherlv_3= 'in' ( (lv_var_4_0= ruleVariable ) ) otherlv_5= ',' ( (lv_conditions_6_0= ruleAssertionOr ) ) otherlv_7= ')' ) ;
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
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:816:28: ( ( ( (lv_quantifier_0_0= ruleBoolQuantifier ) ) otherlv_1= '(' ( (lv_alias_2_0= ruleVariable ) ) otherlv_3= 'in' ( (lv_var_4_0= ruleVariable ) ) otherlv_5= ',' ( (lv_conditions_6_0= ruleAssertionOr ) ) otherlv_7= ')' ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:817:1: ( ( (lv_quantifier_0_0= ruleBoolQuantifier ) ) otherlv_1= '(' ( (lv_alias_2_0= ruleVariable ) ) otherlv_3= 'in' ( (lv_var_4_0= ruleVariable ) ) otherlv_5= ',' ( (lv_conditions_6_0= ruleAssertionOr ) ) otherlv_7= ')' )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:817:1: ( ( (lv_quantifier_0_0= ruleBoolQuantifier ) ) otherlv_1= '(' ( (lv_alias_2_0= ruleVariable ) ) otherlv_3= 'in' ( (lv_var_4_0= ruleVariable ) ) otherlv_5= ',' ( (lv_conditions_6_0= ruleAssertionOr ) ) otherlv_7= ')' )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:817:2: ( (lv_quantifier_0_0= ruleBoolQuantifier ) ) otherlv_1= '(' ( (lv_alias_2_0= ruleVariable ) ) otherlv_3= 'in' ( (lv_var_4_0= ruleVariable ) ) otherlv_5= ',' ( (lv_conditions_6_0= ruleAssertionOr ) ) otherlv_7= ')'
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:817:2: ( (lv_quantifier_0_0= ruleBoolQuantifier ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:818:1: (lv_quantifier_0_0= ruleBoolQuantifier )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:818:1: (lv_quantifier_0_0= ruleBoolQuantifier )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:819:3: lv_quantifier_0_0= ruleBoolQuantifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssertionQuantifiedBooleanAccess().getQuantifierBoolQuantifierParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBoolQuantifier_in_ruleAssertionQuantifiedBoolean1781);
            lv_quantifier_0_0=ruleBoolQuantifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleAssertionQuantifiedBoolean1793); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAssertionQuantifiedBooleanAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:839:1: ( (lv_alias_2_0= ruleVariable ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:840:1: (lv_alias_2_0= ruleVariable )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:840:1: (lv_alias_2_0= ruleVariable )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:841:3: lv_alias_2_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssertionQuantifiedBooleanAccess().getAliasVariableParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleAssertionQuantifiedBoolean1814);
            lv_alias_2_0=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleAssertionQuantifiedBoolean1826); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getAssertionQuantifiedBooleanAccess().getInKeyword_3());
                  
            }
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:861:1: ( (lv_var_4_0= ruleVariable ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:862:1: (lv_var_4_0= ruleVariable )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:862:1: (lv_var_4_0= ruleVariable )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:863:3: lv_var_4_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssertionQuantifiedBooleanAccess().getVarVariableParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleAssertionQuantifiedBoolean1847);
            lv_var_4_0=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleAssertionQuantifiedBoolean1859); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getAssertionQuantifiedBooleanAccess().getCommaKeyword_5());
                  
            }
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:883:1: ( (lv_conditions_6_0= ruleAssertionOr ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:884:1: (lv_conditions_6_0= ruleAssertionOr )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:884:1: (lv_conditions_6_0= ruleAssertionOr )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:885:3: lv_conditions_6_0= ruleAssertionOr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssertionQuantifiedBooleanAccess().getConditionsAssertionOrParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAssertionOr_in_ruleAssertionQuantifiedBoolean1880);
            lv_conditions_6_0=ruleAssertionOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleAssertionQuantifiedBoolean1892); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getAssertionQuantifiedBooleanAccess().getRightParenthesisKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAssertionQuantifiedBoolean"


    // $ANTLR start "entryRuleAssertionQuantifiedNumeric"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:913:1: entryRuleAssertionQuantifiedNumeric returns [EObject current=null] : iv_ruleAssertionQuantifiedNumeric= ruleAssertionQuantifiedNumeric EOF ;
    public final EObject entryRuleAssertionQuantifiedNumeric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertionQuantifiedNumeric = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:914:2: (iv_ruleAssertionQuantifiedNumeric= ruleAssertionQuantifiedNumeric EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:915:2: iv_ruleAssertionQuantifiedNumeric= ruleAssertionQuantifiedNumeric EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssertionQuantifiedNumericRule()); 
            }
            pushFollow(FOLLOW_ruleAssertionQuantifiedNumeric_in_entryRuleAssertionQuantifiedNumeric1928);
            iv_ruleAssertionQuantifiedNumeric=ruleAssertionQuantifiedNumeric();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssertionQuantifiedNumeric; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertionQuantifiedNumeric1938); if (state.failed) return current;

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:922:1: ruleAssertionQuantifiedNumeric returns [EObject current=null] : ( ( (lv_quantifier_0_0= ruleNumbQuantifier ) ) otherlv_1= '(' ( (lv_alias_2_0= ruleVariable ) ) otherlv_3= 'in' ( (lv_var_4_0= ruleVariable ) ) otherlv_5= ',' ( (lv_conditions_6_0= ruleAssertionOr ) ) otherlv_7= ')' ) ;
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
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:925:28: ( ( ( (lv_quantifier_0_0= ruleNumbQuantifier ) ) otherlv_1= '(' ( (lv_alias_2_0= ruleVariable ) ) otherlv_3= 'in' ( (lv_var_4_0= ruleVariable ) ) otherlv_5= ',' ( (lv_conditions_6_0= ruleAssertionOr ) ) otherlv_7= ')' ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:926:1: ( ( (lv_quantifier_0_0= ruleNumbQuantifier ) ) otherlv_1= '(' ( (lv_alias_2_0= ruleVariable ) ) otherlv_3= 'in' ( (lv_var_4_0= ruleVariable ) ) otherlv_5= ',' ( (lv_conditions_6_0= ruleAssertionOr ) ) otherlv_7= ')' )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:926:1: ( ( (lv_quantifier_0_0= ruleNumbQuantifier ) ) otherlv_1= '(' ( (lv_alias_2_0= ruleVariable ) ) otherlv_3= 'in' ( (lv_var_4_0= ruleVariable ) ) otherlv_5= ',' ( (lv_conditions_6_0= ruleAssertionOr ) ) otherlv_7= ')' )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:926:2: ( (lv_quantifier_0_0= ruleNumbQuantifier ) ) otherlv_1= '(' ( (lv_alias_2_0= ruleVariable ) ) otherlv_3= 'in' ( (lv_var_4_0= ruleVariable ) ) otherlv_5= ',' ( (lv_conditions_6_0= ruleAssertionOr ) ) otherlv_7= ')'
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:926:2: ( (lv_quantifier_0_0= ruleNumbQuantifier ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:927:1: (lv_quantifier_0_0= ruleNumbQuantifier )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:927:1: (lv_quantifier_0_0= ruleNumbQuantifier )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:928:3: lv_quantifier_0_0= ruleNumbQuantifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssertionQuantifiedNumericAccess().getQuantifierNumbQuantifierParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumbQuantifier_in_ruleAssertionQuantifiedNumeric1984);
            lv_quantifier_0_0=ruleNumbQuantifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleAssertionQuantifiedNumeric1996); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAssertionQuantifiedNumericAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:948:1: ( (lv_alias_2_0= ruleVariable ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:949:1: (lv_alias_2_0= ruleVariable )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:949:1: (lv_alias_2_0= ruleVariable )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:950:3: lv_alias_2_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssertionQuantifiedNumericAccess().getAliasVariableParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleAssertionQuantifiedNumeric2017);
            lv_alias_2_0=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleAssertionQuantifiedNumeric2029); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getAssertionQuantifiedNumericAccess().getInKeyword_3());
                  
            }
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:970:1: ( (lv_var_4_0= ruleVariable ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:971:1: (lv_var_4_0= ruleVariable )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:971:1: (lv_var_4_0= ruleVariable )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:972:3: lv_var_4_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssertionQuantifiedNumericAccess().getVarVariableParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleAssertionQuantifiedNumeric2050);
            lv_var_4_0=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleAssertionQuantifiedNumeric2062); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getAssertionQuantifiedNumericAccess().getCommaKeyword_5());
                  
            }
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:992:1: ( (lv_conditions_6_0= ruleAssertionOr ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:993:1: (lv_conditions_6_0= ruleAssertionOr )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:993:1: (lv_conditions_6_0= ruleAssertionOr )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:994:3: lv_conditions_6_0= ruleAssertionOr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssertionQuantifiedNumericAccess().getConditionsAssertionOrParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAssertionOr_in_ruleAssertionQuantifiedNumeric2083);
            lv_conditions_6_0=ruleAssertionOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleAssertionQuantifiedNumeric2095); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getAssertionQuantifiedNumericAccess().getRightParenthesisKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAssertionQuantifiedNumeric"


    // $ANTLR start "entryRuleStep"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1022:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1023:2: (iv_ruleStep= ruleStep EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1024:2: iv_ruleStep= ruleStep EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStepRule()); 
            }
            pushFollow(FOLLOW_ruleStep_in_entryRuleStep2131);
            iv_ruleStep=ruleStep();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStep; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStep2141); if (state.failed) return current;

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1031:1: ruleStep returns [EObject current=null] : ( (otherlv_0= '/' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_attribute_3_0= ruleAttribute ) ) otherlv_4= ']' )? ) | ( (lv_placeholder_5_0= ruleVariable ) ) ) ;
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
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1034:28: ( ( (otherlv_0= '/' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_attribute_3_0= ruleAttribute ) ) otherlv_4= ']' )? ) | ( (lv_placeholder_5_0= ruleVariable ) ) ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1035:1: ( (otherlv_0= '/' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_attribute_3_0= ruleAttribute ) ) otherlv_4= ']' )? ) | ( (lv_placeholder_5_0= ruleVariable ) ) )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1035:1: ( (otherlv_0= '/' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_attribute_3_0= ruleAttribute ) ) otherlv_4= ']' )? ) | ( (lv_placeholder_5_0= ruleVariable ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            else if ( (LA13_0==30) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1035:2: (otherlv_0= '/' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_attribute_3_0= ruleAttribute ) ) otherlv_4= ']' )? )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1035:2: (otherlv_0= '/' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_attribute_3_0= ruleAttribute ) ) otherlv_4= ']' )? )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1035:4: otherlv_0= '/' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_attribute_3_0= ruleAttribute ) ) otherlv_4= ']' )?
                    {
                    otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleStep2179); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getStepAccess().getSolidusKeyword_0_0());
                          
                    }
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1039:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1040:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1040:1: (lv_name_1_0= RULE_ID )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1041:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStep2196); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_1_0, grammarAccess.getStepAccess().getNameIDTerminalRuleCall_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

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


                    }

                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1057:2: (otherlv_2= '[' ( (lv_attribute_3_0= ruleAttribute ) ) otherlv_4= ']' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==22) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1057:4: otherlv_2= '[' ( (lv_attribute_3_0= ruleAttribute ) ) otherlv_4= ']'
                            {
                            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleStep2214); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_2, grammarAccess.getStepAccess().getLeftSquareBracketKeyword_0_2_0());
                                  
                            }
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1061:1: ( (lv_attribute_3_0= ruleAttribute ) )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1062:1: (lv_attribute_3_0= ruleAttribute )
                            {
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1062:1: (lv_attribute_3_0= ruleAttribute )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1063:3: lv_attribute_3_0= ruleAttribute
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getStepAccess().getAttributeAttributeParserRuleCall_0_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleAttribute_in_ruleStep2235);
                            lv_attribute_3_0=ruleAttribute();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

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


                            }

                            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleStep2247); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getStepAccess().getRightSquareBracketKeyword_0_2_2());
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1084:6: ( (lv_placeholder_5_0= ruleVariable ) )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1084:6: ( (lv_placeholder_5_0= ruleVariable ) )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1085:1: (lv_placeholder_5_0= ruleVariable )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1085:1: (lv_placeholder_5_0= ruleVariable )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1086:3: lv_placeholder_5_0= ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStepAccess().getPlaceholderVariableParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleStep2277);
                    lv_placeholder_5_0=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStep"


    // $ANTLR start "entryRuleAttribute"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1110:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1111:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1112:2: iv_ruleAttribute= ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute2313);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute2323); if (state.failed) return current;

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1119:1: ruleAttribute returns [EObject current=null] : ( ( ( (lv_property_0_0= RULE_ID ) ) ( ( ( (lv_op_1_0= ruleRop ) ) ( (lv_numberValue_2_0= RULE_NUMBER ) ) ) | ( ( (lv_op_3_0= ruleStringRop ) ) ( (lv_strValue_4_0= RULE_STRING ) ) ) | ( ( (lv_op_5_0= ruleRop ) ) ( (lv_varValue_6_0= ruleVariable ) ) ) ) ) | ( (lv_number_7_0= RULE_NUMBER ) ) | ( (lv_var_8_0= ruleVariable ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_property_0_0=null;
        Token lv_numberValue_2_0=null;
        Token lv_strValue_4_0=null;
        Token lv_number_7_0=null;
        AntlrDatatypeRuleToken lv_op_1_0 = null;

        AntlrDatatypeRuleToken lv_op_3_0 = null;

        AntlrDatatypeRuleToken lv_op_5_0 = null;

        AntlrDatatypeRuleToken lv_varValue_6_0 = null;

        AntlrDatatypeRuleToken lv_var_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1122:28: ( ( ( ( (lv_property_0_0= RULE_ID ) ) ( ( ( (lv_op_1_0= ruleRop ) ) ( (lv_numberValue_2_0= RULE_NUMBER ) ) ) | ( ( (lv_op_3_0= ruleStringRop ) ) ( (lv_strValue_4_0= RULE_STRING ) ) ) | ( ( (lv_op_5_0= ruleRop ) ) ( (lv_varValue_6_0= ruleVariable ) ) ) ) ) | ( (lv_number_7_0= RULE_NUMBER ) ) | ( (lv_var_8_0= ruleVariable ) ) ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1123:1: ( ( ( (lv_property_0_0= RULE_ID ) ) ( ( ( (lv_op_1_0= ruleRop ) ) ( (lv_numberValue_2_0= RULE_NUMBER ) ) ) | ( ( (lv_op_3_0= ruleStringRop ) ) ( (lv_strValue_4_0= RULE_STRING ) ) ) | ( ( (lv_op_5_0= ruleRop ) ) ( (lv_varValue_6_0= ruleVariable ) ) ) ) ) | ( (lv_number_7_0= RULE_NUMBER ) ) | ( (lv_var_8_0= ruleVariable ) ) )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1123:1: ( ( ( (lv_property_0_0= RULE_ID ) ) ( ( ( (lv_op_1_0= ruleRop ) ) ( (lv_numberValue_2_0= RULE_NUMBER ) ) ) | ( ( (lv_op_3_0= ruleStringRop ) ) ( (lv_strValue_4_0= RULE_STRING ) ) ) | ( ( (lv_op_5_0= ruleRop ) ) ( (lv_varValue_6_0= ruleVariable ) ) ) ) ) | ( (lv_number_7_0= RULE_NUMBER ) ) | ( (lv_var_8_0= ruleVariable ) ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt15=1;
                }
                break;
            case RULE_NUMBER:
                {
                alt15=2;
                }
                break;
            case 30:
                {
                alt15=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1123:2: ( ( (lv_property_0_0= RULE_ID ) ) ( ( ( (lv_op_1_0= ruleRop ) ) ( (lv_numberValue_2_0= RULE_NUMBER ) ) ) | ( ( (lv_op_3_0= ruleStringRop ) ) ( (lv_strValue_4_0= RULE_STRING ) ) ) | ( ( (lv_op_5_0= ruleRop ) ) ( (lv_varValue_6_0= ruleVariable ) ) ) ) )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1123:2: ( ( (lv_property_0_0= RULE_ID ) ) ( ( ( (lv_op_1_0= ruleRop ) ) ( (lv_numberValue_2_0= RULE_NUMBER ) ) ) | ( ( (lv_op_3_0= ruleStringRop ) ) ( (lv_strValue_4_0= RULE_STRING ) ) ) | ( ( (lv_op_5_0= ruleRop ) ) ( (lv_varValue_6_0= ruleVariable ) ) ) ) )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1123:3: ( (lv_property_0_0= RULE_ID ) ) ( ( ( (lv_op_1_0= ruleRop ) ) ( (lv_numberValue_2_0= RULE_NUMBER ) ) ) | ( ( (lv_op_3_0= ruleStringRop ) ) ( (lv_strValue_4_0= RULE_STRING ) ) ) | ( ( (lv_op_5_0= ruleRop ) ) ( (lv_varValue_6_0= ruleVariable ) ) ) )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1123:3: ( (lv_property_0_0= RULE_ID ) )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1124:1: (lv_property_0_0= RULE_ID )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1124:1: (lv_property_0_0= RULE_ID )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1125:3: lv_property_0_0= RULE_ID
                    {
                    lv_property_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute2366); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_property_0_0, grammarAccess.getAttributeAccess().getPropertyIDTerminalRuleCall_0_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

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


                    }

                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1141:2: ( ( ( (lv_op_1_0= ruleRop ) ) ( (lv_numberValue_2_0= RULE_NUMBER ) ) ) | ( ( (lv_op_3_0= ruleStringRop ) ) ( (lv_strValue_4_0= RULE_STRING ) ) ) | ( ( (lv_op_5_0= ruleRop ) ) ( (lv_varValue_6_0= ruleVariable ) ) ) )
                    int alt14=3;
                    alt14 = dfa14.predict(input);
                    switch (alt14) {
                        case 1 :
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1141:3: ( ( (lv_op_1_0= ruleRop ) ) ( (lv_numberValue_2_0= RULE_NUMBER ) ) )
                            {
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1141:3: ( ( (lv_op_1_0= ruleRop ) ) ( (lv_numberValue_2_0= RULE_NUMBER ) ) )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1141:4: ( (lv_op_1_0= ruleRop ) ) ( (lv_numberValue_2_0= RULE_NUMBER ) )
                            {
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1141:4: ( (lv_op_1_0= ruleRop ) )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1142:1: (lv_op_1_0= ruleRop )
                            {
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1142:1: (lv_op_1_0= ruleRop )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1143:3: lv_op_1_0= ruleRop
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getAttributeAccess().getOpRopParserRuleCall_0_1_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleRop_in_ruleAttribute2394);
                            lv_op_1_0=ruleRop();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

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


                            }

                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1159:2: ( (lv_numberValue_2_0= RULE_NUMBER ) )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1160:1: (lv_numberValue_2_0= RULE_NUMBER )
                            {
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1160:1: (lv_numberValue_2_0= RULE_NUMBER )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1161:3: lv_numberValue_2_0= RULE_NUMBER
                            {
                            lv_numberValue_2_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleAttribute2411); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_numberValue_2_0, grammarAccess.getAttributeAccess().getNumberValueNUMBERTerminalRuleCall_0_1_0_1_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

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


                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1178:6: ( ( (lv_op_3_0= ruleStringRop ) ) ( (lv_strValue_4_0= RULE_STRING ) ) )
                            {
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1178:6: ( ( (lv_op_3_0= ruleStringRop ) ) ( (lv_strValue_4_0= RULE_STRING ) ) )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1178:7: ( (lv_op_3_0= ruleStringRop ) ) ( (lv_strValue_4_0= RULE_STRING ) )
                            {
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1178:7: ( (lv_op_3_0= ruleStringRop ) )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1179:1: (lv_op_3_0= ruleStringRop )
                            {
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1179:1: (lv_op_3_0= ruleStringRop )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1180:3: lv_op_3_0= ruleStringRop
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getAttributeAccess().getOpStringRopParserRuleCall_0_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleStringRop_in_ruleAttribute2445);
                            lv_op_3_0=ruleStringRop();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

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


                            }

                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1196:2: ( (lv_strValue_4_0= RULE_STRING ) )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1197:1: (lv_strValue_4_0= RULE_STRING )
                            {
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1197:1: (lv_strValue_4_0= RULE_STRING )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1198:3: lv_strValue_4_0= RULE_STRING
                            {
                            lv_strValue_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute2462); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_strValue_4_0, grammarAccess.getAttributeAccess().getStrValueSTRINGTerminalRuleCall_0_1_1_1_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

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


                            }
                            break;
                        case 3 :
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1215:6: ( ( (lv_op_5_0= ruleRop ) ) ( (lv_varValue_6_0= ruleVariable ) ) )
                            {
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1215:6: ( ( (lv_op_5_0= ruleRop ) ) ( (lv_varValue_6_0= ruleVariable ) ) )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1215:7: ( (lv_op_5_0= ruleRop ) ) ( (lv_varValue_6_0= ruleVariable ) )
                            {
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1215:7: ( (lv_op_5_0= ruleRop ) )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1216:1: (lv_op_5_0= ruleRop )
                            {
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1216:1: (lv_op_5_0= ruleRop )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1217:3: lv_op_5_0= ruleRop
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getAttributeAccess().getOpRopParserRuleCall_0_1_2_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleRop_in_ruleAttribute2496);
                            lv_op_5_0=ruleRop();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getAttributeRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"op",
                                      		lv_op_5_0, 
                                      		"Rop");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1233:2: ( (lv_varValue_6_0= ruleVariable ) )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1234:1: (lv_varValue_6_0= ruleVariable )
                            {
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1234:1: (lv_varValue_6_0= ruleVariable )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1235:3: lv_varValue_6_0= ruleVariable
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getAttributeAccess().getVarValueVariableParserRuleCall_0_1_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleVariable_in_ruleAttribute2517);
                            lv_varValue_6_0=ruleVariable();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getAttributeRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"varValue",
                                      		lv_varValue_6_0, 
                                      		"Variable");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

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
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1252:6: ( (lv_number_7_0= RULE_NUMBER ) )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1252:6: ( (lv_number_7_0= RULE_NUMBER ) )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1253:1: (lv_number_7_0= RULE_NUMBER )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1253:1: (lv_number_7_0= RULE_NUMBER )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1254:3: lv_number_7_0= RULE_NUMBER
                    {
                    lv_number_7_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleAttribute2543); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_number_7_0, grammarAccess.getAttributeAccess().getNumberNUMBERTerminalRuleCall_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAttributeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"number",
                              		lv_number_7_0, 
                              		"NUMBER");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1271:6: ( (lv_var_8_0= ruleVariable ) )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1271:6: ( (lv_var_8_0= ruleVariable ) )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1272:1: (lv_var_8_0= ruleVariable )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1272:1: (lv_var_8_0= ruleVariable )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1273:3: lv_var_8_0= ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeAccess().getVarVariableParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleAttribute2575);
                    lv_var_8_0=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAttributeRule());
                      	        }
                             		set(
                             			current, 
                             			"var",
                              		lv_var_8_0, 
                              		"Variable");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleFunction"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1297:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1298:2: (iv_ruleFunction= ruleFunction EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1299:2: iv_ruleFunction= ruleFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction2611);
            iv_ruleFunction=ruleFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction2621); if (state.failed) return current;

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1306:1: ruleFunction returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_params_2_0= ruleValues ) )? otherlv_3= ')' ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_params_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1309:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_params_2_0= ruleValues ) )? otherlv_3= ')' ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1310:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_params_2_0= ruleValues ) )? otherlv_3= ')' )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1310:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_params_2_0= ruleValues ) )? otherlv_3= ')' )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1310:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_params_2_0= ruleValues ) )? otherlv_3= ')'
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1310:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1311:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1311:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1312:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunction2663); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

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


            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleFunction2680); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1332:1: ( (lv_params_2_0= ruleValues ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_NUMBER && LA16_0<=RULE_STRING)||LA16_0==26||LA16_0==30) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1333:1: (lv_params_2_0= ruleValues )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1333:1: (lv_params_2_0= ruleValues )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1334:3: lv_params_2_0= ruleValues
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionAccess().getParamsValuesParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValues_in_ruleFunction2701);
                    lv_params_2_0=ruleValues();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }
                    break;

            }

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleFunction2714); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleFunctionBoolean"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1362:1: entryRuleFunctionBoolean returns [EObject current=null] : iv_ruleFunctionBoolean= ruleFunctionBoolean EOF ;
    public final EObject entryRuleFunctionBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionBoolean = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1363:2: (iv_ruleFunctionBoolean= ruleFunctionBoolean EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1364:2: iv_ruleFunctionBoolean= ruleFunctionBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionBooleanRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionBoolean_in_entryRuleFunctionBoolean2750);
            iv_ruleFunctionBoolean=ruleFunctionBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionBoolean; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionBoolean2760); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFunctionBoolean"


    // $ANTLR start "ruleFunctionBoolean"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1371:1: ruleFunctionBoolean returns [EObject current=null] : ( ( ( (lv_name_0_1= 'contains' | lv_name_0_2= 'startsWith' | lv_name_0_3= 'endsWith' ) ) ) otherlv_1= '(' ( (lv_params_2_0= ruleValues ) )? otherlv_3= ')' ) ;
    public final EObject ruleFunctionBoolean() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_params_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1374:28: ( ( ( ( (lv_name_0_1= 'contains' | lv_name_0_2= 'startsWith' | lv_name_0_3= 'endsWith' ) ) ) otherlv_1= '(' ( (lv_params_2_0= ruleValues ) )? otherlv_3= ')' ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1375:1: ( ( ( (lv_name_0_1= 'contains' | lv_name_0_2= 'startsWith' | lv_name_0_3= 'endsWith' ) ) ) otherlv_1= '(' ( (lv_params_2_0= ruleValues ) )? otherlv_3= ')' )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1375:1: ( ( ( (lv_name_0_1= 'contains' | lv_name_0_2= 'startsWith' | lv_name_0_3= 'endsWith' ) ) ) otherlv_1= '(' ( (lv_params_2_0= ruleValues ) )? otherlv_3= ')' )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1375:2: ( ( (lv_name_0_1= 'contains' | lv_name_0_2= 'startsWith' | lv_name_0_3= 'endsWith' ) ) ) otherlv_1= '(' ( (lv_params_2_0= ruleValues ) )? otherlv_3= ')'
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1375:2: ( ( (lv_name_0_1= 'contains' | lv_name_0_2= 'startsWith' | lv_name_0_3= 'endsWith' ) ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1376:1: ( (lv_name_0_1= 'contains' | lv_name_0_2= 'startsWith' | lv_name_0_3= 'endsWith' ) )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1376:1: ( (lv_name_0_1= 'contains' | lv_name_0_2= 'startsWith' | lv_name_0_3= 'endsWith' ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1377:1: (lv_name_0_1= 'contains' | lv_name_0_2= 'startsWith' | lv_name_0_3= 'endsWith' )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1377:1: (lv_name_0_1= 'contains' | lv_name_0_2= 'startsWith' | lv_name_0_3= 'endsWith' )
            int alt17=3;
            switch ( input.LA(1) ) {
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
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1378:3: lv_name_0_1= 'contains'
                    {
                    lv_name_0_1=(Token)match(input,27,FOLLOW_27_in_ruleFunctionBoolean2805); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_0_1, grammarAccess.getFunctionBooleanAccess().getNameContainsKeyword_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFunctionBooleanRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_0_1, null);
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1390:8: lv_name_0_2= 'startsWith'
                    {
                    lv_name_0_2=(Token)match(input,28,FOLLOW_28_in_ruleFunctionBoolean2834); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_0_2, grammarAccess.getFunctionBooleanAccess().getNameStartsWithKeyword_0_0_1());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFunctionBooleanRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_0_2, null);
                      	    
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1402:8: lv_name_0_3= 'endsWith'
                    {
                    lv_name_0_3=(Token)match(input,29,FOLLOW_29_in_ruleFunctionBoolean2863); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_0_3, grammarAccess.getFunctionBooleanAccess().getNameEndsWithKeyword_0_0_2());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFunctionBooleanRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_0_3, null);
                      	    
                    }

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleFunctionBoolean2891); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFunctionBooleanAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1421:1: ( (lv_params_2_0= ruleValues ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_NUMBER && LA18_0<=RULE_STRING)||LA18_0==26||LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1422:1: (lv_params_2_0= ruleValues )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1422:1: (lv_params_2_0= ruleValues )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1423:3: lv_params_2_0= ruleValues
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionBooleanAccess().getParamsValuesParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValues_in_ruleFunctionBoolean2912);
                    lv_params_2_0=ruleValues();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFunctionBooleanRule());
                      	        }
                             		set(
                             			current, 
                             			"params",
                              		lv_params_2_0, 
                              		"Values");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleFunctionBoolean2925); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getFunctionBooleanAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleFunctionBoolean"


    // $ANTLR start "entryRuleValues"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1451:1: entryRuleValues returns [EObject current=null] : iv_ruleValues= ruleValues EOF ;
    public final EObject entryRuleValues() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValues = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1452:2: (iv_ruleValues= ruleValues EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1453:2: iv_ruleValues= ruleValues EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuesRule()); 
            }
            pushFollow(FOLLOW_ruleValues_in_entryRuleValues2961);
            iv_ruleValues=ruleValues();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValues; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValues2971); if (state.failed) return current;

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1460:1: ruleValues returns [EObject current=null] : ( ( (lv_value_0_0= ruleValue ) ) (otherlv_1= ',' ( (lv_value_2_0= ruleValue ) ) )* ) ;
    public final EObject ruleValues() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1463:28: ( ( ( (lv_value_0_0= ruleValue ) ) (otherlv_1= ',' ( (lv_value_2_0= ruleValue ) ) )* ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1464:1: ( ( (lv_value_0_0= ruleValue ) ) (otherlv_1= ',' ( (lv_value_2_0= ruleValue ) ) )* )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1464:1: ( ( (lv_value_0_0= ruleValue ) ) (otherlv_1= ',' ( (lv_value_2_0= ruleValue ) ) )* )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1464:2: ( (lv_value_0_0= ruleValue ) ) (otherlv_1= ',' ( (lv_value_2_0= ruleValue ) ) )*
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1464:2: ( (lv_value_0_0= ruleValue ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1465:1: (lv_value_0_0= ruleValue )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1465:1: (lv_value_0_0= ruleValue )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1466:3: lv_value_0_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getValuesAccess().getValueValueParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleValues3017);
            lv_value_0_0=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getValuesRule());
              	        }
                     		add(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"Value");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1482:2: (otherlv_1= ',' ( (lv_value_2_0= ruleValue ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==25) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1482:4: otherlv_1= ',' ( (lv_value_2_0= ruleValue ) )
            	    {
            	    otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleValues3030); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getValuesAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1486:1: ( (lv_value_2_0= ruleValue ) )
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1487:1: (lv_value_2_0= ruleValue )
            	    {
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1487:1: (lv_value_2_0= ruleValue )
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1488:3: lv_value_2_0= ruleValue
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getValuesAccess().getValueValueParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValue_in_ruleValues3051);
            	    lv_value_2_0=ruleValue();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getValuesRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"value",
            	              		lv_value_2_0, 
            	              		"Value");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleValues"


    // $ANTLR start "entryRuleValue"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1512:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1513:2: (iv_ruleValue= ruleValue EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1514:2: iv_ruleValue= ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue3089);
            iv_ruleValue=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue3099); if (state.failed) return current;

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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1521:1: ruleValue returns [EObject current=null] : (this_Constant_0= ruleConstant | ( ( (lv_steps_1_0= ruleStep ) )+ (otherlv_2= '.' ( (lv_functions_3_0= ruleFunction ) ) )* ) ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Constant_0 = null;

        EObject lv_steps_1_0 = null;

        EObject lv_functions_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1524:28: ( (this_Constant_0= ruleConstant | ( ( (lv_steps_1_0= ruleStep ) )+ (otherlv_2= '.' ( (lv_functions_3_0= ruleFunction ) ) )* ) ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1525:1: (this_Constant_0= ruleConstant | ( ( (lv_steps_1_0= ruleStep ) )+ (otherlv_2= '.' ( (lv_functions_3_0= ruleFunction ) ) )* ) )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1525:1: (this_Constant_0= ruleConstant | ( ( (lv_steps_1_0= ruleStep ) )+ (otherlv_2= '.' ( (lv_functions_3_0= ruleFunction ) ) )* ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_NUMBER && LA22_0<=RULE_STRING)) ) {
                alt22=1;
            }
            else if ( (LA22_0==26||LA22_0==30) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1526:5: this_Constant_0= ruleConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getConstantParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConstant_in_ruleValue3146);
                    this_Constant_0=ruleConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Constant_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1535:6: ( ( (lv_steps_1_0= ruleStep ) )+ (otherlv_2= '.' ( (lv_functions_3_0= ruleFunction ) ) )* )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1535:6: ( ( (lv_steps_1_0= ruleStep ) )+ (otherlv_2= '.' ( (lv_functions_3_0= ruleFunction ) ) )* )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1535:7: ( (lv_steps_1_0= ruleStep ) )+ (otherlv_2= '.' ( (lv_functions_3_0= ruleFunction ) ) )*
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1535:7: ( (lv_steps_1_0= ruleStep ) )+
                    int cnt20=0;
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==26||LA20_0==30) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1536:1: (lv_steps_1_0= ruleStep )
                    	    {
                    	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1536:1: (lv_steps_1_0= ruleStep )
                    	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1537:3: lv_steps_1_0= ruleStep
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getValueAccess().getStepsStepParserRuleCall_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleStep_in_ruleValue3173);
                    	    lv_steps_1_0=ruleStep();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getValueRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"steps",
                    	              		lv_steps_1_0, 
                    	              		"Step");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt20 >= 1 ) break loop20;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(20, input);
                                throw eee;
                        }
                        cnt20++;
                    } while (true);

                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1553:3: (otherlv_2= '.' ( (lv_functions_3_0= ruleFunction ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==21) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1553:5: otherlv_2= '.' ( (lv_functions_3_0= ruleFunction ) )
                    	    {
                    	    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleValue3187); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getValueAccess().getFullStopKeyword_1_1_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1557:1: ( (lv_functions_3_0= ruleFunction ) )
                    	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1558:1: (lv_functions_3_0= ruleFunction )
                    	    {
                    	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1558:1: (lv_functions_3_0= ruleFunction )
                    	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1559:3: lv_functions_3_0= ruleFunction
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getValueAccess().getFunctionsFunctionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleFunction_in_ruleValue3208);
                    	    lv_functions_3_0=ruleFunction();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getValueRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"functions",
                    	              		lv_functions_3_0, 
                    	              		"Function");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleConstant"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1583:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1584:2: (iv_ruleConstant= ruleConstant EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1585:2: iv_ruleConstant= ruleConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantRule()); 
            }
            pushFollow(FOLLOW_ruleConstant_in_entryRuleConstant3247);
            iv_ruleConstant=ruleConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstant; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstant3257); if (state.failed) return current;

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1592:1: ruleConstant returns [EObject current=null] : ( ( (lv_number_0_0= RULE_NUMBER ) ) | ( (lv_string_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token lv_number_0_0=null;
        Token lv_string_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1595:28: ( ( ( (lv_number_0_0= RULE_NUMBER ) ) | ( (lv_string_1_0= RULE_STRING ) ) ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1596:1: ( ( (lv_number_0_0= RULE_NUMBER ) ) | ( (lv_string_1_0= RULE_STRING ) ) )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1596:1: ( ( (lv_number_0_0= RULE_NUMBER ) ) | ( (lv_string_1_0= RULE_STRING ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_NUMBER) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_STRING) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1596:2: ( (lv_number_0_0= RULE_NUMBER ) )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1596:2: ( (lv_number_0_0= RULE_NUMBER ) )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1597:1: (lv_number_0_0= RULE_NUMBER )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1597:1: (lv_number_0_0= RULE_NUMBER )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1598:3: lv_number_0_0= RULE_NUMBER
                    {
                    lv_number_0_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleConstant3299); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_number_0_0, grammarAccess.getConstantAccess().getNumberNUMBERTerminalRuleCall_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

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


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1615:6: ( (lv_string_1_0= RULE_STRING ) )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1615:6: ( (lv_string_1_0= RULE_STRING ) )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1616:1: (lv_string_1_0= RULE_STRING )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1616:1: (lv_string_1_0= RULE_STRING )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1617:3: lv_string_1_0= RULE_STRING
                    {
                    lv_string_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConstant3327); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_string_1_0, grammarAccess.getConstantAccess().getStringSTRINGTerminalRuleCall_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

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


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleVariable"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1641:1: entryRuleVariable returns [String current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final String entryRuleVariable() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVariable = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1642:2: (iv_ruleVariable= ruleVariable EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1643:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable3369);
            iv_ruleVariable=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable3380); if (state.failed) return current;

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1650:1: ruleVariable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '$' (this_ID_1= RULE_ID | this_NumbQuantifier_2= ruleNumbQuantifier ) ) ;
    public final AntlrDatatypeRuleToken ruleVariable() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        AntlrDatatypeRuleToken this_NumbQuantifier_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1653:28: ( (kw= '$' (this_ID_1= RULE_ID | this_NumbQuantifier_2= ruleNumbQuantifier ) ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1654:1: (kw= '$' (this_ID_1= RULE_ID | this_NumbQuantifier_2= ruleNumbQuantifier ) )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1654:1: (kw= '$' (this_ID_1= RULE_ID | this_NumbQuantifier_2= ruleNumbQuantifier ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1655:2: kw= '$' (this_ID_1= RULE_ID | this_NumbQuantifier_2= ruleNumbQuantifier )
            {
            kw=(Token)match(input,30,FOLLOW_30_in_ruleVariable3418); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getVariableAccess().getDollarSignKeyword_0()); 
                  
            }
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1660:1: (this_ID_1= RULE_ID | this_NumbQuantifier_2= ruleNumbQuantifier )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            else if ( ((LA24_0>=33 && LA24_0<=38)) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1660:6: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable3434); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_1, grammarAccess.getVariableAccess().getIDTerminalRuleCall_1_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1669:5: this_NumbQuantifier_2= ruleNumbQuantifier
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVariableAccess().getNumbQuantifierParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumbQuantifier_in_ruleVariable3467);
                    this_NumbQuantifier_2=ruleNumbQuantifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NumbQuantifier_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleBoolQuantifier"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1687:1: entryRuleBoolQuantifier returns [String current=null] : iv_ruleBoolQuantifier= ruleBoolQuantifier EOF ;
    public final String entryRuleBoolQuantifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolQuantifier = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1688:2: (iv_ruleBoolQuantifier= ruleBoolQuantifier EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1689:2: iv_ruleBoolQuantifier= ruleBoolQuantifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolQuantifierRule()); 
            }
            pushFollow(FOLLOW_ruleBoolQuantifier_in_entryRuleBoolQuantifier3514);
            iv_ruleBoolQuantifier=ruleBoolQuantifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolQuantifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolQuantifier3525); if (state.failed) return current;

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1696:1: ruleBoolQuantifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'forall' | kw= 'exists' ) ;
    public final AntlrDatatypeRuleToken ruleBoolQuantifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1699:28: ( (kw= 'forall' | kw= 'exists' ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1700:1: (kw= 'forall' | kw= 'exists' )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1700:1: (kw= 'forall' | kw= 'exists' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==31) ) {
                alt25=1;
            }
            else if ( (LA25_0==32) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1701:2: kw= 'forall'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleBoolQuantifier3563); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBoolQuantifierAccess().getForallKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1708:2: kw= 'exists'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleBoolQuantifier3582); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBoolQuantifierAccess().getExistsKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBoolQuantifier"


    // $ANTLR start "entryRuleNumbQuantifier"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1721:1: entryRuleNumbQuantifier returns [String current=null] : iv_ruleNumbQuantifier= ruleNumbQuantifier EOF ;
    public final String entryRuleNumbQuantifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumbQuantifier = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1722:2: (iv_ruleNumbQuantifier= ruleNumbQuantifier EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1723:2: iv_ruleNumbQuantifier= ruleNumbQuantifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumbQuantifierRule()); 
            }
            pushFollow(FOLLOW_ruleNumbQuantifier_in_entryRuleNumbQuantifier3623);
            iv_ruleNumbQuantifier=ruleNumbQuantifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumbQuantifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumbQuantifier3634); if (state.failed) return current;

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1730:1: ruleNumbQuantifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'numOf' | kw= 'sum' | kw= 'avg' | kw= 'min' | kw= 'max' | kw= 'product' ) ;
    public final AntlrDatatypeRuleToken ruleNumbQuantifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1733:28: ( (kw= 'numOf' | kw= 'sum' | kw= 'avg' | kw= 'min' | kw= 'max' | kw= 'product' ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1734:1: (kw= 'numOf' | kw= 'sum' | kw= 'avg' | kw= 'min' | kw= 'max' | kw= 'product' )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1734:1: (kw= 'numOf' | kw= 'sum' | kw= 'avg' | kw= 'min' | kw= 'max' | kw= 'product' )
            int alt26=6;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt26=1;
                }
                break;
            case 34:
                {
                alt26=2;
                }
                break;
            case 35:
                {
                alt26=3;
                }
                break;
            case 36:
                {
                alt26=4;
                }
                break;
            case 37:
                {
                alt26=5;
                }
                break;
            case 38:
                {
                alt26=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1735:2: kw= 'numOf'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleNumbQuantifier3672); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNumbQuantifierAccess().getNumOfKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1742:2: kw= 'sum'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleNumbQuantifier3691); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNumbQuantifierAccess().getSumKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1749:2: kw= 'avg'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleNumbQuantifier3710); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNumbQuantifierAccess().getAvgKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1756:2: kw= 'min'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleNumbQuantifier3729); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNumbQuantifierAccess().getMinKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1763:2: kw= 'max'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleNumbQuantifier3748); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNumbQuantifierAccess().getMaxKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1770:2: kw= 'product'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleNumbQuantifier3767); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNumbQuantifierAccess().getProductKeyword_5()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNumbQuantifier"


    // $ANTLR start "entryRuleStringRop"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1783:1: entryRuleStringRop returns [String current=null] : iv_ruleStringRop= ruleStringRop EOF ;
    public final String entryRuleStringRop() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringRop = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1784:2: (iv_ruleStringRop= ruleStringRop EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1785:2: iv_ruleStringRop= ruleStringRop EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringRopRule()); 
            }
            pushFollow(FOLLOW_ruleStringRop_in_entryRuleStringRop3808);
            iv_ruleStringRop=ruleStringRop();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringRop.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringRop3819); if (state.failed) return current;

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1792:1: ruleStringRop returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleStringRop() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1795:28: ( (kw= '==' | kw= '!=' ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1796:1: (kw= '==' | kw= '!=' )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1796:1: (kw= '==' | kw= '!=' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==39) ) {
                alt27=1;
            }
            else if ( (LA27_0==40) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1797:2: kw= '=='
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleStringRop3857); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getStringRopAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1804:2: kw= '!='
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleStringRop3876); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getStringRopAccess().getExclamationMarkEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStringRop"


    // $ANTLR start "entryRuleRop"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1817:1: entryRuleRop returns [String current=null] : iv_ruleRop= ruleRop EOF ;
    public final String entryRuleRop() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRop = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1818:2: (iv_ruleRop= ruleRop EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1819:2: iv_ruleRop= ruleRop EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRopRule()); 
            }
            pushFollow(FOLLOW_ruleRop_in_entryRuleRop3917);
            iv_ruleRop=ruleRop();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRop.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRop3928); if (state.failed) return current;

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1826:1: ruleRop returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_StringRop_0= ruleStringRop | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' ) ;
    public final AntlrDatatypeRuleToken ruleRop() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_StringRop_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1829:28: ( (this_StringRop_0= ruleStringRop | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1830:1: (this_StringRop_0= ruleStringRop | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1830:1: (this_StringRop_0= ruleStringRop | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' )
            int alt28=5;
            switch ( input.LA(1) ) {
            case 39:
            case 40:
                {
                alt28=1;
                }
                break;
            case 41:
                {
                alt28=2;
                }
                break;
            case 42:
                {
                alt28=3;
                }
                break;
            case 43:
                {
                alt28=4;
                }
                break;
            case 44:
                {
                alt28=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1831:5: this_StringRop_0= ruleStringRop
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRopAccess().getStringRopParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringRop_in_ruleRop3975);
                    this_StringRop_0=ruleStringRop();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_StringRop_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1843:2: kw= '<'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleRop3999); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRopAccess().getLessThanSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1850:2: kw= '<='
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleRop4018); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRopAccess().getLessThanSignEqualsSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1857:2: kw= '>'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleRop4037); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRopAccess().getGreaterThanSignKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1864:2: kw= '>='
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleRop4056); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRopAccess().getGreaterThanSignEqualsSignKeyword_4()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleRop"

    // $ANTLR start synpred1_InternalXpt
    public final void synpred1_InternalXpt_fragment() throws RecognitionException {   
        // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:492:3: ( ruleAssertionStdCmp )
        // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:492:5: ruleAssertionStdCmp
        {
        pushFollow(FOLLOW_ruleAssertionStdCmp_in_synpred1_InternalXpt1085);
        ruleAssertionStdCmp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalXpt

    // Delegated rules

    public final boolean synpred1_InternalXpt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalXpt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA6_eotS =
        "\17\uffff";
    static final String DFA6_eofS =
        "\17\uffff";
    static final String DFA6_minS =
        "\1\5\2\0\14\uffff";
    static final String DFA6_maxS =
        "\1\46\2\0\14\uffff";
    static final String DFA6_acceptS =
        "\3\uffff\11\1\1\2\1\uffff\1\3";
    static final String DFA6_specialS =
        "\1\0\1\1\1\2\14\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\12\1\13\17\uffff\1\11\3\uffff\1\1\3\uffff\1\2\2\14\1\3\1"+
            "\4\1\5\1\6\1\7\1\10",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "492:1: ( ( ( ruleAssertionStdCmp )=>this_AssertionStdCmp_0= ruleAssertionStdCmp ) | this_AssertionQuantifiedBoolean_1= ruleAssertionQuantifiedBoolean | this_AssertionBoolean_2= ruleAssertionBoolean )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA6_0 = input.LA(1);

                         
                        int index6_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA6_0==26) ) {s = 1;}

                        else if ( (LA6_0==30) ) {s = 2;}

                        else if ( (LA6_0==33) && (synpred1_InternalXpt())) {s = 3;}

                        else if ( (LA6_0==34) && (synpred1_InternalXpt())) {s = 4;}

                        else if ( (LA6_0==35) && (synpred1_InternalXpt())) {s = 5;}

                        else if ( (LA6_0==36) && (synpred1_InternalXpt())) {s = 6;}

                        else if ( (LA6_0==37) && (synpred1_InternalXpt())) {s = 7;}

                        else if ( (LA6_0==38) && (synpred1_InternalXpt())) {s = 8;}

                        else if ( (LA6_0==22) && (synpred1_InternalXpt())) {s = 9;}

                        else if ( (LA6_0==RULE_NUMBER) && (synpred1_InternalXpt())) {s = 10;}

                        else if ( (LA6_0==RULE_STRING) && (synpred1_InternalXpt())) {s = 11;}

                        else if ( ((LA6_0>=31 && LA6_0<=32)) ) {s = 12;}

                         
                        input.seek(index6_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA6_1 = input.LA(1);

                         
                        int index6_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalXpt()) ) {s = 11;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index6_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA6_2 = input.LA(1);

                         
                        int index6_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalXpt()) ) {s = 11;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index6_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 6, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA14_eotS =
        "\12\uffff";
    static final String DFA14_eofS =
        "\12\uffff";
    static final String DFA14_minS =
        "\1\47\6\5\3\uffff";
    static final String DFA14_maxS =
        "\1\54\6\36\3\uffff";
    static final String DFA14_acceptS =
        "\7\uffff\1\3\1\2\1\1";
    static final String DFA14_specialS =
        "\12\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\1\1\2\1\3\1\4\1\5\1\6",
            "\1\11\1\10\27\uffff\1\7",
            "\1\11\1\10\27\uffff\1\7",
            "\1\11\30\uffff\1\7",
            "\1\11\30\uffff\1\7",
            "\1\11\30\uffff\1\7",
            "\1\11\30\uffff\1\7",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1141:2: ( ( ( (lv_op_1_0= ruleRop ) ) ( (lv_numberValue_2_0= RULE_NUMBER ) ) ) | ( ( (lv_op_3_0= ruleStringRop ) ) ( (lv_strValue_4_0= RULE_STRING ) ) ) | ( ( (lv_op_5_0= ruleRop ) ) ( (lv_varValue_6_0= ruleVariable ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleModel131 = new BitSet(new long[]{0x0000007FC4544060L});
    public static final BitSet FOLLOW_ruleAssertionOr_in_ruleModel153 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleModel165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleDeclaration248 = new BitSet(new long[]{0x0000000044000000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleDeclaration269 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDeclaration281 = new BitSet(new long[]{0x0000007FC4400060L});
    public static final BitSet FOLLOW_ruleAssertion_in_ruleDeclaration304 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleAssertionQuantifiedBoolean_in_ruleDeclaration323 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDeclaration338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionOr_in_entryRuleAssertionOr374 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertionOr384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionAnd_in_ruleAssertionOr431 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleAssertionOr452 = new BitSet(new long[]{0x0000007FC4540060L});
    public static final BitSet FOLLOW_ruleAssertionAnd_in_ruleAssertionOr473 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleAssertionAnd_in_entryRuleAssertionAnd511 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertionAnd521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionHP_in_ruleAssertionAnd568 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleAssertionAnd589 = new BitSet(new long[]{0x0000007FC4540060L});
    public static final BitSet FOLLOW_ruleAssertionHP_in_ruleAssertionAnd610 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleAssertionHP_in_entryRuleAssertionHP648 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertionHP658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionNot_in_ruleAssertionHP705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionBraced_in_ruleAssertionHP732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionForm_in_ruleAssertionHP759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionBraced_in_entryRuleAssertionBraced794 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertionBraced804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleAssertionBraced841 = new BitSet(new long[]{0x0000007FC4540060L});
    public static final BitSet FOLLOW_ruleAssertionOr_in_ruleAssertionBraced862 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAssertionBraced874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionNot_in_entryRuleAssertionNot910 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertionNot920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleAssertionNot957 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAssertionNot969 = new BitSet(new long[]{0x0000007FC4540060L});
    public static final BitSet FOLLOW_ruleAssertionOr_in_ruleAssertionNot990 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAssertionNot1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionForm_in_entryRuleAssertionForm1038 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertionForm1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionStdCmp_in_ruleAssertionForm1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionQuantifiedBoolean_in_ruleAssertionForm1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionBoolean_in_ruleAssertionForm1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionStdCmp_in_entryRuleAssertionStdCmp1191 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertionStdCmp1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertion_in_ruleAssertionStdCmp1247 = new BitSet(new long[]{0x00001F8000000000L});
    public static final BitSet FOLLOW_ruleRop_in_ruleAssertionStdCmp1268 = new BitSet(new long[]{0x0000007E44400060L});
    public static final BitSet FOLLOW_ruleAssertion_in_ruleAssertionStdCmp1289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertion_in_entryRuleAssertion1325 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertion1335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_ruleAssertion1382 = new BitSet(new long[]{0x0000000044200002L});
    public static final BitSet FOLLOW_21_in_ruleAssertion1396 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleAssertion1417 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleAssertionQuantifiedNumeric_in_ruleAssertion1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleAssertion1466 = new BitSet(new long[]{0x0000007E44400060L});
    public static final BitSet FOLLOW_ruleValues_in_ruleAssertion1487 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleAssertion1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleAssertion1527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionBoolean_in_entryRuleAssertionBoolean1563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertionBoolean1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_ruleAssertionBoolean1619 = new BitSet(new long[]{0x0000000044200000L});
    public static final BitSet FOLLOW_21_in_ruleAssertionBoolean1633 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleAssertionBoolean1654 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleAssertionBoolean1668 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_ruleFunctionBoolean_in_ruleAssertionBoolean1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionQuantifiedBoolean_in_entryRuleAssertionQuantifiedBoolean1725 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertionQuantifiedBoolean1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolQuantifier_in_ruleAssertionQuantifiedBoolean1781 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAssertionQuantifiedBoolean1793 = new BitSet(new long[]{0x0000000044000000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleAssertionQuantifiedBoolean1814 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleAssertionQuantifiedBoolean1826 = new BitSet(new long[]{0x0000000044000000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleAssertionQuantifiedBoolean1847 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleAssertionQuantifiedBoolean1859 = new BitSet(new long[]{0x0000007FC4540060L});
    public static final BitSet FOLLOW_ruleAssertionOr_in_ruleAssertionQuantifiedBoolean1880 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAssertionQuantifiedBoolean1892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionQuantifiedNumeric_in_entryRuleAssertionQuantifiedNumeric1928 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertionQuantifiedNumeric1938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumbQuantifier_in_ruleAssertionQuantifiedNumeric1984 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAssertionQuantifiedNumeric1996 = new BitSet(new long[]{0x0000000044000000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleAssertionQuantifiedNumeric2017 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleAssertionQuantifiedNumeric2029 = new BitSet(new long[]{0x0000000044000000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleAssertionQuantifiedNumeric2050 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleAssertionQuantifiedNumeric2062 = new BitSet(new long[]{0x0000007FC4540060L});
    public static final BitSet FOLLOW_ruleAssertionOr_in_ruleAssertionQuantifiedNumeric2083 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAssertionQuantifiedNumeric2095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_entryRuleStep2131 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStep2141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleStep2179 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStep2196 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleStep2214 = new BitSet(new long[]{0x0000000044000030L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleStep2235 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleStep2247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleStep2277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute2313 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute2323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute2366 = new BitSet(new long[]{0x00001F8000000000L});
    public static final BitSet FOLLOW_ruleRop_in_ruleAttribute2394 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleAttribute2411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringRop_in_ruleAttribute2445 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute2462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRop_in_ruleAttribute2496 = new BitSet(new long[]{0x0000000044000000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleAttribute2517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleAttribute2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleAttribute2575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction2611 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction2621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunction2663 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunction2680 = new BitSet(new long[]{0x0000007E44480060L});
    public static final BitSet FOLLOW_ruleValues_in_ruleFunction2701 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleFunction2714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionBoolean_in_entryRuleFunctionBoolean2750 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionBoolean2760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleFunctionBoolean2805 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_28_in_ruleFunctionBoolean2834 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_29_in_ruleFunctionBoolean2863 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionBoolean2891 = new BitSet(new long[]{0x0000007E44480060L});
    public static final BitSet FOLLOW_ruleValues_in_ruleFunctionBoolean2912 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleFunctionBoolean2925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValues_in_entryRuleValues2961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValues2971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_ruleValues3017 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleValues3030 = new BitSet(new long[]{0x0000007E44400060L});
    public static final BitSet FOLLOW_ruleValue_in_ruleValues3051 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue3089 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue3099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleValue3146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_ruleValue3173 = new BitSet(new long[]{0x0000000044200002L});
    public static final BitSet FOLLOW_21_in_ruleValue3187 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleValue3208 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant3247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstant3257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleConstant3299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConstant3327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable3369 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable3380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleVariable3418 = new BitSet(new long[]{0x0000007E00000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable3434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumbQuantifier_in_ruleVariable3467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolQuantifier_in_entryRuleBoolQuantifier3514 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolQuantifier3525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleBoolQuantifier3563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleBoolQuantifier3582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumbQuantifier_in_entryRuleNumbQuantifier3623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumbQuantifier3634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleNumbQuantifier3672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleNumbQuantifier3691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleNumbQuantifier3710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleNumbQuantifier3729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleNumbQuantifier3748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleNumbQuantifier3767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringRop_in_entryRuleStringRop3808 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringRop3819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleStringRop3857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleStringRop3876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRop_in_entryRuleRop3917 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRop3928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringRop_in_ruleRop3975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleRop3999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleRop4018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleRop4037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleRop4056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionStdCmp_in_synpred1_InternalXpt1085 = new BitSet(new long[]{0x0000000000000002L});

}