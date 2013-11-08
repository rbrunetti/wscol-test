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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BOOLEAN", "RULE_ID", "RULE_NUMBER", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'let'", "'='", "'||'", "'&&'", "'('", "')'", "'!'", "'['", "']'", "'.'", "'in'", "','", "'/'", "'contains'", "'startsWith'", "'endsWith'", "'+'", "'-'", "'*'", "'%'", "'$'", "'forall'", "'exists'", "'numOf'", "'sum'", "'avg'", "'min'", "'max'", "'product'", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='"
    };
    public static final int RULE_BOOLEAN=4;
    public static final int RULE_ID=5;
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
    public static final int RULE_NUMBER=6;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=8;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=7;
    public static final int T__32=32;
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

            if ( (LA2_0==RULE_BOOLEAN||(LA2_0>=RULE_NUMBER && LA2_0<=RULE_STRING)||LA2_0==18||LA2_0==21||LA2_0==26||LA2_0==34||(LA2_0>=37 && LA2_0<=42)) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=35 && LA2_0<=36)) ) {
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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:340:1: ruleAssertionHP returns [EObject current=null] : ( ( ( ruleAssertionForm )=>this_AssertionForm_0= ruleAssertionForm ) | this_AssertionNot_1= ruleAssertionNot | this_AssertionBraced_2= ruleAssertionBraced ) ;
    public final EObject ruleAssertionHP() throws RecognitionException {
        EObject current = null;

        EObject this_AssertionForm_0 = null;

        EObject this_AssertionNot_1 = null;

        EObject this_AssertionBraced_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:343:28: ( ( ( ( ruleAssertionForm )=>this_AssertionForm_0= ruleAssertionForm ) | this_AssertionNot_1= ruleAssertionNot | this_AssertionBraced_2= ruleAssertionBraced ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:344:1: ( ( ( ruleAssertionForm )=>this_AssertionForm_0= ruleAssertionForm ) | this_AssertionNot_1= ruleAssertionNot | this_AssertionBraced_2= ruleAssertionBraced )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:344:1: ( ( ( ruleAssertionForm )=>this_AssertionForm_0= ruleAssertionForm ) | this_AssertionNot_1= ruleAssertionNot | this_AssertionBraced_2= ruleAssertionBraced )
            int alt5=3;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:344:2: ( ( ruleAssertionForm )=>this_AssertionForm_0= ruleAssertionForm )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:344:2: ( ( ruleAssertionForm )=>this_AssertionForm_0= ruleAssertionForm )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:344:3: ( ruleAssertionForm )=>this_AssertionForm_0= ruleAssertionForm
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAssertionHPAccess().getAssertionFormParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAssertionForm_in_ruleAssertionHP711);
                    this_AssertionForm_0=ruleAssertionForm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AssertionForm_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:355:5: this_AssertionNot_1= ruleAssertionNot
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAssertionHPAccess().getAssertionNotParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAssertionNot_in_ruleAssertionHP739);
                    this_AssertionNot_1=ruleAssertionNot();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AssertionNot_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:365:5: this_AssertionBraced_2= ruleAssertionBraced
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAssertionHPAccess().getAssertionBracedParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAssertionBraced_in_ruleAssertionHP766);
                    this_AssertionBraced_2=ruleAssertionBraced();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AssertionBraced_2; 
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
            pushFollow(FOLLOW_ruleAssertionBraced_in_entryRuleAssertionBraced801);
            iv_ruleAssertionBraced=ruleAssertionBraced();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssertionBraced; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertionBraced811); if (state.failed) return current;

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
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleAssertionBraced848); if (state.failed) return current;
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
            pushFollow(FOLLOW_ruleAssertionOr_in_ruleAssertionBraced869);
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

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleAssertionBraced881); if (state.failed) return current;
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
            pushFollow(FOLLOW_ruleAssertionNot_in_entryRuleAssertionNot917);
            iv_ruleAssertionNot=ruleAssertionNot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssertionNot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertionNot927); if (state.failed) return current;

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
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleAssertionNot964); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAssertionNotAccess().getExclamationMarkKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleAssertionNot976); if (state.failed) return current;
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
            pushFollow(FOLLOW_ruleAssertionOr_in_ruleAssertionNot997);
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

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleAssertionNot1009); if (state.failed) return current;
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
            pushFollow(FOLLOW_ruleAssertionForm_in_entryRuleAssertionForm1045);
            iv_ruleAssertionForm=ruleAssertionForm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssertionForm; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertionForm1055); if (state.failed) return current;

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
                    pushFollow(FOLLOW_ruleAssertionStdCmp_in_ruleAssertionForm1108);
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
                    pushFollow(FOLLOW_ruleAssertionQuantifiedBoolean_in_ruleAssertionForm1136);
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
                    pushFollow(FOLLOW_ruleAssertionBoolean_in_ruleAssertionForm1163);
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
            pushFollow(FOLLOW_ruleAssertionStdCmp_in_entryRuleAssertionStdCmp1198);
            iv_ruleAssertionStdCmp=ruleAssertionStdCmp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssertionStdCmp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertionStdCmp1208); if (state.failed) return current;

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
            pushFollow(FOLLOW_ruleAssertion_in_ruleAssertionStdCmp1254);
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
            pushFollow(FOLLOW_ruleRop_in_ruleAssertionStdCmp1275);
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
            pushFollow(FOLLOW_ruleAssertion_in_ruleAssertionStdCmp1296);
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
            pushFollow(FOLLOW_ruleAssertion_in_entryRuleAssertion1332);
            iv_ruleAssertion=ruleAssertion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssertion; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertion1342); if (state.failed) return current;

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:613:1: ruleAssertion returns [EObject current=null] : (this_AssertionQuantifiedNumeric_0= ruleAssertionQuantifiedNumeric | (otherlv_1= '[' ( (lv_values_2_0= ruleValues ) ) otherlv_3= ']' ) | this_Expression_4= ruleExpression | ( (lv_bool_5_0= RULE_BOOLEAN ) ) ) ;
    public final EObject ruleAssertion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_bool_5_0=null;
        EObject this_AssertionQuantifiedNumeric_0 = null;

        EObject lv_values_2_0 = null;

        EObject this_Expression_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:616:28: ( (this_AssertionQuantifiedNumeric_0= ruleAssertionQuantifiedNumeric | (otherlv_1= '[' ( (lv_values_2_0= ruleValues ) ) otherlv_3= ']' ) | this_Expression_4= ruleExpression | ( (lv_bool_5_0= RULE_BOOLEAN ) ) ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:617:1: (this_AssertionQuantifiedNumeric_0= ruleAssertionQuantifiedNumeric | (otherlv_1= '[' ( (lv_values_2_0= ruleValues ) ) otherlv_3= ']' ) | this_Expression_4= ruleExpression | ( (lv_bool_5_0= RULE_BOOLEAN ) ) )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:617:1: (this_AssertionQuantifiedNumeric_0= ruleAssertionQuantifiedNumeric | (otherlv_1= '[' ( (lv_values_2_0= ruleValues ) ) otherlv_3= ']' ) | this_Expression_4= ruleExpression | ( (lv_bool_5_0= RULE_BOOLEAN ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
                {
                alt7=1;
                }
                break;
            case 21:
                {
                alt7=2;
                }
                break;
            case RULE_NUMBER:
            case RULE_STRING:
            case 18:
            case 26:
            case 34:
                {
                alt7=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt7=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:618:5: this_AssertionQuantifiedNumeric_0= ruleAssertionQuantifiedNumeric
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAssertionAccess().getAssertionQuantifiedNumericParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAssertionQuantifiedNumeric_in_ruleAssertion1389);
                    this_AssertionQuantifiedNumeric_0=ruleAssertionQuantifiedNumeric();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AssertionQuantifiedNumeric_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:627:6: (otherlv_1= '[' ( (lv_values_2_0= ruleValues ) ) otherlv_3= ']' )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:627:6: (otherlv_1= '[' ( (lv_values_2_0= ruleValues ) ) otherlv_3= ']' )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:627:8: otherlv_1= '[' ( (lv_values_2_0= ruleValues ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleAssertion1407); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getAssertionAccess().getLeftSquareBracketKeyword_1_0());
                          
                    }
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:631:1: ( (lv_values_2_0= ruleValues ) )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:632:1: (lv_values_2_0= ruleValues )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:632:1: (lv_values_2_0= ruleValues )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:633:3: lv_values_2_0= ruleValues
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAssertionAccess().getValuesValuesParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValues_in_ruleAssertion1428);
                    lv_values_2_0=ruleValues();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAssertionRule());
                      	        }
                             		set(
                             			current, 
                             			"values",
                              		lv_values_2_0, 
                              		"Values");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleAssertion1440); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getAssertionAccess().getRightSquareBracketKeyword_1_2());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:655:5: this_Expression_4= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAssertionAccess().getExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleAssertion1469);
                    this_Expression_4=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:664:6: ( (lv_bool_5_0= RULE_BOOLEAN ) )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:664:6: ( (lv_bool_5_0= RULE_BOOLEAN ) )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:665:1: (lv_bool_5_0= RULE_BOOLEAN )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:665:1: (lv_bool_5_0= RULE_BOOLEAN )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:666:3: lv_bool_5_0= RULE_BOOLEAN
                    {
                    lv_bool_5_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleAssertion1491); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_bool_5_0, grammarAccess.getAssertionAccess().getBoolBOOLEANTerminalRuleCall_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAssertionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"bool",
                              		lv_bool_5_0, 
                              		"BOOLEAN");
                      	    
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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:690:1: entryRuleAssertionBoolean returns [EObject current=null] : iv_ruleAssertionBoolean= ruleAssertionBoolean EOF ;
    public final EObject entryRuleAssertionBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertionBoolean = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:691:2: (iv_ruleAssertionBoolean= ruleAssertionBoolean EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:692:2: iv_ruleAssertionBoolean= ruleAssertionBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssertionBooleanRule()); 
            }
            pushFollow(FOLLOW_ruleAssertionBoolean_in_entryRuleAssertionBoolean1532);
            iv_ruleAssertionBoolean=ruleAssertionBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssertionBoolean; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertionBoolean1542); if (state.failed) return current;

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:699:1: ruleAssertionBoolean returns [EObject current=null] : ( ( (lv_steps_0_0= ruleStep ) )+ (otherlv_1= '.' ( (lv_functions_2_0= ruleFunction ) ) )* otherlv_3= '.' ( (lv_functions_4_0= ruleFunctionBoolean ) ) ) ;
    public final EObject ruleAssertionBoolean() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_steps_0_0 = null;

        EObject lv_functions_2_0 = null;

        EObject lv_functions_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:702:28: ( ( ( (lv_steps_0_0= ruleStep ) )+ (otherlv_1= '.' ( (lv_functions_2_0= ruleFunction ) ) )* otherlv_3= '.' ( (lv_functions_4_0= ruleFunctionBoolean ) ) ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:703:1: ( ( (lv_steps_0_0= ruleStep ) )+ (otherlv_1= '.' ( (lv_functions_2_0= ruleFunction ) ) )* otherlv_3= '.' ( (lv_functions_4_0= ruleFunctionBoolean ) ) )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:703:1: ( ( (lv_steps_0_0= ruleStep ) )+ (otherlv_1= '.' ( (lv_functions_2_0= ruleFunction ) ) )* otherlv_3= '.' ( (lv_functions_4_0= ruleFunctionBoolean ) ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:703:2: ( (lv_steps_0_0= ruleStep ) )+ (otherlv_1= '.' ( (lv_functions_2_0= ruleFunction ) ) )* otherlv_3= '.' ( (lv_functions_4_0= ruleFunctionBoolean ) )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:703:2: ( (lv_steps_0_0= ruleStep ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==26||LA8_0==34) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:704:1: (lv_steps_0_0= ruleStep )
            	    {
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:704:1: (lv_steps_0_0= ruleStep )
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:705:3: lv_steps_0_0= ruleStep
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssertionBooleanAccess().getStepsStepParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStep_in_ruleAssertionBoolean1588);
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
            	    if ( cnt8 >= 1 ) break loop8;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:721:3: (otherlv_1= '.' ( (lv_functions_2_0= ruleFunction ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23) ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1==RULE_ID) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:721:5: otherlv_1= '.' ( (lv_functions_2_0= ruleFunction ) )
            	    {
            	    otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleAssertionBoolean1602); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getAssertionBooleanAccess().getFullStopKeyword_1_0());
            	          
            	    }
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:725:1: ( (lv_functions_2_0= ruleFunction ) )
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:726:1: (lv_functions_2_0= ruleFunction )
            	    {
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:726:1: (lv_functions_2_0= ruleFunction )
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:727:3: lv_functions_2_0= ruleFunction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssertionBooleanAccess().getFunctionsFunctionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFunction_in_ruleAssertionBoolean1623);
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
            	    break loop9;
                }
            } while (true);

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleAssertionBoolean1637); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getAssertionBooleanAccess().getFullStopKeyword_2());
                  
            }
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:747:1: ( (lv_functions_4_0= ruleFunctionBoolean ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:748:1: (lv_functions_4_0= ruleFunctionBoolean )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:748:1: (lv_functions_4_0= ruleFunctionBoolean )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:749:3: lv_functions_4_0= ruleFunctionBoolean
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssertionBooleanAccess().getFunctionsFunctionBooleanParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFunctionBoolean_in_ruleAssertionBoolean1658);
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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:773:1: entryRuleAssertionQuantifiedBoolean returns [EObject current=null] : iv_ruleAssertionQuantifiedBoolean= ruleAssertionQuantifiedBoolean EOF ;
    public final EObject entryRuleAssertionQuantifiedBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertionQuantifiedBoolean = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:774:2: (iv_ruleAssertionQuantifiedBoolean= ruleAssertionQuantifiedBoolean EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:775:2: iv_ruleAssertionQuantifiedBoolean= ruleAssertionQuantifiedBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssertionQuantifiedBooleanRule()); 
            }
            pushFollow(FOLLOW_ruleAssertionQuantifiedBoolean_in_entryRuleAssertionQuantifiedBoolean1694);
            iv_ruleAssertionQuantifiedBoolean=ruleAssertionQuantifiedBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssertionQuantifiedBoolean; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertionQuantifiedBoolean1704); if (state.failed) return current;

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:782:1: ruleAssertionQuantifiedBoolean returns [EObject current=null] : ( ( (lv_quantifier_0_0= ruleBoolQuantifier ) ) otherlv_1= '(' ( (lv_alias_2_0= ruleVariable ) ) otherlv_3= 'in' ( (lv_var_4_0= ruleVariable ) ) otherlv_5= ',' ( (lv_conditions_6_0= ruleAssertionOr ) ) otherlv_7= ')' ) ;
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
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:785:28: ( ( ( (lv_quantifier_0_0= ruleBoolQuantifier ) ) otherlv_1= '(' ( (lv_alias_2_0= ruleVariable ) ) otherlv_3= 'in' ( (lv_var_4_0= ruleVariable ) ) otherlv_5= ',' ( (lv_conditions_6_0= ruleAssertionOr ) ) otherlv_7= ')' ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:786:1: ( ( (lv_quantifier_0_0= ruleBoolQuantifier ) ) otherlv_1= '(' ( (lv_alias_2_0= ruleVariable ) ) otherlv_3= 'in' ( (lv_var_4_0= ruleVariable ) ) otherlv_5= ',' ( (lv_conditions_6_0= ruleAssertionOr ) ) otherlv_7= ')' )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:786:1: ( ( (lv_quantifier_0_0= ruleBoolQuantifier ) ) otherlv_1= '(' ( (lv_alias_2_0= ruleVariable ) ) otherlv_3= 'in' ( (lv_var_4_0= ruleVariable ) ) otherlv_5= ',' ( (lv_conditions_6_0= ruleAssertionOr ) ) otherlv_7= ')' )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:786:2: ( (lv_quantifier_0_0= ruleBoolQuantifier ) ) otherlv_1= '(' ( (lv_alias_2_0= ruleVariable ) ) otherlv_3= 'in' ( (lv_var_4_0= ruleVariable ) ) otherlv_5= ',' ( (lv_conditions_6_0= ruleAssertionOr ) ) otherlv_7= ')'
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:786:2: ( (lv_quantifier_0_0= ruleBoolQuantifier ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:787:1: (lv_quantifier_0_0= ruleBoolQuantifier )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:787:1: (lv_quantifier_0_0= ruleBoolQuantifier )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:788:3: lv_quantifier_0_0= ruleBoolQuantifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssertionQuantifiedBooleanAccess().getQuantifierBoolQuantifierParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBoolQuantifier_in_ruleAssertionQuantifiedBoolean1750);
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

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleAssertionQuantifiedBoolean1762); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAssertionQuantifiedBooleanAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:808:1: ( (lv_alias_2_0= ruleVariable ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:809:1: (lv_alias_2_0= ruleVariable )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:809:1: (lv_alias_2_0= ruleVariable )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:810:3: lv_alias_2_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssertionQuantifiedBooleanAccess().getAliasVariableParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleAssertionQuantifiedBoolean1783);
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

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleAssertionQuantifiedBoolean1795); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getAssertionQuantifiedBooleanAccess().getInKeyword_3());
                  
            }
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:830:1: ( (lv_var_4_0= ruleVariable ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:831:1: (lv_var_4_0= ruleVariable )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:831:1: (lv_var_4_0= ruleVariable )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:832:3: lv_var_4_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssertionQuantifiedBooleanAccess().getVarVariableParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleAssertionQuantifiedBoolean1816);
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

            otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleAssertionQuantifiedBoolean1828); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getAssertionQuantifiedBooleanAccess().getCommaKeyword_5());
                  
            }
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:852:1: ( (lv_conditions_6_0= ruleAssertionOr ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:853:1: (lv_conditions_6_0= ruleAssertionOr )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:853:1: (lv_conditions_6_0= ruleAssertionOr )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:854:3: lv_conditions_6_0= ruleAssertionOr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssertionQuantifiedBooleanAccess().getConditionsAssertionOrParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAssertionOr_in_ruleAssertionQuantifiedBoolean1849);
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

            otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleAssertionQuantifiedBoolean1861); if (state.failed) return current;
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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:882:1: entryRuleAssertionQuantifiedNumeric returns [EObject current=null] : iv_ruleAssertionQuantifiedNumeric= ruleAssertionQuantifiedNumeric EOF ;
    public final EObject entryRuleAssertionQuantifiedNumeric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertionQuantifiedNumeric = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:883:2: (iv_ruleAssertionQuantifiedNumeric= ruleAssertionQuantifiedNumeric EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:884:2: iv_ruleAssertionQuantifiedNumeric= ruleAssertionQuantifiedNumeric EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssertionQuantifiedNumericRule()); 
            }
            pushFollow(FOLLOW_ruleAssertionQuantifiedNumeric_in_entryRuleAssertionQuantifiedNumeric1897);
            iv_ruleAssertionQuantifiedNumeric=ruleAssertionQuantifiedNumeric();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssertionQuantifiedNumeric; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertionQuantifiedNumeric1907); if (state.failed) return current;

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:891:1: ruleAssertionQuantifiedNumeric returns [EObject current=null] : ( ( (lv_quantifier_0_0= ruleNumbQuantifier ) ) otherlv_1= '(' ( (lv_alias_2_0= ruleVariable ) ) otherlv_3= 'in' ( (lv_var_4_0= ruleVariable ) ) otherlv_5= ',' ( (lv_conditions_6_0= ruleAssertionOr ) ) otherlv_7= ')' ) ;
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
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:894:28: ( ( ( (lv_quantifier_0_0= ruleNumbQuantifier ) ) otherlv_1= '(' ( (lv_alias_2_0= ruleVariable ) ) otherlv_3= 'in' ( (lv_var_4_0= ruleVariable ) ) otherlv_5= ',' ( (lv_conditions_6_0= ruleAssertionOr ) ) otherlv_7= ')' ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:895:1: ( ( (lv_quantifier_0_0= ruleNumbQuantifier ) ) otherlv_1= '(' ( (lv_alias_2_0= ruleVariable ) ) otherlv_3= 'in' ( (lv_var_4_0= ruleVariable ) ) otherlv_5= ',' ( (lv_conditions_6_0= ruleAssertionOr ) ) otherlv_7= ')' )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:895:1: ( ( (lv_quantifier_0_0= ruleNumbQuantifier ) ) otherlv_1= '(' ( (lv_alias_2_0= ruleVariable ) ) otherlv_3= 'in' ( (lv_var_4_0= ruleVariable ) ) otherlv_5= ',' ( (lv_conditions_6_0= ruleAssertionOr ) ) otherlv_7= ')' )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:895:2: ( (lv_quantifier_0_0= ruleNumbQuantifier ) ) otherlv_1= '(' ( (lv_alias_2_0= ruleVariable ) ) otherlv_3= 'in' ( (lv_var_4_0= ruleVariable ) ) otherlv_5= ',' ( (lv_conditions_6_0= ruleAssertionOr ) ) otherlv_7= ')'
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:895:2: ( (lv_quantifier_0_0= ruleNumbQuantifier ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:896:1: (lv_quantifier_0_0= ruleNumbQuantifier )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:896:1: (lv_quantifier_0_0= ruleNumbQuantifier )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:897:3: lv_quantifier_0_0= ruleNumbQuantifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssertionQuantifiedNumericAccess().getQuantifierNumbQuantifierParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumbQuantifier_in_ruleAssertionQuantifiedNumeric1953);
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

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleAssertionQuantifiedNumeric1965); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAssertionQuantifiedNumericAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:917:1: ( (lv_alias_2_0= ruleVariable ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:918:1: (lv_alias_2_0= ruleVariable )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:918:1: (lv_alias_2_0= ruleVariable )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:919:3: lv_alias_2_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssertionQuantifiedNumericAccess().getAliasVariableParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleAssertionQuantifiedNumeric1986);
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

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleAssertionQuantifiedNumeric1998); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getAssertionQuantifiedNumericAccess().getInKeyword_3());
                  
            }
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:939:1: ( (lv_var_4_0= ruleVariable ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:940:1: (lv_var_4_0= ruleVariable )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:940:1: (lv_var_4_0= ruleVariable )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:941:3: lv_var_4_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssertionQuantifiedNumericAccess().getVarVariableParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleAssertionQuantifiedNumeric2019);
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

            otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleAssertionQuantifiedNumeric2031); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getAssertionQuantifiedNumericAccess().getCommaKeyword_5());
                  
            }
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:961:1: ( (lv_conditions_6_0= ruleAssertionOr ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:962:1: (lv_conditions_6_0= ruleAssertionOr )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:962:1: (lv_conditions_6_0= ruleAssertionOr )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:963:3: lv_conditions_6_0= ruleAssertionOr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssertionQuantifiedNumericAccess().getConditionsAssertionOrParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAssertionOr_in_ruleAssertionQuantifiedNumeric2052);
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

            otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleAssertionQuantifiedNumeric2064); if (state.failed) return current;
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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:991:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:992:2: (iv_ruleStep= ruleStep EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:993:2: iv_ruleStep= ruleStep EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStepRule()); 
            }
            pushFollow(FOLLOW_ruleStep_in_entryRuleStep2100);
            iv_ruleStep=ruleStep();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStep; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStep2110); if (state.failed) return current;

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1000:1: ruleStep returns [EObject current=null] : ( (otherlv_0= '/' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_predicate_3_0= rulePredicate ) ) otherlv_4= ']' )? ) | ( (lv_placeholder_5_0= ruleVariable ) ) ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        AntlrDatatypeRuleToken lv_placeholder_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1003:28: ( ( (otherlv_0= '/' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_predicate_3_0= rulePredicate ) ) otherlv_4= ']' )? ) | ( (lv_placeholder_5_0= ruleVariable ) ) ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1004:1: ( (otherlv_0= '/' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_predicate_3_0= rulePredicate ) ) otherlv_4= ']' )? ) | ( (lv_placeholder_5_0= ruleVariable ) ) )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1004:1: ( (otherlv_0= '/' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_predicate_3_0= rulePredicate ) ) otherlv_4= ']' )? ) | ( (lv_placeholder_5_0= ruleVariable ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            else if ( (LA11_0==34) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1004:2: (otherlv_0= '/' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_predicate_3_0= rulePredicate ) ) otherlv_4= ']' )? )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1004:2: (otherlv_0= '/' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_predicate_3_0= rulePredicate ) ) otherlv_4= ']' )? )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1004:4: otherlv_0= '/' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_predicate_3_0= rulePredicate ) ) otherlv_4= ']' )?
                    {
                    otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleStep2148); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getStepAccess().getSolidusKeyword_0_0());
                          
                    }
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1008:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1009:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1009:1: (lv_name_1_0= RULE_ID )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1010:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStep2165); if (state.failed) return current;
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

                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1026:2: (otherlv_2= '[' ( (lv_predicate_3_0= rulePredicate ) ) otherlv_4= ']' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==21) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1026:4: otherlv_2= '[' ( (lv_predicate_3_0= rulePredicate ) ) otherlv_4= ']'
                            {
                            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleStep2183); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_2, grammarAccess.getStepAccess().getLeftSquareBracketKeyword_0_2_0());
                                  
                            }
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1030:1: ( (lv_predicate_3_0= rulePredicate ) )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1031:1: (lv_predicate_3_0= rulePredicate )
                            {
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1031:1: (lv_predicate_3_0= rulePredicate )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1032:3: lv_predicate_3_0= rulePredicate
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getStepAccess().getPredicatePredicateParserRuleCall_0_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulePredicate_in_ruleStep2204);
                            lv_predicate_3_0=rulePredicate();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getStepRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"predicate",
                                      		lv_predicate_3_0, 
                                      		"Predicate");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleStep2216); if (state.failed) return current;
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
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1053:6: ( (lv_placeholder_5_0= ruleVariable ) )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1053:6: ( (lv_placeholder_5_0= ruleVariable ) )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1054:1: (lv_placeholder_5_0= ruleVariable )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1054:1: (lv_placeholder_5_0= ruleVariable )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1055:3: lv_placeholder_5_0= ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStepAccess().getPlaceholderVariableParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleStep2246);
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


    // $ANTLR start "entryRulePredicate"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1079:1: entryRulePredicate returns [EObject current=null] : iv_rulePredicate= rulePredicate EOF ;
    public final EObject entryRulePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicate = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1080:2: (iv_rulePredicate= rulePredicate EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1081:2: iv_rulePredicate= rulePredicate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPredicateRule()); 
            }
            pushFollow(FOLLOW_rulePredicate_in_entryRulePredicate2282);
            iv_rulePredicate=rulePredicate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePredicate; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicate2292); if (state.failed) return current;

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
    // $ANTLR end "entryRulePredicate"


    // $ANTLR start "rulePredicate"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1088:1: rulePredicate returns [EObject current=null] : ( ( ( (lv_property_0_0= RULE_ID ) ) ( ( ( (lv_op_1_0= ruleRop ) ) ( (lv_numberValue_2_0= RULE_NUMBER ) ) ) | ( ( (lv_op_3_0= ruleStringRop ) ) ( (lv_strValue_4_0= RULE_STRING ) ) ) | ( ( (lv_op_5_0= ruleRop ) ) ( (lv_varValue_6_0= ruleVariable ) ) ) ) ) | ( (lv_number_7_0= RULE_NUMBER ) ) | ( (lv_var_8_0= ruleVariable ) ) ) ;
    public final EObject rulePredicate() throws RecognitionException {
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
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1091:28: ( ( ( ( (lv_property_0_0= RULE_ID ) ) ( ( ( (lv_op_1_0= ruleRop ) ) ( (lv_numberValue_2_0= RULE_NUMBER ) ) ) | ( ( (lv_op_3_0= ruleStringRop ) ) ( (lv_strValue_4_0= RULE_STRING ) ) ) | ( ( (lv_op_5_0= ruleRop ) ) ( (lv_varValue_6_0= ruleVariable ) ) ) ) ) | ( (lv_number_7_0= RULE_NUMBER ) ) | ( (lv_var_8_0= ruleVariable ) ) ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1092:1: ( ( ( (lv_property_0_0= RULE_ID ) ) ( ( ( (lv_op_1_0= ruleRop ) ) ( (lv_numberValue_2_0= RULE_NUMBER ) ) ) | ( ( (lv_op_3_0= ruleStringRop ) ) ( (lv_strValue_4_0= RULE_STRING ) ) ) | ( ( (lv_op_5_0= ruleRop ) ) ( (lv_varValue_6_0= ruleVariable ) ) ) ) ) | ( (lv_number_7_0= RULE_NUMBER ) ) | ( (lv_var_8_0= ruleVariable ) ) )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1092:1: ( ( ( (lv_property_0_0= RULE_ID ) ) ( ( ( (lv_op_1_0= ruleRop ) ) ( (lv_numberValue_2_0= RULE_NUMBER ) ) ) | ( ( (lv_op_3_0= ruleStringRop ) ) ( (lv_strValue_4_0= RULE_STRING ) ) ) | ( ( (lv_op_5_0= ruleRop ) ) ( (lv_varValue_6_0= ruleVariable ) ) ) ) ) | ( (lv_number_7_0= RULE_NUMBER ) ) | ( (lv_var_8_0= ruleVariable ) ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt13=1;
                }
                break;
            case RULE_NUMBER:
                {
                alt13=2;
                }
                break;
            case 34:
                {
                alt13=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1092:2: ( ( (lv_property_0_0= RULE_ID ) ) ( ( ( (lv_op_1_0= ruleRop ) ) ( (lv_numberValue_2_0= RULE_NUMBER ) ) ) | ( ( (lv_op_3_0= ruleStringRop ) ) ( (lv_strValue_4_0= RULE_STRING ) ) ) | ( ( (lv_op_5_0= ruleRop ) ) ( (lv_varValue_6_0= ruleVariable ) ) ) ) )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1092:2: ( ( (lv_property_0_0= RULE_ID ) ) ( ( ( (lv_op_1_0= ruleRop ) ) ( (lv_numberValue_2_0= RULE_NUMBER ) ) ) | ( ( (lv_op_3_0= ruleStringRop ) ) ( (lv_strValue_4_0= RULE_STRING ) ) ) | ( ( (lv_op_5_0= ruleRop ) ) ( (lv_varValue_6_0= ruleVariable ) ) ) ) )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1092:3: ( (lv_property_0_0= RULE_ID ) ) ( ( ( (lv_op_1_0= ruleRop ) ) ( (lv_numberValue_2_0= RULE_NUMBER ) ) ) | ( ( (lv_op_3_0= ruleStringRop ) ) ( (lv_strValue_4_0= RULE_STRING ) ) ) | ( ( (lv_op_5_0= ruleRop ) ) ( (lv_varValue_6_0= ruleVariable ) ) ) )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1092:3: ( (lv_property_0_0= RULE_ID ) )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1093:1: (lv_property_0_0= RULE_ID )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1093:1: (lv_property_0_0= RULE_ID )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1094:3: lv_property_0_0= RULE_ID
                    {
                    lv_property_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePredicate2335); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_property_0_0, grammarAccess.getPredicateAccess().getPropertyIDTerminalRuleCall_0_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPredicateRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"property",
                              		lv_property_0_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1110:2: ( ( ( (lv_op_1_0= ruleRop ) ) ( (lv_numberValue_2_0= RULE_NUMBER ) ) ) | ( ( (lv_op_3_0= ruleStringRop ) ) ( (lv_strValue_4_0= RULE_STRING ) ) ) | ( ( (lv_op_5_0= ruleRop ) ) ( (lv_varValue_6_0= ruleVariable ) ) ) )
                    int alt12=3;
                    alt12 = dfa12.predict(input);
                    switch (alt12) {
                        case 1 :
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1110:3: ( ( (lv_op_1_0= ruleRop ) ) ( (lv_numberValue_2_0= RULE_NUMBER ) ) )
                            {
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1110:3: ( ( (lv_op_1_0= ruleRop ) ) ( (lv_numberValue_2_0= RULE_NUMBER ) ) )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1110:4: ( (lv_op_1_0= ruleRop ) ) ( (lv_numberValue_2_0= RULE_NUMBER ) )
                            {
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1110:4: ( (lv_op_1_0= ruleRop ) )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1111:1: (lv_op_1_0= ruleRop )
                            {
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1111:1: (lv_op_1_0= ruleRop )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1112:3: lv_op_1_0= ruleRop
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPredicateAccess().getOpRopParserRuleCall_0_1_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleRop_in_rulePredicate2363);
                            lv_op_1_0=ruleRop();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getPredicateRule());
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

                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1128:2: ( (lv_numberValue_2_0= RULE_NUMBER ) )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1129:1: (lv_numberValue_2_0= RULE_NUMBER )
                            {
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1129:1: (lv_numberValue_2_0= RULE_NUMBER )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1130:3: lv_numberValue_2_0= RULE_NUMBER
                            {
                            lv_numberValue_2_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rulePredicate2380); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_numberValue_2_0, grammarAccess.getPredicateAccess().getNumberValueNUMBERTerminalRuleCall_0_1_0_1_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getPredicateRule());
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
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1147:6: ( ( (lv_op_3_0= ruleStringRop ) ) ( (lv_strValue_4_0= RULE_STRING ) ) )
                            {
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1147:6: ( ( (lv_op_3_0= ruleStringRop ) ) ( (lv_strValue_4_0= RULE_STRING ) ) )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1147:7: ( (lv_op_3_0= ruleStringRop ) ) ( (lv_strValue_4_0= RULE_STRING ) )
                            {
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1147:7: ( (lv_op_3_0= ruleStringRop ) )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1148:1: (lv_op_3_0= ruleStringRop )
                            {
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1148:1: (lv_op_3_0= ruleStringRop )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1149:3: lv_op_3_0= ruleStringRop
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPredicateAccess().getOpStringRopParserRuleCall_0_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleStringRop_in_rulePredicate2414);
                            lv_op_3_0=ruleStringRop();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getPredicateRule());
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

                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1165:2: ( (lv_strValue_4_0= RULE_STRING ) )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1166:1: (lv_strValue_4_0= RULE_STRING )
                            {
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1166:1: (lv_strValue_4_0= RULE_STRING )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1167:3: lv_strValue_4_0= RULE_STRING
                            {
                            lv_strValue_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePredicate2431); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_strValue_4_0, grammarAccess.getPredicateAccess().getStrValueSTRINGTerminalRuleCall_0_1_1_1_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getPredicateRule());
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
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1184:6: ( ( (lv_op_5_0= ruleRop ) ) ( (lv_varValue_6_0= ruleVariable ) ) )
                            {
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1184:6: ( ( (lv_op_5_0= ruleRop ) ) ( (lv_varValue_6_0= ruleVariable ) ) )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1184:7: ( (lv_op_5_0= ruleRop ) ) ( (lv_varValue_6_0= ruleVariable ) )
                            {
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1184:7: ( (lv_op_5_0= ruleRop ) )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1185:1: (lv_op_5_0= ruleRop )
                            {
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1185:1: (lv_op_5_0= ruleRop )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1186:3: lv_op_5_0= ruleRop
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPredicateAccess().getOpRopParserRuleCall_0_1_2_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleRop_in_rulePredicate2465);
                            lv_op_5_0=ruleRop();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getPredicateRule());
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

                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1202:2: ( (lv_varValue_6_0= ruleVariable ) )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1203:1: (lv_varValue_6_0= ruleVariable )
                            {
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1203:1: (lv_varValue_6_0= ruleVariable )
                            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1204:3: lv_varValue_6_0= ruleVariable
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPredicateAccess().getVarValueVariableParserRuleCall_0_1_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleVariable_in_rulePredicate2486);
                            lv_varValue_6_0=ruleVariable();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getPredicateRule());
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
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1221:6: ( (lv_number_7_0= RULE_NUMBER ) )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1221:6: ( (lv_number_7_0= RULE_NUMBER ) )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1222:1: (lv_number_7_0= RULE_NUMBER )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1222:1: (lv_number_7_0= RULE_NUMBER )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1223:3: lv_number_7_0= RULE_NUMBER
                    {
                    lv_number_7_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rulePredicate2512); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_number_7_0, grammarAccess.getPredicateAccess().getNumberNUMBERTerminalRuleCall_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPredicateRule());
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
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1240:6: ( (lv_var_8_0= ruleVariable ) )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1240:6: ( (lv_var_8_0= ruleVariable ) )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1241:1: (lv_var_8_0= ruleVariable )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1241:1: (lv_var_8_0= ruleVariable )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1242:3: lv_var_8_0= ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPredicateAccess().getVarVariableParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariable_in_rulePredicate2544);
                    lv_var_8_0=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPredicateRule());
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
    // $ANTLR end "rulePredicate"


    // $ANTLR start "entryRuleFunction"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1266:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1267:2: (iv_ruleFunction= ruleFunction EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1268:2: iv_ruleFunction= ruleFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction2580);
            iv_ruleFunction=ruleFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction2590); if (state.failed) return current;

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1275:1: ruleFunction returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_params_2_0= ruleValues ) )? otherlv_3= ')' ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_params_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1278:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_params_2_0= ruleValues ) )? otherlv_3= ')' ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1279:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_params_2_0= ruleValues ) )? otherlv_3= ')' )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1279:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_params_2_0= ruleValues ) )? otherlv_3= ')' )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1279:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_params_2_0= ruleValues ) )? otherlv_3= ')'
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1279:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1280:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1280:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1281:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunction2632); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleFunction2649); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1301:1: ( (lv_params_2_0= ruleValues ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_NUMBER && LA14_0<=RULE_STRING)||LA14_0==26||LA14_0==34) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1302:1: (lv_params_2_0= ruleValues )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1302:1: (lv_params_2_0= ruleValues )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1303:3: lv_params_2_0= ruleValues
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionAccess().getParamsValuesParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValues_in_ruleFunction2670);
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

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleFunction2683); if (state.failed) return current;
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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1331:1: entryRuleFunctionBoolean returns [EObject current=null] : iv_ruleFunctionBoolean= ruleFunctionBoolean EOF ;
    public final EObject entryRuleFunctionBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionBoolean = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1332:2: (iv_ruleFunctionBoolean= ruleFunctionBoolean EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1333:2: iv_ruleFunctionBoolean= ruleFunctionBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionBooleanRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionBoolean_in_entryRuleFunctionBoolean2719);
            iv_ruleFunctionBoolean=ruleFunctionBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionBoolean; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionBoolean2729); if (state.failed) return current;

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1340:1: ruleFunctionBoolean returns [EObject current=null] : ( ( ( (lv_name_0_1= 'contains' | lv_name_0_2= 'startsWith' | lv_name_0_3= 'endsWith' ) ) ) otherlv_1= '(' ( (lv_params_2_0= ruleValues ) )? otherlv_3= ')' ) ;
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
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1343:28: ( ( ( ( (lv_name_0_1= 'contains' | lv_name_0_2= 'startsWith' | lv_name_0_3= 'endsWith' ) ) ) otherlv_1= '(' ( (lv_params_2_0= ruleValues ) )? otherlv_3= ')' ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1344:1: ( ( ( (lv_name_0_1= 'contains' | lv_name_0_2= 'startsWith' | lv_name_0_3= 'endsWith' ) ) ) otherlv_1= '(' ( (lv_params_2_0= ruleValues ) )? otherlv_3= ')' )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1344:1: ( ( ( (lv_name_0_1= 'contains' | lv_name_0_2= 'startsWith' | lv_name_0_3= 'endsWith' ) ) ) otherlv_1= '(' ( (lv_params_2_0= ruleValues ) )? otherlv_3= ')' )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1344:2: ( ( (lv_name_0_1= 'contains' | lv_name_0_2= 'startsWith' | lv_name_0_3= 'endsWith' ) ) ) otherlv_1= '(' ( (lv_params_2_0= ruleValues ) )? otherlv_3= ')'
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1344:2: ( ( (lv_name_0_1= 'contains' | lv_name_0_2= 'startsWith' | lv_name_0_3= 'endsWith' ) ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1345:1: ( (lv_name_0_1= 'contains' | lv_name_0_2= 'startsWith' | lv_name_0_3= 'endsWith' ) )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1345:1: ( (lv_name_0_1= 'contains' | lv_name_0_2= 'startsWith' | lv_name_0_3= 'endsWith' ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1346:1: (lv_name_0_1= 'contains' | lv_name_0_2= 'startsWith' | lv_name_0_3= 'endsWith' )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1346:1: (lv_name_0_1= 'contains' | lv_name_0_2= 'startsWith' | lv_name_0_3= 'endsWith' )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt15=1;
                }
                break;
            case 28:
                {
                alt15=2;
                }
                break;
            case 29:
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
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1347:3: lv_name_0_1= 'contains'
                    {
                    lv_name_0_1=(Token)match(input,27,FOLLOW_27_in_ruleFunctionBoolean2774); if (state.failed) return current;
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
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1359:8: lv_name_0_2= 'startsWith'
                    {
                    lv_name_0_2=(Token)match(input,28,FOLLOW_28_in_ruleFunctionBoolean2803); if (state.failed) return current;
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
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1371:8: lv_name_0_3= 'endsWith'
                    {
                    lv_name_0_3=(Token)match(input,29,FOLLOW_29_in_ruleFunctionBoolean2832); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleFunctionBoolean2860); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFunctionBooleanAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1390:1: ( (lv_params_2_0= ruleValues ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_NUMBER && LA16_0<=RULE_STRING)||LA16_0==26||LA16_0==34) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1391:1: (lv_params_2_0= ruleValues )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1391:1: (lv_params_2_0= ruleValues )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1392:3: lv_params_2_0= ruleValues
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionBooleanAccess().getParamsValuesParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValues_in_ruleFunctionBoolean2881);
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

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleFunctionBoolean2894); if (state.failed) return current;
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


    // $ANTLR start "entryRuleExpression"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1420:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1421:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1422:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression2930);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression2940); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1429:1: ruleExpression returns [EObject current=null] : this_Addition_0= ruleAddition ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Addition_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1432:28: (this_Addition_0= ruleAddition )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1434:5: this_Addition_0= ruleAddition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getAdditionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleAddition_in_ruleExpression2986);
            this_Addition_0=ruleAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Addition_0; 
                      afterParserOrEnumRuleCall();
                  
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAddition"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1450:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1451:2: (iv_ruleAddition= ruleAddition EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1452:2: iv_ruleAddition= ruleAddition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditionRule()); 
            }
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition3020);
            iv_ruleAddition=ruleAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition3030); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1459:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1462:28: ( (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1463:1: (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1463:1: (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1464:5: this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition3077);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Multiplication_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1472:1: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=30 && LA18_0<=31)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1472:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) )
            	    {
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1472:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==30) ) {
            	        alt17=1;
            	    }
            	    else if ( (LA17_0==31) ) {
            	        alt17=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1472:3: ( () otherlv_2= '+' )
            	            {
            	            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1472:3: ( () otherlv_2= '+' )
            	            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1472:4: () otherlv_2= '+'
            	            {
            	            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1472:4: ()
            	            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1473:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleAddition3100); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1483:6: ( () otherlv_4= '-' )
            	            {
            	            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1483:6: ( () otherlv_4= '-' )
            	            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1483:7: () otherlv_4= '-'
            	            {
            	            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1483:7: ()
            	            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1484:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleAddition3129); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_4, grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1());
            	                  
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1493:3: ( (lv_right_5_0= ruleMultiplication ) )
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1494:1: (lv_right_5_0= ruleMultiplication )
            	    {
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1494:1: (lv_right_5_0= ruleMultiplication )
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1495:3: lv_right_5_0= ruleMultiplication
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition3152);
            	    lv_right_5_0=ruleMultiplication();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAdditionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_5_0, 
            	              		"Multiplication");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1519:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1520:2: (iv_ruleMultiplication= ruleMultiplication EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1521:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicationRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication3190);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplication; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication3200); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1528:1: ruleMultiplication returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= rulePrimaryExpression ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1531:28: ( (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= rulePrimaryExpression ) ) )* ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1532:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= rulePrimaryExpression ) ) )* )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1532:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= rulePrimaryExpression ) ) )* )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1533:5: this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= rulePrimaryExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultiplicationAccess().getPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_ruleMultiplication3247);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1541:1: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= rulePrimaryExpression ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==26||(LA20_0>=32 && LA20_0<=33)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1541:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= rulePrimaryExpression ) )
            	    {
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1541:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) )
            	    int alt19=3;
            	    switch ( input.LA(1) ) {
            	    case 32:
            	        {
            	        alt19=1;
            	        }
            	        break;
            	    case 26:
            	        {
            	        alt19=2;
            	        }
            	        break;
            	    case 33:
            	        {
            	        alt19=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt19) {
            	        case 1 :
            	            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1541:3: ( () otherlv_2= '*' )
            	            {
            	            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1541:3: ( () otherlv_2= '*' )
            	            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1541:4: () otherlv_2= '*'
            	            {
            	            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1541:4: ()
            	            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1542:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleMultiplication3270); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1552:6: ( () otherlv_4= '/' )
            	            {
            	            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1552:6: ( () otherlv_4= '/' )
            	            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1552:7: () otherlv_4= '/'
            	            {
            	            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1552:7: ()
            	            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1553:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleMultiplication3299); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_4, grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1563:6: ( () otherlv_6= '%' )
            	            {
            	            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1563:6: ( () otherlv_6= '%' )
            	            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1563:7: () otherlv_6= '%'
            	            {
            	            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1563:7: ()
            	            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1564:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getMultiplicationAccess().getRestLeftAction_1_0_2_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_6=(Token)match(input,33,FOLLOW_33_in_ruleMultiplication3328); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_6, grammarAccess.getMultiplicationAccess().getPercentSignKeyword_1_0_2_1());
            	                  
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1573:3: ( (lv_right_7_0= rulePrimaryExpression ) )
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1574:1: (lv_right_7_0= rulePrimaryExpression )
            	    {
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1574:1: (lv_right_7_0= rulePrimaryExpression )
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1575:3: lv_right_7_0= rulePrimaryExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicationAccess().getRightPrimaryExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleMultiplication3351);
            	    lv_right_7_0=rulePrimaryExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_7_0, 
            	              		"PrimaryExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRulePrimaryExpression"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1599:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1600:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1601:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression3389);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression3399); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1608:1: rulePrimaryExpression returns [EObject current=null] : (this_Value_0= ruleValue | (otherlv_1= '(' this_Addition_2= ruleAddition otherlv_3= ')' ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Value_0 = null;

        EObject this_Addition_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1611:28: ( (this_Value_0= ruleValue | (otherlv_1= '(' this_Addition_2= ruleAddition otherlv_3= ')' ) ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1612:1: (this_Value_0= ruleValue | (otherlv_1= '(' this_Addition_2= ruleAddition otherlv_3= ')' ) )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1612:1: (this_Value_0= ruleValue | (otherlv_1= '(' this_Addition_2= ruleAddition otherlv_3= ')' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_NUMBER && LA21_0<=RULE_STRING)||LA21_0==26||LA21_0==34) ) {
                alt21=1;
            }
            else if ( (LA21_0==18) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1613:5: this_Value_0= ruleValue
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValue_in_rulePrimaryExpression3446);
                    this_Value_0=ruleValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Value_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1622:6: (otherlv_1= '(' this_Addition_2= ruleAddition otherlv_3= ')' )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1622:6: (otherlv_1= '(' this_Addition_2= ruleAddition otherlv_3= ')' )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1622:8: otherlv_1= '(' this_Addition_2= ruleAddition otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_18_in_rulePrimaryExpression3464); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getAdditionParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAddition_in_rulePrimaryExpression3486);
                    this_Addition_2=ruleAddition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Addition_2; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_rulePrimaryExpression3497); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_1_2());
                          
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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleValues"
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1647:1: entryRuleValues returns [EObject current=null] : iv_ruleValues= ruleValues EOF ;
    public final EObject entryRuleValues() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValues = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1648:2: (iv_ruleValues= ruleValues EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1649:2: iv_ruleValues= ruleValues EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuesRule()); 
            }
            pushFollow(FOLLOW_ruleValues_in_entryRuleValues3534);
            iv_ruleValues=ruleValues();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValues; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValues3544); if (state.failed) return current;

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1656:1: ruleValues returns [EObject current=null] : ( ( (lv_value_0_0= ruleValue ) ) (otherlv_1= ',' ( (lv_value_2_0= ruleValue ) ) )* ) ;
    public final EObject ruleValues() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1659:28: ( ( ( (lv_value_0_0= ruleValue ) ) (otherlv_1= ',' ( (lv_value_2_0= ruleValue ) ) )* ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1660:1: ( ( (lv_value_0_0= ruleValue ) ) (otherlv_1= ',' ( (lv_value_2_0= ruleValue ) ) )* )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1660:1: ( ( (lv_value_0_0= ruleValue ) ) (otherlv_1= ',' ( (lv_value_2_0= ruleValue ) ) )* )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1660:2: ( (lv_value_0_0= ruleValue ) ) (otherlv_1= ',' ( (lv_value_2_0= ruleValue ) ) )*
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1660:2: ( (lv_value_0_0= ruleValue ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1661:1: (lv_value_0_0= ruleValue )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1661:1: (lv_value_0_0= ruleValue )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1662:3: lv_value_0_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getValuesAccess().getValueValueParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleValues3590);
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

            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1678:2: (otherlv_1= ',' ( (lv_value_2_0= ruleValue ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==25) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1678:4: otherlv_1= ',' ( (lv_value_2_0= ruleValue ) )
            	    {
            	    otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleValues3603); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getValuesAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1682:1: ( (lv_value_2_0= ruleValue ) )
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1683:1: (lv_value_2_0= ruleValue )
            	    {
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1683:1: (lv_value_2_0= ruleValue )
            	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1684:3: lv_value_2_0= ruleValue
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getValuesAccess().getValueValueParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValue_in_ruleValues3624);
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
            	    break loop22;
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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1708:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1709:2: (iv_ruleValue= ruleValue EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1710:2: iv_ruleValue= ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue3662);
            iv_ruleValue=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue3672); if (state.failed) return current;

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1717:1: ruleValue returns [EObject current=null] : (this_Constant_0= ruleConstant | ( ( (lv_steps_1_0= ruleStep ) )+ (otherlv_2= '.' ( (lv_functions_3_0= ruleFunction ) ) )* ) ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Constant_0 = null;

        EObject lv_steps_1_0 = null;

        EObject lv_functions_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1720:28: ( (this_Constant_0= ruleConstant | ( ( (lv_steps_1_0= ruleStep ) )+ (otherlv_2= '.' ( (lv_functions_3_0= ruleFunction ) ) )* ) ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1721:1: (this_Constant_0= ruleConstant | ( ( (lv_steps_1_0= ruleStep ) )+ (otherlv_2= '.' ( (lv_functions_3_0= ruleFunction ) ) )* ) )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1721:1: (this_Constant_0= ruleConstant | ( ( (lv_steps_1_0= ruleStep ) )+ (otherlv_2= '.' ( (lv_functions_3_0= ruleFunction ) ) )* ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_NUMBER && LA25_0<=RULE_STRING)) ) {
                alt25=1;
            }
            else if ( (LA25_0==26||LA25_0==34) ) {
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
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1722:5: this_Constant_0= ruleConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getConstantParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConstant_in_ruleValue3719);
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
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1731:6: ( ( (lv_steps_1_0= ruleStep ) )+ (otherlv_2= '.' ( (lv_functions_3_0= ruleFunction ) ) )* )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1731:6: ( ( (lv_steps_1_0= ruleStep ) )+ (otherlv_2= '.' ( (lv_functions_3_0= ruleFunction ) ) )* )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1731:7: ( (lv_steps_1_0= ruleStep ) )+ (otherlv_2= '.' ( (lv_functions_3_0= ruleFunction ) ) )*
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1731:7: ( (lv_steps_1_0= ruleStep ) )+
                    int cnt23=0;
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==26) ) {
                            int LA23_2 = input.LA(2);

                            if ( (LA23_2==RULE_ID) ) {
                                alt23=1;
                            }


                        }
                        else if ( (LA23_0==34) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1732:1: (lv_steps_1_0= ruleStep )
                    	    {
                    	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1732:1: (lv_steps_1_0= ruleStep )
                    	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1733:3: lv_steps_1_0= ruleStep
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getValueAccess().getStepsStepParserRuleCall_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleStep_in_ruleValue3746);
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
                    	    if ( cnt23 >= 1 ) break loop23;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(23, input);
                                throw eee;
                        }
                        cnt23++;
                    } while (true);

                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1749:3: (otherlv_2= '.' ( (lv_functions_3_0= ruleFunction ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==23) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1749:5: otherlv_2= '.' ( (lv_functions_3_0= ruleFunction ) )
                    	    {
                    	    otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleValue3760); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getValueAccess().getFullStopKeyword_1_1_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1753:1: ( (lv_functions_3_0= ruleFunction ) )
                    	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1754:1: (lv_functions_3_0= ruleFunction )
                    	    {
                    	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1754:1: (lv_functions_3_0= ruleFunction )
                    	    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1755:3: lv_functions_3_0= ruleFunction
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getValueAccess().getFunctionsFunctionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleFunction_in_ruleValue3781);
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
                    	    break loop24;
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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1779:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1780:2: (iv_ruleConstant= ruleConstant EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1781:2: iv_ruleConstant= ruleConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantRule()); 
            }
            pushFollow(FOLLOW_ruleConstant_in_entryRuleConstant3820);
            iv_ruleConstant=ruleConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstant; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstant3830); if (state.failed) return current;

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1788:1: ruleConstant returns [EObject current=null] : ( ( (lv_number_0_0= RULE_NUMBER ) ) | ( (lv_string_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token lv_number_0_0=null;
        Token lv_string_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1791:28: ( ( ( (lv_number_0_0= RULE_NUMBER ) ) | ( (lv_string_1_0= RULE_STRING ) ) ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1792:1: ( ( (lv_number_0_0= RULE_NUMBER ) ) | ( (lv_string_1_0= RULE_STRING ) ) )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1792:1: ( ( (lv_number_0_0= RULE_NUMBER ) ) | ( (lv_string_1_0= RULE_STRING ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_NUMBER) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_STRING) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1792:2: ( (lv_number_0_0= RULE_NUMBER ) )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1792:2: ( (lv_number_0_0= RULE_NUMBER ) )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1793:1: (lv_number_0_0= RULE_NUMBER )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1793:1: (lv_number_0_0= RULE_NUMBER )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1794:3: lv_number_0_0= RULE_NUMBER
                    {
                    lv_number_0_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleConstant3872); if (state.failed) return current;
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
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1811:6: ( (lv_string_1_0= RULE_STRING ) )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1811:6: ( (lv_string_1_0= RULE_STRING ) )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1812:1: (lv_string_1_0= RULE_STRING )
                    {
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1812:1: (lv_string_1_0= RULE_STRING )
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1813:3: lv_string_1_0= RULE_STRING
                    {
                    lv_string_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConstant3900); if (state.failed) return current;
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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1837:1: entryRuleVariable returns [String current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final String entryRuleVariable() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVariable = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1838:2: (iv_ruleVariable= ruleVariable EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1839:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable3942);
            iv_ruleVariable=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable3953); if (state.failed) return current;

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1846:1: ruleVariable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '$' (this_ID_1= RULE_ID | this_NumbQuantifier_2= ruleNumbQuantifier ) ) ;
    public final AntlrDatatypeRuleToken ruleVariable() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        AntlrDatatypeRuleToken this_NumbQuantifier_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1849:28: ( (kw= '$' (this_ID_1= RULE_ID | this_NumbQuantifier_2= ruleNumbQuantifier ) ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1850:1: (kw= '$' (this_ID_1= RULE_ID | this_NumbQuantifier_2= ruleNumbQuantifier ) )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1850:1: (kw= '$' (this_ID_1= RULE_ID | this_NumbQuantifier_2= ruleNumbQuantifier ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1851:2: kw= '$' (this_ID_1= RULE_ID | this_NumbQuantifier_2= ruleNumbQuantifier )
            {
            kw=(Token)match(input,34,FOLLOW_34_in_ruleVariable3991); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getVariableAccess().getDollarSignKeyword_0()); 
                  
            }
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1856:1: (this_ID_1= RULE_ID | this_NumbQuantifier_2= ruleNumbQuantifier )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                alt27=1;
            }
            else if ( ((LA27_0>=37 && LA27_0<=42)) ) {
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
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1856:6: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable4007); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_1, grammarAccess.getVariableAccess().getIDTerminalRuleCall_1_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1865:5: this_NumbQuantifier_2= ruleNumbQuantifier
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVariableAccess().getNumbQuantifierParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumbQuantifier_in_ruleVariable4040);
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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1883:1: entryRuleBoolQuantifier returns [String current=null] : iv_ruleBoolQuantifier= ruleBoolQuantifier EOF ;
    public final String entryRuleBoolQuantifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolQuantifier = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1884:2: (iv_ruleBoolQuantifier= ruleBoolQuantifier EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1885:2: iv_ruleBoolQuantifier= ruleBoolQuantifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolQuantifierRule()); 
            }
            pushFollow(FOLLOW_ruleBoolQuantifier_in_entryRuleBoolQuantifier4087);
            iv_ruleBoolQuantifier=ruleBoolQuantifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolQuantifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolQuantifier4098); if (state.failed) return current;

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1892:1: ruleBoolQuantifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'forall' | kw= 'exists' ) ;
    public final AntlrDatatypeRuleToken ruleBoolQuantifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1895:28: ( (kw= 'forall' | kw= 'exists' ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1896:1: (kw= 'forall' | kw= 'exists' )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1896:1: (kw= 'forall' | kw= 'exists' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==35) ) {
                alt28=1;
            }
            else if ( (LA28_0==36) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1897:2: kw= 'forall'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleBoolQuantifier4136); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBoolQuantifierAccess().getForallKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1904:2: kw= 'exists'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleBoolQuantifier4155); if (state.failed) return current;
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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1917:1: entryRuleNumbQuantifier returns [String current=null] : iv_ruleNumbQuantifier= ruleNumbQuantifier EOF ;
    public final String entryRuleNumbQuantifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumbQuantifier = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1918:2: (iv_ruleNumbQuantifier= ruleNumbQuantifier EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1919:2: iv_ruleNumbQuantifier= ruleNumbQuantifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumbQuantifierRule()); 
            }
            pushFollow(FOLLOW_ruleNumbQuantifier_in_entryRuleNumbQuantifier4196);
            iv_ruleNumbQuantifier=ruleNumbQuantifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumbQuantifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumbQuantifier4207); if (state.failed) return current;

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1926:1: ruleNumbQuantifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'numOf' | kw= 'sum' | kw= 'avg' | kw= 'min' | kw= 'max' | kw= 'product' ) ;
    public final AntlrDatatypeRuleToken ruleNumbQuantifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1929:28: ( (kw= 'numOf' | kw= 'sum' | kw= 'avg' | kw= 'min' | kw= 'max' | kw= 'product' ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1930:1: (kw= 'numOf' | kw= 'sum' | kw= 'avg' | kw= 'min' | kw= 'max' | kw= 'product' )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1930:1: (kw= 'numOf' | kw= 'sum' | kw= 'avg' | kw= 'min' | kw= 'max' | kw= 'product' )
            int alt29=6;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt29=1;
                }
                break;
            case 38:
                {
                alt29=2;
                }
                break;
            case 39:
                {
                alt29=3;
                }
                break;
            case 40:
                {
                alt29=4;
                }
                break;
            case 41:
                {
                alt29=5;
                }
                break;
            case 42:
                {
                alt29=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1931:2: kw= 'numOf'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleNumbQuantifier4245); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNumbQuantifierAccess().getNumOfKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1938:2: kw= 'sum'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleNumbQuantifier4264); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNumbQuantifierAccess().getSumKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1945:2: kw= 'avg'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleNumbQuantifier4283); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNumbQuantifierAccess().getAvgKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1952:2: kw= 'min'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleNumbQuantifier4302); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNumbQuantifierAccess().getMinKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1959:2: kw= 'max'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleNumbQuantifier4321); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNumbQuantifierAccess().getMaxKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1966:2: kw= 'product'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleNumbQuantifier4340); if (state.failed) return current;
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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1979:1: entryRuleStringRop returns [String current=null] : iv_ruleStringRop= ruleStringRop EOF ;
    public final String entryRuleStringRop() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringRop = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1980:2: (iv_ruleStringRop= ruleStringRop EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1981:2: iv_ruleStringRop= ruleStringRop EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringRopRule()); 
            }
            pushFollow(FOLLOW_ruleStringRop_in_entryRuleStringRop4381);
            iv_ruleStringRop=ruleStringRop();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringRop.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringRop4392); if (state.failed) return current;

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1988:1: ruleStringRop returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleStringRop() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1991:28: ( (kw= '==' | kw= '!=' ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1992:1: (kw= '==' | kw= '!=' )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1992:1: (kw= '==' | kw= '!=' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==43) ) {
                alt30=1;
            }
            else if ( (LA30_0==44) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:1993:2: kw= '=='
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleStringRop4430); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getStringRopAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:2000:2: kw= '!='
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleStringRop4449); if (state.failed) return current;
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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:2013:1: entryRuleRop returns [String current=null] : iv_ruleRop= ruleRop EOF ;
    public final String entryRuleRop() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRop = null;


        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:2014:2: (iv_ruleRop= ruleRop EOF )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:2015:2: iv_ruleRop= ruleRop EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRopRule()); 
            }
            pushFollow(FOLLOW_ruleRop_in_entryRuleRop4490);
            iv_ruleRop=ruleRop();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRop.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRop4501); if (state.failed) return current;

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
    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:2022:1: ruleRop returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_StringRop_0= ruleStringRop | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' ) ;
    public final AntlrDatatypeRuleToken ruleRop() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_StringRop_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:2025:28: ( (this_StringRop_0= ruleStringRop | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' ) )
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:2026:1: (this_StringRop_0= ruleStringRop | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' )
            {
            // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:2026:1: (this_StringRop_0= ruleStringRop | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' )
            int alt31=5;
            switch ( input.LA(1) ) {
            case 43:
            case 44:
                {
                alt31=1;
                }
                break;
            case 45:
                {
                alt31=2;
                }
                break;
            case 46:
                {
                alt31=3;
                }
                break;
            case 47:
                {
                alt31=4;
                }
                break;
            case 48:
                {
                alt31=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:2027:5: this_StringRop_0= ruleStringRop
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRopAccess().getStringRopParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringRop_in_ruleRop4548);
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
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:2039:2: kw= '<'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleRop4572); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRopAccess().getLessThanSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:2046:2: kw= '<='
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleRop4591); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRopAccess().getLessThanSignEqualsSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:2053:2: kw= '>'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleRop4610); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRopAccess().getGreaterThanSignKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:2060:2: kw= '>='
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleRop4629); if (state.failed) return current;
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
        // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:344:3: ( ruleAssertionForm )
        // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:344:5: ruleAssertionForm
        {
        pushFollow(FOLLOW_ruleAssertionForm_in_synpred1_InternalXpt695);
        ruleAssertionForm();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalXpt

    // $ANTLR start synpred2_InternalXpt
    public final void synpred2_InternalXpt_fragment() throws RecognitionException {   
        // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:492:3: ( ruleAssertionStdCmp )
        // ../org.xtext.example.xpt/src-gen/org/xtext/example/xpt/parser/antlr/internal/InternalXpt.g:492:5: ruleAssertionStdCmp
        {
        pushFollow(FOLLOW_ruleAssertionStdCmp_in_synpred2_InternalXpt1092);
        ruleAssertionStdCmp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalXpt

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
    public final boolean synpred2_InternalXpt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalXpt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA5_eotS =
        "\22\uffff";
    static final String DFA5_eofS =
        "\22\uffff";
    static final String DFA5_minS =
        "\1\4\13\uffff\1\0\5\uffff";
    static final String DFA5_maxS =
        "\1\52\13\uffff\1\0\5\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\13\1\1\uffff\3\1\1\2\1\3";
    static final String DFA5_specialS =
        "\1\0\13\uffff\1\1\5\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\15\1\uffff\1\10\1\11\12\uffff\1\14\1\uffff\1\20\1\7\4\uffff"+
            "\1\12\7\uffff\1\13\1\16\1\17\1\1\1\2\1\3\1\4\1\5\1\6",
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
            "\1\uffff",
            "",
            "",
            "",
            "",
            ""
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
            return "344:1: ( ( ( ruleAssertionForm )=>this_AssertionForm_0= ruleAssertionForm ) | this_AssertionNot_1= ruleAssertionNot | this_AssertionBraced_2= ruleAssertionBraced )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA5_0 = input.LA(1);

                         
                        int index5_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA5_0==37) && (synpred1_InternalXpt())) {s = 1;}

                        else if ( (LA5_0==38) && (synpred1_InternalXpt())) {s = 2;}

                        else if ( (LA5_0==39) && (synpred1_InternalXpt())) {s = 3;}

                        else if ( (LA5_0==40) && (synpred1_InternalXpt())) {s = 4;}

                        else if ( (LA5_0==41) && (synpred1_InternalXpt())) {s = 5;}

                        else if ( (LA5_0==42) && (synpred1_InternalXpt())) {s = 6;}

                        else if ( (LA5_0==21) && (synpred1_InternalXpt())) {s = 7;}

                        else if ( (LA5_0==RULE_NUMBER) && (synpred1_InternalXpt())) {s = 8;}

                        else if ( (LA5_0==RULE_STRING) && (synpred1_InternalXpt())) {s = 9;}

                        else if ( (LA5_0==26) && (synpred1_InternalXpt())) {s = 10;}

                        else if ( (LA5_0==34) && (synpred1_InternalXpt())) {s = 11;}

                        else if ( (LA5_0==18) ) {s = 12;}

                        else if ( (LA5_0==RULE_BOOLEAN) && (synpred1_InternalXpt())) {s = 13;}

                        else if ( (LA5_0==35) && (synpred1_InternalXpt())) {s = 14;}

                        else if ( (LA5_0==36) && (synpred1_InternalXpt())) {s = 15;}

                        else if ( (LA5_0==20) ) {s = 16;}

                         
                        input.seek(index5_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA5_12 = input.LA(1);

                         
                        int index5_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalXpt()) ) {s = 15;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index5_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 5, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA6_eotS =
        "\21\uffff";
    static final String DFA6_eofS =
        "\21\uffff";
    static final String DFA6_minS =
        "\1\4\11\uffff\2\0\5\uffff";
    static final String DFA6_maxS =
        "\1\52\11\uffff\2\0\5\uffff";
    static final String DFA6_acceptS =
        "\1\uffff\11\1\2\uffff\2\1\1\2\1\uffff\1\3";
    static final String DFA6_specialS =
        "\1\0\11\uffff\1\1\1\2\5\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\15\1\uffff\1\10\1\11\12\uffff\1\14\2\uffff\1\7\4\uffff\1"+
            "\12\7\uffff\1\13\2\16\1\1\1\2\1\3\1\4\1\5\1\6",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
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
                        if ( (LA6_0==37) && (synpred2_InternalXpt())) {s = 1;}

                        else if ( (LA6_0==38) && (synpred2_InternalXpt())) {s = 2;}

                        else if ( (LA6_0==39) && (synpred2_InternalXpt())) {s = 3;}

                        else if ( (LA6_0==40) && (synpred2_InternalXpt())) {s = 4;}

                        else if ( (LA6_0==41) && (synpred2_InternalXpt())) {s = 5;}

                        else if ( (LA6_0==42) && (synpred2_InternalXpt())) {s = 6;}

                        else if ( (LA6_0==21) && (synpred2_InternalXpt())) {s = 7;}

                        else if ( (LA6_0==RULE_NUMBER) && (synpred2_InternalXpt())) {s = 8;}

                        else if ( (LA6_0==RULE_STRING) && (synpred2_InternalXpt())) {s = 9;}

                        else if ( (LA6_0==26) ) {s = 10;}

                        else if ( (LA6_0==34) ) {s = 11;}

                        else if ( (LA6_0==18) && (synpred2_InternalXpt())) {s = 12;}

                        else if ( (LA6_0==RULE_BOOLEAN) && (synpred2_InternalXpt())) {s = 13;}

                        else if ( ((LA6_0>=35 && LA6_0<=36)) ) {s = 14;}

                         
                        input.seek(index6_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA6_10 = input.LA(1);

                         
                        int index6_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalXpt()) ) {s = 13;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index6_10);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA6_11 = input.LA(1);

                         
                        int index6_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalXpt()) ) {s = 13;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index6_11);
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
    static final String DFA12_eotS =
        "\12\uffff";
    static final String DFA12_eofS =
        "\12\uffff";
    static final String DFA12_minS =
        "\1\53\6\6\3\uffff";
    static final String DFA12_maxS =
        "\1\60\6\42\3\uffff";
    static final String DFA12_acceptS =
        "\7\uffff\1\3\1\1\1\2";
    static final String DFA12_specialS =
        "\12\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\1\1\2\1\3\1\4\1\5\1\6",
            "\1\10\1\11\32\uffff\1\7",
            "\1\10\1\11\32\uffff\1\7",
            "\1\10\33\uffff\1\7",
            "\1\10\33\uffff\1\7",
            "\1\10\33\uffff\1\7",
            "\1\10\33\uffff\1\7",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1110:2: ( ( ( (lv_op_1_0= ruleRop ) ) ( (lv_numberValue_2_0= RULE_NUMBER ) ) ) | ( ( (lv_op_3_0= ruleStringRop ) ) ( (lv_strValue_4_0= RULE_STRING ) ) ) | ( ( (lv_op_5_0= ruleRop ) ) ( (lv_varValue_6_0= ruleVariable ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleModel131 = new BitSet(new long[]{0x000007FC043440D0L});
    public static final BitSet FOLLOW_ruleAssertionOr_in_ruleModel153 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleModel165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleDeclaration248 = new BitSet(new long[]{0x00000004040000C0L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleDeclaration269 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDeclaration281 = new BitSet(new long[]{0x000007FC042400D0L});
    public static final BitSet FOLLOW_ruleAssertion_in_ruleDeclaration304 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleAssertionQuantifiedBoolean_in_ruleDeclaration323 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDeclaration338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionOr_in_entryRuleAssertionOr374 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertionOr384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionAnd_in_ruleAssertionOr431 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleAssertionOr452 = new BitSet(new long[]{0x000007FC043400D0L});
    public static final BitSet FOLLOW_ruleAssertionAnd_in_ruleAssertionOr473 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleAssertionAnd_in_entryRuleAssertionAnd511 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertionAnd521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionHP_in_ruleAssertionAnd568 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleAssertionAnd589 = new BitSet(new long[]{0x000007FC043400D0L});
    public static final BitSet FOLLOW_ruleAssertionHP_in_ruleAssertionAnd610 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleAssertionHP_in_entryRuleAssertionHP648 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertionHP658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionForm_in_ruleAssertionHP711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionNot_in_ruleAssertionHP739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionBraced_in_ruleAssertionHP766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionBraced_in_entryRuleAssertionBraced801 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertionBraced811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleAssertionBraced848 = new BitSet(new long[]{0x000007FC043400D0L});
    public static final BitSet FOLLOW_ruleAssertionOr_in_ruleAssertionBraced869 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAssertionBraced881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionNot_in_entryRuleAssertionNot917 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertionNot927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleAssertionNot964 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAssertionNot976 = new BitSet(new long[]{0x000007FC043400D0L});
    public static final BitSet FOLLOW_ruleAssertionOr_in_ruleAssertionNot997 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAssertionNot1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionForm_in_entryRuleAssertionForm1045 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertionForm1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionStdCmp_in_ruleAssertionForm1108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionQuantifiedBoolean_in_ruleAssertionForm1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionBoolean_in_ruleAssertionForm1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionStdCmp_in_entryRuleAssertionStdCmp1198 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertionStdCmp1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertion_in_ruleAssertionStdCmp1254 = new BitSet(new long[]{0x0001F80000000000L});
    public static final BitSet FOLLOW_ruleRop_in_ruleAssertionStdCmp1275 = new BitSet(new long[]{0x000007E4042400D0L});
    public static final BitSet FOLLOW_ruleAssertion_in_ruleAssertionStdCmp1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertion_in_entryRuleAssertion1332 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertion1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionQuantifiedNumeric_in_ruleAssertion1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleAssertion1407 = new BitSet(new long[]{0x00000004040000C0L});
    public static final BitSet FOLLOW_ruleValues_in_ruleAssertion1428 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleAssertion1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAssertion1469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleAssertion1491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionBoolean_in_entryRuleAssertionBoolean1532 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertionBoolean1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_ruleAssertionBoolean1588 = new BitSet(new long[]{0x00000004048000C0L});
    public static final BitSet FOLLOW_23_in_ruleAssertionBoolean1602 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleAssertionBoolean1623 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleAssertionBoolean1637 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_ruleFunctionBoolean_in_ruleAssertionBoolean1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionQuantifiedBoolean_in_entryRuleAssertionQuantifiedBoolean1694 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertionQuantifiedBoolean1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolQuantifier_in_ruleAssertionQuantifiedBoolean1750 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAssertionQuantifiedBoolean1762 = new BitSet(new long[]{0x00000004040000C0L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleAssertionQuantifiedBoolean1783 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleAssertionQuantifiedBoolean1795 = new BitSet(new long[]{0x00000004040000C0L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleAssertionQuantifiedBoolean1816 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleAssertionQuantifiedBoolean1828 = new BitSet(new long[]{0x000007FC043400D0L});
    public static final BitSet FOLLOW_ruleAssertionOr_in_ruleAssertionQuantifiedBoolean1849 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAssertionQuantifiedBoolean1861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionQuantifiedNumeric_in_entryRuleAssertionQuantifiedNumeric1897 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertionQuantifiedNumeric1907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumbQuantifier_in_ruleAssertionQuantifiedNumeric1953 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAssertionQuantifiedNumeric1965 = new BitSet(new long[]{0x00000004040000C0L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleAssertionQuantifiedNumeric1986 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleAssertionQuantifiedNumeric1998 = new BitSet(new long[]{0x00000004040000C0L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleAssertionQuantifiedNumeric2019 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleAssertionQuantifiedNumeric2031 = new BitSet(new long[]{0x000007FC043400D0L});
    public static final BitSet FOLLOW_ruleAssertionOr_in_ruleAssertionQuantifiedNumeric2052 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAssertionQuantifiedNumeric2064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_entryRuleStep2100 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStep2110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleStep2148 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStep2165 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleStep2183 = new BitSet(new long[]{0x00000004040000E0L});
    public static final BitSet FOLLOW_rulePredicate_in_ruleStep2204 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleStep2216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleStep2246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicate_in_entryRulePredicate2282 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicate2292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePredicate2335 = new BitSet(new long[]{0x0001F80000000000L});
    public static final BitSet FOLLOW_ruleRop_in_rulePredicate2363 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rulePredicate2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringRop_in_rulePredicate2414 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePredicate2431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRop_in_rulePredicate2465 = new BitSet(new long[]{0x00000004040000C0L});
    public static final BitSet FOLLOW_ruleVariable_in_rulePredicate2486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rulePredicate2512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rulePredicate2544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction2580 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction2590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunction2632 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunction2649 = new BitSet(new long[]{0x00000004040800C0L});
    public static final BitSet FOLLOW_ruleValues_in_ruleFunction2670 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleFunction2683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionBoolean_in_entryRuleFunctionBoolean2719 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionBoolean2729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleFunctionBoolean2774 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_28_in_ruleFunctionBoolean2803 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_29_in_ruleFunctionBoolean2832 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionBoolean2860 = new BitSet(new long[]{0x00000004040800C0L});
    public static final BitSet FOLLOW_ruleValues_in_ruleFunctionBoolean2881 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleFunctionBoolean2894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression2930 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression2940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleExpression2986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition3020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition3030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition3077 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_30_in_ruleAddition3100 = new BitSet(new long[]{0x00000004040400C0L});
    public static final BitSet FOLLOW_31_in_ruleAddition3129 = new BitSet(new long[]{0x00000004040400C0L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition3152 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication3190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication3200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleMultiplication3247 = new BitSet(new long[]{0x0000000304000002L});
    public static final BitSet FOLLOW_32_in_ruleMultiplication3270 = new BitSet(new long[]{0x00000004040400C0L});
    public static final BitSet FOLLOW_26_in_ruleMultiplication3299 = new BitSet(new long[]{0x00000004040400C0L});
    public static final BitSet FOLLOW_33_in_ruleMultiplication3328 = new BitSet(new long[]{0x00000004040400C0L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleMultiplication3351 = new BitSet(new long[]{0x0000000304000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression3389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression3399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rulePrimaryExpression3446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rulePrimaryExpression3464 = new BitSet(new long[]{0x00000004040400C0L});
    public static final BitSet FOLLOW_ruleAddition_in_rulePrimaryExpression3486 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulePrimaryExpression3497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValues_in_entryRuleValues3534 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValues3544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_ruleValues3590 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleValues3603 = new BitSet(new long[]{0x00000004040000C0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleValues3624 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue3662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue3672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleValue3719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_ruleValue3746 = new BitSet(new long[]{0x00000004048000C2L});
    public static final BitSet FOLLOW_23_in_ruleValue3760 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleValue3781 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant3820 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstant3830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleConstant3872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConstant3900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable3942 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable3953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleVariable3991 = new BitSet(new long[]{0x000007E000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable4007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumbQuantifier_in_ruleVariable4040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolQuantifier_in_entryRuleBoolQuantifier4087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolQuantifier4098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleBoolQuantifier4136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleBoolQuantifier4155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumbQuantifier_in_entryRuleNumbQuantifier4196 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumbQuantifier4207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleNumbQuantifier4245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleNumbQuantifier4264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleNumbQuantifier4283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleNumbQuantifier4302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleNumbQuantifier4321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleNumbQuantifier4340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringRop_in_entryRuleStringRop4381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringRop4392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleStringRop4430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleStringRop4449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRop_in_entryRuleRop4490 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRop4501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringRop_in_ruleRop4548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleRop4572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleRop4591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleRop4610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleRop4629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionForm_in_synpred1_InternalXpt695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionStdCmp_in_synpred2_InternalXpt1092 = new BitSet(new long[]{0x0000000000000002L});

}