package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.IDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalIDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "TimesNewRoman", "Showpercentage", "Legendstyle", "Horizontal", "Lineheight", "SansSerif", "Showlegend", "Bgpattern", "Gridscale", "Showtitle", "Electric", "Maxwidth", "Position", "Showgrid", "Subtitle", "Vertical", "Verdana", "Bgcolor", "Bgimage", "Padding", "Gotham", "Bgsize", "Center", "Colors", "Orange", "Purple", "Yellow", "Arial", "Align", "Basic", "Black", "Bold", "Color", "Donut", "Green", "Label", "Right", "Title", "Value", "White", "DigitOneDigitZeroDigitZeroSpace", "DigitTwoDigitZeroDigitZeroSpace", "DigitThreeDigitZeroDigitZeroSpace", "DigitFourDigitZeroDigitZeroSpace", "DigitFiveDigitZeroDigitZeroSpace", "DigitSixDigitZeroDigitZeroSpace", "DigitSevenDigitZeroDigitZeroSpace", "DigitEightDigitZeroDigitZeroSpace", "DigitNineDigitZeroDigitZeroSpace", "Blue", "Data", "Font", "Foot", "Head", "Left", "Logo", "Pink", "Size", "Text", "Type", "Bin", "Off", "Pie", "Red", "Src", "DigitOne", "DigitTwo", "Colon", "N", "RULE_INT", "RULE_SIZE_POS", "RULE_COLOR_HEX", "RULE_COLOR_CHARTS", "RULE_PATTERN_DB", "RULE_FONT_SIZE", "RULE_BOXID", "RULE_TEXTID", "RULE_TITLETEXTID", "RULE_IMAGEID", "RULE_PIECHARTID", "RULE_BARCHARTID", "RULE_PICTUREGRAPHID", "RULE_BEGIN", "RULE_END", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Vertical=19;
    public static final int DigitTwo=70;
    public static final int RULE_PIECHARTID=83;
    public static final int Left=58;
    public static final int Size=61;
    public static final int RULE_BOXID=79;
    public static final int Black=34;
    public static final int Orange=28;
    public static final int Bgimage=22;
    public static final int RULE_COLOR_HEX=75;
    public static final int DigitOneDigitZeroDigitZeroSpace=44;
    public static final int Head=57;
    public static final int Align=32;
    public static final int RULE_ID=88;
    public static final int Showlegend=10;
    public static final int Position=16;
    public static final int RULE_PICTUREGRAPHID=85;
    public static final int Subtitle=18;
    public static final int RULE_TITLETEXTID=81;
    public static final int Colors=27;
    public static final int Yellow=30;
    public static final int RULE_IMAGEID=82;
    public static final int RULE_INT=73;
    public static final int RULE_ML_COMMENT=90;
    public static final int Right=40;
    public static final int Font=55;
    public static final int Off=65;
    public static final int N=72;
    public static final int RULE_FONT_SIZE=78;
    public static final int Showgrid=17;
    public static final int Center=26;
    public static final int Blue=53;
    public static final int Bgsize=25;
    public static final int Text=62;
    public static final int RULE_PATTERN_DB=77;
    public static final int Pie=66;
    public static final int RULE_COLOR_CHARTS=76;
    public static final int Red=67;
    public static final int Gridscale=12;
    public static final int Type=63;
    public static final int DigitTwoDigitZeroDigitZeroSpace=45;
    public static final int Maxwidth=15;
    public static final int Showtitle=13;
    public static final int RULE_BEGIN=86;
    public static final int Label=39;
    public static final int DigitThreeDigitZeroDigitZeroSpace=46;
    public static final int DigitSevenDigitZeroDigitZeroSpace=50;
    public static final int Lineheight=8;
    public static final int Bgpattern=11;
    public static final int Color=36;
    public static final int TimesNewRoman=4;
    public static final int Arial=31;
    public static final int Foot=56;
    public static final int DigitSixDigitZeroDigitZeroSpace=49;
    public static final int Pink=60;
    public static final int Value=42;
    public static final int Bold=35;
    public static final int Basic=33;
    public static final int RULE_END=87;
    public static final int Horizontal=7;
    public static final int Src=68;
    public static final int RULE_TEXTID=80;
    public static final int RULE_STRING=89;
    public static final int DigitFiveDigitZeroDigitZeroSpace=48;
    public static final int RULE_SL_COMMENT=91;
    public static final int Gotham=24;
    public static final int Verdana=20;
    public static final int DigitNineDigitZeroDigitZeroSpace=52;
    public static final int Padding=23;
    public static final int Bgcolor=21;
    public static final int DigitFourDigitZeroDigitZeroSpace=47;
    public static final int Colon=71;
    public static final int EOF=-1;
    public static final int SansSerif=9;
    public static final int RULE_WS=92;
    public static final int Bin=64;
    public static final int RULE_SIZE_POS=74;
    public static final int DigitOne=69;
    public static final int Electric=14;
    public static final int Title=41;
    public static final int Data=54;
    public static final int RULE_ANY_OTHER=93;
    public static final int Logo=59;
    public static final int Donut=37;
    public static final int Showpercentage=5;
    public static final int White=43;
    public static final int RULE_BARCHARTID=84;
    public static final int Purple=29;
    public static final int DigitEightDigitZeroDigitZeroSpace=51;
    public static final int Green=38;
    public static final int Legendstyle=6;

    // delegates
    // delegators


        public InternalIDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalIDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalIDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalIDSLParser.g"; }



     	private IDSLGrammarAccess grammarAccess;

        public InternalIDSLParser(TokenStream input, IDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Infographic";
       	}

       	@Override
       	protected IDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleInfographic"
    // InternalIDSLParser.g:58:1: entryRuleInfographic returns [EObject current=null] : iv_ruleInfographic= ruleInfographic EOF ;
    public final EObject entryRuleInfographic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfographic = null;


        try {
            // InternalIDSLParser.g:58:52: (iv_ruleInfographic= ruleInfographic EOF )
            // InternalIDSLParser.g:59:2: iv_ruleInfographic= ruleInfographic EOF
            {
             newCompositeNode(grammarAccess.getInfographicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInfographic=ruleInfographic();

            state._fsp--;

             current =iv_ruleInfographic; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInfographic"


    // $ANTLR start "ruleInfographic"
    // InternalIDSLParser.g:65:1: ruleInfographic returns [EObject current=null] : this_InfographicElementType_0= ruleInfographicElementType ;
    public final EObject ruleInfographic() throws RecognitionException {
        EObject current = null;

        EObject this_InfographicElementType_0 = null;



        	enterRule();

        try {
            // InternalIDSLParser.g:71:2: (this_InfographicElementType_0= ruleInfographicElementType )
            // InternalIDSLParser.g:72:2: this_InfographicElementType_0= ruleInfographicElementType
            {

            		newCompositeNode(grammarAccess.getInfographicAccess().getInfographicElementTypeParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_InfographicElementType_0=ruleInfographicElementType();

            state._fsp--;


            		current = this_InfographicElementType_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleInfographic"


    // $ANTLR start "entryRuleInfographicElementType"
    // InternalIDSLParser.g:83:1: entryRuleInfographicElementType returns [EObject current=null] : iv_ruleInfographicElementType= ruleInfographicElementType EOF ;
    public final EObject entryRuleInfographicElementType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfographicElementType = null;


        try {
            // InternalIDSLParser.g:83:63: (iv_ruleInfographicElementType= ruleInfographicElementType EOF )
            // InternalIDSLParser.g:84:2: iv_ruleInfographicElementType= ruleInfographicElementType EOF
            {
             newCompositeNode(grammarAccess.getInfographicElementTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInfographicElementType=ruleInfographicElementType();

            state._fsp--;

             current =iv_ruleInfographicElementType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInfographicElementType"


    // $ANTLR start "ruleInfographicElementType"
    // InternalIDSLParser.g:90:1: ruleInfographicElementType returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type otherlv_2= Colon ( (lv_type_3_0= Basic ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_bgcolor_6_0= ruleColor ) ) ) | (otherlv_7= Bgpattern otherlv_8= Colon ( (lv_bgpattern_9_0= rulePattern ) ) ) | (otherlv_10= Bgimage otherlv_11= Colon ( (lv_bgimage_12_0= ruleImageSrc ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Bgsize otherlv_14= Colon ( (lv_bgsize_15_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_head_16_0= ruleHead ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_boxes_17_0= ruleBox ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_texts_18_0= ruleText ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_images_19_0= ruleImage ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_piecharts_20_0= rulePiechart ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_barcharts_21_0= ruleBarchart ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_picturegraphs_22_0= rulePicturegraph ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_foot_23_0= ruleFoot ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleInfographicElementType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_type_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_bgsize_15_0=null;
        EObject lv_bgcolor_6_0 = null;

        AntlrDatatypeRuleToken lv_bgpattern_9_0 = null;

        AntlrDatatypeRuleToken lv_bgimage_12_0 = null;

        EObject lv_head_16_0 = null;

        EObject lv_boxes_17_0 = null;

        EObject lv_texts_18_0 = null;

        EObject lv_images_19_0 = null;

        EObject lv_piecharts_20_0 = null;

        EObject lv_barcharts_21_0 = null;

        EObject lv_picturegraphs_22_0 = null;

        EObject lv_foot_23_0 = null;



        	enterRule();

        try {
            // InternalIDSLParser.g:96:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type otherlv_2= Colon ( (lv_type_3_0= Basic ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_bgcolor_6_0= ruleColor ) ) ) | (otherlv_7= Bgpattern otherlv_8= Colon ( (lv_bgpattern_9_0= rulePattern ) ) ) | (otherlv_10= Bgimage otherlv_11= Colon ( (lv_bgimage_12_0= ruleImageSrc ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Bgsize otherlv_14= Colon ( (lv_bgsize_15_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_head_16_0= ruleHead ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_boxes_17_0= ruleBox ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_texts_18_0= ruleText ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_images_19_0= ruleImage ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_piecharts_20_0= rulePiechart ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_barcharts_21_0= ruleBarchart ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_picturegraphs_22_0= rulePicturegraph ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_foot_23_0= ruleFoot ) ) ) ) ) )+ {...}?) ) ) )
            // InternalIDSLParser.g:97:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type otherlv_2= Colon ( (lv_type_3_0= Basic ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_bgcolor_6_0= ruleColor ) ) ) | (otherlv_7= Bgpattern otherlv_8= Colon ( (lv_bgpattern_9_0= rulePattern ) ) ) | (otherlv_10= Bgimage otherlv_11= Colon ( (lv_bgimage_12_0= ruleImageSrc ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Bgsize otherlv_14= Colon ( (lv_bgsize_15_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_head_16_0= ruleHead ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_boxes_17_0= ruleBox ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_texts_18_0= ruleText ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_images_19_0= ruleImage ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_piecharts_20_0= rulePiechart ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_barcharts_21_0= ruleBarchart ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_picturegraphs_22_0= rulePicturegraph ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_foot_23_0= ruleFoot ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalIDSLParser.g:97:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type otherlv_2= Colon ( (lv_type_3_0= Basic ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_bgcolor_6_0= ruleColor ) ) ) | (otherlv_7= Bgpattern otherlv_8= Colon ( (lv_bgpattern_9_0= rulePattern ) ) ) | (otherlv_10= Bgimage otherlv_11= Colon ( (lv_bgimage_12_0= ruleImageSrc ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Bgsize otherlv_14= Colon ( (lv_bgsize_15_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_head_16_0= ruleHead ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_boxes_17_0= ruleBox ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_texts_18_0= ruleText ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_images_19_0= ruleImage ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_piecharts_20_0= rulePiechart ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_barcharts_21_0= ruleBarchart ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_picturegraphs_22_0= rulePicturegraph ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_foot_23_0= ruleFoot ) ) ) ) ) )+ {...}?) ) )
            // InternalIDSLParser.g:98:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type otherlv_2= Colon ( (lv_type_3_0= Basic ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_bgcolor_6_0= ruleColor ) ) ) | (otherlv_7= Bgpattern otherlv_8= Colon ( (lv_bgpattern_9_0= rulePattern ) ) ) | (otherlv_10= Bgimage otherlv_11= Colon ( (lv_bgimage_12_0= ruleImageSrc ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Bgsize otherlv_14= Colon ( (lv_bgsize_15_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_head_16_0= ruleHead ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_boxes_17_0= ruleBox ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_texts_18_0= ruleText ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_images_19_0= ruleImage ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_piecharts_20_0= rulePiechart ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_barcharts_21_0= ruleBarchart ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_picturegraphs_22_0= rulePicturegraph ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_foot_23_0= ruleFoot ) ) ) ) ) )+ {...}?) )
            {
            // InternalIDSLParser.g:98:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type otherlv_2= Colon ( (lv_type_3_0= Basic ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_bgcolor_6_0= ruleColor ) ) ) | (otherlv_7= Bgpattern otherlv_8= Colon ( (lv_bgpattern_9_0= rulePattern ) ) ) | (otherlv_10= Bgimage otherlv_11= Colon ( (lv_bgimage_12_0= ruleImageSrc ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Bgsize otherlv_14= Colon ( (lv_bgsize_15_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_head_16_0= ruleHead ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_boxes_17_0= ruleBox ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_texts_18_0= ruleText ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_images_19_0= ruleImage ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_piecharts_20_0= rulePiechart ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_barcharts_21_0= ruleBarchart ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_picturegraphs_22_0= rulePicturegraph ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_foot_23_0= ruleFoot ) ) ) ) ) )+ {...}?) )
            // InternalIDSLParser.g:99:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Type otherlv_2= Colon ( (lv_type_3_0= Basic ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_bgcolor_6_0= ruleColor ) ) ) | (otherlv_7= Bgpattern otherlv_8= Colon ( (lv_bgpattern_9_0= rulePattern ) ) ) | (otherlv_10= Bgimage otherlv_11= Colon ( (lv_bgimage_12_0= ruleImageSrc ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Bgsize otherlv_14= Colon ( (lv_bgsize_15_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_head_16_0= ruleHead ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_boxes_17_0= ruleBox ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_texts_18_0= ruleText ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_images_19_0= ruleImage ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_piecharts_20_0= rulePiechart ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_barcharts_21_0= ruleBarchart ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_picturegraphs_22_0= rulePicturegraph ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_foot_23_0= ruleFoot ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getInfographicElementTypeAccess().getUnorderedGroup());
            			
            // InternalIDSLParser.g:102:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Type otherlv_2= Colon ( (lv_type_3_0= Basic ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_bgcolor_6_0= ruleColor ) ) ) | (otherlv_7= Bgpattern otherlv_8= Colon ( (lv_bgpattern_9_0= rulePattern ) ) ) | (otherlv_10= Bgimage otherlv_11= Colon ( (lv_bgimage_12_0= ruleImageSrc ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Bgsize otherlv_14= Colon ( (lv_bgsize_15_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_head_16_0= ruleHead ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_boxes_17_0= ruleBox ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_texts_18_0= ruleText ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_images_19_0= ruleImage ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_piecharts_20_0= rulePiechart ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_barcharts_21_0= ruleBarchart ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_picturegraphs_22_0= rulePicturegraph ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_foot_23_0= ruleFoot ) ) ) ) ) )+ {...}?)
            // InternalIDSLParser.g:103:5: ( ({...}? => ( ({...}? => (otherlv_1= Type otherlv_2= Colon ( (lv_type_3_0= Basic ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_bgcolor_6_0= ruleColor ) ) ) | (otherlv_7= Bgpattern otherlv_8= Colon ( (lv_bgpattern_9_0= rulePattern ) ) ) | (otherlv_10= Bgimage otherlv_11= Colon ( (lv_bgimage_12_0= ruleImageSrc ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Bgsize otherlv_14= Colon ( (lv_bgsize_15_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_head_16_0= ruleHead ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_boxes_17_0= ruleBox ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_texts_18_0= ruleText ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_images_19_0= ruleImage ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_piecharts_20_0= rulePiechart ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_barcharts_21_0= ruleBarchart ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_picturegraphs_22_0= rulePicturegraph ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_foot_23_0= ruleFoot ) ) ) ) ) )+ {...}?
            {
            // InternalIDSLParser.g:103:5: ( ({...}? => ( ({...}? => (otherlv_1= Type otherlv_2= Colon ( (lv_type_3_0= Basic ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_bgcolor_6_0= ruleColor ) ) ) | (otherlv_7= Bgpattern otherlv_8= Colon ( (lv_bgpattern_9_0= rulePattern ) ) ) | (otherlv_10= Bgimage otherlv_11= Colon ( (lv_bgimage_12_0= ruleImageSrc ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Bgsize otherlv_14= Colon ( (lv_bgsize_15_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_head_16_0= ruleHead ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_boxes_17_0= ruleBox ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_texts_18_0= ruleText ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_images_19_0= ruleImage ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_piecharts_20_0= rulePiechart ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_barcharts_21_0= ruleBarchart ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_picturegraphs_22_0= rulePicturegraph ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_foot_23_0= ruleFoot ) ) ) ) ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=12;
                alt8 = dfa8.predict(input);
                switch (alt8) {
            	case 1 :
            	    // InternalIDSLParser.g:104:3: ({...}? => ( ({...}? => (otherlv_1= Type otherlv_2= Colon ( (lv_type_3_0= Basic ) ) ) ) ) )
            	    {
            	    // InternalIDSLParser.g:104:3: ({...}? => ( ({...}? => (otherlv_1= Type otherlv_2= Colon ( (lv_type_3_0= Basic ) ) ) ) ) )
            	    // InternalIDSLParser.g:105:4: {...}? => ( ({...}? => (otherlv_1= Type otherlv_2= Colon ( (lv_type_3_0= Basic ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInfographicElementTypeAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleInfographicElementType", "getUnorderedGroupHelper().canSelect(grammarAccess.getInfographicElementTypeAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalIDSLParser.g:105:116: ( ({...}? => (otherlv_1= Type otherlv_2= Colon ( (lv_type_3_0= Basic ) ) ) ) )
            	    // InternalIDSLParser.g:106:5: ({...}? => (otherlv_1= Type otherlv_2= Colon ( (lv_type_3_0= Basic ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getInfographicElementTypeAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalIDSLParser.g:109:8: ({...}? => (otherlv_1= Type otherlv_2= Colon ( (lv_type_3_0= Basic ) ) ) )
            	    // InternalIDSLParser.g:109:9: {...}? => (otherlv_1= Type otherlv_2= Colon ( (lv_type_3_0= Basic ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInfographicElementType", "true");
            	    }
            	    // InternalIDSLParser.g:109:18: (otherlv_1= Type otherlv_2= Colon ( (lv_type_3_0= Basic ) ) )
            	    // InternalIDSLParser.g:109:19: otherlv_1= Type otherlv_2= Colon ( (lv_type_3_0= Basic ) )
            	    {
            	    otherlv_1=(Token)match(input,Type,FOLLOW_3); 

            	    								newLeafNode(otherlv_1, grammarAccess.getInfographicElementTypeAccess().getTypeKeyword_0_0());
            	    							
            	    otherlv_2=(Token)match(input,Colon,FOLLOW_4); 

            	    								newLeafNode(otherlv_2, grammarAccess.getInfographicElementTypeAccess().getColonKeyword_0_1());
            	    							
            	    // InternalIDSLParser.g:117:8: ( (lv_type_3_0= Basic ) )
            	    // InternalIDSLParser.g:118:9: (lv_type_3_0= Basic )
            	    {
            	    // InternalIDSLParser.g:118:9: (lv_type_3_0= Basic )
            	    // InternalIDSLParser.g:119:10: lv_type_3_0= Basic
            	    {
            	    lv_type_3_0=(Token)match(input,Basic,FOLLOW_5); 

            	    										newLeafNode(lv_type_3_0, grammarAccess.getInfographicElementTypeAccess().getTypeBasicKeyword_0_2_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getInfographicElementTypeRule());
            	    										}
            	    										setWithLastConsumed(current, "type", lv_type_3_0, "basic");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInfographicElementTypeAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalIDSLParser.g:137:3: ({...}? => ( ({...}? => ( (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_bgcolor_6_0= ruleColor ) ) ) | (otherlv_7= Bgpattern otherlv_8= Colon ( (lv_bgpattern_9_0= rulePattern ) ) ) | (otherlv_10= Bgimage otherlv_11= Colon ( (lv_bgimage_12_0= ruleImageSrc ) ) ) ) ) ) )
            	    {
            	    // InternalIDSLParser.g:137:3: ({...}? => ( ({...}? => ( (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_bgcolor_6_0= ruleColor ) ) ) | (otherlv_7= Bgpattern otherlv_8= Colon ( (lv_bgpattern_9_0= rulePattern ) ) ) | (otherlv_10= Bgimage otherlv_11= Colon ( (lv_bgimage_12_0= ruleImageSrc ) ) ) ) ) ) )
            	    // InternalIDSLParser.g:138:4: {...}? => ( ({...}? => ( (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_bgcolor_6_0= ruleColor ) ) ) | (otherlv_7= Bgpattern otherlv_8= Colon ( (lv_bgpattern_9_0= rulePattern ) ) ) | (otherlv_10= Bgimage otherlv_11= Colon ( (lv_bgimage_12_0= ruleImageSrc ) ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInfographicElementTypeAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleInfographicElementType", "getUnorderedGroupHelper().canSelect(grammarAccess.getInfographicElementTypeAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalIDSLParser.g:138:116: ( ({...}? => ( (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_bgcolor_6_0= ruleColor ) ) ) | (otherlv_7= Bgpattern otherlv_8= Colon ( (lv_bgpattern_9_0= rulePattern ) ) ) | (otherlv_10= Bgimage otherlv_11= Colon ( (lv_bgimage_12_0= ruleImageSrc ) ) ) ) ) )
            	    // InternalIDSLParser.g:139:5: ({...}? => ( (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_bgcolor_6_0= ruleColor ) ) ) | (otherlv_7= Bgpattern otherlv_8= Colon ( (lv_bgpattern_9_0= rulePattern ) ) ) | (otherlv_10= Bgimage otherlv_11= Colon ( (lv_bgimage_12_0= ruleImageSrc ) ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getInfographicElementTypeAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalIDSLParser.g:142:8: ({...}? => ( (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_bgcolor_6_0= ruleColor ) ) ) | (otherlv_7= Bgpattern otherlv_8= Colon ( (lv_bgpattern_9_0= rulePattern ) ) ) | (otherlv_10= Bgimage otherlv_11= Colon ( (lv_bgimage_12_0= ruleImageSrc ) ) ) ) )
            	    // InternalIDSLParser.g:142:9: {...}? => ( (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_bgcolor_6_0= ruleColor ) ) ) | (otherlv_7= Bgpattern otherlv_8= Colon ( (lv_bgpattern_9_0= rulePattern ) ) ) | (otherlv_10= Bgimage otherlv_11= Colon ( (lv_bgimage_12_0= ruleImageSrc ) ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInfographicElementType", "true");
            	    }
            	    // InternalIDSLParser.g:142:18: ( (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_bgcolor_6_0= ruleColor ) ) ) | (otherlv_7= Bgpattern otherlv_8= Colon ( (lv_bgpattern_9_0= rulePattern ) ) ) | (otherlv_10= Bgimage otherlv_11= Colon ( (lv_bgimage_12_0= ruleImageSrc ) ) ) )
            	    int alt1=3;
            	    switch ( input.LA(1) ) {
            	    case Bgcolor:
            	        {
            	        alt1=1;
            	        }
            	        break;
            	    case Bgpattern:
            	        {
            	        alt1=2;
            	        }
            	        break;
            	    case Bgimage:
            	        {
            	        alt1=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 1, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt1) {
            	        case 1 :
            	            // InternalIDSLParser.g:142:19: (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_bgcolor_6_0= ruleColor ) ) )
            	            {
            	            // InternalIDSLParser.g:142:19: (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_bgcolor_6_0= ruleColor ) ) )
            	            // InternalIDSLParser.g:143:9: otherlv_4= Bgcolor otherlv_5= Colon ( (lv_bgcolor_6_0= ruleColor ) )
            	            {
            	            otherlv_4=(Token)match(input,Bgcolor,FOLLOW_3); 

            	            									newLeafNode(otherlv_4, grammarAccess.getInfographicElementTypeAccess().getBgcolorKeyword_1_0_0());
            	            								
            	            otherlv_5=(Token)match(input,Colon,FOLLOW_6); 

            	            									newLeafNode(otherlv_5, grammarAccess.getInfographicElementTypeAccess().getColonKeyword_1_0_1());
            	            								
            	            // InternalIDSLParser.g:151:9: ( (lv_bgcolor_6_0= ruleColor ) )
            	            // InternalIDSLParser.g:152:10: (lv_bgcolor_6_0= ruleColor )
            	            {
            	            // InternalIDSLParser.g:152:10: (lv_bgcolor_6_0= ruleColor )
            	            // InternalIDSLParser.g:153:11: lv_bgcolor_6_0= ruleColor
            	            {

            	            											newCompositeNode(grammarAccess.getInfographicElementTypeAccess().getBgcolorColorParserRuleCall_1_0_2_0());
            	            										
            	            pushFollow(FOLLOW_5);
            	            lv_bgcolor_6_0=ruleColor();

            	            state._fsp--;


            	            											if (current==null) {
            	            												current = createModelElementForParent(grammarAccess.getInfographicElementTypeRule());
            	            											}
            	            											set(
            	            												current,
            	            												"bgcolor",
            	            												lv_bgcolor_6_0,
            	            												"org.xtext.example.mydsl.IDSL.Color");
            	            											afterParserOrEnumRuleCall();
            	            										

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalIDSLParser.g:172:8: (otherlv_7= Bgpattern otherlv_8= Colon ( (lv_bgpattern_9_0= rulePattern ) ) )
            	            {
            	            // InternalIDSLParser.g:172:8: (otherlv_7= Bgpattern otherlv_8= Colon ( (lv_bgpattern_9_0= rulePattern ) ) )
            	            // InternalIDSLParser.g:173:9: otherlv_7= Bgpattern otherlv_8= Colon ( (lv_bgpattern_9_0= rulePattern ) )
            	            {
            	            otherlv_7=(Token)match(input,Bgpattern,FOLLOW_3); 

            	            									newLeafNode(otherlv_7, grammarAccess.getInfographicElementTypeAccess().getBgpatternKeyword_1_1_0());
            	            								
            	            otherlv_8=(Token)match(input,Colon,FOLLOW_7); 

            	            									newLeafNode(otherlv_8, grammarAccess.getInfographicElementTypeAccess().getColonKeyword_1_1_1());
            	            								
            	            // InternalIDSLParser.g:181:9: ( (lv_bgpattern_9_0= rulePattern ) )
            	            // InternalIDSLParser.g:182:10: (lv_bgpattern_9_0= rulePattern )
            	            {
            	            // InternalIDSLParser.g:182:10: (lv_bgpattern_9_0= rulePattern )
            	            // InternalIDSLParser.g:183:11: lv_bgpattern_9_0= rulePattern
            	            {

            	            											newCompositeNode(grammarAccess.getInfographicElementTypeAccess().getBgpatternPatternParserRuleCall_1_1_2_0());
            	            										
            	            pushFollow(FOLLOW_5);
            	            lv_bgpattern_9_0=rulePattern();

            	            state._fsp--;


            	            											if (current==null) {
            	            												current = createModelElementForParent(grammarAccess.getInfographicElementTypeRule());
            	            											}
            	            											set(
            	            												current,
            	            												"bgpattern",
            	            												lv_bgpattern_9_0,
            	            												"org.xtext.example.mydsl.IDSL.Pattern");
            	            											afterParserOrEnumRuleCall();
            	            										

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalIDSLParser.g:202:8: (otherlv_10= Bgimage otherlv_11= Colon ( (lv_bgimage_12_0= ruleImageSrc ) ) )
            	            {
            	            // InternalIDSLParser.g:202:8: (otherlv_10= Bgimage otherlv_11= Colon ( (lv_bgimage_12_0= ruleImageSrc ) ) )
            	            // InternalIDSLParser.g:203:9: otherlv_10= Bgimage otherlv_11= Colon ( (lv_bgimage_12_0= ruleImageSrc ) )
            	            {
            	            otherlv_10=(Token)match(input,Bgimage,FOLLOW_3); 

            	            									newLeafNode(otherlv_10, grammarAccess.getInfographicElementTypeAccess().getBgimageKeyword_1_2_0());
            	            								
            	            otherlv_11=(Token)match(input,Colon,FOLLOW_8); 

            	            									newLeafNode(otherlv_11, grammarAccess.getInfographicElementTypeAccess().getColonKeyword_1_2_1());
            	            								
            	            // InternalIDSLParser.g:211:9: ( (lv_bgimage_12_0= ruleImageSrc ) )
            	            // InternalIDSLParser.g:212:10: (lv_bgimage_12_0= ruleImageSrc )
            	            {
            	            // InternalIDSLParser.g:212:10: (lv_bgimage_12_0= ruleImageSrc )
            	            // InternalIDSLParser.g:213:11: lv_bgimage_12_0= ruleImageSrc
            	            {

            	            											newCompositeNode(grammarAccess.getInfographicElementTypeAccess().getBgimageImageSrcParserRuleCall_1_2_2_0());
            	            										
            	            pushFollow(FOLLOW_5);
            	            lv_bgimage_12_0=ruleImageSrc();

            	            state._fsp--;


            	            											if (current==null) {
            	            												current = createModelElementForParent(grammarAccess.getInfographicElementTypeRule());
            	            											}
            	            											set(
            	            												current,
            	            												"bgimage",
            	            												lv_bgimage_12_0,
            	            												"org.xtext.example.mydsl.IDSL.ImageSrc");
            	            											afterParserOrEnumRuleCall();
            	            										

            	            }


            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInfographicElementTypeAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalIDSLParser.g:237:3: ({...}? => ( ({...}? => (otherlv_13= Bgsize otherlv_14= Colon ( (lv_bgsize_15_0= RULE_SIZE_POS ) ) ) ) ) )
            	    {
            	    // InternalIDSLParser.g:237:3: ({...}? => ( ({...}? => (otherlv_13= Bgsize otherlv_14= Colon ( (lv_bgsize_15_0= RULE_SIZE_POS ) ) ) ) ) )
            	    // InternalIDSLParser.g:238:4: {...}? => ( ({...}? => (otherlv_13= Bgsize otherlv_14= Colon ( (lv_bgsize_15_0= RULE_SIZE_POS ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInfographicElementTypeAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleInfographicElementType", "getUnorderedGroupHelper().canSelect(grammarAccess.getInfographicElementTypeAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalIDSLParser.g:238:116: ( ({...}? => (otherlv_13= Bgsize otherlv_14= Colon ( (lv_bgsize_15_0= RULE_SIZE_POS ) ) ) ) )
            	    // InternalIDSLParser.g:239:5: ({...}? => (otherlv_13= Bgsize otherlv_14= Colon ( (lv_bgsize_15_0= RULE_SIZE_POS ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getInfographicElementTypeAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalIDSLParser.g:242:8: ({...}? => (otherlv_13= Bgsize otherlv_14= Colon ( (lv_bgsize_15_0= RULE_SIZE_POS ) ) ) )
            	    // InternalIDSLParser.g:242:9: {...}? => (otherlv_13= Bgsize otherlv_14= Colon ( (lv_bgsize_15_0= RULE_SIZE_POS ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInfographicElementType", "true");
            	    }
            	    // InternalIDSLParser.g:242:18: (otherlv_13= Bgsize otherlv_14= Colon ( (lv_bgsize_15_0= RULE_SIZE_POS ) ) )
            	    // InternalIDSLParser.g:242:19: otherlv_13= Bgsize otherlv_14= Colon ( (lv_bgsize_15_0= RULE_SIZE_POS ) )
            	    {
            	    otherlv_13=(Token)match(input,Bgsize,FOLLOW_3); 

            	    								newLeafNode(otherlv_13, grammarAccess.getInfographicElementTypeAccess().getBgsizeKeyword_2_0());
            	    							
            	    otherlv_14=(Token)match(input,Colon,FOLLOW_9); 

            	    								newLeafNode(otherlv_14, grammarAccess.getInfographicElementTypeAccess().getColonKeyword_2_1());
            	    							
            	    // InternalIDSLParser.g:250:8: ( (lv_bgsize_15_0= RULE_SIZE_POS ) )
            	    // InternalIDSLParser.g:251:9: (lv_bgsize_15_0= RULE_SIZE_POS )
            	    {
            	    // InternalIDSLParser.g:251:9: (lv_bgsize_15_0= RULE_SIZE_POS )
            	    // InternalIDSLParser.g:252:10: lv_bgsize_15_0= RULE_SIZE_POS
            	    {
            	    lv_bgsize_15_0=(Token)match(input,RULE_SIZE_POS,FOLLOW_5); 

            	    										newLeafNode(lv_bgsize_15_0, grammarAccess.getInfographicElementTypeAccess().getBgsizeSIZE_POSTerminalRuleCall_2_2_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getInfographicElementTypeRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"bgsize",
            	    											lv_bgsize_15_0,
            	    											"org.xtext.example.mydsl.IDSL.SIZE_POS");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInfographicElementTypeAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalIDSLParser.g:274:3: ({...}? => ( ({...}? => ( (lv_head_16_0= ruleHead ) ) ) ) )
            	    {
            	    // InternalIDSLParser.g:274:3: ({...}? => ( ({...}? => ( (lv_head_16_0= ruleHead ) ) ) ) )
            	    // InternalIDSLParser.g:275:4: {...}? => ( ({...}? => ( (lv_head_16_0= ruleHead ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInfographicElementTypeAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleInfographicElementType", "getUnorderedGroupHelper().canSelect(grammarAccess.getInfographicElementTypeAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalIDSLParser.g:275:116: ( ({...}? => ( (lv_head_16_0= ruleHead ) ) ) )
            	    // InternalIDSLParser.g:276:5: ({...}? => ( (lv_head_16_0= ruleHead ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getInfographicElementTypeAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalIDSLParser.g:279:8: ({...}? => ( (lv_head_16_0= ruleHead ) ) )
            	    // InternalIDSLParser.g:279:9: {...}? => ( (lv_head_16_0= ruleHead ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInfographicElementType", "true");
            	    }
            	    // InternalIDSLParser.g:279:18: ( (lv_head_16_0= ruleHead ) )
            	    // InternalIDSLParser.g:279:19: (lv_head_16_0= ruleHead )
            	    {
            	    // InternalIDSLParser.g:279:19: (lv_head_16_0= ruleHead )
            	    // InternalIDSLParser.g:280:9: lv_head_16_0= ruleHead
            	    {

            	    									newCompositeNode(grammarAccess.getInfographicElementTypeAccess().getHeadHeadParserRuleCall_3_0());
            	    								
            	    pushFollow(FOLLOW_5);
            	    lv_head_16_0=ruleHead();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getInfographicElementTypeRule());
            	    									}
            	    									set(
            	    										current,
            	    										"head",
            	    										lv_head_16_0,
            	    										"org.xtext.example.mydsl.IDSL.Head");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInfographicElementTypeAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalIDSLParser.g:302:3: ({...}? => ( ({...}? => ( (lv_boxes_17_0= ruleBox ) ) )+ ) )
            	    {
            	    // InternalIDSLParser.g:302:3: ({...}? => ( ({...}? => ( (lv_boxes_17_0= ruleBox ) ) )+ ) )
            	    // InternalIDSLParser.g:303:4: {...}? => ( ({...}? => ( (lv_boxes_17_0= ruleBox ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInfographicElementTypeAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleInfographicElementType", "getUnorderedGroupHelper().canSelect(grammarAccess.getInfographicElementTypeAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalIDSLParser.g:303:116: ( ({...}? => ( (lv_boxes_17_0= ruleBox ) ) )+ )
            	    // InternalIDSLParser.g:304:5: ({...}? => ( (lv_boxes_17_0= ruleBox ) ) )+
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getInfographicElementTypeAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalIDSLParser.g:307:8: ({...}? => ( (lv_boxes_17_0= ruleBox ) ) )+
            	    int cnt2=0;
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==RULE_BOXID) ) {
            	            int LA2_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt2=1;
            	            }


            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalIDSLParser.g:307:9: {...}? => ( (lv_boxes_17_0= ruleBox ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleInfographicElementType", "true");
            	    	    }
            	    	    // InternalIDSLParser.g:307:18: ( (lv_boxes_17_0= ruleBox ) )
            	    	    // InternalIDSLParser.g:307:19: (lv_boxes_17_0= ruleBox )
            	    	    {
            	    	    // InternalIDSLParser.g:307:19: (lv_boxes_17_0= ruleBox )
            	    	    // InternalIDSLParser.g:308:9: lv_boxes_17_0= ruleBox
            	    	    {

            	    	    									newCompositeNode(grammarAccess.getInfographicElementTypeAccess().getBoxesBoxParserRuleCall_4_0());
            	    	    								
            	    	    pushFollow(FOLLOW_5);
            	    	    lv_boxes_17_0=ruleBox();

            	    	    state._fsp--;


            	    	    									if (current==null) {
            	    	    										current = createModelElementForParent(grammarAccess.getInfographicElementTypeRule());
            	    	    									}
            	    	    									add(
            	    	    										current,
            	    	    										"boxes",
            	    	    										lv_boxes_17_0,
            	    	    										"org.xtext.example.mydsl.IDSL.Box");
            	    	    									afterParserOrEnumRuleCall();
            	    	    								

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt2 >= 1 ) break loop2;
            	                EarlyExitException eee =
            	                    new EarlyExitException(2, input);
            	                throw eee;
            	        }
            	        cnt2++;
            	    } while (true);

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInfographicElementTypeAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalIDSLParser.g:330:3: ({...}? => ( ({...}? => ( (lv_texts_18_0= ruleText ) ) )+ ) )
            	    {
            	    // InternalIDSLParser.g:330:3: ({...}? => ( ({...}? => ( (lv_texts_18_0= ruleText ) ) )+ ) )
            	    // InternalIDSLParser.g:331:4: {...}? => ( ({...}? => ( (lv_texts_18_0= ruleText ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInfographicElementTypeAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleInfographicElementType", "getUnorderedGroupHelper().canSelect(grammarAccess.getInfographicElementTypeAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalIDSLParser.g:331:116: ( ({...}? => ( (lv_texts_18_0= ruleText ) ) )+ )
            	    // InternalIDSLParser.g:332:5: ({...}? => ( (lv_texts_18_0= ruleText ) ) )+
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getInfographicElementTypeAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalIDSLParser.g:335:8: ({...}? => ( (lv_texts_18_0= ruleText ) ) )+
            	    int cnt3=0;
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==RULE_TEXTID) ) {
            	            int LA3_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt3=1;
            	            }


            	        }
            	        else if ( (LA3_0==RULE_TITLETEXTID) ) {
            	            int LA3_3 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt3=1;
            	            }


            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalIDSLParser.g:335:9: {...}? => ( (lv_texts_18_0= ruleText ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleInfographicElementType", "true");
            	    	    }
            	    	    // InternalIDSLParser.g:335:18: ( (lv_texts_18_0= ruleText ) )
            	    	    // InternalIDSLParser.g:335:19: (lv_texts_18_0= ruleText )
            	    	    {
            	    	    // InternalIDSLParser.g:335:19: (lv_texts_18_0= ruleText )
            	    	    // InternalIDSLParser.g:336:9: lv_texts_18_0= ruleText
            	    	    {

            	    	    									newCompositeNode(grammarAccess.getInfographicElementTypeAccess().getTextsTextParserRuleCall_5_0());
            	    	    								
            	    	    pushFollow(FOLLOW_5);
            	    	    lv_texts_18_0=ruleText();

            	    	    state._fsp--;


            	    	    									if (current==null) {
            	    	    										current = createModelElementForParent(grammarAccess.getInfographicElementTypeRule());
            	    	    									}
            	    	    									add(
            	    	    										current,
            	    	    										"texts",
            	    	    										lv_texts_18_0,
            	    	    										"org.xtext.example.mydsl.IDSL.Text");
            	    	    									afterParserOrEnumRuleCall();
            	    	    								

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt3 >= 1 ) break loop3;
            	                EarlyExitException eee =
            	                    new EarlyExitException(3, input);
            	                throw eee;
            	        }
            	        cnt3++;
            	    } while (true);

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInfographicElementTypeAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalIDSLParser.g:358:3: ({...}? => ( ({...}? => ( (lv_images_19_0= ruleImage ) ) )+ ) )
            	    {
            	    // InternalIDSLParser.g:358:3: ({...}? => ( ({...}? => ( (lv_images_19_0= ruleImage ) ) )+ ) )
            	    // InternalIDSLParser.g:359:4: {...}? => ( ({...}? => ( (lv_images_19_0= ruleImage ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInfographicElementTypeAccess().getUnorderedGroup(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleInfographicElementType", "getUnorderedGroupHelper().canSelect(grammarAccess.getInfographicElementTypeAccess().getUnorderedGroup(), 6)");
            	    }
            	    // InternalIDSLParser.g:359:116: ( ({...}? => ( (lv_images_19_0= ruleImage ) ) )+ )
            	    // InternalIDSLParser.g:360:5: ({...}? => ( (lv_images_19_0= ruleImage ) ) )+
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getInfographicElementTypeAccess().getUnorderedGroup(), 6);
            	    				
            	    // InternalIDSLParser.g:363:8: ({...}? => ( (lv_images_19_0= ruleImage ) ) )+
            	    int cnt4=0;
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==RULE_IMAGEID) ) {
            	            int LA4_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt4=1;
            	            }


            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // InternalIDSLParser.g:363:9: {...}? => ( (lv_images_19_0= ruleImage ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleInfographicElementType", "true");
            	    	    }
            	    	    // InternalIDSLParser.g:363:18: ( (lv_images_19_0= ruleImage ) )
            	    	    // InternalIDSLParser.g:363:19: (lv_images_19_0= ruleImage )
            	    	    {
            	    	    // InternalIDSLParser.g:363:19: (lv_images_19_0= ruleImage )
            	    	    // InternalIDSLParser.g:364:9: lv_images_19_0= ruleImage
            	    	    {

            	    	    									newCompositeNode(grammarAccess.getInfographicElementTypeAccess().getImagesImageParserRuleCall_6_0());
            	    	    								
            	    	    pushFollow(FOLLOW_5);
            	    	    lv_images_19_0=ruleImage();

            	    	    state._fsp--;


            	    	    									if (current==null) {
            	    	    										current = createModelElementForParent(grammarAccess.getInfographicElementTypeRule());
            	    	    									}
            	    	    									add(
            	    	    										current,
            	    	    										"images",
            	    	    										lv_images_19_0,
            	    	    										"org.xtext.example.mydsl.IDSL.Image");
            	    	    									afterParserOrEnumRuleCall();
            	    	    								

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt4 >= 1 ) break loop4;
            	                EarlyExitException eee =
            	                    new EarlyExitException(4, input);
            	                throw eee;
            	        }
            	        cnt4++;
            	    } while (true);

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInfographicElementTypeAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalIDSLParser.g:386:3: ({...}? => ( ({...}? => ( (lv_piecharts_20_0= rulePiechart ) ) )+ ) )
            	    {
            	    // InternalIDSLParser.g:386:3: ({...}? => ( ({...}? => ( (lv_piecharts_20_0= rulePiechart ) ) )+ ) )
            	    // InternalIDSLParser.g:387:4: {...}? => ( ({...}? => ( (lv_piecharts_20_0= rulePiechart ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInfographicElementTypeAccess().getUnorderedGroup(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleInfographicElementType", "getUnorderedGroupHelper().canSelect(grammarAccess.getInfographicElementTypeAccess().getUnorderedGroup(), 7)");
            	    }
            	    // InternalIDSLParser.g:387:116: ( ({...}? => ( (lv_piecharts_20_0= rulePiechart ) ) )+ )
            	    // InternalIDSLParser.g:388:5: ({...}? => ( (lv_piecharts_20_0= rulePiechart ) ) )+
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getInfographicElementTypeAccess().getUnorderedGroup(), 7);
            	    				
            	    // InternalIDSLParser.g:391:8: ({...}? => ( (lv_piecharts_20_0= rulePiechart ) ) )+
            	    int cnt5=0;
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==RULE_PIECHARTID) ) {
            	            int LA5_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt5=1;
            	            }


            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalIDSLParser.g:391:9: {...}? => ( (lv_piecharts_20_0= rulePiechart ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleInfographicElementType", "true");
            	    	    }
            	    	    // InternalIDSLParser.g:391:18: ( (lv_piecharts_20_0= rulePiechart ) )
            	    	    // InternalIDSLParser.g:391:19: (lv_piecharts_20_0= rulePiechart )
            	    	    {
            	    	    // InternalIDSLParser.g:391:19: (lv_piecharts_20_0= rulePiechart )
            	    	    // InternalIDSLParser.g:392:9: lv_piecharts_20_0= rulePiechart
            	    	    {

            	    	    									newCompositeNode(grammarAccess.getInfographicElementTypeAccess().getPiechartsPiechartParserRuleCall_7_0());
            	    	    								
            	    	    pushFollow(FOLLOW_5);
            	    	    lv_piecharts_20_0=rulePiechart();

            	    	    state._fsp--;


            	    	    									if (current==null) {
            	    	    										current = createModelElementForParent(grammarAccess.getInfographicElementTypeRule());
            	    	    									}
            	    	    									add(
            	    	    										current,
            	    	    										"piecharts",
            	    	    										lv_piecharts_20_0,
            	    	    										"org.xtext.example.mydsl.IDSL.Piechart");
            	    	    									afterParserOrEnumRuleCall();
            	    	    								

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt5 >= 1 ) break loop5;
            	                EarlyExitException eee =
            	                    new EarlyExitException(5, input);
            	                throw eee;
            	        }
            	        cnt5++;
            	    } while (true);

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInfographicElementTypeAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // InternalIDSLParser.g:414:3: ({...}? => ( ({...}? => ( (lv_barcharts_21_0= ruleBarchart ) ) )+ ) )
            	    {
            	    // InternalIDSLParser.g:414:3: ({...}? => ( ({...}? => ( (lv_barcharts_21_0= ruleBarchart ) ) )+ ) )
            	    // InternalIDSLParser.g:415:4: {...}? => ( ({...}? => ( (lv_barcharts_21_0= ruleBarchart ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInfographicElementTypeAccess().getUnorderedGroup(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleInfographicElementType", "getUnorderedGroupHelper().canSelect(grammarAccess.getInfographicElementTypeAccess().getUnorderedGroup(), 8)");
            	    }
            	    // InternalIDSLParser.g:415:116: ( ({...}? => ( (lv_barcharts_21_0= ruleBarchart ) ) )+ )
            	    // InternalIDSLParser.g:416:5: ({...}? => ( (lv_barcharts_21_0= ruleBarchart ) ) )+
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getInfographicElementTypeAccess().getUnorderedGroup(), 8);
            	    				
            	    // InternalIDSLParser.g:419:8: ({...}? => ( (lv_barcharts_21_0= ruleBarchart ) ) )+
            	    int cnt6=0;
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==RULE_BARCHARTID) ) {
            	            int LA6_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt6=1;
            	            }


            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // InternalIDSLParser.g:419:9: {...}? => ( (lv_barcharts_21_0= ruleBarchart ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleInfographicElementType", "true");
            	    	    }
            	    	    // InternalIDSLParser.g:419:18: ( (lv_barcharts_21_0= ruleBarchart ) )
            	    	    // InternalIDSLParser.g:419:19: (lv_barcharts_21_0= ruleBarchart )
            	    	    {
            	    	    // InternalIDSLParser.g:419:19: (lv_barcharts_21_0= ruleBarchart )
            	    	    // InternalIDSLParser.g:420:9: lv_barcharts_21_0= ruleBarchart
            	    	    {

            	    	    									newCompositeNode(grammarAccess.getInfographicElementTypeAccess().getBarchartsBarchartParserRuleCall_8_0());
            	    	    								
            	    	    pushFollow(FOLLOW_5);
            	    	    lv_barcharts_21_0=ruleBarchart();

            	    	    state._fsp--;


            	    	    									if (current==null) {
            	    	    										current = createModelElementForParent(grammarAccess.getInfographicElementTypeRule());
            	    	    									}
            	    	    									add(
            	    	    										current,
            	    	    										"barcharts",
            	    	    										lv_barcharts_21_0,
            	    	    										"org.xtext.example.mydsl.IDSL.Barchart");
            	    	    									afterParserOrEnumRuleCall();
            	    	    								

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt6 >= 1 ) break loop6;
            	                EarlyExitException eee =
            	                    new EarlyExitException(6, input);
            	                throw eee;
            	        }
            	        cnt6++;
            	    } while (true);

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInfographicElementTypeAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // InternalIDSLParser.g:442:3: ({...}? => ( ({...}? => ( (lv_picturegraphs_22_0= rulePicturegraph ) ) )+ ) )
            	    {
            	    // InternalIDSLParser.g:442:3: ({...}? => ( ({...}? => ( (lv_picturegraphs_22_0= rulePicturegraph ) ) )+ ) )
            	    // InternalIDSLParser.g:443:4: {...}? => ( ({...}? => ( (lv_picturegraphs_22_0= rulePicturegraph ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInfographicElementTypeAccess().getUnorderedGroup(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleInfographicElementType", "getUnorderedGroupHelper().canSelect(grammarAccess.getInfographicElementTypeAccess().getUnorderedGroup(), 9)");
            	    }
            	    // InternalIDSLParser.g:443:116: ( ({...}? => ( (lv_picturegraphs_22_0= rulePicturegraph ) ) )+ )
            	    // InternalIDSLParser.g:444:5: ({...}? => ( (lv_picturegraphs_22_0= rulePicturegraph ) ) )+
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getInfographicElementTypeAccess().getUnorderedGroup(), 9);
            	    				
            	    // InternalIDSLParser.g:447:8: ({...}? => ( (lv_picturegraphs_22_0= rulePicturegraph ) ) )+
            	    int cnt7=0;
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( (LA7_0==RULE_PICTUREGRAPHID) ) {
            	            int LA7_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt7=1;
            	            }


            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // InternalIDSLParser.g:447:9: {...}? => ( (lv_picturegraphs_22_0= rulePicturegraph ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleInfographicElementType", "true");
            	    	    }
            	    	    // InternalIDSLParser.g:447:18: ( (lv_picturegraphs_22_0= rulePicturegraph ) )
            	    	    // InternalIDSLParser.g:447:19: (lv_picturegraphs_22_0= rulePicturegraph )
            	    	    {
            	    	    // InternalIDSLParser.g:447:19: (lv_picturegraphs_22_0= rulePicturegraph )
            	    	    // InternalIDSLParser.g:448:9: lv_picturegraphs_22_0= rulePicturegraph
            	    	    {

            	    	    									newCompositeNode(grammarAccess.getInfographicElementTypeAccess().getPicturegraphsPicturegraphParserRuleCall_9_0());
            	    	    								
            	    	    pushFollow(FOLLOW_5);
            	    	    lv_picturegraphs_22_0=rulePicturegraph();

            	    	    state._fsp--;


            	    	    									if (current==null) {
            	    	    										current = createModelElementForParent(grammarAccess.getInfographicElementTypeRule());
            	    	    									}
            	    	    									add(
            	    	    										current,
            	    	    										"picturegraphs",
            	    	    										lv_picturegraphs_22_0,
            	    	    										"org.xtext.example.mydsl.IDSL.Picturegraph");
            	    	    									afterParserOrEnumRuleCall();
            	    	    								

            	    	    }


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

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInfographicElementTypeAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // InternalIDSLParser.g:470:3: ({...}? => ( ({...}? => ( (lv_foot_23_0= ruleFoot ) ) ) ) )
            	    {
            	    // InternalIDSLParser.g:470:3: ({...}? => ( ({...}? => ( (lv_foot_23_0= ruleFoot ) ) ) ) )
            	    // InternalIDSLParser.g:471:4: {...}? => ( ({...}? => ( (lv_foot_23_0= ruleFoot ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInfographicElementTypeAccess().getUnorderedGroup(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleInfographicElementType", "getUnorderedGroupHelper().canSelect(grammarAccess.getInfographicElementTypeAccess().getUnorderedGroup(), 10)");
            	    }
            	    // InternalIDSLParser.g:471:117: ( ({...}? => ( (lv_foot_23_0= ruleFoot ) ) ) )
            	    // InternalIDSLParser.g:472:5: ({...}? => ( (lv_foot_23_0= ruleFoot ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getInfographicElementTypeAccess().getUnorderedGroup(), 10);
            	    				
            	    // InternalIDSLParser.g:475:8: ({...}? => ( (lv_foot_23_0= ruleFoot ) ) )
            	    // InternalIDSLParser.g:475:9: {...}? => ( (lv_foot_23_0= ruleFoot ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInfographicElementType", "true");
            	    }
            	    // InternalIDSLParser.g:475:18: ( (lv_foot_23_0= ruleFoot ) )
            	    // InternalIDSLParser.g:475:19: (lv_foot_23_0= ruleFoot )
            	    {
            	    // InternalIDSLParser.g:475:19: (lv_foot_23_0= ruleFoot )
            	    // InternalIDSLParser.g:476:9: lv_foot_23_0= ruleFoot
            	    {

            	    									newCompositeNode(grammarAccess.getInfographicElementTypeAccess().getFootFootParserRuleCall_10_0());
            	    								
            	    pushFollow(FOLLOW_5);
            	    lv_foot_23_0=ruleFoot();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getInfographicElementTypeRule());
            	    									}
            	    									set(
            	    										current,
            	    										"foot",
            	    										lv_foot_23_0,
            	    										"org.xtext.example.mydsl.IDSL.Foot");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInfographicElementTypeAccess().getUnorderedGroup());
            	    				

            	    }


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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getInfographicElementTypeAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleInfographicElementType", "getUnorderedGroupHelper().canLeave(grammarAccess.getInfographicElementTypeAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getInfographicElementTypeAccess().getUnorderedGroup());
            			

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
    // $ANTLR end "ruleInfographicElementType"


    // $ANTLR start "entryRuleHead"
    // InternalIDSLParser.g:509:1: entryRuleHead returns [EObject current=null] : iv_ruleHead= ruleHead EOF ;
    public final EObject entryRuleHead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHead = null;


        try {
            // InternalIDSLParser.g:509:45: (iv_ruleHead= ruleHead EOF )
            // InternalIDSLParser.g:510:2: iv_ruleHead= ruleHead EOF
            {
             newCompositeNode(grammarAccess.getHeadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHead=ruleHead();

            state._fsp--;

             current =iv_ruleHead; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleHead"


    // $ANTLR start "ruleHead"
    // InternalIDSLParser.g:516:1: ruleHead returns [EObject current=null] : ( ( (lv_name_0_0= Head ) ) otherlv_1= Colon (otherlv_2= Off | ( (this_BEGIN_3= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_5= Bgcolor otherlv_6= Colon ( (lv_bgcolor_7_0= ruleColor ) ) ) | (otherlv_8= Bgpattern otherlv_9= Colon ( (lv_bgpattern_10_0= rulePattern ) ) ) | (otherlv_11= Bgimage otherlv_12= Colon ( (lv_bgimage_13_0= ruleImageSrc ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Size otherlv_15= Colon ( (lv_size_16_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Position otherlv_18= Colon ( (lv_position_19_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= Logo otherlv_21= Colon ( (lv_logo_22_0= ruleLogo ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= Title otherlv_24= Colon ( (lv_title_25_0= ruleTitle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= Subtitle otherlv_27= Colon ( (lv_subtitle_28_0= ruleTitle ) ) ) ) ) ) )* ) ) ) ) this_END_29= RULE_END ) ) ) ;
    public final EObject ruleHead() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_size_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_position_19_0=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token this_END_29=null;
        EObject lv_bgcolor_7_0 = null;

        AntlrDatatypeRuleToken lv_bgpattern_10_0 = null;

        AntlrDatatypeRuleToken lv_bgimage_13_0 = null;

        EObject lv_logo_22_0 = null;

        EObject lv_title_25_0 = null;

        EObject lv_subtitle_28_0 = null;



        	enterRule();

        try {
            // InternalIDSLParser.g:522:2: ( ( ( (lv_name_0_0= Head ) ) otherlv_1= Colon (otherlv_2= Off | ( (this_BEGIN_3= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_5= Bgcolor otherlv_6= Colon ( (lv_bgcolor_7_0= ruleColor ) ) ) | (otherlv_8= Bgpattern otherlv_9= Colon ( (lv_bgpattern_10_0= rulePattern ) ) ) | (otherlv_11= Bgimage otherlv_12= Colon ( (lv_bgimage_13_0= ruleImageSrc ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Size otherlv_15= Colon ( (lv_size_16_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Position otherlv_18= Colon ( (lv_position_19_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= Logo otherlv_21= Colon ( (lv_logo_22_0= ruleLogo ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= Title otherlv_24= Colon ( (lv_title_25_0= ruleTitle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= Subtitle otherlv_27= Colon ( (lv_subtitle_28_0= ruleTitle ) ) ) ) ) ) )* ) ) ) ) this_END_29= RULE_END ) ) ) )
            // InternalIDSLParser.g:523:2: ( ( (lv_name_0_0= Head ) ) otherlv_1= Colon (otherlv_2= Off | ( (this_BEGIN_3= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_5= Bgcolor otherlv_6= Colon ( (lv_bgcolor_7_0= ruleColor ) ) ) | (otherlv_8= Bgpattern otherlv_9= Colon ( (lv_bgpattern_10_0= rulePattern ) ) ) | (otherlv_11= Bgimage otherlv_12= Colon ( (lv_bgimage_13_0= ruleImageSrc ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Size otherlv_15= Colon ( (lv_size_16_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Position otherlv_18= Colon ( (lv_position_19_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= Logo otherlv_21= Colon ( (lv_logo_22_0= ruleLogo ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= Title otherlv_24= Colon ( (lv_title_25_0= ruleTitle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= Subtitle otherlv_27= Colon ( (lv_subtitle_28_0= ruleTitle ) ) ) ) ) ) )* ) ) ) ) this_END_29= RULE_END ) ) )
            {
            // InternalIDSLParser.g:523:2: ( ( (lv_name_0_0= Head ) ) otherlv_1= Colon (otherlv_2= Off | ( (this_BEGIN_3= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_5= Bgcolor otherlv_6= Colon ( (lv_bgcolor_7_0= ruleColor ) ) ) | (otherlv_8= Bgpattern otherlv_9= Colon ( (lv_bgpattern_10_0= rulePattern ) ) ) | (otherlv_11= Bgimage otherlv_12= Colon ( (lv_bgimage_13_0= ruleImageSrc ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Size otherlv_15= Colon ( (lv_size_16_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Position otherlv_18= Colon ( (lv_position_19_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= Logo otherlv_21= Colon ( (lv_logo_22_0= ruleLogo ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= Title otherlv_24= Colon ( (lv_title_25_0= ruleTitle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= Subtitle otherlv_27= Colon ( (lv_subtitle_28_0= ruleTitle ) ) ) ) ) ) )* ) ) ) ) this_END_29= RULE_END ) ) )
            // InternalIDSLParser.g:524:3: ( (lv_name_0_0= Head ) ) otherlv_1= Colon (otherlv_2= Off | ( (this_BEGIN_3= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_5= Bgcolor otherlv_6= Colon ( (lv_bgcolor_7_0= ruleColor ) ) ) | (otherlv_8= Bgpattern otherlv_9= Colon ( (lv_bgpattern_10_0= rulePattern ) ) ) | (otherlv_11= Bgimage otherlv_12= Colon ( (lv_bgimage_13_0= ruleImageSrc ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Size otherlv_15= Colon ( (lv_size_16_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Position otherlv_18= Colon ( (lv_position_19_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= Logo otherlv_21= Colon ( (lv_logo_22_0= ruleLogo ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= Title otherlv_24= Colon ( (lv_title_25_0= ruleTitle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= Subtitle otherlv_27= Colon ( (lv_subtitle_28_0= ruleTitle ) ) ) ) ) ) )* ) ) ) ) this_END_29= RULE_END ) )
            {
            // InternalIDSLParser.g:524:3: ( (lv_name_0_0= Head ) )
            // InternalIDSLParser.g:525:4: (lv_name_0_0= Head )
            {
            // InternalIDSLParser.g:525:4: (lv_name_0_0= Head )
            // InternalIDSLParser.g:526:5: lv_name_0_0= Head
            {
            lv_name_0_0=(Token)match(input,Head,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getHeadAccess().getNameHeadKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHeadRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "head");
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getHeadAccess().getColonKeyword_1());
            		
            // InternalIDSLParser.g:542:3: (otherlv_2= Off | ( (this_BEGIN_3= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_5= Bgcolor otherlv_6= Colon ( (lv_bgcolor_7_0= ruleColor ) ) ) | (otherlv_8= Bgpattern otherlv_9= Colon ( (lv_bgpattern_10_0= rulePattern ) ) ) | (otherlv_11= Bgimage otherlv_12= Colon ( (lv_bgimage_13_0= ruleImageSrc ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Size otherlv_15= Colon ( (lv_size_16_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Position otherlv_18= Colon ( (lv_position_19_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= Logo otherlv_21= Colon ( (lv_logo_22_0= ruleLogo ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= Title otherlv_24= Colon ( (lv_title_25_0= ruleTitle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= Subtitle otherlv_27= Colon ( (lv_subtitle_28_0= ruleTitle ) ) ) ) ) ) )* ) ) ) ) this_END_29= RULE_END ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==Off) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_BEGIN) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalIDSLParser.g:543:4: otherlv_2= Off
                    {
                    otherlv_2=(Token)match(input,Off,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getHeadAccess().getOffKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalIDSLParser.g:548:4: ( (this_BEGIN_3= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_5= Bgcolor otherlv_6= Colon ( (lv_bgcolor_7_0= ruleColor ) ) ) | (otherlv_8= Bgpattern otherlv_9= Colon ( (lv_bgpattern_10_0= rulePattern ) ) ) | (otherlv_11= Bgimage otherlv_12= Colon ( (lv_bgimage_13_0= ruleImageSrc ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Size otherlv_15= Colon ( (lv_size_16_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Position otherlv_18= Colon ( (lv_position_19_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= Logo otherlv_21= Colon ( (lv_logo_22_0= ruleLogo ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= Title otherlv_24= Colon ( (lv_title_25_0= ruleTitle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= Subtitle otherlv_27= Colon ( (lv_subtitle_28_0= ruleTitle ) ) ) ) ) ) )* ) ) ) ) this_END_29= RULE_END )
                    {
                    // InternalIDSLParser.g:548:4: ( (this_BEGIN_3= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_5= Bgcolor otherlv_6= Colon ( (lv_bgcolor_7_0= ruleColor ) ) ) | (otherlv_8= Bgpattern otherlv_9= Colon ( (lv_bgpattern_10_0= rulePattern ) ) ) | (otherlv_11= Bgimage otherlv_12= Colon ( (lv_bgimage_13_0= ruleImageSrc ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Size otherlv_15= Colon ( (lv_size_16_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Position otherlv_18= Colon ( (lv_position_19_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= Logo otherlv_21= Colon ( (lv_logo_22_0= ruleLogo ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= Title otherlv_24= Colon ( (lv_title_25_0= ruleTitle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= Subtitle otherlv_27= Colon ( (lv_subtitle_28_0= ruleTitle ) ) ) ) ) ) )* ) ) ) ) this_END_29= RULE_END )
                    // InternalIDSLParser.g:549:5: (this_BEGIN_3= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_5= Bgcolor otherlv_6= Colon ( (lv_bgcolor_7_0= ruleColor ) ) ) | (otherlv_8= Bgpattern otherlv_9= Colon ( (lv_bgpattern_10_0= rulePattern ) ) ) | (otherlv_11= Bgimage otherlv_12= Colon ( (lv_bgimage_13_0= ruleImageSrc ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Size otherlv_15= Colon ( (lv_size_16_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Position otherlv_18= Colon ( (lv_position_19_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= Logo otherlv_21= Colon ( (lv_logo_22_0= ruleLogo ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= Title otherlv_24= Colon ( (lv_title_25_0= ruleTitle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= Subtitle otherlv_27= Colon ( (lv_subtitle_28_0= ruleTitle ) ) ) ) ) ) )* ) ) ) ) this_END_29= RULE_END
                    {
                    // InternalIDSLParser.g:549:5: (this_BEGIN_3= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_5= Bgcolor otherlv_6= Colon ( (lv_bgcolor_7_0= ruleColor ) ) ) | (otherlv_8= Bgpattern otherlv_9= Colon ( (lv_bgpattern_10_0= rulePattern ) ) ) | (otherlv_11= Bgimage otherlv_12= Colon ( (lv_bgimage_13_0= ruleImageSrc ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Size otherlv_15= Colon ( (lv_size_16_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Position otherlv_18= Colon ( (lv_position_19_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= Logo otherlv_21= Colon ( (lv_logo_22_0= ruleLogo ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= Title otherlv_24= Colon ( (lv_title_25_0= ruleTitle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= Subtitle otherlv_27= Colon ( (lv_subtitle_28_0= ruleTitle ) ) ) ) ) ) )* ) ) ) )
                    // InternalIDSLParser.g:550:6: this_BEGIN_3= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_5= Bgcolor otherlv_6= Colon ( (lv_bgcolor_7_0= ruleColor ) ) ) | (otherlv_8= Bgpattern otherlv_9= Colon ( (lv_bgpattern_10_0= rulePattern ) ) ) | (otherlv_11= Bgimage otherlv_12= Colon ( (lv_bgimage_13_0= ruleImageSrc ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Size otherlv_15= Colon ( (lv_size_16_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Position otherlv_18= Colon ( (lv_position_19_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= Logo otherlv_21= Colon ( (lv_logo_22_0= ruleLogo ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= Title otherlv_24= Colon ( (lv_title_25_0= ruleTitle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= Subtitle otherlv_27= Colon ( (lv_subtitle_28_0= ruleTitle ) ) ) ) ) ) )* ) ) )
                    {
                    this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_11); 

                    						newLeafNode(this_BEGIN_3, grammarAccess.getHeadAccess().getBEGINTerminalRuleCall_2_1_0_0());
                    					
                    // InternalIDSLParser.g:554:6: ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_5= Bgcolor otherlv_6= Colon ( (lv_bgcolor_7_0= ruleColor ) ) ) | (otherlv_8= Bgpattern otherlv_9= Colon ( (lv_bgpattern_10_0= rulePattern ) ) ) | (otherlv_11= Bgimage otherlv_12= Colon ( (lv_bgimage_13_0= ruleImageSrc ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Size otherlv_15= Colon ( (lv_size_16_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Position otherlv_18= Colon ( (lv_position_19_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= Logo otherlv_21= Colon ( (lv_logo_22_0= ruleLogo ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= Title otherlv_24= Colon ( (lv_title_25_0= ruleTitle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= Subtitle otherlv_27= Colon ( (lv_subtitle_28_0= ruleTitle ) ) ) ) ) ) )* ) ) )
                    // InternalIDSLParser.g:555:7: ( ( ( ({...}? => ( ({...}? => ( (otherlv_5= Bgcolor otherlv_6= Colon ( (lv_bgcolor_7_0= ruleColor ) ) ) | (otherlv_8= Bgpattern otherlv_9= Colon ( (lv_bgpattern_10_0= rulePattern ) ) ) | (otherlv_11= Bgimage otherlv_12= Colon ( (lv_bgimage_13_0= ruleImageSrc ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Size otherlv_15= Colon ( (lv_size_16_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Position otherlv_18= Colon ( (lv_position_19_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= Logo otherlv_21= Colon ( (lv_logo_22_0= ruleLogo ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= Title otherlv_24= Colon ( (lv_title_25_0= ruleTitle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= Subtitle otherlv_27= Colon ( (lv_subtitle_28_0= ruleTitle ) ) ) ) ) ) )* ) )
                    {
                    // InternalIDSLParser.g:555:7: ( ( ( ({...}? => ( ({...}? => ( (otherlv_5= Bgcolor otherlv_6= Colon ( (lv_bgcolor_7_0= ruleColor ) ) ) | (otherlv_8= Bgpattern otherlv_9= Colon ( (lv_bgpattern_10_0= rulePattern ) ) ) | (otherlv_11= Bgimage otherlv_12= Colon ( (lv_bgimage_13_0= ruleImageSrc ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Size otherlv_15= Colon ( (lv_size_16_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Position otherlv_18= Colon ( (lv_position_19_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= Logo otherlv_21= Colon ( (lv_logo_22_0= ruleLogo ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= Title otherlv_24= Colon ( (lv_title_25_0= ruleTitle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= Subtitle otherlv_27= Colon ( (lv_subtitle_28_0= ruleTitle ) ) ) ) ) ) )* ) )
                    // InternalIDSLParser.g:556:8: ( ( ({...}? => ( ({...}? => ( (otherlv_5= Bgcolor otherlv_6= Colon ( (lv_bgcolor_7_0= ruleColor ) ) ) | (otherlv_8= Bgpattern otherlv_9= Colon ( (lv_bgpattern_10_0= rulePattern ) ) ) | (otherlv_11= Bgimage otherlv_12= Colon ( (lv_bgimage_13_0= ruleImageSrc ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Size otherlv_15= Colon ( (lv_size_16_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Position otherlv_18= Colon ( (lv_position_19_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= Logo otherlv_21= Colon ( (lv_logo_22_0= ruleLogo ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= Title otherlv_24= Colon ( (lv_title_25_0= ruleTitle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= Subtitle otherlv_27= Colon ( (lv_subtitle_28_0= ruleTitle ) ) ) ) ) ) )* )
                    {
                     
                    							  getUnorderedGroupHelper().enter(grammarAccess.getHeadAccess().getUnorderedGroup_2_1_0_1());
                    							
                    // InternalIDSLParser.g:559:8: ( ( ({...}? => ( ({...}? => ( (otherlv_5= Bgcolor otherlv_6= Colon ( (lv_bgcolor_7_0= ruleColor ) ) ) | (otherlv_8= Bgpattern otherlv_9= Colon ( (lv_bgpattern_10_0= rulePattern ) ) ) | (otherlv_11= Bgimage otherlv_12= Colon ( (lv_bgimage_13_0= ruleImageSrc ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Size otherlv_15= Colon ( (lv_size_16_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Position otherlv_18= Colon ( (lv_position_19_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= Logo otherlv_21= Colon ( (lv_logo_22_0= ruleLogo ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= Title otherlv_24= Colon ( (lv_title_25_0= ruleTitle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= Subtitle otherlv_27= Colon ( (lv_subtitle_28_0= ruleTitle ) ) ) ) ) ) )* )
                    // InternalIDSLParser.g:560:9: ( ({...}? => ( ({...}? => ( (otherlv_5= Bgcolor otherlv_6= Colon ( (lv_bgcolor_7_0= ruleColor ) ) ) | (otherlv_8= Bgpattern otherlv_9= Colon ( (lv_bgpattern_10_0= rulePattern ) ) ) | (otherlv_11= Bgimage otherlv_12= Colon ( (lv_bgimage_13_0= ruleImageSrc ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Size otherlv_15= Colon ( (lv_size_16_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Position otherlv_18= Colon ( (lv_position_19_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= Logo otherlv_21= Colon ( (lv_logo_22_0= ruleLogo ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= Title otherlv_24= Colon ( (lv_title_25_0= ruleTitle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= Subtitle otherlv_27= Colon ( (lv_subtitle_28_0= ruleTitle ) ) ) ) ) ) )*
                    {
                    // InternalIDSLParser.g:560:9: ( ({...}? => ( ({...}? => ( (otherlv_5= Bgcolor otherlv_6= Colon ( (lv_bgcolor_7_0= ruleColor ) ) ) | (otherlv_8= Bgpattern otherlv_9= Colon ( (lv_bgpattern_10_0= rulePattern ) ) ) | (otherlv_11= Bgimage otherlv_12= Colon ( (lv_bgimage_13_0= ruleImageSrc ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Size otherlv_15= Colon ( (lv_size_16_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Position otherlv_18= Colon ( (lv_position_19_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= Logo otherlv_21= Colon ( (lv_logo_22_0= ruleLogo ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= Title otherlv_24= Colon ( (lv_title_25_0= ruleTitle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= Subtitle otherlv_27= Colon ( (lv_subtitle_28_0= ruleTitle ) ) ) ) ) ) )*
                    loop10:
                    do {
                        int alt10=7;
                        int LA10_0 = input.LA(1);

                        if ( ( LA10_0 == Bgpattern || LA10_0 >= Bgcolor && LA10_0 <= Bgimage ) && getUnorderedGroupHelper().canSelect(grammarAccess.getHeadAccess().getUnorderedGroup_2_1_0_1(), 0) ) {
                            alt10=1;
                        }
                        else if ( LA10_0 == Size && getUnorderedGroupHelper().canSelect(grammarAccess.getHeadAccess().getUnorderedGroup_2_1_0_1(), 1) ) {
                            alt10=2;
                        }
                        else if ( LA10_0 == Position && getUnorderedGroupHelper().canSelect(grammarAccess.getHeadAccess().getUnorderedGroup_2_1_0_1(), 2) ) {
                            alt10=3;
                        }
                        else if ( LA10_0 == Logo && getUnorderedGroupHelper().canSelect(grammarAccess.getHeadAccess().getUnorderedGroup_2_1_0_1(), 3) ) {
                            alt10=4;
                        }
                        else if ( LA10_0 == Title && getUnorderedGroupHelper().canSelect(grammarAccess.getHeadAccess().getUnorderedGroup_2_1_0_1(), 4) ) {
                            alt10=5;
                        }
                        else if ( LA10_0 == Subtitle && getUnorderedGroupHelper().canSelect(grammarAccess.getHeadAccess().getUnorderedGroup_2_1_0_1(), 5) ) {
                            alt10=6;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalIDSLParser.g:561:7: ({...}? => ( ({...}? => ( (otherlv_5= Bgcolor otherlv_6= Colon ( (lv_bgcolor_7_0= ruleColor ) ) ) | (otherlv_8= Bgpattern otherlv_9= Colon ( (lv_bgpattern_10_0= rulePattern ) ) ) | (otherlv_11= Bgimage otherlv_12= Colon ( (lv_bgimage_13_0= ruleImageSrc ) ) ) ) ) ) )
                    	    {
                    	    // InternalIDSLParser.g:561:7: ({...}? => ( ({...}? => ( (otherlv_5= Bgcolor otherlv_6= Colon ( (lv_bgcolor_7_0= ruleColor ) ) ) | (otherlv_8= Bgpattern otherlv_9= Colon ( (lv_bgpattern_10_0= rulePattern ) ) ) | (otherlv_11= Bgimage otherlv_12= Colon ( (lv_bgimage_13_0= ruleImageSrc ) ) ) ) ) ) )
                    	    // InternalIDSLParser.g:562:8: {...}? => ( ({...}? => ( (otherlv_5= Bgcolor otherlv_6= Colon ( (lv_bgcolor_7_0= ruleColor ) ) ) | (otherlv_8= Bgpattern otherlv_9= Colon ( (lv_bgpattern_10_0= rulePattern ) ) ) | (otherlv_11= Bgimage otherlv_12= Colon ( (lv_bgimage_13_0= ruleImageSrc ) ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getHeadAccess().getUnorderedGroup_2_1_0_1(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleHead", "getUnorderedGroupHelper().canSelect(grammarAccess.getHeadAccess().getUnorderedGroup_2_1_0_1(), 0)");
                    	    }
                    	    // InternalIDSLParser.g:562:110: ( ({...}? => ( (otherlv_5= Bgcolor otherlv_6= Colon ( (lv_bgcolor_7_0= ruleColor ) ) ) | (otherlv_8= Bgpattern otherlv_9= Colon ( (lv_bgpattern_10_0= rulePattern ) ) ) | (otherlv_11= Bgimage otherlv_12= Colon ( (lv_bgimage_13_0= ruleImageSrc ) ) ) ) ) )
                    	    // InternalIDSLParser.g:563:9: ({...}? => ( (otherlv_5= Bgcolor otherlv_6= Colon ( (lv_bgcolor_7_0= ruleColor ) ) ) | (otherlv_8= Bgpattern otherlv_9= Colon ( (lv_bgpattern_10_0= rulePattern ) ) ) | (otherlv_11= Bgimage otherlv_12= Colon ( (lv_bgimage_13_0= ruleImageSrc ) ) ) ) )
                    	    {

                    	    									getUnorderedGroupHelper().select(grammarAccess.getHeadAccess().getUnorderedGroup_2_1_0_1(), 0);
                    	    								
                    	    // InternalIDSLParser.g:566:12: ({...}? => ( (otherlv_5= Bgcolor otherlv_6= Colon ( (lv_bgcolor_7_0= ruleColor ) ) ) | (otherlv_8= Bgpattern otherlv_9= Colon ( (lv_bgpattern_10_0= rulePattern ) ) ) | (otherlv_11= Bgimage otherlv_12= Colon ( (lv_bgimage_13_0= ruleImageSrc ) ) ) ) )
                    	    // InternalIDSLParser.g:566:13: {...}? => ( (otherlv_5= Bgcolor otherlv_6= Colon ( (lv_bgcolor_7_0= ruleColor ) ) ) | (otherlv_8= Bgpattern otherlv_9= Colon ( (lv_bgpattern_10_0= rulePattern ) ) ) | (otherlv_11= Bgimage otherlv_12= Colon ( (lv_bgimage_13_0= ruleImageSrc ) ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleHead", "true");
                    	    }
                    	    // InternalIDSLParser.g:566:22: ( (otherlv_5= Bgcolor otherlv_6= Colon ( (lv_bgcolor_7_0= ruleColor ) ) ) | (otherlv_8= Bgpattern otherlv_9= Colon ( (lv_bgpattern_10_0= rulePattern ) ) ) | (otherlv_11= Bgimage otherlv_12= Colon ( (lv_bgimage_13_0= ruleImageSrc ) ) ) )
                    	    int alt9=3;
                    	    switch ( input.LA(1) ) {
                    	    case Bgcolor:
                    	        {
                    	        alt9=1;
                    	        }
                    	        break;
                    	    case Bgpattern:
                    	        {
                    	        alt9=2;
                    	        }
                    	        break;
                    	    case Bgimage:
                    	        {
                    	        alt9=3;
                    	        }
                    	        break;
                    	    default:
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 9, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt9) {
                    	        case 1 :
                    	            // InternalIDSLParser.g:566:23: (otherlv_5= Bgcolor otherlv_6= Colon ( (lv_bgcolor_7_0= ruleColor ) ) )
                    	            {
                    	            // InternalIDSLParser.g:566:23: (otherlv_5= Bgcolor otherlv_6= Colon ( (lv_bgcolor_7_0= ruleColor ) ) )
                    	            // InternalIDSLParser.g:567:13: otherlv_5= Bgcolor otherlv_6= Colon ( (lv_bgcolor_7_0= ruleColor ) )
                    	            {
                    	            otherlv_5=(Token)match(input,Bgcolor,FOLLOW_3); 

                    	            													newLeafNode(otherlv_5, grammarAccess.getHeadAccess().getBgcolorKeyword_2_1_0_1_0_0_0());
                    	            												
                    	            otherlv_6=(Token)match(input,Colon,FOLLOW_6); 

                    	            													newLeafNode(otherlv_6, grammarAccess.getHeadAccess().getColonKeyword_2_1_0_1_0_0_1());
                    	            												
                    	            // InternalIDSLParser.g:575:13: ( (lv_bgcolor_7_0= ruleColor ) )
                    	            // InternalIDSLParser.g:576:14: (lv_bgcolor_7_0= ruleColor )
                    	            {
                    	            // InternalIDSLParser.g:576:14: (lv_bgcolor_7_0= ruleColor )
                    	            // InternalIDSLParser.g:577:15: lv_bgcolor_7_0= ruleColor
                    	            {

                    	            															newCompositeNode(grammarAccess.getHeadAccess().getBgcolorColorParserRuleCall_2_1_0_1_0_0_2_0());
                    	            														
                    	            pushFollow(FOLLOW_11);
                    	            lv_bgcolor_7_0=ruleColor();

                    	            state._fsp--;


                    	            															if (current==null) {
                    	            																current = createModelElementForParent(grammarAccess.getHeadRule());
                    	            															}
                    	            															set(
                    	            																current,
                    	            																"bgcolor",
                    	            																lv_bgcolor_7_0,
                    	            																"org.xtext.example.mydsl.IDSL.Color");
                    	            															afterParserOrEnumRuleCall();
                    	            														

                    	            }


                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalIDSLParser.g:596:12: (otherlv_8= Bgpattern otherlv_9= Colon ( (lv_bgpattern_10_0= rulePattern ) ) )
                    	            {
                    	            // InternalIDSLParser.g:596:12: (otherlv_8= Bgpattern otherlv_9= Colon ( (lv_bgpattern_10_0= rulePattern ) ) )
                    	            // InternalIDSLParser.g:597:13: otherlv_8= Bgpattern otherlv_9= Colon ( (lv_bgpattern_10_0= rulePattern ) )
                    	            {
                    	            otherlv_8=(Token)match(input,Bgpattern,FOLLOW_3); 

                    	            													newLeafNode(otherlv_8, grammarAccess.getHeadAccess().getBgpatternKeyword_2_1_0_1_0_1_0());
                    	            												
                    	            otherlv_9=(Token)match(input,Colon,FOLLOW_7); 

                    	            													newLeafNode(otherlv_9, grammarAccess.getHeadAccess().getColonKeyword_2_1_0_1_0_1_1());
                    	            												
                    	            // InternalIDSLParser.g:605:13: ( (lv_bgpattern_10_0= rulePattern ) )
                    	            // InternalIDSLParser.g:606:14: (lv_bgpattern_10_0= rulePattern )
                    	            {
                    	            // InternalIDSLParser.g:606:14: (lv_bgpattern_10_0= rulePattern )
                    	            // InternalIDSLParser.g:607:15: lv_bgpattern_10_0= rulePattern
                    	            {

                    	            															newCompositeNode(grammarAccess.getHeadAccess().getBgpatternPatternParserRuleCall_2_1_0_1_0_1_2_0());
                    	            														
                    	            pushFollow(FOLLOW_11);
                    	            lv_bgpattern_10_0=rulePattern();

                    	            state._fsp--;


                    	            															if (current==null) {
                    	            																current = createModelElementForParent(grammarAccess.getHeadRule());
                    	            															}
                    	            															set(
                    	            																current,
                    	            																"bgpattern",
                    	            																lv_bgpattern_10_0,
                    	            																"org.xtext.example.mydsl.IDSL.Pattern");
                    	            															afterParserOrEnumRuleCall();
                    	            														

                    	            }


                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 3 :
                    	            // InternalIDSLParser.g:626:12: (otherlv_11= Bgimage otherlv_12= Colon ( (lv_bgimage_13_0= ruleImageSrc ) ) )
                    	            {
                    	            // InternalIDSLParser.g:626:12: (otherlv_11= Bgimage otherlv_12= Colon ( (lv_bgimage_13_0= ruleImageSrc ) ) )
                    	            // InternalIDSLParser.g:627:13: otherlv_11= Bgimage otherlv_12= Colon ( (lv_bgimage_13_0= ruleImageSrc ) )
                    	            {
                    	            otherlv_11=(Token)match(input,Bgimage,FOLLOW_3); 

                    	            													newLeafNode(otherlv_11, grammarAccess.getHeadAccess().getBgimageKeyword_2_1_0_1_0_2_0());
                    	            												
                    	            otherlv_12=(Token)match(input,Colon,FOLLOW_8); 

                    	            													newLeafNode(otherlv_12, grammarAccess.getHeadAccess().getColonKeyword_2_1_0_1_0_2_1());
                    	            												
                    	            // InternalIDSLParser.g:635:13: ( (lv_bgimage_13_0= ruleImageSrc ) )
                    	            // InternalIDSLParser.g:636:14: (lv_bgimage_13_0= ruleImageSrc )
                    	            {
                    	            // InternalIDSLParser.g:636:14: (lv_bgimage_13_0= ruleImageSrc )
                    	            // InternalIDSLParser.g:637:15: lv_bgimage_13_0= ruleImageSrc
                    	            {

                    	            															newCompositeNode(grammarAccess.getHeadAccess().getBgimageImageSrcParserRuleCall_2_1_0_1_0_2_2_0());
                    	            														
                    	            pushFollow(FOLLOW_11);
                    	            lv_bgimage_13_0=ruleImageSrc();

                    	            state._fsp--;


                    	            															if (current==null) {
                    	            																current = createModelElementForParent(grammarAccess.getHeadRule());
                    	            															}
                    	            															set(
                    	            																current,
                    	            																"bgimage",
                    	            																lv_bgimage_13_0,
                    	            																"org.xtext.example.mydsl.IDSL.ImageSrc");
                    	            															afterParserOrEnumRuleCall();
                    	            														

                    	            }


                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }

                    	     
                    	    									getUnorderedGroupHelper().returnFromSelection(grammarAccess.getHeadAccess().getUnorderedGroup_2_1_0_1());
                    	    								

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalIDSLParser.g:661:7: ({...}? => ( ({...}? => (otherlv_14= Size otherlv_15= Colon ( (lv_size_16_0= RULE_SIZE_POS ) ) ) ) ) )
                    	    {
                    	    // InternalIDSLParser.g:661:7: ({...}? => ( ({...}? => (otherlv_14= Size otherlv_15= Colon ( (lv_size_16_0= RULE_SIZE_POS ) ) ) ) ) )
                    	    // InternalIDSLParser.g:662:8: {...}? => ( ({...}? => (otherlv_14= Size otherlv_15= Colon ( (lv_size_16_0= RULE_SIZE_POS ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getHeadAccess().getUnorderedGroup_2_1_0_1(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleHead", "getUnorderedGroupHelper().canSelect(grammarAccess.getHeadAccess().getUnorderedGroup_2_1_0_1(), 1)");
                    	    }
                    	    // InternalIDSLParser.g:662:110: ( ({...}? => (otherlv_14= Size otherlv_15= Colon ( (lv_size_16_0= RULE_SIZE_POS ) ) ) ) )
                    	    // InternalIDSLParser.g:663:9: ({...}? => (otherlv_14= Size otherlv_15= Colon ( (lv_size_16_0= RULE_SIZE_POS ) ) ) )
                    	    {

                    	    									getUnorderedGroupHelper().select(grammarAccess.getHeadAccess().getUnorderedGroup_2_1_0_1(), 1);
                    	    								
                    	    // InternalIDSLParser.g:666:12: ({...}? => (otherlv_14= Size otherlv_15= Colon ( (lv_size_16_0= RULE_SIZE_POS ) ) ) )
                    	    // InternalIDSLParser.g:666:13: {...}? => (otherlv_14= Size otherlv_15= Colon ( (lv_size_16_0= RULE_SIZE_POS ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleHead", "true");
                    	    }
                    	    // InternalIDSLParser.g:666:22: (otherlv_14= Size otherlv_15= Colon ( (lv_size_16_0= RULE_SIZE_POS ) ) )
                    	    // InternalIDSLParser.g:666:23: otherlv_14= Size otherlv_15= Colon ( (lv_size_16_0= RULE_SIZE_POS ) )
                    	    {
                    	    otherlv_14=(Token)match(input,Size,FOLLOW_3); 

                    	    												newLeafNode(otherlv_14, grammarAccess.getHeadAccess().getSizeKeyword_2_1_0_1_1_0());
                    	    											
                    	    otherlv_15=(Token)match(input,Colon,FOLLOW_9); 

                    	    												newLeafNode(otherlv_15, grammarAccess.getHeadAccess().getColonKeyword_2_1_0_1_1_1());
                    	    											
                    	    // InternalIDSLParser.g:674:12: ( (lv_size_16_0= RULE_SIZE_POS ) )
                    	    // InternalIDSLParser.g:675:13: (lv_size_16_0= RULE_SIZE_POS )
                    	    {
                    	    // InternalIDSLParser.g:675:13: (lv_size_16_0= RULE_SIZE_POS )
                    	    // InternalIDSLParser.g:676:14: lv_size_16_0= RULE_SIZE_POS
                    	    {
                    	    lv_size_16_0=(Token)match(input,RULE_SIZE_POS,FOLLOW_11); 

                    	    														newLeafNode(lv_size_16_0, grammarAccess.getHeadAccess().getSizeSIZE_POSTerminalRuleCall_2_1_0_1_1_2_0());
                    	    													

                    	    														if (current==null) {
                    	    															current = createModelElement(grammarAccess.getHeadRule());
                    	    														}
                    	    														setWithLastConsumed(
                    	    															current,
                    	    															"size",
                    	    															lv_size_16_0,
                    	    															"org.xtext.example.mydsl.IDSL.SIZE_POS");
                    	    													

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    									getUnorderedGroupHelper().returnFromSelection(grammarAccess.getHeadAccess().getUnorderedGroup_2_1_0_1());
                    	    								

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalIDSLParser.g:698:7: ({...}? => ( ({...}? => (otherlv_17= Position otherlv_18= Colon ( (lv_position_19_0= RULE_SIZE_POS ) ) ) ) ) )
                    	    {
                    	    // InternalIDSLParser.g:698:7: ({...}? => ( ({...}? => (otherlv_17= Position otherlv_18= Colon ( (lv_position_19_0= RULE_SIZE_POS ) ) ) ) ) )
                    	    // InternalIDSLParser.g:699:8: {...}? => ( ({...}? => (otherlv_17= Position otherlv_18= Colon ( (lv_position_19_0= RULE_SIZE_POS ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getHeadAccess().getUnorderedGroup_2_1_0_1(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleHead", "getUnorderedGroupHelper().canSelect(grammarAccess.getHeadAccess().getUnorderedGroup_2_1_0_1(), 2)");
                    	    }
                    	    // InternalIDSLParser.g:699:110: ( ({...}? => (otherlv_17= Position otherlv_18= Colon ( (lv_position_19_0= RULE_SIZE_POS ) ) ) ) )
                    	    // InternalIDSLParser.g:700:9: ({...}? => (otherlv_17= Position otherlv_18= Colon ( (lv_position_19_0= RULE_SIZE_POS ) ) ) )
                    	    {

                    	    									getUnorderedGroupHelper().select(grammarAccess.getHeadAccess().getUnorderedGroup_2_1_0_1(), 2);
                    	    								
                    	    // InternalIDSLParser.g:703:12: ({...}? => (otherlv_17= Position otherlv_18= Colon ( (lv_position_19_0= RULE_SIZE_POS ) ) ) )
                    	    // InternalIDSLParser.g:703:13: {...}? => (otherlv_17= Position otherlv_18= Colon ( (lv_position_19_0= RULE_SIZE_POS ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleHead", "true");
                    	    }
                    	    // InternalIDSLParser.g:703:22: (otherlv_17= Position otherlv_18= Colon ( (lv_position_19_0= RULE_SIZE_POS ) ) )
                    	    // InternalIDSLParser.g:703:23: otherlv_17= Position otherlv_18= Colon ( (lv_position_19_0= RULE_SIZE_POS ) )
                    	    {
                    	    otherlv_17=(Token)match(input,Position,FOLLOW_3); 

                    	    												newLeafNode(otherlv_17, grammarAccess.getHeadAccess().getPositionKeyword_2_1_0_1_2_0());
                    	    											
                    	    otherlv_18=(Token)match(input,Colon,FOLLOW_9); 

                    	    												newLeafNode(otherlv_18, grammarAccess.getHeadAccess().getColonKeyword_2_1_0_1_2_1());
                    	    											
                    	    // InternalIDSLParser.g:711:12: ( (lv_position_19_0= RULE_SIZE_POS ) )
                    	    // InternalIDSLParser.g:712:13: (lv_position_19_0= RULE_SIZE_POS )
                    	    {
                    	    // InternalIDSLParser.g:712:13: (lv_position_19_0= RULE_SIZE_POS )
                    	    // InternalIDSLParser.g:713:14: lv_position_19_0= RULE_SIZE_POS
                    	    {
                    	    lv_position_19_0=(Token)match(input,RULE_SIZE_POS,FOLLOW_11); 

                    	    														newLeafNode(lv_position_19_0, grammarAccess.getHeadAccess().getPositionSIZE_POSTerminalRuleCall_2_1_0_1_2_2_0());
                    	    													

                    	    														if (current==null) {
                    	    															current = createModelElement(grammarAccess.getHeadRule());
                    	    														}
                    	    														setWithLastConsumed(
                    	    															current,
                    	    															"position",
                    	    															lv_position_19_0,
                    	    															"org.xtext.example.mydsl.IDSL.SIZE_POS");
                    	    													

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    									getUnorderedGroupHelper().returnFromSelection(grammarAccess.getHeadAccess().getUnorderedGroup_2_1_0_1());
                    	    								

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // InternalIDSLParser.g:735:7: ({...}? => ( ({...}? => (otherlv_20= Logo otherlv_21= Colon ( (lv_logo_22_0= ruleLogo ) ) ) ) ) )
                    	    {
                    	    // InternalIDSLParser.g:735:7: ({...}? => ( ({...}? => (otherlv_20= Logo otherlv_21= Colon ( (lv_logo_22_0= ruleLogo ) ) ) ) ) )
                    	    // InternalIDSLParser.g:736:8: {...}? => ( ({...}? => (otherlv_20= Logo otherlv_21= Colon ( (lv_logo_22_0= ruleLogo ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getHeadAccess().getUnorderedGroup_2_1_0_1(), 3) ) {
                    	        throw new FailedPredicateException(input, "ruleHead", "getUnorderedGroupHelper().canSelect(grammarAccess.getHeadAccess().getUnorderedGroup_2_1_0_1(), 3)");
                    	    }
                    	    // InternalIDSLParser.g:736:110: ( ({...}? => (otherlv_20= Logo otherlv_21= Colon ( (lv_logo_22_0= ruleLogo ) ) ) ) )
                    	    // InternalIDSLParser.g:737:9: ({...}? => (otherlv_20= Logo otherlv_21= Colon ( (lv_logo_22_0= ruleLogo ) ) ) )
                    	    {

                    	    									getUnorderedGroupHelper().select(grammarAccess.getHeadAccess().getUnorderedGroup_2_1_0_1(), 3);
                    	    								
                    	    // InternalIDSLParser.g:740:12: ({...}? => (otherlv_20= Logo otherlv_21= Colon ( (lv_logo_22_0= ruleLogo ) ) ) )
                    	    // InternalIDSLParser.g:740:13: {...}? => (otherlv_20= Logo otherlv_21= Colon ( (lv_logo_22_0= ruleLogo ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleHead", "true");
                    	    }
                    	    // InternalIDSLParser.g:740:22: (otherlv_20= Logo otherlv_21= Colon ( (lv_logo_22_0= ruleLogo ) ) )
                    	    // InternalIDSLParser.g:740:23: otherlv_20= Logo otherlv_21= Colon ( (lv_logo_22_0= ruleLogo ) )
                    	    {
                    	    otherlv_20=(Token)match(input,Logo,FOLLOW_3); 

                    	    												newLeafNode(otherlv_20, grammarAccess.getHeadAccess().getLogoKeyword_2_1_0_1_3_0());
                    	    											
                    	    otherlv_21=(Token)match(input,Colon,FOLLOW_12); 

                    	    												newLeafNode(otherlv_21, grammarAccess.getHeadAccess().getColonKeyword_2_1_0_1_3_1());
                    	    											
                    	    // InternalIDSLParser.g:748:12: ( (lv_logo_22_0= ruleLogo ) )
                    	    // InternalIDSLParser.g:749:13: (lv_logo_22_0= ruleLogo )
                    	    {
                    	    // InternalIDSLParser.g:749:13: (lv_logo_22_0= ruleLogo )
                    	    // InternalIDSLParser.g:750:14: lv_logo_22_0= ruleLogo
                    	    {

                    	    														newCompositeNode(grammarAccess.getHeadAccess().getLogoLogoParserRuleCall_2_1_0_1_3_2_0());
                    	    													
                    	    pushFollow(FOLLOW_11);
                    	    lv_logo_22_0=ruleLogo();

                    	    state._fsp--;


                    	    														if (current==null) {
                    	    															current = createModelElementForParent(grammarAccess.getHeadRule());
                    	    														}
                    	    														set(
                    	    															current,
                    	    															"logo",
                    	    															lv_logo_22_0,
                    	    															"org.xtext.example.mydsl.IDSL.Logo");
                    	    														afterParserOrEnumRuleCall();
                    	    													

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    									getUnorderedGroupHelper().returnFromSelection(grammarAccess.getHeadAccess().getUnorderedGroup_2_1_0_1());
                    	    								

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 5 :
                    	    // InternalIDSLParser.g:773:7: ({...}? => ( ({...}? => (otherlv_23= Title otherlv_24= Colon ( (lv_title_25_0= ruleTitle ) ) ) ) ) )
                    	    {
                    	    // InternalIDSLParser.g:773:7: ({...}? => ( ({...}? => (otherlv_23= Title otherlv_24= Colon ( (lv_title_25_0= ruleTitle ) ) ) ) ) )
                    	    // InternalIDSLParser.g:774:8: {...}? => ( ({...}? => (otherlv_23= Title otherlv_24= Colon ( (lv_title_25_0= ruleTitle ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getHeadAccess().getUnorderedGroup_2_1_0_1(), 4) ) {
                    	        throw new FailedPredicateException(input, "ruleHead", "getUnorderedGroupHelper().canSelect(grammarAccess.getHeadAccess().getUnorderedGroup_2_1_0_1(), 4)");
                    	    }
                    	    // InternalIDSLParser.g:774:110: ( ({...}? => (otherlv_23= Title otherlv_24= Colon ( (lv_title_25_0= ruleTitle ) ) ) ) )
                    	    // InternalIDSLParser.g:775:9: ({...}? => (otherlv_23= Title otherlv_24= Colon ( (lv_title_25_0= ruleTitle ) ) ) )
                    	    {

                    	    									getUnorderedGroupHelper().select(grammarAccess.getHeadAccess().getUnorderedGroup_2_1_0_1(), 4);
                    	    								
                    	    // InternalIDSLParser.g:778:12: ({...}? => (otherlv_23= Title otherlv_24= Colon ( (lv_title_25_0= ruleTitle ) ) ) )
                    	    // InternalIDSLParser.g:778:13: {...}? => (otherlv_23= Title otherlv_24= Colon ( (lv_title_25_0= ruleTitle ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleHead", "true");
                    	    }
                    	    // InternalIDSLParser.g:778:22: (otherlv_23= Title otherlv_24= Colon ( (lv_title_25_0= ruleTitle ) ) )
                    	    // InternalIDSLParser.g:778:23: otherlv_23= Title otherlv_24= Colon ( (lv_title_25_0= ruleTitle ) )
                    	    {
                    	    otherlv_23=(Token)match(input,Title,FOLLOW_3); 

                    	    												newLeafNode(otherlv_23, grammarAccess.getHeadAccess().getTitleKeyword_2_1_0_1_4_0());
                    	    											
                    	    otherlv_24=(Token)match(input,Colon,FOLLOW_10); 

                    	    												newLeafNode(otherlv_24, grammarAccess.getHeadAccess().getColonKeyword_2_1_0_1_4_1());
                    	    											
                    	    // InternalIDSLParser.g:786:12: ( (lv_title_25_0= ruleTitle ) )
                    	    // InternalIDSLParser.g:787:13: (lv_title_25_0= ruleTitle )
                    	    {
                    	    // InternalIDSLParser.g:787:13: (lv_title_25_0= ruleTitle )
                    	    // InternalIDSLParser.g:788:14: lv_title_25_0= ruleTitle
                    	    {

                    	    														newCompositeNode(grammarAccess.getHeadAccess().getTitleTitleParserRuleCall_2_1_0_1_4_2_0());
                    	    													
                    	    pushFollow(FOLLOW_11);
                    	    lv_title_25_0=ruleTitle();

                    	    state._fsp--;


                    	    														if (current==null) {
                    	    															current = createModelElementForParent(grammarAccess.getHeadRule());
                    	    														}
                    	    														set(
                    	    															current,
                    	    															"title",
                    	    															lv_title_25_0,
                    	    															"org.xtext.example.mydsl.IDSL.Title");
                    	    														afterParserOrEnumRuleCall();
                    	    													

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    									getUnorderedGroupHelper().returnFromSelection(grammarAccess.getHeadAccess().getUnorderedGroup_2_1_0_1());
                    	    								

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 6 :
                    	    // InternalIDSLParser.g:811:7: ({...}? => ( ({...}? => (otherlv_26= Subtitle otherlv_27= Colon ( (lv_subtitle_28_0= ruleTitle ) ) ) ) ) )
                    	    {
                    	    // InternalIDSLParser.g:811:7: ({...}? => ( ({...}? => (otherlv_26= Subtitle otherlv_27= Colon ( (lv_subtitle_28_0= ruleTitle ) ) ) ) ) )
                    	    // InternalIDSLParser.g:812:8: {...}? => ( ({...}? => (otherlv_26= Subtitle otherlv_27= Colon ( (lv_subtitle_28_0= ruleTitle ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getHeadAccess().getUnorderedGroup_2_1_0_1(), 5) ) {
                    	        throw new FailedPredicateException(input, "ruleHead", "getUnorderedGroupHelper().canSelect(grammarAccess.getHeadAccess().getUnorderedGroup_2_1_0_1(), 5)");
                    	    }
                    	    // InternalIDSLParser.g:812:110: ( ({...}? => (otherlv_26= Subtitle otherlv_27= Colon ( (lv_subtitle_28_0= ruleTitle ) ) ) ) )
                    	    // InternalIDSLParser.g:813:9: ({...}? => (otherlv_26= Subtitle otherlv_27= Colon ( (lv_subtitle_28_0= ruleTitle ) ) ) )
                    	    {

                    	    									getUnorderedGroupHelper().select(grammarAccess.getHeadAccess().getUnorderedGroup_2_1_0_1(), 5);
                    	    								
                    	    // InternalIDSLParser.g:816:12: ({...}? => (otherlv_26= Subtitle otherlv_27= Colon ( (lv_subtitle_28_0= ruleTitle ) ) ) )
                    	    // InternalIDSLParser.g:816:13: {...}? => (otherlv_26= Subtitle otherlv_27= Colon ( (lv_subtitle_28_0= ruleTitle ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleHead", "true");
                    	    }
                    	    // InternalIDSLParser.g:816:22: (otherlv_26= Subtitle otherlv_27= Colon ( (lv_subtitle_28_0= ruleTitle ) ) )
                    	    // InternalIDSLParser.g:816:23: otherlv_26= Subtitle otherlv_27= Colon ( (lv_subtitle_28_0= ruleTitle ) )
                    	    {
                    	    otherlv_26=(Token)match(input,Subtitle,FOLLOW_3); 

                    	    												newLeafNode(otherlv_26, grammarAccess.getHeadAccess().getSubtitleKeyword_2_1_0_1_5_0());
                    	    											
                    	    otherlv_27=(Token)match(input,Colon,FOLLOW_10); 

                    	    												newLeafNode(otherlv_27, grammarAccess.getHeadAccess().getColonKeyword_2_1_0_1_5_1());
                    	    											
                    	    // InternalIDSLParser.g:824:12: ( (lv_subtitle_28_0= ruleTitle ) )
                    	    // InternalIDSLParser.g:825:13: (lv_subtitle_28_0= ruleTitle )
                    	    {
                    	    // InternalIDSLParser.g:825:13: (lv_subtitle_28_0= ruleTitle )
                    	    // InternalIDSLParser.g:826:14: lv_subtitle_28_0= ruleTitle
                    	    {

                    	    														newCompositeNode(grammarAccess.getHeadAccess().getSubtitleTitleParserRuleCall_2_1_0_1_5_2_0());
                    	    													
                    	    pushFollow(FOLLOW_11);
                    	    lv_subtitle_28_0=ruleTitle();

                    	    state._fsp--;


                    	    														if (current==null) {
                    	    															current = createModelElementForParent(grammarAccess.getHeadRule());
                    	    														}
                    	    														set(
                    	    															current,
                    	    															"subtitle",
                    	    															lv_subtitle_28_0,
                    	    															"org.xtext.example.mydsl.IDSL.Title");
                    	    														afterParserOrEnumRuleCall();
                    	    													

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    									getUnorderedGroupHelper().returnFromSelection(grammarAccess.getHeadAccess().getUnorderedGroup_2_1_0_1());
                    	    								

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }


                    }

                     
                    							  getUnorderedGroupHelper().leave(grammarAccess.getHeadAccess().getUnorderedGroup_2_1_0_1());
                    							

                    }


                    }

                    this_END_29=(Token)match(input,RULE_END,FOLLOW_2); 

                    					newLeafNode(this_END_29, grammarAccess.getHeadAccess().getENDTerminalRuleCall_2_1_1());
                    				

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
    // $ANTLR end "ruleHead"


    // $ANTLR start "entryRuleTitle"
    // InternalIDSLParser.g:867:1: entryRuleTitle returns [EObject current=null] : iv_ruleTitle= ruleTitle EOF ;
    public final EObject entryRuleTitle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTitle = null;


        try {
            // InternalIDSLParser.g:867:46: (iv_ruleTitle= ruleTitle EOF )
            // InternalIDSLParser.g:868:2: iv_ruleTitle= ruleTitle EOF
            {
             newCompositeNode(grammarAccess.getTitleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTitle=ruleTitle();

            state._fsp--;

             current =iv_ruleTitle; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTitle"


    // $ANTLR start "ruleTitle"
    // InternalIDSLParser.g:874:1: ruleTitle returns [EObject current=null] : ( ( () otherlv_1= Off ) | ( (this_BEGIN_2= RULE_BEGIN () ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= Align otherlv_6= Colon ( (lv_align_7_0= ruleAlignPossibilities ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Color otherlv_9= Colon ( (lv_color_10_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Font otherlv_12= Colon ( (lv_font_13_0= ruleFONT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Position otherlv_15= Colon ( (lv_position_16_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Maxwidth otherlv_18= Colon ( (lv_maxwidth_19_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= Value otherlv_21= Colon ( (lv_value_22_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ) this_END_23= RULE_END ) ) ;
    public final EObject ruleTitle() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_position_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_maxwidth_19_0=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token lv_value_22_0=null;
        Token this_END_23=null;
        Enumerator lv_align_7_0 = null;

        EObject lv_color_10_0 = null;

        EObject lv_font_13_0 = null;



        	enterRule();

        try {
            // InternalIDSLParser.g:880:2: ( ( ( () otherlv_1= Off ) | ( (this_BEGIN_2= RULE_BEGIN () ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= Align otherlv_6= Colon ( (lv_align_7_0= ruleAlignPossibilities ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Color otherlv_9= Colon ( (lv_color_10_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Font otherlv_12= Colon ( (lv_font_13_0= ruleFONT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Position otherlv_15= Colon ( (lv_position_16_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Maxwidth otherlv_18= Colon ( (lv_maxwidth_19_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= Value otherlv_21= Colon ( (lv_value_22_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ) this_END_23= RULE_END ) ) )
            // InternalIDSLParser.g:881:2: ( ( () otherlv_1= Off ) | ( (this_BEGIN_2= RULE_BEGIN () ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= Align otherlv_6= Colon ( (lv_align_7_0= ruleAlignPossibilities ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Color otherlv_9= Colon ( (lv_color_10_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Font otherlv_12= Colon ( (lv_font_13_0= ruleFONT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Position otherlv_15= Colon ( (lv_position_16_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Maxwidth otherlv_18= Colon ( (lv_maxwidth_19_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= Value otherlv_21= Colon ( (lv_value_22_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ) this_END_23= RULE_END ) )
            {
            // InternalIDSLParser.g:881:2: ( ( () otherlv_1= Off ) | ( (this_BEGIN_2= RULE_BEGIN () ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= Align otherlv_6= Colon ( (lv_align_7_0= ruleAlignPossibilities ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Color otherlv_9= Colon ( (lv_color_10_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Font otherlv_12= Colon ( (lv_font_13_0= ruleFONT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Position otherlv_15= Colon ( (lv_position_16_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Maxwidth otherlv_18= Colon ( (lv_maxwidth_19_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= Value otherlv_21= Colon ( (lv_value_22_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ) this_END_23= RULE_END ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==Off) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_BEGIN) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalIDSLParser.g:882:3: ( () otherlv_1= Off )
                    {
                    // InternalIDSLParser.g:882:3: ( () otherlv_1= Off )
                    // InternalIDSLParser.g:883:4: () otherlv_1= Off
                    {
                    // InternalIDSLParser.g:883:4: ()
                    // InternalIDSLParser.g:884:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTitleAccess().getTitleAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,Off,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getTitleAccess().getOffKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalIDSLParser.g:896:3: ( (this_BEGIN_2= RULE_BEGIN () ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= Align otherlv_6= Colon ( (lv_align_7_0= ruleAlignPossibilities ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Color otherlv_9= Colon ( (lv_color_10_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Font otherlv_12= Colon ( (lv_font_13_0= ruleFONT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Position otherlv_15= Colon ( (lv_position_16_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Maxwidth otherlv_18= Colon ( (lv_maxwidth_19_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= Value otherlv_21= Colon ( (lv_value_22_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ) this_END_23= RULE_END )
                    {
                    // InternalIDSLParser.g:896:3: ( (this_BEGIN_2= RULE_BEGIN () ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= Align otherlv_6= Colon ( (lv_align_7_0= ruleAlignPossibilities ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Color otherlv_9= Colon ( (lv_color_10_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Font otherlv_12= Colon ( (lv_font_13_0= ruleFONT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Position otherlv_15= Colon ( (lv_position_16_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Maxwidth otherlv_18= Colon ( (lv_maxwidth_19_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= Value otherlv_21= Colon ( (lv_value_22_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ) this_END_23= RULE_END )
                    // InternalIDSLParser.g:897:4: (this_BEGIN_2= RULE_BEGIN () ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= Align otherlv_6= Colon ( (lv_align_7_0= ruleAlignPossibilities ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Color otherlv_9= Colon ( (lv_color_10_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Font otherlv_12= Colon ( (lv_font_13_0= ruleFONT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Position otherlv_15= Colon ( (lv_position_16_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Maxwidth otherlv_18= Colon ( (lv_maxwidth_19_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= Value otherlv_21= Colon ( (lv_value_22_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ) this_END_23= RULE_END
                    {
                    // InternalIDSLParser.g:897:4: (this_BEGIN_2= RULE_BEGIN () ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= Align otherlv_6= Colon ( (lv_align_7_0= ruleAlignPossibilities ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Color otherlv_9= Colon ( (lv_color_10_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Font otherlv_12= Colon ( (lv_font_13_0= ruleFONT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Position otherlv_15= Colon ( (lv_position_16_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Maxwidth otherlv_18= Colon ( (lv_maxwidth_19_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= Value otherlv_21= Colon ( (lv_value_22_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) )
                    // InternalIDSLParser.g:898:5: this_BEGIN_2= RULE_BEGIN () ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= Align otherlv_6= Colon ( (lv_align_7_0= ruleAlignPossibilities ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Color otherlv_9= Colon ( (lv_color_10_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Font otherlv_12= Colon ( (lv_font_13_0= ruleFONT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Position otherlv_15= Colon ( (lv_position_16_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Maxwidth otherlv_18= Colon ( (lv_maxwidth_19_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= Value otherlv_21= Colon ( (lv_value_22_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
                    {
                    this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_13); 

                    					newLeafNode(this_BEGIN_2, grammarAccess.getTitleAccess().getBEGINTerminalRuleCall_1_0_0());
                    				
                    // InternalIDSLParser.g:902:5: ()
                    // InternalIDSLParser.g:903:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getTitleAccess().getTitleAction_1_0_1(),
                    							current);
                    					

                    }

                    // InternalIDSLParser.g:909:5: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= Align otherlv_6= Colon ( (lv_align_7_0= ruleAlignPossibilities ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Color otherlv_9= Colon ( (lv_color_10_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Font otherlv_12= Colon ( (lv_font_13_0= ruleFONT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Position otherlv_15= Colon ( (lv_position_16_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Maxwidth otherlv_18= Colon ( (lv_maxwidth_19_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= Value otherlv_21= Colon ( (lv_value_22_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
                    // InternalIDSLParser.g:910:6: ( ( ( ({...}? => ( ({...}? => (otherlv_5= Align otherlv_6= Colon ( (lv_align_7_0= ruleAlignPossibilities ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Color otherlv_9= Colon ( (lv_color_10_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Font otherlv_12= Colon ( (lv_font_13_0= ruleFONT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Position otherlv_15= Colon ( (lv_position_16_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Maxwidth otherlv_18= Colon ( (lv_maxwidth_19_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= Value otherlv_21= Colon ( (lv_value_22_0= RULE_STRING ) ) ) ) ) ) )* ) )
                    {
                    // InternalIDSLParser.g:910:6: ( ( ( ({...}? => ( ({...}? => (otherlv_5= Align otherlv_6= Colon ( (lv_align_7_0= ruleAlignPossibilities ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Color otherlv_9= Colon ( (lv_color_10_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Font otherlv_12= Colon ( (lv_font_13_0= ruleFONT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Position otherlv_15= Colon ( (lv_position_16_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Maxwidth otherlv_18= Colon ( (lv_maxwidth_19_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= Value otherlv_21= Colon ( (lv_value_22_0= RULE_STRING ) ) ) ) ) ) )* ) )
                    // InternalIDSLParser.g:911:7: ( ( ({...}? => ( ({...}? => (otherlv_5= Align otherlv_6= Colon ( (lv_align_7_0= ruleAlignPossibilities ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Color otherlv_9= Colon ( (lv_color_10_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Font otherlv_12= Colon ( (lv_font_13_0= ruleFONT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Position otherlv_15= Colon ( (lv_position_16_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Maxwidth otherlv_18= Colon ( (lv_maxwidth_19_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= Value otherlv_21= Colon ( (lv_value_22_0= RULE_STRING ) ) ) ) ) ) )* )
                    {
                     
                    						  getUnorderedGroupHelper().enter(grammarAccess.getTitleAccess().getUnorderedGroup_1_0_2());
                    						
                    // InternalIDSLParser.g:914:7: ( ( ({...}? => ( ({...}? => (otherlv_5= Align otherlv_6= Colon ( (lv_align_7_0= ruleAlignPossibilities ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Color otherlv_9= Colon ( (lv_color_10_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Font otherlv_12= Colon ( (lv_font_13_0= ruleFONT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Position otherlv_15= Colon ( (lv_position_16_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Maxwidth otherlv_18= Colon ( (lv_maxwidth_19_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= Value otherlv_21= Colon ( (lv_value_22_0= RULE_STRING ) ) ) ) ) ) )* )
                    // InternalIDSLParser.g:915:8: ( ({...}? => ( ({...}? => (otherlv_5= Align otherlv_6= Colon ( (lv_align_7_0= ruleAlignPossibilities ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Color otherlv_9= Colon ( (lv_color_10_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Font otherlv_12= Colon ( (lv_font_13_0= ruleFONT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Position otherlv_15= Colon ( (lv_position_16_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Maxwidth otherlv_18= Colon ( (lv_maxwidth_19_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= Value otherlv_21= Colon ( (lv_value_22_0= RULE_STRING ) ) ) ) ) ) )*
                    {
                    // InternalIDSLParser.g:915:8: ( ({...}? => ( ({...}? => (otherlv_5= Align otherlv_6= Colon ( (lv_align_7_0= ruleAlignPossibilities ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Color otherlv_9= Colon ( (lv_color_10_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Font otherlv_12= Colon ( (lv_font_13_0= ruleFONT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Position otherlv_15= Colon ( (lv_position_16_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Maxwidth otherlv_18= Colon ( (lv_maxwidth_19_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= Value otherlv_21= Colon ( (lv_value_22_0= RULE_STRING ) ) ) ) ) ) )*
                    loop12:
                    do {
                        int alt12=7;
                        int LA12_0 = input.LA(1);

                        if ( LA12_0 == Align && getUnorderedGroupHelper().canSelect(grammarAccess.getTitleAccess().getUnorderedGroup_1_0_2(), 0) ) {
                            alt12=1;
                        }
                        else if ( LA12_0 == Color && getUnorderedGroupHelper().canSelect(grammarAccess.getTitleAccess().getUnorderedGroup_1_0_2(), 1) ) {
                            alt12=2;
                        }
                        else if ( LA12_0 == Font && getUnorderedGroupHelper().canSelect(grammarAccess.getTitleAccess().getUnorderedGroup_1_0_2(), 2) ) {
                            alt12=3;
                        }
                        else if ( LA12_0 == Position && getUnorderedGroupHelper().canSelect(grammarAccess.getTitleAccess().getUnorderedGroup_1_0_2(), 3) ) {
                            alt12=4;
                        }
                        else if ( LA12_0 == Maxwidth && getUnorderedGroupHelper().canSelect(grammarAccess.getTitleAccess().getUnorderedGroup_1_0_2(), 4) ) {
                            alt12=5;
                        }
                        else if ( LA12_0 == Value && getUnorderedGroupHelper().canSelect(grammarAccess.getTitleAccess().getUnorderedGroup_1_0_2(), 5) ) {
                            alt12=6;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalIDSLParser.g:916:6: ({...}? => ( ({...}? => (otherlv_5= Align otherlv_6= Colon ( (lv_align_7_0= ruleAlignPossibilities ) ) ) ) ) )
                    	    {
                    	    // InternalIDSLParser.g:916:6: ({...}? => ( ({...}? => (otherlv_5= Align otherlv_6= Colon ( (lv_align_7_0= ruleAlignPossibilities ) ) ) ) ) )
                    	    // InternalIDSLParser.g:917:7: {...}? => ( ({...}? => (otherlv_5= Align otherlv_6= Colon ( (lv_align_7_0= ruleAlignPossibilities ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTitleAccess().getUnorderedGroup_1_0_2(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleTitle", "getUnorderedGroupHelper().canSelect(grammarAccess.getTitleAccess().getUnorderedGroup_1_0_2(), 0)");
                    	    }
                    	    // InternalIDSLParser.g:917:108: ( ({...}? => (otherlv_5= Align otherlv_6= Colon ( (lv_align_7_0= ruleAlignPossibilities ) ) ) ) )
                    	    // InternalIDSLParser.g:918:8: ({...}? => (otherlv_5= Align otherlv_6= Colon ( (lv_align_7_0= ruleAlignPossibilities ) ) ) )
                    	    {

                    	    								getUnorderedGroupHelper().select(grammarAccess.getTitleAccess().getUnorderedGroup_1_0_2(), 0);
                    	    							
                    	    // InternalIDSLParser.g:921:11: ({...}? => (otherlv_5= Align otherlv_6= Colon ( (lv_align_7_0= ruleAlignPossibilities ) ) ) )
                    	    // InternalIDSLParser.g:921:12: {...}? => (otherlv_5= Align otherlv_6= Colon ( (lv_align_7_0= ruleAlignPossibilities ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleTitle", "true");
                    	    }
                    	    // InternalIDSLParser.g:921:21: (otherlv_5= Align otherlv_6= Colon ( (lv_align_7_0= ruleAlignPossibilities ) ) )
                    	    // InternalIDSLParser.g:921:22: otherlv_5= Align otherlv_6= Colon ( (lv_align_7_0= ruleAlignPossibilities ) )
                    	    {
                    	    otherlv_5=(Token)match(input,Align,FOLLOW_3); 

                    	    											newLeafNode(otherlv_5, grammarAccess.getTitleAccess().getAlignKeyword_1_0_2_0_0());
                    	    										
                    	    otherlv_6=(Token)match(input,Colon,FOLLOW_14); 

                    	    											newLeafNode(otherlv_6, grammarAccess.getTitleAccess().getColonKeyword_1_0_2_0_1());
                    	    										
                    	    // InternalIDSLParser.g:929:11: ( (lv_align_7_0= ruleAlignPossibilities ) )
                    	    // InternalIDSLParser.g:930:12: (lv_align_7_0= ruleAlignPossibilities )
                    	    {
                    	    // InternalIDSLParser.g:930:12: (lv_align_7_0= ruleAlignPossibilities )
                    	    // InternalIDSLParser.g:931:13: lv_align_7_0= ruleAlignPossibilities
                    	    {

                    	    													newCompositeNode(grammarAccess.getTitleAccess().getAlignAlignPossibilitiesEnumRuleCall_1_0_2_0_2_0());
                    	    												
                    	    pushFollow(FOLLOW_13);
                    	    lv_align_7_0=ruleAlignPossibilities();

                    	    state._fsp--;


                    	    													if (current==null) {
                    	    														current = createModelElementForParent(grammarAccess.getTitleRule());
                    	    													}
                    	    													set(
                    	    														current,
                    	    														"align",
                    	    														lv_align_7_0,
                    	    														"org.xtext.example.mydsl.IDSL.AlignPossibilities");
                    	    													afterParserOrEnumRuleCall();
                    	    												

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTitleAccess().getUnorderedGroup_1_0_2());
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalIDSLParser.g:954:6: ({...}? => ( ({...}? => (otherlv_8= Color otherlv_9= Colon ( (lv_color_10_0= ruleColor ) ) ) ) ) )
                    	    {
                    	    // InternalIDSLParser.g:954:6: ({...}? => ( ({...}? => (otherlv_8= Color otherlv_9= Colon ( (lv_color_10_0= ruleColor ) ) ) ) ) )
                    	    // InternalIDSLParser.g:955:7: {...}? => ( ({...}? => (otherlv_8= Color otherlv_9= Colon ( (lv_color_10_0= ruleColor ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTitleAccess().getUnorderedGroup_1_0_2(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleTitle", "getUnorderedGroupHelper().canSelect(grammarAccess.getTitleAccess().getUnorderedGroup_1_0_2(), 1)");
                    	    }
                    	    // InternalIDSLParser.g:955:108: ( ({...}? => (otherlv_8= Color otherlv_9= Colon ( (lv_color_10_0= ruleColor ) ) ) ) )
                    	    // InternalIDSLParser.g:956:8: ({...}? => (otherlv_8= Color otherlv_9= Colon ( (lv_color_10_0= ruleColor ) ) ) )
                    	    {

                    	    								getUnorderedGroupHelper().select(grammarAccess.getTitleAccess().getUnorderedGroup_1_0_2(), 1);
                    	    							
                    	    // InternalIDSLParser.g:959:11: ({...}? => (otherlv_8= Color otherlv_9= Colon ( (lv_color_10_0= ruleColor ) ) ) )
                    	    // InternalIDSLParser.g:959:12: {...}? => (otherlv_8= Color otherlv_9= Colon ( (lv_color_10_0= ruleColor ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleTitle", "true");
                    	    }
                    	    // InternalIDSLParser.g:959:21: (otherlv_8= Color otherlv_9= Colon ( (lv_color_10_0= ruleColor ) ) )
                    	    // InternalIDSLParser.g:959:22: otherlv_8= Color otherlv_9= Colon ( (lv_color_10_0= ruleColor ) )
                    	    {
                    	    otherlv_8=(Token)match(input,Color,FOLLOW_3); 

                    	    											newLeafNode(otherlv_8, grammarAccess.getTitleAccess().getColorKeyword_1_0_2_1_0());
                    	    										
                    	    otherlv_9=(Token)match(input,Colon,FOLLOW_6); 

                    	    											newLeafNode(otherlv_9, grammarAccess.getTitleAccess().getColonKeyword_1_0_2_1_1());
                    	    										
                    	    // InternalIDSLParser.g:967:11: ( (lv_color_10_0= ruleColor ) )
                    	    // InternalIDSLParser.g:968:12: (lv_color_10_0= ruleColor )
                    	    {
                    	    // InternalIDSLParser.g:968:12: (lv_color_10_0= ruleColor )
                    	    // InternalIDSLParser.g:969:13: lv_color_10_0= ruleColor
                    	    {

                    	    													newCompositeNode(grammarAccess.getTitleAccess().getColorColorParserRuleCall_1_0_2_1_2_0());
                    	    												
                    	    pushFollow(FOLLOW_13);
                    	    lv_color_10_0=ruleColor();

                    	    state._fsp--;


                    	    													if (current==null) {
                    	    														current = createModelElementForParent(grammarAccess.getTitleRule());
                    	    													}
                    	    													set(
                    	    														current,
                    	    														"color",
                    	    														lv_color_10_0,
                    	    														"org.xtext.example.mydsl.IDSL.Color");
                    	    													afterParserOrEnumRuleCall();
                    	    												

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTitleAccess().getUnorderedGroup_1_0_2());
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalIDSLParser.g:992:6: ({...}? => ( ({...}? => (otherlv_11= Font otherlv_12= Colon ( (lv_font_13_0= ruleFONT ) ) ) ) ) )
                    	    {
                    	    // InternalIDSLParser.g:992:6: ({...}? => ( ({...}? => (otherlv_11= Font otherlv_12= Colon ( (lv_font_13_0= ruleFONT ) ) ) ) ) )
                    	    // InternalIDSLParser.g:993:7: {...}? => ( ({...}? => (otherlv_11= Font otherlv_12= Colon ( (lv_font_13_0= ruleFONT ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTitleAccess().getUnorderedGroup_1_0_2(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleTitle", "getUnorderedGroupHelper().canSelect(grammarAccess.getTitleAccess().getUnorderedGroup_1_0_2(), 2)");
                    	    }
                    	    // InternalIDSLParser.g:993:108: ( ({...}? => (otherlv_11= Font otherlv_12= Colon ( (lv_font_13_0= ruleFONT ) ) ) ) )
                    	    // InternalIDSLParser.g:994:8: ({...}? => (otherlv_11= Font otherlv_12= Colon ( (lv_font_13_0= ruleFONT ) ) ) )
                    	    {

                    	    								getUnorderedGroupHelper().select(grammarAccess.getTitleAccess().getUnorderedGroup_1_0_2(), 2);
                    	    							
                    	    // InternalIDSLParser.g:997:11: ({...}? => (otherlv_11= Font otherlv_12= Colon ( (lv_font_13_0= ruleFONT ) ) ) )
                    	    // InternalIDSLParser.g:997:12: {...}? => (otherlv_11= Font otherlv_12= Colon ( (lv_font_13_0= ruleFONT ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleTitle", "true");
                    	    }
                    	    // InternalIDSLParser.g:997:21: (otherlv_11= Font otherlv_12= Colon ( (lv_font_13_0= ruleFONT ) ) )
                    	    // InternalIDSLParser.g:997:22: otherlv_11= Font otherlv_12= Colon ( (lv_font_13_0= ruleFONT ) )
                    	    {
                    	    otherlv_11=(Token)match(input,Font,FOLLOW_3); 

                    	    											newLeafNode(otherlv_11, grammarAccess.getTitleAccess().getFontKeyword_1_0_2_2_0());
                    	    										
                    	    otherlv_12=(Token)match(input,Colon,FOLLOW_15); 

                    	    											newLeafNode(otherlv_12, grammarAccess.getTitleAccess().getColonKeyword_1_0_2_2_1());
                    	    										
                    	    // InternalIDSLParser.g:1005:11: ( (lv_font_13_0= ruleFONT ) )
                    	    // InternalIDSLParser.g:1006:12: (lv_font_13_0= ruleFONT )
                    	    {
                    	    // InternalIDSLParser.g:1006:12: (lv_font_13_0= ruleFONT )
                    	    // InternalIDSLParser.g:1007:13: lv_font_13_0= ruleFONT
                    	    {

                    	    													newCompositeNode(grammarAccess.getTitleAccess().getFontFONTParserRuleCall_1_0_2_2_2_0());
                    	    												
                    	    pushFollow(FOLLOW_13);
                    	    lv_font_13_0=ruleFONT();

                    	    state._fsp--;


                    	    													if (current==null) {
                    	    														current = createModelElementForParent(grammarAccess.getTitleRule());
                    	    													}
                    	    													set(
                    	    														current,
                    	    														"font",
                    	    														lv_font_13_0,
                    	    														"org.xtext.example.mydsl.IDSL.FONT");
                    	    													afterParserOrEnumRuleCall();
                    	    												

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTitleAccess().getUnorderedGroup_1_0_2());
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // InternalIDSLParser.g:1030:6: ({...}? => ( ({...}? => (otherlv_14= Position otherlv_15= Colon ( (lv_position_16_0= RULE_SIZE_POS ) ) ) ) ) )
                    	    {
                    	    // InternalIDSLParser.g:1030:6: ({...}? => ( ({...}? => (otherlv_14= Position otherlv_15= Colon ( (lv_position_16_0= RULE_SIZE_POS ) ) ) ) ) )
                    	    // InternalIDSLParser.g:1031:7: {...}? => ( ({...}? => (otherlv_14= Position otherlv_15= Colon ( (lv_position_16_0= RULE_SIZE_POS ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTitleAccess().getUnorderedGroup_1_0_2(), 3) ) {
                    	        throw new FailedPredicateException(input, "ruleTitle", "getUnorderedGroupHelper().canSelect(grammarAccess.getTitleAccess().getUnorderedGroup_1_0_2(), 3)");
                    	    }
                    	    // InternalIDSLParser.g:1031:108: ( ({...}? => (otherlv_14= Position otherlv_15= Colon ( (lv_position_16_0= RULE_SIZE_POS ) ) ) ) )
                    	    // InternalIDSLParser.g:1032:8: ({...}? => (otherlv_14= Position otherlv_15= Colon ( (lv_position_16_0= RULE_SIZE_POS ) ) ) )
                    	    {

                    	    								getUnorderedGroupHelper().select(grammarAccess.getTitleAccess().getUnorderedGroup_1_0_2(), 3);
                    	    							
                    	    // InternalIDSLParser.g:1035:11: ({...}? => (otherlv_14= Position otherlv_15= Colon ( (lv_position_16_0= RULE_SIZE_POS ) ) ) )
                    	    // InternalIDSLParser.g:1035:12: {...}? => (otherlv_14= Position otherlv_15= Colon ( (lv_position_16_0= RULE_SIZE_POS ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleTitle", "true");
                    	    }
                    	    // InternalIDSLParser.g:1035:21: (otherlv_14= Position otherlv_15= Colon ( (lv_position_16_0= RULE_SIZE_POS ) ) )
                    	    // InternalIDSLParser.g:1035:22: otherlv_14= Position otherlv_15= Colon ( (lv_position_16_0= RULE_SIZE_POS ) )
                    	    {
                    	    otherlv_14=(Token)match(input,Position,FOLLOW_3); 

                    	    											newLeafNode(otherlv_14, grammarAccess.getTitleAccess().getPositionKeyword_1_0_2_3_0());
                    	    										
                    	    otherlv_15=(Token)match(input,Colon,FOLLOW_9); 

                    	    											newLeafNode(otherlv_15, grammarAccess.getTitleAccess().getColonKeyword_1_0_2_3_1());
                    	    										
                    	    // InternalIDSLParser.g:1043:11: ( (lv_position_16_0= RULE_SIZE_POS ) )
                    	    // InternalIDSLParser.g:1044:12: (lv_position_16_0= RULE_SIZE_POS )
                    	    {
                    	    // InternalIDSLParser.g:1044:12: (lv_position_16_0= RULE_SIZE_POS )
                    	    // InternalIDSLParser.g:1045:13: lv_position_16_0= RULE_SIZE_POS
                    	    {
                    	    lv_position_16_0=(Token)match(input,RULE_SIZE_POS,FOLLOW_13); 

                    	    													newLeafNode(lv_position_16_0, grammarAccess.getTitleAccess().getPositionSIZE_POSTerminalRuleCall_1_0_2_3_2_0());
                    	    												

                    	    													if (current==null) {
                    	    														current = createModelElement(grammarAccess.getTitleRule());
                    	    													}
                    	    													setWithLastConsumed(
                    	    														current,
                    	    														"position",
                    	    														lv_position_16_0,
                    	    														"org.xtext.example.mydsl.IDSL.SIZE_POS");
                    	    												

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTitleAccess().getUnorderedGroup_1_0_2());
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 5 :
                    	    // InternalIDSLParser.g:1067:6: ({...}? => ( ({...}? => (otherlv_17= Maxwidth otherlv_18= Colon ( (lv_maxwidth_19_0= RULE_INT ) ) ) ) ) )
                    	    {
                    	    // InternalIDSLParser.g:1067:6: ({...}? => ( ({...}? => (otherlv_17= Maxwidth otherlv_18= Colon ( (lv_maxwidth_19_0= RULE_INT ) ) ) ) ) )
                    	    // InternalIDSLParser.g:1068:7: {...}? => ( ({...}? => (otherlv_17= Maxwidth otherlv_18= Colon ( (lv_maxwidth_19_0= RULE_INT ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTitleAccess().getUnorderedGroup_1_0_2(), 4) ) {
                    	        throw new FailedPredicateException(input, "ruleTitle", "getUnorderedGroupHelper().canSelect(grammarAccess.getTitleAccess().getUnorderedGroup_1_0_2(), 4)");
                    	    }
                    	    // InternalIDSLParser.g:1068:108: ( ({...}? => (otherlv_17= Maxwidth otherlv_18= Colon ( (lv_maxwidth_19_0= RULE_INT ) ) ) ) )
                    	    // InternalIDSLParser.g:1069:8: ({...}? => (otherlv_17= Maxwidth otherlv_18= Colon ( (lv_maxwidth_19_0= RULE_INT ) ) ) )
                    	    {

                    	    								getUnorderedGroupHelper().select(grammarAccess.getTitleAccess().getUnorderedGroup_1_0_2(), 4);
                    	    							
                    	    // InternalIDSLParser.g:1072:11: ({...}? => (otherlv_17= Maxwidth otherlv_18= Colon ( (lv_maxwidth_19_0= RULE_INT ) ) ) )
                    	    // InternalIDSLParser.g:1072:12: {...}? => (otherlv_17= Maxwidth otherlv_18= Colon ( (lv_maxwidth_19_0= RULE_INT ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleTitle", "true");
                    	    }
                    	    // InternalIDSLParser.g:1072:21: (otherlv_17= Maxwidth otherlv_18= Colon ( (lv_maxwidth_19_0= RULE_INT ) ) )
                    	    // InternalIDSLParser.g:1072:22: otherlv_17= Maxwidth otherlv_18= Colon ( (lv_maxwidth_19_0= RULE_INT ) )
                    	    {
                    	    otherlv_17=(Token)match(input,Maxwidth,FOLLOW_3); 

                    	    											newLeafNode(otherlv_17, grammarAccess.getTitleAccess().getMaxwidthKeyword_1_0_2_4_0());
                    	    										
                    	    otherlv_18=(Token)match(input,Colon,FOLLOW_16); 

                    	    											newLeafNode(otherlv_18, grammarAccess.getTitleAccess().getColonKeyword_1_0_2_4_1());
                    	    										
                    	    // InternalIDSLParser.g:1080:11: ( (lv_maxwidth_19_0= RULE_INT ) )
                    	    // InternalIDSLParser.g:1081:12: (lv_maxwidth_19_0= RULE_INT )
                    	    {
                    	    // InternalIDSLParser.g:1081:12: (lv_maxwidth_19_0= RULE_INT )
                    	    // InternalIDSLParser.g:1082:13: lv_maxwidth_19_0= RULE_INT
                    	    {
                    	    lv_maxwidth_19_0=(Token)match(input,RULE_INT,FOLLOW_13); 

                    	    													newLeafNode(lv_maxwidth_19_0, grammarAccess.getTitleAccess().getMaxwidthINTTerminalRuleCall_1_0_2_4_2_0());
                    	    												

                    	    													if (current==null) {
                    	    														current = createModelElement(grammarAccess.getTitleRule());
                    	    													}
                    	    													setWithLastConsumed(
                    	    														current,
                    	    														"maxwidth",
                    	    														lv_maxwidth_19_0,
                    	    														"org.eclipse.xtext.common.Terminals.INT");
                    	    												

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTitleAccess().getUnorderedGroup_1_0_2());
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 6 :
                    	    // InternalIDSLParser.g:1104:6: ({...}? => ( ({...}? => (otherlv_20= Value otherlv_21= Colon ( (lv_value_22_0= RULE_STRING ) ) ) ) ) )
                    	    {
                    	    // InternalIDSLParser.g:1104:6: ({...}? => ( ({...}? => (otherlv_20= Value otherlv_21= Colon ( (lv_value_22_0= RULE_STRING ) ) ) ) ) )
                    	    // InternalIDSLParser.g:1105:7: {...}? => ( ({...}? => (otherlv_20= Value otherlv_21= Colon ( (lv_value_22_0= RULE_STRING ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTitleAccess().getUnorderedGroup_1_0_2(), 5) ) {
                    	        throw new FailedPredicateException(input, "ruleTitle", "getUnorderedGroupHelper().canSelect(grammarAccess.getTitleAccess().getUnorderedGroup_1_0_2(), 5)");
                    	    }
                    	    // InternalIDSLParser.g:1105:108: ( ({...}? => (otherlv_20= Value otherlv_21= Colon ( (lv_value_22_0= RULE_STRING ) ) ) ) )
                    	    // InternalIDSLParser.g:1106:8: ({...}? => (otherlv_20= Value otherlv_21= Colon ( (lv_value_22_0= RULE_STRING ) ) ) )
                    	    {

                    	    								getUnorderedGroupHelper().select(grammarAccess.getTitleAccess().getUnorderedGroup_1_0_2(), 5);
                    	    							
                    	    // InternalIDSLParser.g:1109:11: ({...}? => (otherlv_20= Value otherlv_21= Colon ( (lv_value_22_0= RULE_STRING ) ) ) )
                    	    // InternalIDSLParser.g:1109:12: {...}? => (otherlv_20= Value otherlv_21= Colon ( (lv_value_22_0= RULE_STRING ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleTitle", "true");
                    	    }
                    	    // InternalIDSLParser.g:1109:21: (otherlv_20= Value otherlv_21= Colon ( (lv_value_22_0= RULE_STRING ) ) )
                    	    // InternalIDSLParser.g:1109:22: otherlv_20= Value otherlv_21= Colon ( (lv_value_22_0= RULE_STRING ) )
                    	    {
                    	    otherlv_20=(Token)match(input,Value,FOLLOW_3); 

                    	    											newLeafNode(otherlv_20, grammarAccess.getTitleAccess().getValueKeyword_1_0_2_5_0());
                    	    										
                    	    otherlv_21=(Token)match(input,Colon,FOLLOW_8); 

                    	    											newLeafNode(otherlv_21, grammarAccess.getTitleAccess().getColonKeyword_1_0_2_5_1());
                    	    										
                    	    // InternalIDSLParser.g:1117:11: ( (lv_value_22_0= RULE_STRING ) )
                    	    // InternalIDSLParser.g:1118:12: (lv_value_22_0= RULE_STRING )
                    	    {
                    	    // InternalIDSLParser.g:1118:12: (lv_value_22_0= RULE_STRING )
                    	    // InternalIDSLParser.g:1119:13: lv_value_22_0= RULE_STRING
                    	    {
                    	    lv_value_22_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

                    	    													newLeafNode(lv_value_22_0, grammarAccess.getTitleAccess().getValueSTRINGTerminalRuleCall_1_0_2_5_2_0());
                    	    												

                    	    													if (current==null) {
                    	    														current = createModelElement(grammarAccess.getTitleRule());
                    	    													}
                    	    													setWithLastConsumed(
                    	    														current,
                    	    														"value",
                    	    														lv_value_22_0,
                    	    														"org.eclipse.xtext.common.Terminals.STRING");
                    	    												

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTitleAccess().getUnorderedGroup_1_0_2());
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }


                    }

                     
                    						  getUnorderedGroupHelper().leave(grammarAccess.getTitleAccess().getUnorderedGroup_1_0_2());
                    						

                    }


                    }

                    this_END_23=(Token)match(input,RULE_END,FOLLOW_2); 

                    				newLeafNode(this_END_23, grammarAccess.getTitleAccess().getENDTerminalRuleCall_1_1());
                    			

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
    // $ANTLR end "ruleTitle"


    // $ANTLR start "entryRuleLogo"
    // InternalIDSLParser.g:1158:1: entryRuleLogo returns [EObject current=null] : iv_ruleLogo= ruleLogo EOF ;
    public final EObject entryRuleLogo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogo = null;


        try {
            // InternalIDSLParser.g:1158:45: (iv_ruleLogo= ruleLogo EOF )
            // InternalIDSLParser.g:1159:2: iv_ruleLogo= ruleLogo EOF
            {
             newCompositeNode(grammarAccess.getLogoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogo=ruleLogo();

            state._fsp--;

             current =iv_ruleLogo; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLogo"


    // $ANTLR start "ruleLogo"
    // InternalIDSLParser.g:1165:1: ruleLogo returns [EObject current=null] : (this_BEGIN_0= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Size otherlv_3= Colon ( (lv_size_4_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Position otherlv_6= Colon ( (lv_position_7_0= RULE_SIZE_POS ) ) ) ) ) ) )+ {...}?) ) ) this_END_8= RULE_END ) ;
    public final EObject ruleLogo() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_size_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_position_7_0=null;
        Token this_END_8=null;


        	enterRule();

        try {
            // InternalIDSLParser.g:1171:2: ( (this_BEGIN_0= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Size otherlv_3= Colon ( (lv_size_4_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Position otherlv_6= Colon ( (lv_position_7_0= RULE_SIZE_POS ) ) ) ) ) ) )+ {...}?) ) ) this_END_8= RULE_END ) )
            // InternalIDSLParser.g:1172:2: (this_BEGIN_0= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Size otherlv_3= Colon ( (lv_size_4_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Position otherlv_6= Colon ( (lv_position_7_0= RULE_SIZE_POS ) ) ) ) ) ) )+ {...}?) ) ) this_END_8= RULE_END )
            {
            // InternalIDSLParser.g:1172:2: (this_BEGIN_0= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Size otherlv_3= Colon ( (lv_size_4_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Position otherlv_6= Colon ( (lv_position_7_0= RULE_SIZE_POS ) ) ) ) ) ) )+ {...}?) ) ) this_END_8= RULE_END )
            // InternalIDSLParser.g:1173:3: this_BEGIN_0= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Size otherlv_3= Colon ( (lv_size_4_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Position otherlv_6= Colon ( (lv_position_7_0= RULE_SIZE_POS ) ) ) ) ) ) )+ {...}?) ) ) this_END_8= RULE_END
            {
            this_BEGIN_0=(Token)match(input,RULE_BEGIN,FOLLOW_17); 

            			newLeafNode(this_BEGIN_0, grammarAccess.getLogoAccess().getBEGINTerminalRuleCall_0());
            		
            // InternalIDSLParser.g:1177:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Size otherlv_3= Colon ( (lv_size_4_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Position otherlv_6= Colon ( (lv_position_7_0= RULE_SIZE_POS ) ) ) ) ) ) )+ {...}?) ) )
            // InternalIDSLParser.g:1178:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Size otherlv_3= Colon ( (lv_size_4_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Position otherlv_6= Colon ( (lv_position_7_0= RULE_SIZE_POS ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalIDSLParser.g:1178:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Size otherlv_3= Colon ( (lv_size_4_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Position otherlv_6= Colon ( (lv_position_7_0= RULE_SIZE_POS ) ) ) ) ) ) )+ {...}?) )
            // InternalIDSLParser.g:1179:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Size otherlv_3= Colon ( (lv_size_4_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Position otherlv_6= Colon ( (lv_position_7_0= RULE_SIZE_POS ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getLogoAccess().getUnorderedGroup_1());
            				
            // InternalIDSLParser.g:1182:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Size otherlv_3= Colon ( (lv_size_4_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Position otherlv_6= Colon ( (lv_position_7_0= RULE_SIZE_POS ) ) ) ) ) ) )+ {...}?)
            // InternalIDSLParser.g:1183:6: ( ({...}? => ( ({...}? => (otherlv_2= Size otherlv_3= Colon ( (lv_size_4_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Position otherlv_6= Colon ( (lv_position_7_0= RULE_SIZE_POS ) ) ) ) ) ) )+ {...}?
            {
            // InternalIDSLParser.g:1183:6: ( ({...}? => ( ({...}? => (otherlv_2= Size otherlv_3= Colon ( (lv_size_4_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Position otherlv_6= Colon ( (lv_position_7_0= RULE_SIZE_POS ) ) ) ) ) ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=3;
                int LA14_0 = input.LA(1);

                if ( LA14_0 == Size && getUnorderedGroupHelper().canSelect(grammarAccess.getLogoAccess().getUnorderedGroup_1(), 0) ) {
                    alt14=1;
                }
                else if ( LA14_0 == Position && getUnorderedGroupHelper().canSelect(grammarAccess.getLogoAccess().getUnorderedGroup_1(), 1) ) {
                    alt14=2;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalIDSLParser.g:1184:4: ({...}? => ( ({...}? => (otherlv_2= Size otherlv_3= Colon ( (lv_size_4_0= RULE_SIZE_POS ) ) ) ) ) )
            	    {
            	    // InternalIDSLParser.g:1184:4: ({...}? => ( ({...}? => (otherlv_2= Size otherlv_3= Colon ( (lv_size_4_0= RULE_SIZE_POS ) ) ) ) ) )
            	    // InternalIDSLParser.g:1185:5: {...}? => ( ({...}? => (otherlv_2= Size otherlv_3= Colon ( (lv_size_4_0= RULE_SIZE_POS ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLogoAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleLogo", "getUnorderedGroupHelper().canSelect(grammarAccess.getLogoAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalIDSLParser.g:1185:101: ( ({...}? => (otherlv_2= Size otherlv_3= Colon ( (lv_size_4_0= RULE_SIZE_POS ) ) ) ) )
            	    // InternalIDSLParser.g:1186:6: ({...}? => (otherlv_2= Size otherlv_3= Colon ( (lv_size_4_0= RULE_SIZE_POS ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLogoAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalIDSLParser.g:1189:9: ({...}? => (otherlv_2= Size otherlv_3= Colon ( (lv_size_4_0= RULE_SIZE_POS ) ) ) )
            	    // InternalIDSLParser.g:1189:10: {...}? => (otherlv_2= Size otherlv_3= Colon ( (lv_size_4_0= RULE_SIZE_POS ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLogo", "true");
            	    }
            	    // InternalIDSLParser.g:1189:19: (otherlv_2= Size otherlv_3= Colon ( (lv_size_4_0= RULE_SIZE_POS ) ) )
            	    // InternalIDSLParser.g:1189:20: otherlv_2= Size otherlv_3= Colon ( (lv_size_4_0= RULE_SIZE_POS ) )
            	    {
            	    otherlv_2=(Token)match(input,Size,FOLLOW_3); 

            	    									newLeafNode(otherlv_2, grammarAccess.getLogoAccess().getSizeKeyword_1_0_0());
            	    								
            	    otherlv_3=(Token)match(input,Colon,FOLLOW_9); 

            	    									newLeafNode(otherlv_3, grammarAccess.getLogoAccess().getColonKeyword_1_0_1());
            	    								
            	    // InternalIDSLParser.g:1197:9: ( (lv_size_4_0= RULE_SIZE_POS ) )
            	    // InternalIDSLParser.g:1198:10: (lv_size_4_0= RULE_SIZE_POS )
            	    {
            	    // InternalIDSLParser.g:1198:10: (lv_size_4_0= RULE_SIZE_POS )
            	    // InternalIDSLParser.g:1199:11: lv_size_4_0= RULE_SIZE_POS
            	    {
            	    lv_size_4_0=(Token)match(input,RULE_SIZE_POS,FOLLOW_18); 

            	    											newLeafNode(lv_size_4_0, grammarAccess.getLogoAccess().getSizeSIZE_POSTerminalRuleCall_1_0_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getLogoRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"size",
            	    												lv_size_4_0,
            	    												"org.xtext.example.mydsl.IDSL.SIZE_POS");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLogoAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalIDSLParser.g:1221:4: ({...}? => ( ({...}? => (otherlv_5= Position otherlv_6= Colon ( (lv_position_7_0= RULE_SIZE_POS ) ) ) ) ) )
            	    {
            	    // InternalIDSLParser.g:1221:4: ({...}? => ( ({...}? => (otherlv_5= Position otherlv_6= Colon ( (lv_position_7_0= RULE_SIZE_POS ) ) ) ) ) )
            	    // InternalIDSLParser.g:1222:5: {...}? => ( ({...}? => (otherlv_5= Position otherlv_6= Colon ( (lv_position_7_0= RULE_SIZE_POS ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLogoAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleLogo", "getUnorderedGroupHelper().canSelect(grammarAccess.getLogoAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalIDSLParser.g:1222:101: ( ({...}? => (otherlv_5= Position otherlv_6= Colon ( (lv_position_7_0= RULE_SIZE_POS ) ) ) ) )
            	    // InternalIDSLParser.g:1223:6: ({...}? => (otherlv_5= Position otherlv_6= Colon ( (lv_position_7_0= RULE_SIZE_POS ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLogoAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalIDSLParser.g:1226:9: ({...}? => (otherlv_5= Position otherlv_6= Colon ( (lv_position_7_0= RULE_SIZE_POS ) ) ) )
            	    // InternalIDSLParser.g:1226:10: {...}? => (otherlv_5= Position otherlv_6= Colon ( (lv_position_7_0= RULE_SIZE_POS ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLogo", "true");
            	    }
            	    // InternalIDSLParser.g:1226:19: (otherlv_5= Position otherlv_6= Colon ( (lv_position_7_0= RULE_SIZE_POS ) ) )
            	    // InternalIDSLParser.g:1226:20: otherlv_5= Position otherlv_6= Colon ( (lv_position_7_0= RULE_SIZE_POS ) )
            	    {
            	    otherlv_5=(Token)match(input,Position,FOLLOW_3); 

            	    									newLeafNode(otherlv_5, grammarAccess.getLogoAccess().getPositionKeyword_1_1_0());
            	    								
            	    otherlv_6=(Token)match(input,Colon,FOLLOW_9); 

            	    									newLeafNode(otherlv_6, grammarAccess.getLogoAccess().getColonKeyword_1_1_1());
            	    								
            	    // InternalIDSLParser.g:1234:9: ( (lv_position_7_0= RULE_SIZE_POS ) )
            	    // InternalIDSLParser.g:1235:10: (lv_position_7_0= RULE_SIZE_POS )
            	    {
            	    // InternalIDSLParser.g:1235:10: (lv_position_7_0= RULE_SIZE_POS )
            	    // InternalIDSLParser.g:1236:11: lv_position_7_0= RULE_SIZE_POS
            	    {
            	    lv_position_7_0=(Token)match(input,RULE_SIZE_POS,FOLLOW_18); 

            	    											newLeafNode(lv_position_7_0, grammarAccess.getLogoAccess().getPositionSIZE_POSTerminalRuleCall_1_1_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getLogoRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"position",
            	    												lv_position_7_0,
            	    												"org.xtext.example.mydsl.IDSL.SIZE_POS");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLogoAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getLogoAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleLogo", "getUnorderedGroupHelper().canLeave(grammarAccess.getLogoAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getLogoAccess().getUnorderedGroup_1());
            				

            }

            this_END_8=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_8, grammarAccess.getLogoAccess().getENDTerminalRuleCall_2());
            		

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
    // $ANTLR end "ruleLogo"


    // $ANTLR start "entryRuleBox"
    // InternalIDSLParser.g:1274:1: entryRuleBox returns [EObject current=null] : iv_ruleBox= ruleBox EOF ;
    public final EObject entryRuleBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBox = null;


        try {
            // InternalIDSLParser.g:1274:44: (iv_ruleBox= ruleBox EOF )
            // InternalIDSLParser.g:1275:2: iv_ruleBox= ruleBox EOF
            {
             newCompositeNode(grammarAccess.getBoxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBox=ruleBox();

            state._fsp--;

             current =iv_ruleBox; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBox"


    // $ANTLR start "ruleBox"
    // InternalIDSLParser.g:1281:1: ruleBox returns [EObject current=null] : ( ( (lv_name_0_0= RULE_BOXID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_bgcolor_6_0= ruleColor ) ) ) | (otherlv_7= Bgpattern otherlv_8= Colon ( (lv_bgpattern_9_0= rulePattern ) ) ) | (otherlv_10= Bgimage otherlv_11= Colon ( (lv_bgimage_12_0= ruleImageSrc ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Size otherlv_14= Colon ( (lv_size_15_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Position otherlv_17= Colon ( (lv_position_18_0= RULE_SIZE_POS ) ) ) ) ) ) )+ {...}?) ) ) this_END_19= RULE_END ) ;
    public final EObject ruleBox() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_size_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_position_18_0=null;
        Token this_END_19=null;
        EObject lv_bgcolor_6_0 = null;

        AntlrDatatypeRuleToken lv_bgpattern_9_0 = null;

        AntlrDatatypeRuleToken lv_bgimage_12_0 = null;



        	enterRule();

        try {
            // InternalIDSLParser.g:1287:2: ( ( ( (lv_name_0_0= RULE_BOXID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_bgcolor_6_0= ruleColor ) ) ) | (otherlv_7= Bgpattern otherlv_8= Colon ( (lv_bgpattern_9_0= rulePattern ) ) ) | (otherlv_10= Bgimage otherlv_11= Colon ( (lv_bgimage_12_0= ruleImageSrc ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Size otherlv_14= Colon ( (lv_size_15_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Position otherlv_17= Colon ( (lv_position_18_0= RULE_SIZE_POS ) ) ) ) ) ) )+ {...}?) ) ) this_END_19= RULE_END ) )
            // InternalIDSLParser.g:1288:2: ( ( (lv_name_0_0= RULE_BOXID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_bgcolor_6_0= ruleColor ) ) ) | (otherlv_7= Bgpattern otherlv_8= Colon ( (lv_bgpattern_9_0= rulePattern ) ) ) | (otherlv_10= Bgimage otherlv_11= Colon ( (lv_bgimage_12_0= ruleImageSrc ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Size otherlv_14= Colon ( (lv_size_15_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Position otherlv_17= Colon ( (lv_position_18_0= RULE_SIZE_POS ) ) ) ) ) ) )+ {...}?) ) ) this_END_19= RULE_END )
            {
            // InternalIDSLParser.g:1288:2: ( ( (lv_name_0_0= RULE_BOXID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_bgcolor_6_0= ruleColor ) ) ) | (otherlv_7= Bgpattern otherlv_8= Colon ( (lv_bgpattern_9_0= rulePattern ) ) ) | (otherlv_10= Bgimage otherlv_11= Colon ( (lv_bgimage_12_0= ruleImageSrc ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Size otherlv_14= Colon ( (lv_size_15_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Position otherlv_17= Colon ( (lv_position_18_0= RULE_SIZE_POS ) ) ) ) ) ) )+ {...}?) ) ) this_END_19= RULE_END )
            // InternalIDSLParser.g:1289:3: ( (lv_name_0_0= RULE_BOXID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_bgcolor_6_0= ruleColor ) ) ) | (otherlv_7= Bgpattern otherlv_8= Colon ( (lv_bgpattern_9_0= rulePattern ) ) ) | (otherlv_10= Bgimage otherlv_11= Colon ( (lv_bgimage_12_0= ruleImageSrc ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Size otherlv_14= Colon ( (lv_size_15_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Position otherlv_17= Colon ( (lv_position_18_0= RULE_SIZE_POS ) ) ) ) ) ) )+ {...}?) ) ) this_END_19= RULE_END
            {
            // InternalIDSLParser.g:1289:3: ( (lv_name_0_0= RULE_BOXID ) )
            // InternalIDSLParser.g:1290:4: (lv_name_0_0= RULE_BOXID )
            {
            // InternalIDSLParser.g:1290:4: (lv_name_0_0= RULE_BOXID )
            // InternalIDSLParser.g:1291:5: lv_name_0_0= RULE_BOXID
            {
            lv_name_0_0=(Token)match(input,RULE_BOXID,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getBoxAccess().getNameBOXIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBoxRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.mydsl.IDSL.BOXID");
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getBoxAccess().getColonKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_19); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getBoxAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalIDSLParser.g:1315:3: ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_bgcolor_6_0= ruleColor ) ) ) | (otherlv_7= Bgpattern otherlv_8= Colon ( (lv_bgpattern_9_0= rulePattern ) ) ) | (otherlv_10= Bgimage otherlv_11= Colon ( (lv_bgimage_12_0= ruleImageSrc ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Size otherlv_14= Colon ( (lv_size_15_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Position otherlv_17= Colon ( (lv_position_18_0= RULE_SIZE_POS ) ) ) ) ) ) )+ {...}?) ) )
            // InternalIDSLParser.g:1316:4: ( ( ( ({...}? => ( ({...}? => ( (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_bgcolor_6_0= ruleColor ) ) ) | (otherlv_7= Bgpattern otherlv_8= Colon ( (lv_bgpattern_9_0= rulePattern ) ) ) | (otherlv_10= Bgimage otherlv_11= Colon ( (lv_bgimage_12_0= ruleImageSrc ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Size otherlv_14= Colon ( (lv_size_15_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Position otherlv_17= Colon ( (lv_position_18_0= RULE_SIZE_POS ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalIDSLParser.g:1316:4: ( ( ( ({...}? => ( ({...}? => ( (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_bgcolor_6_0= ruleColor ) ) ) | (otherlv_7= Bgpattern otherlv_8= Colon ( (lv_bgpattern_9_0= rulePattern ) ) ) | (otherlv_10= Bgimage otherlv_11= Colon ( (lv_bgimage_12_0= ruleImageSrc ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Size otherlv_14= Colon ( (lv_size_15_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Position otherlv_17= Colon ( (lv_position_18_0= RULE_SIZE_POS ) ) ) ) ) ) )+ {...}?) )
            // InternalIDSLParser.g:1317:5: ( ( ({...}? => ( ({...}? => ( (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_bgcolor_6_0= ruleColor ) ) ) | (otherlv_7= Bgpattern otherlv_8= Colon ( (lv_bgpattern_9_0= rulePattern ) ) ) | (otherlv_10= Bgimage otherlv_11= Colon ( (lv_bgimage_12_0= ruleImageSrc ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Size otherlv_14= Colon ( (lv_size_15_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Position otherlv_17= Colon ( (lv_position_18_0= RULE_SIZE_POS ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getBoxAccess().getUnorderedGroup_3());
            				
            // InternalIDSLParser.g:1320:5: ( ( ({...}? => ( ({...}? => ( (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_bgcolor_6_0= ruleColor ) ) ) | (otherlv_7= Bgpattern otherlv_8= Colon ( (lv_bgpattern_9_0= rulePattern ) ) ) | (otherlv_10= Bgimage otherlv_11= Colon ( (lv_bgimage_12_0= ruleImageSrc ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Size otherlv_14= Colon ( (lv_size_15_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Position otherlv_17= Colon ( (lv_position_18_0= RULE_SIZE_POS ) ) ) ) ) ) )+ {...}?)
            // InternalIDSLParser.g:1321:6: ( ({...}? => ( ({...}? => ( (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_bgcolor_6_0= ruleColor ) ) ) | (otherlv_7= Bgpattern otherlv_8= Colon ( (lv_bgpattern_9_0= rulePattern ) ) ) | (otherlv_10= Bgimage otherlv_11= Colon ( (lv_bgimage_12_0= ruleImageSrc ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Size otherlv_14= Colon ( (lv_size_15_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Position otherlv_17= Colon ( (lv_position_18_0= RULE_SIZE_POS ) ) ) ) ) ) )+ {...}?
            {
            // InternalIDSLParser.g:1321:6: ( ({...}? => ( ({...}? => ( (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_bgcolor_6_0= ruleColor ) ) ) | (otherlv_7= Bgpattern otherlv_8= Colon ( (lv_bgpattern_9_0= rulePattern ) ) ) | (otherlv_10= Bgimage otherlv_11= Colon ( (lv_bgimage_12_0= ruleImageSrc ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Size otherlv_14= Colon ( (lv_size_15_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Position otherlv_17= Colon ( (lv_position_18_0= RULE_SIZE_POS ) ) ) ) ) ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=4;
                int LA16_0 = input.LA(1);

                if ( ( LA16_0 == Bgpattern || LA16_0 >= Bgcolor && LA16_0 <= Bgimage ) && getUnorderedGroupHelper().canSelect(grammarAccess.getBoxAccess().getUnorderedGroup_3(), 0) ) {
                    alt16=1;
                }
                else if ( LA16_0 == Size && getUnorderedGroupHelper().canSelect(grammarAccess.getBoxAccess().getUnorderedGroup_3(), 1) ) {
                    alt16=2;
                }
                else if ( LA16_0 == Position && getUnorderedGroupHelper().canSelect(grammarAccess.getBoxAccess().getUnorderedGroup_3(), 2) ) {
                    alt16=3;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalIDSLParser.g:1322:4: ({...}? => ( ({...}? => ( (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_bgcolor_6_0= ruleColor ) ) ) | (otherlv_7= Bgpattern otherlv_8= Colon ( (lv_bgpattern_9_0= rulePattern ) ) ) | (otherlv_10= Bgimage otherlv_11= Colon ( (lv_bgimage_12_0= ruleImageSrc ) ) ) ) ) ) )
            	    {
            	    // InternalIDSLParser.g:1322:4: ({...}? => ( ({...}? => ( (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_bgcolor_6_0= ruleColor ) ) ) | (otherlv_7= Bgpattern otherlv_8= Colon ( (lv_bgpattern_9_0= rulePattern ) ) ) | (otherlv_10= Bgimage otherlv_11= Colon ( (lv_bgimage_12_0= ruleImageSrc ) ) ) ) ) ) )
            	    // InternalIDSLParser.g:1323:5: {...}? => ( ({...}? => ( (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_bgcolor_6_0= ruleColor ) ) ) | (otherlv_7= Bgpattern otherlv_8= Colon ( (lv_bgpattern_9_0= rulePattern ) ) ) | (otherlv_10= Bgimage otherlv_11= Colon ( (lv_bgimage_12_0= ruleImageSrc ) ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBoxAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleBox", "getUnorderedGroupHelper().canSelect(grammarAccess.getBoxAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalIDSLParser.g:1323:100: ( ({...}? => ( (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_bgcolor_6_0= ruleColor ) ) ) | (otherlv_7= Bgpattern otherlv_8= Colon ( (lv_bgpattern_9_0= rulePattern ) ) ) | (otherlv_10= Bgimage otherlv_11= Colon ( (lv_bgimage_12_0= ruleImageSrc ) ) ) ) ) )
            	    // InternalIDSLParser.g:1324:6: ({...}? => ( (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_bgcolor_6_0= ruleColor ) ) ) | (otherlv_7= Bgpattern otherlv_8= Colon ( (lv_bgpattern_9_0= rulePattern ) ) ) | (otherlv_10= Bgimage otherlv_11= Colon ( (lv_bgimage_12_0= ruleImageSrc ) ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getBoxAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalIDSLParser.g:1327:9: ({...}? => ( (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_bgcolor_6_0= ruleColor ) ) ) | (otherlv_7= Bgpattern otherlv_8= Colon ( (lv_bgpattern_9_0= rulePattern ) ) ) | (otherlv_10= Bgimage otherlv_11= Colon ( (lv_bgimage_12_0= ruleImageSrc ) ) ) ) )
            	    // InternalIDSLParser.g:1327:10: {...}? => ( (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_bgcolor_6_0= ruleColor ) ) ) | (otherlv_7= Bgpattern otherlv_8= Colon ( (lv_bgpattern_9_0= rulePattern ) ) ) | (otherlv_10= Bgimage otherlv_11= Colon ( (lv_bgimage_12_0= ruleImageSrc ) ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBox", "true");
            	    }
            	    // InternalIDSLParser.g:1327:19: ( (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_bgcolor_6_0= ruleColor ) ) ) | (otherlv_7= Bgpattern otherlv_8= Colon ( (lv_bgpattern_9_0= rulePattern ) ) ) | (otherlv_10= Bgimage otherlv_11= Colon ( (lv_bgimage_12_0= ruleImageSrc ) ) ) )
            	    int alt15=3;
            	    switch ( input.LA(1) ) {
            	    case Bgcolor:
            	        {
            	        alt15=1;
            	        }
            	        break;
            	    case Bgpattern:
            	        {
            	        alt15=2;
            	        }
            	        break;
            	    case Bgimage:
            	        {
            	        alt15=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt15) {
            	        case 1 :
            	            // InternalIDSLParser.g:1327:20: (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_bgcolor_6_0= ruleColor ) ) )
            	            {
            	            // InternalIDSLParser.g:1327:20: (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_bgcolor_6_0= ruleColor ) ) )
            	            // InternalIDSLParser.g:1328:10: otherlv_4= Bgcolor otherlv_5= Colon ( (lv_bgcolor_6_0= ruleColor ) )
            	            {
            	            otherlv_4=(Token)match(input,Bgcolor,FOLLOW_3); 

            	            										newLeafNode(otherlv_4, grammarAccess.getBoxAccess().getBgcolorKeyword_3_0_0_0());
            	            									
            	            otherlv_5=(Token)match(input,Colon,FOLLOW_6); 

            	            										newLeafNode(otherlv_5, grammarAccess.getBoxAccess().getColonKeyword_3_0_0_1());
            	            									
            	            // InternalIDSLParser.g:1336:10: ( (lv_bgcolor_6_0= ruleColor ) )
            	            // InternalIDSLParser.g:1337:11: (lv_bgcolor_6_0= ruleColor )
            	            {
            	            // InternalIDSLParser.g:1337:11: (lv_bgcolor_6_0= ruleColor )
            	            // InternalIDSLParser.g:1338:12: lv_bgcolor_6_0= ruleColor
            	            {

            	            												newCompositeNode(grammarAccess.getBoxAccess().getBgcolorColorParserRuleCall_3_0_0_2_0());
            	            											
            	            pushFollow(FOLLOW_20);
            	            lv_bgcolor_6_0=ruleColor();

            	            state._fsp--;


            	            												if (current==null) {
            	            													current = createModelElementForParent(grammarAccess.getBoxRule());
            	            												}
            	            												set(
            	            													current,
            	            													"bgcolor",
            	            													lv_bgcolor_6_0,
            	            													"org.xtext.example.mydsl.IDSL.Color");
            	            												afterParserOrEnumRuleCall();
            	            											

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalIDSLParser.g:1357:9: (otherlv_7= Bgpattern otherlv_8= Colon ( (lv_bgpattern_9_0= rulePattern ) ) )
            	            {
            	            // InternalIDSLParser.g:1357:9: (otherlv_7= Bgpattern otherlv_8= Colon ( (lv_bgpattern_9_0= rulePattern ) ) )
            	            // InternalIDSLParser.g:1358:10: otherlv_7= Bgpattern otherlv_8= Colon ( (lv_bgpattern_9_0= rulePattern ) )
            	            {
            	            otherlv_7=(Token)match(input,Bgpattern,FOLLOW_3); 

            	            										newLeafNode(otherlv_7, grammarAccess.getBoxAccess().getBgpatternKeyword_3_0_1_0());
            	            									
            	            otherlv_8=(Token)match(input,Colon,FOLLOW_7); 

            	            										newLeafNode(otherlv_8, grammarAccess.getBoxAccess().getColonKeyword_3_0_1_1());
            	            									
            	            // InternalIDSLParser.g:1366:10: ( (lv_bgpattern_9_0= rulePattern ) )
            	            // InternalIDSLParser.g:1367:11: (lv_bgpattern_9_0= rulePattern )
            	            {
            	            // InternalIDSLParser.g:1367:11: (lv_bgpattern_9_0= rulePattern )
            	            // InternalIDSLParser.g:1368:12: lv_bgpattern_9_0= rulePattern
            	            {

            	            												newCompositeNode(grammarAccess.getBoxAccess().getBgpatternPatternParserRuleCall_3_0_1_2_0());
            	            											
            	            pushFollow(FOLLOW_20);
            	            lv_bgpattern_9_0=rulePattern();

            	            state._fsp--;


            	            												if (current==null) {
            	            													current = createModelElementForParent(grammarAccess.getBoxRule());
            	            												}
            	            												set(
            	            													current,
            	            													"bgpattern",
            	            													lv_bgpattern_9_0,
            	            													"org.xtext.example.mydsl.IDSL.Pattern");
            	            												afterParserOrEnumRuleCall();
            	            											

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalIDSLParser.g:1387:9: (otherlv_10= Bgimage otherlv_11= Colon ( (lv_bgimage_12_0= ruleImageSrc ) ) )
            	            {
            	            // InternalIDSLParser.g:1387:9: (otherlv_10= Bgimage otherlv_11= Colon ( (lv_bgimage_12_0= ruleImageSrc ) ) )
            	            // InternalIDSLParser.g:1388:10: otherlv_10= Bgimage otherlv_11= Colon ( (lv_bgimage_12_0= ruleImageSrc ) )
            	            {
            	            otherlv_10=(Token)match(input,Bgimage,FOLLOW_3); 

            	            										newLeafNode(otherlv_10, grammarAccess.getBoxAccess().getBgimageKeyword_3_0_2_0());
            	            									
            	            otherlv_11=(Token)match(input,Colon,FOLLOW_8); 

            	            										newLeafNode(otherlv_11, grammarAccess.getBoxAccess().getColonKeyword_3_0_2_1());
            	            									
            	            // InternalIDSLParser.g:1396:10: ( (lv_bgimage_12_0= ruleImageSrc ) )
            	            // InternalIDSLParser.g:1397:11: (lv_bgimage_12_0= ruleImageSrc )
            	            {
            	            // InternalIDSLParser.g:1397:11: (lv_bgimage_12_0= ruleImageSrc )
            	            // InternalIDSLParser.g:1398:12: lv_bgimage_12_0= ruleImageSrc
            	            {

            	            												newCompositeNode(grammarAccess.getBoxAccess().getBgimageImageSrcParserRuleCall_3_0_2_2_0());
            	            											
            	            pushFollow(FOLLOW_20);
            	            lv_bgimage_12_0=ruleImageSrc();

            	            state._fsp--;


            	            												if (current==null) {
            	            													current = createModelElementForParent(grammarAccess.getBoxRule());
            	            												}
            	            												set(
            	            													current,
            	            													"bgimage",
            	            													lv_bgimage_12_0,
            	            													"org.xtext.example.mydsl.IDSL.ImageSrc");
            	            												afterParserOrEnumRuleCall();
            	            											

            	            }


            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBoxAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalIDSLParser.g:1422:4: ({...}? => ( ({...}? => (otherlv_13= Size otherlv_14= Colon ( (lv_size_15_0= RULE_SIZE_POS ) ) ) ) ) )
            	    {
            	    // InternalIDSLParser.g:1422:4: ({...}? => ( ({...}? => (otherlv_13= Size otherlv_14= Colon ( (lv_size_15_0= RULE_SIZE_POS ) ) ) ) ) )
            	    // InternalIDSLParser.g:1423:5: {...}? => ( ({...}? => (otherlv_13= Size otherlv_14= Colon ( (lv_size_15_0= RULE_SIZE_POS ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBoxAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleBox", "getUnorderedGroupHelper().canSelect(grammarAccess.getBoxAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalIDSLParser.g:1423:100: ( ({...}? => (otherlv_13= Size otherlv_14= Colon ( (lv_size_15_0= RULE_SIZE_POS ) ) ) ) )
            	    // InternalIDSLParser.g:1424:6: ({...}? => (otherlv_13= Size otherlv_14= Colon ( (lv_size_15_0= RULE_SIZE_POS ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getBoxAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalIDSLParser.g:1427:9: ({...}? => (otherlv_13= Size otherlv_14= Colon ( (lv_size_15_0= RULE_SIZE_POS ) ) ) )
            	    // InternalIDSLParser.g:1427:10: {...}? => (otherlv_13= Size otherlv_14= Colon ( (lv_size_15_0= RULE_SIZE_POS ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBox", "true");
            	    }
            	    // InternalIDSLParser.g:1427:19: (otherlv_13= Size otherlv_14= Colon ( (lv_size_15_0= RULE_SIZE_POS ) ) )
            	    // InternalIDSLParser.g:1427:20: otherlv_13= Size otherlv_14= Colon ( (lv_size_15_0= RULE_SIZE_POS ) )
            	    {
            	    otherlv_13=(Token)match(input,Size,FOLLOW_3); 

            	    									newLeafNode(otherlv_13, grammarAccess.getBoxAccess().getSizeKeyword_3_1_0());
            	    								
            	    otherlv_14=(Token)match(input,Colon,FOLLOW_9); 

            	    									newLeafNode(otherlv_14, grammarAccess.getBoxAccess().getColonKeyword_3_1_1());
            	    								
            	    // InternalIDSLParser.g:1435:9: ( (lv_size_15_0= RULE_SIZE_POS ) )
            	    // InternalIDSLParser.g:1436:10: (lv_size_15_0= RULE_SIZE_POS )
            	    {
            	    // InternalIDSLParser.g:1436:10: (lv_size_15_0= RULE_SIZE_POS )
            	    // InternalIDSLParser.g:1437:11: lv_size_15_0= RULE_SIZE_POS
            	    {
            	    lv_size_15_0=(Token)match(input,RULE_SIZE_POS,FOLLOW_20); 

            	    											newLeafNode(lv_size_15_0, grammarAccess.getBoxAccess().getSizeSIZE_POSTerminalRuleCall_3_1_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getBoxRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"size",
            	    												lv_size_15_0,
            	    												"org.xtext.example.mydsl.IDSL.SIZE_POS");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBoxAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalIDSLParser.g:1459:4: ({...}? => ( ({...}? => (otherlv_16= Position otherlv_17= Colon ( (lv_position_18_0= RULE_SIZE_POS ) ) ) ) ) )
            	    {
            	    // InternalIDSLParser.g:1459:4: ({...}? => ( ({...}? => (otherlv_16= Position otherlv_17= Colon ( (lv_position_18_0= RULE_SIZE_POS ) ) ) ) ) )
            	    // InternalIDSLParser.g:1460:5: {...}? => ( ({...}? => (otherlv_16= Position otherlv_17= Colon ( (lv_position_18_0= RULE_SIZE_POS ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBoxAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleBox", "getUnorderedGroupHelper().canSelect(grammarAccess.getBoxAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalIDSLParser.g:1460:100: ( ({...}? => (otherlv_16= Position otherlv_17= Colon ( (lv_position_18_0= RULE_SIZE_POS ) ) ) ) )
            	    // InternalIDSLParser.g:1461:6: ({...}? => (otherlv_16= Position otherlv_17= Colon ( (lv_position_18_0= RULE_SIZE_POS ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getBoxAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalIDSLParser.g:1464:9: ({...}? => (otherlv_16= Position otherlv_17= Colon ( (lv_position_18_0= RULE_SIZE_POS ) ) ) )
            	    // InternalIDSLParser.g:1464:10: {...}? => (otherlv_16= Position otherlv_17= Colon ( (lv_position_18_0= RULE_SIZE_POS ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBox", "true");
            	    }
            	    // InternalIDSLParser.g:1464:19: (otherlv_16= Position otherlv_17= Colon ( (lv_position_18_0= RULE_SIZE_POS ) ) )
            	    // InternalIDSLParser.g:1464:20: otherlv_16= Position otherlv_17= Colon ( (lv_position_18_0= RULE_SIZE_POS ) )
            	    {
            	    otherlv_16=(Token)match(input,Position,FOLLOW_3); 

            	    									newLeafNode(otherlv_16, grammarAccess.getBoxAccess().getPositionKeyword_3_2_0());
            	    								
            	    otherlv_17=(Token)match(input,Colon,FOLLOW_9); 

            	    									newLeafNode(otherlv_17, grammarAccess.getBoxAccess().getColonKeyword_3_2_1());
            	    								
            	    // InternalIDSLParser.g:1472:9: ( (lv_position_18_0= RULE_SIZE_POS ) )
            	    // InternalIDSLParser.g:1473:10: (lv_position_18_0= RULE_SIZE_POS )
            	    {
            	    // InternalIDSLParser.g:1473:10: (lv_position_18_0= RULE_SIZE_POS )
            	    // InternalIDSLParser.g:1474:11: lv_position_18_0= RULE_SIZE_POS
            	    {
            	    lv_position_18_0=(Token)match(input,RULE_SIZE_POS,FOLLOW_20); 

            	    											newLeafNode(lv_position_18_0, grammarAccess.getBoxAccess().getPositionSIZE_POSTerminalRuleCall_3_2_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getBoxRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"position",
            	    												lv_position_18_0,
            	    												"org.xtext.example.mydsl.IDSL.SIZE_POS");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBoxAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getBoxAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleBox", "getUnorderedGroupHelper().canLeave(grammarAccess.getBoxAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getBoxAccess().getUnorderedGroup_3());
            				

            }

            this_END_19=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_19, grammarAccess.getBoxAccess().getENDTerminalRuleCall_4());
            		

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
    // $ANTLR end "ruleBox"


    // $ANTLR start "entryRuleText"
    // InternalIDSLParser.g:1512:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // InternalIDSLParser.g:1512:45: (iv_ruleText= ruleText EOF )
            // InternalIDSLParser.g:1513:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // InternalIDSLParser.g:1519:1: ruleText returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_TEXTID ) ) otherlv_1= Colon (this_BEGIN_2= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= Align otherlv_5= Colon ( (lv_align_6_0= ruleAlignPossibilities ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Color otherlv_8= Colon ( (lv_color_9_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Font otherlv_11= Colon ( (lv_font_12_0= ruleFONT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Lineheight otherlv_14= Colon ( (lv_lineheight_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Position otherlv_17= Colon ( (lv_position_18_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Maxwidth otherlv_20= Colon ( (lv_maxwidth_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Value otherlv_23= Colon ( (lv_value_24_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) this_END_25= RULE_END ) ) | ( ( (lv_name_26_0= RULE_TITLETEXTID ) ) otherlv_27= Colon (this_BEGIN_28= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_30= Align otherlv_31= Colon ( (lv_align_32_0= ruleAlignPossibilities ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Color otherlv_34= Colon ( (lv_color_35_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= Font otherlv_37= Colon ( (lv_font_38_0= ruleFONT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Position otherlv_40= Colon ( (lv_position_41_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= Maxwidth otherlv_43= Colon ( (lv_maxwidth_44_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= Value otherlv_46= Colon ( (lv_value_47_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) this_END_48= RULE_END ) ) ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_lineheight_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_position_18_0=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token lv_maxwidth_21_0=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token lv_value_24_0=null;
        Token this_END_25=null;
        Token lv_name_26_0=null;
        Token otherlv_27=null;
        Token this_BEGIN_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token lv_position_41_0=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        Token lv_maxwidth_44_0=null;
        Token otherlv_45=null;
        Token otherlv_46=null;
        Token lv_value_47_0=null;
        Token this_END_48=null;
        Enumerator lv_align_6_0 = null;

        EObject lv_color_9_0 = null;

        EObject lv_font_12_0 = null;

        Enumerator lv_align_32_0 = null;

        EObject lv_color_35_0 = null;

        EObject lv_font_38_0 = null;



        	enterRule();

        try {
            // InternalIDSLParser.g:1525:2: ( ( ( ( (lv_name_0_0= RULE_TEXTID ) ) otherlv_1= Colon (this_BEGIN_2= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= Align otherlv_5= Colon ( (lv_align_6_0= ruleAlignPossibilities ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Color otherlv_8= Colon ( (lv_color_9_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Font otherlv_11= Colon ( (lv_font_12_0= ruleFONT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Lineheight otherlv_14= Colon ( (lv_lineheight_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Position otherlv_17= Colon ( (lv_position_18_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Maxwidth otherlv_20= Colon ( (lv_maxwidth_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Value otherlv_23= Colon ( (lv_value_24_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) this_END_25= RULE_END ) ) | ( ( (lv_name_26_0= RULE_TITLETEXTID ) ) otherlv_27= Colon (this_BEGIN_28= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_30= Align otherlv_31= Colon ( (lv_align_32_0= ruleAlignPossibilities ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Color otherlv_34= Colon ( (lv_color_35_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= Font otherlv_37= Colon ( (lv_font_38_0= ruleFONT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Position otherlv_40= Colon ( (lv_position_41_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= Maxwidth otherlv_43= Colon ( (lv_maxwidth_44_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= Value otherlv_46= Colon ( (lv_value_47_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) this_END_48= RULE_END ) ) ) )
            // InternalIDSLParser.g:1526:2: ( ( ( (lv_name_0_0= RULE_TEXTID ) ) otherlv_1= Colon (this_BEGIN_2= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= Align otherlv_5= Colon ( (lv_align_6_0= ruleAlignPossibilities ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Color otherlv_8= Colon ( (lv_color_9_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Font otherlv_11= Colon ( (lv_font_12_0= ruleFONT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Lineheight otherlv_14= Colon ( (lv_lineheight_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Position otherlv_17= Colon ( (lv_position_18_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Maxwidth otherlv_20= Colon ( (lv_maxwidth_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Value otherlv_23= Colon ( (lv_value_24_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) this_END_25= RULE_END ) ) | ( ( (lv_name_26_0= RULE_TITLETEXTID ) ) otherlv_27= Colon (this_BEGIN_28= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_30= Align otherlv_31= Colon ( (lv_align_32_0= ruleAlignPossibilities ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Color otherlv_34= Colon ( (lv_color_35_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= Font otherlv_37= Colon ( (lv_font_38_0= ruleFONT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Position otherlv_40= Colon ( (lv_position_41_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= Maxwidth otherlv_43= Colon ( (lv_maxwidth_44_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= Value otherlv_46= Colon ( (lv_value_47_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) this_END_48= RULE_END ) ) )
            {
            // InternalIDSLParser.g:1526:2: ( ( ( (lv_name_0_0= RULE_TEXTID ) ) otherlv_1= Colon (this_BEGIN_2= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= Align otherlv_5= Colon ( (lv_align_6_0= ruleAlignPossibilities ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Color otherlv_8= Colon ( (lv_color_9_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Font otherlv_11= Colon ( (lv_font_12_0= ruleFONT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Lineheight otherlv_14= Colon ( (lv_lineheight_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Position otherlv_17= Colon ( (lv_position_18_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Maxwidth otherlv_20= Colon ( (lv_maxwidth_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Value otherlv_23= Colon ( (lv_value_24_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) this_END_25= RULE_END ) ) | ( ( (lv_name_26_0= RULE_TITLETEXTID ) ) otherlv_27= Colon (this_BEGIN_28= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_30= Align otherlv_31= Colon ( (lv_align_32_0= ruleAlignPossibilities ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Color otherlv_34= Colon ( (lv_color_35_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= Font otherlv_37= Colon ( (lv_font_38_0= ruleFONT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Position otherlv_40= Colon ( (lv_position_41_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= Maxwidth otherlv_43= Colon ( (lv_maxwidth_44_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= Value otherlv_46= Colon ( (lv_value_47_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) this_END_48= RULE_END ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_TEXTID) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_TITLETEXTID) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalIDSLParser.g:1527:3: ( ( (lv_name_0_0= RULE_TEXTID ) ) otherlv_1= Colon (this_BEGIN_2= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= Align otherlv_5= Colon ( (lv_align_6_0= ruleAlignPossibilities ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Color otherlv_8= Colon ( (lv_color_9_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Font otherlv_11= Colon ( (lv_font_12_0= ruleFONT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Lineheight otherlv_14= Colon ( (lv_lineheight_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Position otherlv_17= Colon ( (lv_position_18_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Maxwidth otherlv_20= Colon ( (lv_maxwidth_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Value otherlv_23= Colon ( (lv_value_24_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) this_END_25= RULE_END ) )
                    {
                    // InternalIDSLParser.g:1527:3: ( ( (lv_name_0_0= RULE_TEXTID ) ) otherlv_1= Colon (this_BEGIN_2= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= Align otherlv_5= Colon ( (lv_align_6_0= ruleAlignPossibilities ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Color otherlv_8= Colon ( (lv_color_9_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Font otherlv_11= Colon ( (lv_font_12_0= ruleFONT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Lineheight otherlv_14= Colon ( (lv_lineheight_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Position otherlv_17= Colon ( (lv_position_18_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Maxwidth otherlv_20= Colon ( (lv_maxwidth_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Value otherlv_23= Colon ( (lv_value_24_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) this_END_25= RULE_END ) )
                    // InternalIDSLParser.g:1528:4: ( (lv_name_0_0= RULE_TEXTID ) ) otherlv_1= Colon (this_BEGIN_2= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= Align otherlv_5= Colon ( (lv_align_6_0= ruleAlignPossibilities ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Color otherlv_8= Colon ( (lv_color_9_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Font otherlv_11= Colon ( (lv_font_12_0= ruleFONT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Lineheight otherlv_14= Colon ( (lv_lineheight_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Position otherlv_17= Colon ( (lv_position_18_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Maxwidth otherlv_20= Colon ( (lv_maxwidth_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Value otherlv_23= Colon ( (lv_value_24_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) this_END_25= RULE_END )
                    {
                    // InternalIDSLParser.g:1528:4: ( (lv_name_0_0= RULE_TEXTID ) )
                    // InternalIDSLParser.g:1529:5: (lv_name_0_0= RULE_TEXTID )
                    {
                    // InternalIDSLParser.g:1529:5: (lv_name_0_0= RULE_TEXTID )
                    // InternalIDSLParser.g:1530:6: lv_name_0_0= RULE_TEXTID
                    {
                    lv_name_0_0=(Token)match(input,RULE_TEXTID,FOLLOW_3); 

                    						newLeafNode(lv_name_0_0, grammarAccess.getTextAccess().getNameTEXTIDTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTextRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_0_0,
                    							"org.xtext.example.mydsl.IDSL.TEXTID");
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,Colon,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getTextAccess().getColonKeyword_0_1());
                    			
                    // InternalIDSLParser.g:1550:4: (this_BEGIN_2= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= Align otherlv_5= Colon ( (lv_align_6_0= ruleAlignPossibilities ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Color otherlv_8= Colon ( (lv_color_9_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Font otherlv_11= Colon ( (lv_font_12_0= ruleFONT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Lineheight otherlv_14= Colon ( (lv_lineheight_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Position otherlv_17= Colon ( (lv_position_18_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Maxwidth otherlv_20= Colon ( (lv_maxwidth_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Value otherlv_23= Colon ( (lv_value_24_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) this_END_25= RULE_END )
                    // InternalIDSLParser.g:1551:5: this_BEGIN_2= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= Align otherlv_5= Colon ( (lv_align_6_0= ruleAlignPossibilities ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Color otherlv_8= Colon ( (lv_color_9_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Font otherlv_11= Colon ( (lv_font_12_0= ruleFONT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Lineheight otherlv_14= Colon ( (lv_lineheight_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Position otherlv_17= Colon ( (lv_position_18_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Maxwidth otherlv_20= Colon ( (lv_maxwidth_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Value otherlv_23= Colon ( (lv_value_24_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) this_END_25= RULE_END
                    {
                    this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_21); 

                    					newLeafNode(this_BEGIN_2, grammarAccess.getTextAccess().getBEGINTerminalRuleCall_0_2_0());
                    				
                    // InternalIDSLParser.g:1555:5: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= Align otherlv_5= Colon ( (lv_align_6_0= ruleAlignPossibilities ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Color otherlv_8= Colon ( (lv_color_9_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Font otherlv_11= Colon ( (lv_font_12_0= ruleFONT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Lineheight otherlv_14= Colon ( (lv_lineheight_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Position otherlv_17= Colon ( (lv_position_18_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Maxwidth otherlv_20= Colon ( (lv_maxwidth_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Value otherlv_23= Colon ( (lv_value_24_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )
                    // InternalIDSLParser.g:1556:6: ( ( ( ({...}? => ( ({...}? => (otherlv_4= Align otherlv_5= Colon ( (lv_align_6_0= ruleAlignPossibilities ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Color otherlv_8= Colon ( (lv_color_9_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Font otherlv_11= Colon ( (lv_font_12_0= ruleFONT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Lineheight otherlv_14= Colon ( (lv_lineheight_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Position otherlv_17= Colon ( (lv_position_18_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Maxwidth otherlv_20= Colon ( (lv_maxwidth_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Value otherlv_23= Colon ( (lv_value_24_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
                    {
                    // InternalIDSLParser.g:1556:6: ( ( ( ({...}? => ( ({...}? => (otherlv_4= Align otherlv_5= Colon ( (lv_align_6_0= ruleAlignPossibilities ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Color otherlv_8= Colon ( (lv_color_9_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Font otherlv_11= Colon ( (lv_font_12_0= ruleFONT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Lineheight otherlv_14= Colon ( (lv_lineheight_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Position otherlv_17= Colon ( (lv_position_18_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Maxwidth otherlv_20= Colon ( (lv_maxwidth_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Value otherlv_23= Colon ( (lv_value_24_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
                    // InternalIDSLParser.g:1557:7: ( ( ({...}? => ( ({...}? => (otherlv_4= Align otherlv_5= Colon ( (lv_align_6_0= ruleAlignPossibilities ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Color otherlv_8= Colon ( (lv_color_9_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Font otherlv_11= Colon ( (lv_font_12_0= ruleFONT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Lineheight otherlv_14= Colon ( (lv_lineheight_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Position otherlv_17= Colon ( (lv_position_18_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Maxwidth otherlv_20= Colon ( (lv_maxwidth_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Value otherlv_23= Colon ( (lv_value_24_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
                    {
                     
                    						  getUnorderedGroupHelper().enter(grammarAccess.getTextAccess().getUnorderedGroup_0_2_1());
                    						
                    // InternalIDSLParser.g:1560:7: ( ( ({...}? => ( ({...}? => (otherlv_4= Align otherlv_5= Colon ( (lv_align_6_0= ruleAlignPossibilities ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Color otherlv_8= Colon ( (lv_color_9_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Font otherlv_11= Colon ( (lv_font_12_0= ruleFONT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Lineheight otherlv_14= Colon ( (lv_lineheight_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Position otherlv_17= Colon ( (lv_position_18_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Maxwidth otherlv_20= Colon ( (lv_maxwidth_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Value otherlv_23= Colon ( (lv_value_24_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
                    // InternalIDSLParser.g:1561:8: ( ({...}? => ( ({...}? => (otherlv_4= Align otherlv_5= Colon ( (lv_align_6_0= ruleAlignPossibilities ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Color otherlv_8= Colon ( (lv_color_9_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Font otherlv_11= Colon ( (lv_font_12_0= ruleFONT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Lineheight otherlv_14= Colon ( (lv_lineheight_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Position otherlv_17= Colon ( (lv_position_18_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Maxwidth otherlv_20= Colon ( (lv_maxwidth_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Value otherlv_23= Colon ( (lv_value_24_0= RULE_STRING ) ) ) ) ) ) )+ {...}?
                    {
                    // InternalIDSLParser.g:1561:8: ( ({...}? => ( ({...}? => (otherlv_4= Align otherlv_5= Colon ( (lv_align_6_0= ruleAlignPossibilities ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Color otherlv_8= Colon ( (lv_color_9_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Font otherlv_11= Colon ( (lv_font_12_0= ruleFONT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Lineheight otherlv_14= Colon ( (lv_lineheight_15_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Position otherlv_17= Colon ( (lv_position_18_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Maxwidth otherlv_20= Colon ( (lv_maxwidth_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Value otherlv_23= Colon ( (lv_value_24_0= RULE_STRING ) ) ) ) ) ) )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=8;
                        int LA17_0 = input.LA(1);

                        if ( LA17_0 == Align && getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_0_2_1(), 0) ) {
                            alt17=1;
                        }
                        else if ( LA17_0 == Color && getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_0_2_1(), 1) ) {
                            alt17=2;
                        }
                        else if ( LA17_0 == Font && getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_0_2_1(), 2) ) {
                            alt17=3;
                        }
                        else if ( LA17_0 == Lineheight && getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_0_2_1(), 3) ) {
                            alt17=4;
                        }
                        else if ( LA17_0 == Position && getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_0_2_1(), 4) ) {
                            alt17=5;
                        }
                        else if ( LA17_0 == Maxwidth && getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_0_2_1(), 5) ) {
                            alt17=6;
                        }
                        else if ( LA17_0 == Value && getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_0_2_1(), 6) ) {
                            alt17=7;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalIDSLParser.g:1562:6: ({...}? => ( ({...}? => (otherlv_4= Align otherlv_5= Colon ( (lv_align_6_0= ruleAlignPossibilities ) ) ) ) ) )
                    	    {
                    	    // InternalIDSLParser.g:1562:6: ({...}? => ( ({...}? => (otherlv_4= Align otherlv_5= Colon ( (lv_align_6_0= ruleAlignPossibilities ) ) ) ) ) )
                    	    // InternalIDSLParser.g:1563:7: {...}? => ( ({...}? => (otherlv_4= Align otherlv_5= Colon ( (lv_align_6_0= ruleAlignPossibilities ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_0_2_1(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_0_2_1(), 0)");
                    	    }
                    	    // InternalIDSLParser.g:1563:107: ( ({...}? => (otherlv_4= Align otherlv_5= Colon ( (lv_align_6_0= ruleAlignPossibilities ) ) ) ) )
                    	    // InternalIDSLParser.g:1564:8: ({...}? => (otherlv_4= Align otherlv_5= Colon ( (lv_align_6_0= ruleAlignPossibilities ) ) ) )
                    	    {

                    	    								getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_0_2_1(), 0);
                    	    							
                    	    // InternalIDSLParser.g:1567:11: ({...}? => (otherlv_4= Align otherlv_5= Colon ( (lv_align_6_0= ruleAlignPossibilities ) ) ) )
                    	    // InternalIDSLParser.g:1567:12: {...}? => (otherlv_4= Align otherlv_5= Colon ( (lv_align_6_0= ruleAlignPossibilities ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleText", "true");
                    	    }
                    	    // InternalIDSLParser.g:1567:21: (otherlv_4= Align otherlv_5= Colon ( (lv_align_6_0= ruleAlignPossibilities ) ) )
                    	    // InternalIDSLParser.g:1567:22: otherlv_4= Align otherlv_5= Colon ( (lv_align_6_0= ruleAlignPossibilities ) )
                    	    {
                    	    otherlv_4=(Token)match(input,Align,FOLLOW_3); 

                    	    											newLeafNode(otherlv_4, grammarAccess.getTextAccess().getAlignKeyword_0_2_1_0_0());
                    	    										
                    	    otherlv_5=(Token)match(input,Colon,FOLLOW_14); 

                    	    											newLeafNode(otherlv_5, grammarAccess.getTextAccess().getColonKeyword_0_2_1_0_1());
                    	    										
                    	    // InternalIDSLParser.g:1575:11: ( (lv_align_6_0= ruleAlignPossibilities ) )
                    	    // InternalIDSLParser.g:1576:12: (lv_align_6_0= ruleAlignPossibilities )
                    	    {
                    	    // InternalIDSLParser.g:1576:12: (lv_align_6_0= ruleAlignPossibilities )
                    	    // InternalIDSLParser.g:1577:13: lv_align_6_0= ruleAlignPossibilities
                    	    {

                    	    													newCompositeNode(grammarAccess.getTextAccess().getAlignAlignPossibilitiesEnumRuleCall_0_2_1_0_2_0());
                    	    												
                    	    pushFollow(FOLLOW_22);
                    	    lv_align_6_0=ruleAlignPossibilities();

                    	    state._fsp--;


                    	    													if (current==null) {
                    	    														current = createModelElementForParent(grammarAccess.getTextRule());
                    	    													}
                    	    													set(
                    	    														current,
                    	    														"align",
                    	    														lv_align_6_0,
                    	    														"org.xtext.example.mydsl.IDSL.AlignPossibilities");
                    	    													afterParserOrEnumRuleCall();
                    	    												

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTextAccess().getUnorderedGroup_0_2_1());
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalIDSLParser.g:1600:6: ({...}? => ( ({...}? => (otherlv_7= Color otherlv_8= Colon ( (lv_color_9_0= ruleColor ) ) ) ) ) )
                    	    {
                    	    // InternalIDSLParser.g:1600:6: ({...}? => ( ({...}? => (otherlv_7= Color otherlv_8= Colon ( (lv_color_9_0= ruleColor ) ) ) ) ) )
                    	    // InternalIDSLParser.g:1601:7: {...}? => ( ({...}? => (otherlv_7= Color otherlv_8= Colon ( (lv_color_9_0= ruleColor ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_0_2_1(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_0_2_1(), 1)");
                    	    }
                    	    // InternalIDSLParser.g:1601:107: ( ({...}? => (otherlv_7= Color otherlv_8= Colon ( (lv_color_9_0= ruleColor ) ) ) ) )
                    	    // InternalIDSLParser.g:1602:8: ({...}? => (otherlv_7= Color otherlv_8= Colon ( (lv_color_9_0= ruleColor ) ) ) )
                    	    {

                    	    								getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_0_2_1(), 1);
                    	    							
                    	    // InternalIDSLParser.g:1605:11: ({...}? => (otherlv_7= Color otherlv_8= Colon ( (lv_color_9_0= ruleColor ) ) ) )
                    	    // InternalIDSLParser.g:1605:12: {...}? => (otherlv_7= Color otherlv_8= Colon ( (lv_color_9_0= ruleColor ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleText", "true");
                    	    }
                    	    // InternalIDSLParser.g:1605:21: (otherlv_7= Color otherlv_8= Colon ( (lv_color_9_0= ruleColor ) ) )
                    	    // InternalIDSLParser.g:1605:22: otherlv_7= Color otherlv_8= Colon ( (lv_color_9_0= ruleColor ) )
                    	    {
                    	    otherlv_7=(Token)match(input,Color,FOLLOW_3); 

                    	    											newLeafNode(otherlv_7, grammarAccess.getTextAccess().getColorKeyword_0_2_1_1_0());
                    	    										
                    	    otherlv_8=(Token)match(input,Colon,FOLLOW_6); 

                    	    											newLeafNode(otherlv_8, grammarAccess.getTextAccess().getColonKeyword_0_2_1_1_1());
                    	    										
                    	    // InternalIDSLParser.g:1613:11: ( (lv_color_9_0= ruleColor ) )
                    	    // InternalIDSLParser.g:1614:12: (lv_color_9_0= ruleColor )
                    	    {
                    	    // InternalIDSLParser.g:1614:12: (lv_color_9_0= ruleColor )
                    	    // InternalIDSLParser.g:1615:13: lv_color_9_0= ruleColor
                    	    {

                    	    													newCompositeNode(grammarAccess.getTextAccess().getColorColorParserRuleCall_0_2_1_1_2_0());
                    	    												
                    	    pushFollow(FOLLOW_22);
                    	    lv_color_9_0=ruleColor();

                    	    state._fsp--;


                    	    													if (current==null) {
                    	    														current = createModelElementForParent(grammarAccess.getTextRule());
                    	    													}
                    	    													set(
                    	    														current,
                    	    														"color",
                    	    														lv_color_9_0,
                    	    														"org.xtext.example.mydsl.IDSL.Color");
                    	    													afterParserOrEnumRuleCall();
                    	    												

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTextAccess().getUnorderedGroup_0_2_1());
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalIDSLParser.g:1638:6: ({...}? => ( ({...}? => (otherlv_10= Font otherlv_11= Colon ( (lv_font_12_0= ruleFONT ) ) ) ) ) )
                    	    {
                    	    // InternalIDSLParser.g:1638:6: ({...}? => ( ({...}? => (otherlv_10= Font otherlv_11= Colon ( (lv_font_12_0= ruleFONT ) ) ) ) ) )
                    	    // InternalIDSLParser.g:1639:7: {...}? => ( ({...}? => (otherlv_10= Font otherlv_11= Colon ( (lv_font_12_0= ruleFONT ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_0_2_1(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_0_2_1(), 2)");
                    	    }
                    	    // InternalIDSLParser.g:1639:107: ( ({...}? => (otherlv_10= Font otherlv_11= Colon ( (lv_font_12_0= ruleFONT ) ) ) ) )
                    	    // InternalIDSLParser.g:1640:8: ({...}? => (otherlv_10= Font otherlv_11= Colon ( (lv_font_12_0= ruleFONT ) ) ) )
                    	    {

                    	    								getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_0_2_1(), 2);
                    	    							
                    	    // InternalIDSLParser.g:1643:11: ({...}? => (otherlv_10= Font otherlv_11= Colon ( (lv_font_12_0= ruleFONT ) ) ) )
                    	    // InternalIDSLParser.g:1643:12: {...}? => (otherlv_10= Font otherlv_11= Colon ( (lv_font_12_0= ruleFONT ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleText", "true");
                    	    }
                    	    // InternalIDSLParser.g:1643:21: (otherlv_10= Font otherlv_11= Colon ( (lv_font_12_0= ruleFONT ) ) )
                    	    // InternalIDSLParser.g:1643:22: otherlv_10= Font otherlv_11= Colon ( (lv_font_12_0= ruleFONT ) )
                    	    {
                    	    otherlv_10=(Token)match(input,Font,FOLLOW_3); 

                    	    											newLeafNode(otherlv_10, grammarAccess.getTextAccess().getFontKeyword_0_2_1_2_0());
                    	    										
                    	    otherlv_11=(Token)match(input,Colon,FOLLOW_15); 

                    	    											newLeafNode(otherlv_11, grammarAccess.getTextAccess().getColonKeyword_0_2_1_2_1());
                    	    										
                    	    // InternalIDSLParser.g:1651:11: ( (lv_font_12_0= ruleFONT ) )
                    	    // InternalIDSLParser.g:1652:12: (lv_font_12_0= ruleFONT )
                    	    {
                    	    // InternalIDSLParser.g:1652:12: (lv_font_12_0= ruleFONT )
                    	    // InternalIDSLParser.g:1653:13: lv_font_12_0= ruleFONT
                    	    {

                    	    													newCompositeNode(grammarAccess.getTextAccess().getFontFONTParserRuleCall_0_2_1_2_2_0());
                    	    												
                    	    pushFollow(FOLLOW_22);
                    	    lv_font_12_0=ruleFONT();

                    	    state._fsp--;


                    	    													if (current==null) {
                    	    														current = createModelElementForParent(grammarAccess.getTextRule());
                    	    													}
                    	    													set(
                    	    														current,
                    	    														"font",
                    	    														lv_font_12_0,
                    	    														"org.xtext.example.mydsl.IDSL.FONT");
                    	    													afterParserOrEnumRuleCall();
                    	    												

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTextAccess().getUnorderedGroup_0_2_1());
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // InternalIDSLParser.g:1676:6: ({...}? => ( ({...}? => (otherlv_13= Lineheight otherlv_14= Colon ( (lv_lineheight_15_0= RULE_INT ) ) ) ) ) )
                    	    {
                    	    // InternalIDSLParser.g:1676:6: ({...}? => ( ({...}? => (otherlv_13= Lineheight otherlv_14= Colon ( (lv_lineheight_15_0= RULE_INT ) ) ) ) ) )
                    	    // InternalIDSLParser.g:1677:7: {...}? => ( ({...}? => (otherlv_13= Lineheight otherlv_14= Colon ( (lv_lineheight_15_0= RULE_INT ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_0_2_1(), 3) ) {
                    	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_0_2_1(), 3)");
                    	    }
                    	    // InternalIDSLParser.g:1677:107: ( ({...}? => (otherlv_13= Lineheight otherlv_14= Colon ( (lv_lineheight_15_0= RULE_INT ) ) ) ) )
                    	    // InternalIDSLParser.g:1678:8: ({...}? => (otherlv_13= Lineheight otherlv_14= Colon ( (lv_lineheight_15_0= RULE_INT ) ) ) )
                    	    {

                    	    								getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_0_2_1(), 3);
                    	    							
                    	    // InternalIDSLParser.g:1681:11: ({...}? => (otherlv_13= Lineheight otherlv_14= Colon ( (lv_lineheight_15_0= RULE_INT ) ) ) )
                    	    // InternalIDSLParser.g:1681:12: {...}? => (otherlv_13= Lineheight otherlv_14= Colon ( (lv_lineheight_15_0= RULE_INT ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleText", "true");
                    	    }
                    	    // InternalIDSLParser.g:1681:21: (otherlv_13= Lineheight otherlv_14= Colon ( (lv_lineheight_15_0= RULE_INT ) ) )
                    	    // InternalIDSLParser.g:1681:22: otherlv_13= Lineheight otherlv_14= Colon ( (lv_lineheight_15_0= RULE_INT ) )
                    	    {
                    	    otherlv_13=(Token)match(input,Lineheight,FOLLOW_3); 

                    	    											newLeafNode(otherlv_13, grammarAccess.getTextAccess().getLineheightKeyword_0_2_1_3_0());
                    	    										
                    	    otherlv_14=(Token)match(input,Colon,FOLLOW_16); 

                    	    											newLeafNode(otherlv_14, grammarAccess.getTextAccess().getColonKeyword_0_2_1_3_1());
                    	    										
                    	    // InternalIDSLParser.g:1689:11: ( (lv_lineheight_15_0= RULE_INT ) )
                    	    // InternalIDSLParser.g:1690:12: (lv_lineheight_15_0= RULE_INT )
                    	    {
                    	    // InternalIDSLParser.g:1690:12: (lv_lineheight_15_0= RULE_INT )
                    	    // InternalIDSLParser.g:1691:13: lv_lineheight_15_0= RULE_INT
                    	    {
                    	    lv_lineheight_15_0=(Token)match(input,RULE_INT,FOLLOW_22); 

                    	    													newLeafNode(lv_lineheight_15_0, grammarAccess.getTextAccess().getLineheightINTTerminalRuleCall_0_2_1_3_2_0());
                    	    												

                    	    													if (current==null) {
                    	    														current = createModelElement(grammarAccess.getTextRule());
                    	    													}
                    	    													setWithLastConsumed(
                    	    														current,
                    	    														"lineheight",
                    	    														lv_lineheight_15_0,
                    	    														"org.eclipse.xtext.common.Terminals.INT");
                    	    												

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTextAccess().getUnorderedGroup_0_2_1());
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 5 :
                    	    // InternalIDSLParser.g:1713:6: ({...}? => ( ({...}? => (otherlv_16= Position otherlv_17= Colon ( (lv_position_18_0= RULE_SIZE_POS ) ) ) ) ) )
                    	    {
                    	    // InternalIDSLParser.g:1713:6: ({...}? => ( ({...}? => (otherlv_16= Position otherlv_17= Colon ( (lv_position_18_0= RULE_SIZE_POS ) ) ) ) ) )
                    	    // InternalIDSLParser.g:1714:7: {...}? => ( ({...}? => (otherlv_16= Position otherlv_17= Colon ( (lv_position_18_0= RULE_SIZE_POS ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_0_2_1(), 4) ) {
                    	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_0_2_1(), 4)");
                    	    }
                    	    // InternalIDSLParser.g:1714:107: ( ({...}? => (otherlv_16= Position otherlv_17= Colon ( (lv_position_18_0= RULE_SIZE_POS ) ) ) ) )
                    	    // InternalIDSLParser.g:1715:8: ({...}? => (otherlv_16= Position otherlv_17= Colon ( (lv_position_18_0= RULE_SIZE_POS ) ) ) )
                    	    {

                    	    								getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_0_2_1(), 4);
                    	    							
                    	    // InternalIDSLParser.g:1718:11: ({...}? => (otherlv_16= Position otherlv_17= Colon ( (lv_position_18_0= RULE_SIZE_POS ) ) ) )
                    	    // InternalIDSLParser.g:1718:12: {...}? => (otherlv_16= Position otherlv_17= Colon ( (lv_position_18_0= RULE_SIZE_POS ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleText", "true");
                    	    }
                    	    // InternalIDSLParser.g:1718:21: (otherlv_16= Position otherlv_17= Colon ( (lv_position_18_0= RULE_SIZE_POS ) ) )
                    	    // InternalIDSLParser.g:1718:22: otherlv_16= Position otherlv_17= Colon ( (lv_position_18_0= RULE_SIZE_POS ) )
                    	    {
                    	    otherlv_16=(Token)match(input,Position,FOLLOW_3); 

                    	    											newLeafNode(otherlv_16, grammarAccess.getTextAccess().getPositionKeyword_0_2_1_4_0());
                    	    										
                    	    otherlv_17=(Token)match(input,Colon,FOLLOW_9); 

                    	    											newLeafNode(otherlv_17, grammarAccess.getTextAccess().getColonKeyword_0_2_1_4_1());
                    	    										
                    	    // InternalIDSLParser.g:1726:11: ( (lv_position_18_0= RULE_SIZE_POS ) )
                    	    // InternalIDSLParser.g:1727:12: (lv_position_18_0= RULE_SIZE_POS )
                    	    {
                    	    // InternalIDSLParser.g:1727:12: (lv_position_18_0= RULE_SIZE_POS )
                    	    // InternalIDSLParser.g:1728:13: lv_position_18_0= RULE_SIZE_POS
                    	    {
                    	    lv_position_18_0=(Token)match(input,RULE_SIZE_POS,FOLLOW_22); 

                    	    													newLeafNode(lv_position_18_0, grammarAccess.getTextAccess().getPositionSIZE_POSTerminalRuleCall_0_2_1_4_2_0());
                    	    												

                    	    													if (current==null) {
                    	    														current = createModelElement(grammarAccess.getTextRule());
                    	    													}
                    	    													setWithLastConsumed(
                    	    														current,
                    	    														"position",
                    	    														lv_position_18_0,
                    	    														"org.xtext.example.mydsl.IDSL.SIZE_POS");
                    	    												

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTextAccess().getUnorderedGroup_0_2_1());
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 6 :
                    	    // InternalIDSLParser.g:1750:6: ({...}? => ( ({...}? => (otherlv_19= Maxwidth otherlv_20= Colon ( (lv_maxwidth_21_0= RULE_INT ) ) ) ) ) )
                    	    {
                    	    // InternalIDSLParser.g:1750:6: ({...}? => ( ({...}? => (otherlv_19= Maxwidth otherlv_20= Colon ( (lv_maxwidth_21_0= RULE_INT ) ) ) ) ) )
                    	    // InternalIDSLParser.g:1751:7: {...}? => ( ({...}? => (otherlv_19= Maxwidth otherlv_20= Colon ( (lv_maxwidth_21_0= RULE_INT ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_0_2_1(), 5) ) {
                    	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_0_2_1(), 5)");
                    	    }
                    	    // InternalIDSLParser.g:1751:107: ( ({...}? => (otherlv_19= Maxwidth otherlv_20= Colon ( (lv_maxwidth_21_0= RULE_INT ) ) ) ) )
                    	    // InternalIDSLParser.g:1752:8: ({...}? => (otherlv_19= Maxwidth otherlv_20= Colon ( (lv_maxwidth_21_0= RULE_INT ) ) ) )
                    	    {

                    	    								getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_0_2_1(), 5);
                    	    							
                    	    // InternalIDSLParser.g:1755:11: ({...}? => (otherlv_19= Maxwidth otherlv_20= Colon ( (lv_maxwidth_21_0= RULE_INT ) ) ) )
                    	    // InternalIDSLParser.g:1755:12: {...}? => (otherlv_19= Maxwidth otherlv_20= Colon ( (lv_maxwidth_21_0= RULE_INT ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleText", "true");
                    	    }
                    	    // InternalIDSLParser.g:1755:21: (otherlv_19= Maxwidth otherlv_20= Colon ( (lv_maxwidth_21_0= RULE_INT ) ) )
                    	    // InternalIDSLParser.g:1755:22: otherlv_19= Maxwidth otherlv_20= Colon ( (lv_maxwidth_21_0= RULE_INT ) )
                    	    {
                    	    otherlv_19=(Token)match(input,Maxwidth,FOLLOW_3); 

                    	    											newLeafNode(otherlv_19, grammarAccess.getTextAccess().getMaxwidthKeyword_0_2_1_5_0());
                    	    										
                    	    otherlv_20=(Token)match(input,Colon,FOLLOW_16); 

                    	    											newLeafNode(otherlv_20, grammarAccess.getTextAccess().getColonKeyword_0_2_1_5_1());
                    	    										
                    	    // InternalIDSLParser.g:1763:11: ( (lv_maxwidth_21_0= RULE_INT ) )
                    	    // InternalIDSLParser.g:1764:12: (lv_maxwidth_21_0= RULE_INT )
                    	    {
                    	    // InternalIDSLParser.g:1764:12: (lv_maxwidth_21_0= RULE_INT )
                    	    // InternalIDSLParser.g:1765:13: lv_maxwidth_21_0= RULE_INT
                    	    {
                    	    lv_maxwidth_21_0=(Token)match(input,RULE_INT,FOLLOW_22); 

                    	    													newLeafNode(lv_maxwidth_21_0, grammarAccess.getTextAccess().getMaxwidthINTTerminalRuleCall_0_2_1_5_2_0());
                    	    												

                    	    													if (current==null) {
                    	    														current = createModelElement(grammarAccess.getTextRule());
                    	    													}
                    	    													setWithLastConsumed(
                    	    														current,
                    	    														"maxwidth",
                    	    														lv_maxwidth_21_0,
                    	    														"org.eclipse.xtext.common.Terminals.INT");
                    	    												

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTextAccess().getUnorderedGroup_0_2_1());
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 7 :
                    	    // InternalIDSLParser.g:1787:6: ({...}? => ( ({...}? => (otherlv_22= Value otherlv_23= Colon ( (lv_value_24_0= RULE_STRING ) ) ) ) ) )
                    	    {
                    	    // InternalIDSLParser.g:1787:6: ({...}? => ( ({...}? => (otherlv_22= Value otherlv_23= Colon ( (lv_value_24_0= RULE_STRING ) ) ) ) ) )
                    	    // InternalIDSLParser.g:1788:7: {...}? => ( ({...}? => (otherlv_22= Value otherlv_23= Colon ( (lv_value_24_0= RULE_STRING ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_0_2_1(), 6) ) {
                    	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_0_2_1(), 6)");
                    	    }
                    	    // InternalIDSLParser.g:1788:107: ( ({...}? => (otherlv_22= Value otherlv_23= Colon ( (lv_value_24_0= RULE_STRING ) ) ) ) )
                    	    // InternalIDSLParser.g:1789:8: ({...}? => (otherlv_22= Value otherlv_23= Colon ( (lv_value_24_0= RULE_STRING ) ) ) )
                    	    {

                    	    								getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_0_2_1(), 6);
                    	    							
                    	    // InternalIDSLParser.g:1792:11: ({...}? => (otherlv_22= Value otherlv_23= Colon ( (lv_value_24_0= RULE_STRING ) ) ) )
                    	    // InternalIDSLParser.g:1792:12: {...}? => (otherlv_22= Value otherlv_23= Colon ( (lv_value_24_0= RULE_STRING ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleText", "true");
                    	    }
                    	    // InternalIDSLParser.g:1792:21: (otherlv_22= Value otherlv_23= Colon ( (lv_value_24_0= RULE_STRING ) ) )
                    	    // InternalIDSLParser.g:1792:22: otherlv_22= Value otherlv_23= Colon ( (lv_value_24_0= RULE_STRING ) )
                    	    {
                    	    otherlv_22=(Token)match(input,Value,FOLLOW_3); 

                    	    											newLeafNode(otherlv_22, grammarAccess.getTextAccess().getValueKeyword_0_2_1_6_0());
                    	    										
                    	    otherlv_23=(Token)match(input,Colon,FOLLOW_8); 

                    	    											newLeafNode(otherlv_23, grammarAccess.getTextAccess().getColonKeyword_0_2_1_6_1());
                    	    										
                    	    // InternalIDSLParser.g:1800:11: ( (lv_value_24_0= RULE_STRING ) )
                    	    // InternalIDSLParser.g:1801:12: (lv_value_24_0= RULE_STRING )
                    	    {
                    	    // InternalIDSLParser.g:1801:12: (lv_value_24_0= RULE_STRING )
                    	    // InternalIDSLParser.g:1802:13: lv_value_24_0= RULE_STRING
                    	    {
                    	    lv_value_24_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

                    	    													newLeafNode(lv_value_24_0, grammarAccess.getTextAccess().getValueSTRINGTerminalRuleCall_0_2_1_6_2_0());
                    	    												

                    	    													if (current==null) {
                    	    														current = createModelElement(grammarAccess.getTextRule());
                    	    													}
                    	    													setWithLastConsumed(
                    	    														current,
                    	    														"value",
                    	    														lv_value_24_0,
                    	    														"org.eclipse.xtext.common.Terminals.STRING");
                    	    												

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTextAccess().getUnorderedGroup_0_2_1());
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt17 >= 1 ) break loop17;
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                throw eee;
                        }
                        cnt17++;
                    } while (true);

                    if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getTextAccess().getUnorderedGroup_0_2_1()) ) {
                        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canLeave(grammarAccess.getTextAccess().getUnorderedGroup_0_2_1())");
                    }

                    }


                    }

                     
                    						  getUnorderedGroupHelper().leave(grammarAccess.getTextAccess().getUnorderedGroup_0_2_1());
                    						

                    }

                    this_END_25=(Token)match(input,RULE_END,FOLLOW_2); 

                    					newLeafNode(this_END_25, grammarAccess.getTextAccess().getENDTerminalRuleCall_0_2_2());
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalIDSLParser.g:1839:3: ( ( (lv_name_26_0= RULE_TITLETEXTID ) ) otherlv_27= Colon (this_BEGIN_28= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_30= Align otherlv_31= Colon ( (lv_align_32_0= ruleAlignPossibilities ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Color otherlv_34= Colon ( (lv_color_35_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= Font otherlv_37= Colon ( (lv_font_38_0= ruleFONT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Position otherlv_40= Colon ( (lv_position_41_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= Maxwidth otherlv_43= Colon ( (lv_maxwidth_44_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= Value otherlv_46= Colon ( (lv_value_47_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) this_END_48= RULE_END ) )
                    {
                    // InternalIDSLParser.g:1839:3: ( ( (lv_name_26_0= RULE_TITLETEXTID ) ) otherlv_27= Colon (this_BEGIN_28= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_30= Align otherlv_31= Colon ( (lv_align_32_0= ruleAlignPossibilities ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Color otherlv_34= Colon ( (lv_color_35_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= Font otherlv_37= Colon ( (lv_font_38_0= ruleFONT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Position otherlv_40= Colon ( (lv_position_41_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= Maxwidth otherlv_43= Colon ( (lv_maxwidth_44_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= Value otherlv_46= Colon ( (lv_value_47_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) this_END_48= RULE_END ) )
                    // InternalIDSLParser.g:1840:4: ( (lv_name_26_0= RULE_TITLETEXTID ) ) otherlv_27= Colon (this_BEGIN_28= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_30= Align otherlv_31= Colon ( (lv_align_32_0= ruleAlignPossibilities ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Color otherlv_34= Colon ( (lv_color_35_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= Font otherlv_37= Colon ( (lv_font_38_0= ruleFONT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Position otherlv_40= Colon ( (lv_position_41_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= Maxwidth otherlv_43= Colon ( (lv_maxwidth_44_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= Value otherlv_46= Colon ( (lv_value_47_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) this_END_48= RULE_END )
                    {
                    // InternalIDSLParser.g:1840:4: ( (lv_name_26_0= RULE_TITLETEXTID ) )
                    // InternalIDSLParser.g:1841:5: (lv_name_26_0= RULE_TITLETEXTID )
                    {
                    // InternalIDSLParser.g:1841:5: (lv_name_26_0= RULE_TITLETEXTID )
                    // InternalIDSLParser.g:1842:6: lv_name_26_0= RULE_TITLETEXTID
                    {
                    lv_name_26_0=(Token)match(input,RULE_TITLETEXTID,FOLLOW_3); 

                    						newLeafNode(lv_name_26_0, grammarAccess.getTextAccess().getNameTITLETEXTIDTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTextRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_26_0,
                    							"org.xtext.example.mydsl.IDSL.TITLETEXTID");
                    					

                    }


                    }

                    otherlv_27=(Token)match(input,Colon,FOLLOW_12); 

                    				newLeafNode(otherlv_27, grammarAccess.getTextAccess().getColonKeyword_1_1());
                    			
                    // InternalIDSLParser.g:1862:4: (this_BEGIN_28= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_30= Align otherlv_31= Colon ( (lv_align_32_0= ruleAlignPossibilities ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Color otherlv_34= Colon ( (lv_color_35_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= Font otherlv_37= Colon ( (lv_font_38_0= ruleFONT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Position otherlv_40= Colon ( (lv_position_41_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= Maxwidth otherlv_43= Colon ( (lv_maxwidth_44_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= Value otherlv_46= Colon ( (lv_value_47_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) this_END_48= RULE_END )
                    // InternalIDSLParser.g:1863:5: this_BEGIN_28= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_30= Align otherlv_31= Colon ( (lv_align_32_0= ruleAlignPossibilities ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Color otherlv_34= Colon ( (lv_color_35_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= Font otherlv_37= Colon ( (lv_font_38_0= ruleFONT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Position otherlv_40= Colon ( (lv_position_41_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= Maxwidth otherlv_43= Colon ( (lv_maxwidth_44_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= Value otherlv_46= Colon ( (lv_value_47_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) this_END_48= RULE_END
                    {
                    this_BEGIN_28=(Token)match(input,RULE_BEGIN,FOLLOW_23); 

                    					newLeafNode(this_BEGIN_28, grammarAccess.getTextAccess().getBEGINTerminalRuleCall_1_2_0());
                    				
                    // InternalIDSLParser.g:1867:5: ( ( ( ( ({...}? => ( ({...}? => (otherlv_30= Align otherlv_31= Colon ( (lv_align_32_0= ruleAlignPossibilities ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Color otherlv_34= Colon ( (lv_color_35_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= Font otherlv_37= Colon ( (lv_font_38_0= ruleFONT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Position otherlv_40= Colon ( (lv_position_41_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= Maxwidth otherlv_43= Colon ( (lv_maxwidth_44_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= Value otherlv_46= Colon ( (lv_value_47_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )
                    // InternalIDSLParser.g:1868:6: ( ( ( ({...}? => ( ({...}? => (otherlv_30= Align otherlv_31= Colon ( (lv_align_32_0= ruleAlignPossibilities ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Color otherlv_34= Colon ( (lv_color_35_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= Font otherlv_37= Colon ( (lv_font_38_0= ruleFONT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Position otherlv_40= Colon ( (lv_position_41_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= Maxwidth otherlv_43= Colon ( (lv_maxwidth_44_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= Value otherlv_46= Colon ( (lv_value_47_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
                    {
                    // InternalIDSLParser.g:1868:6: ( ( ( ({...}? => ( ({...}? => (otherlv_30= Align otherlv_31= Colon ( (lv_align_32_0= ruleAlignPossibilities ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Color otherlv_34= Colon ( (lv_color_35_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= Font otherlv_37= Colon ( (lv_font_38_0= ruleFONT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Position otherlv_40= Colon ( (lv_position_41_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= Maxwidth otherlv_43= Colon ( (lv_maxwidth_44_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= Value otherlv_46= Colon ( (lv_value_47_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
                    // InternalIDSLParser.g:1869:7: ( ( ({...}? => ( ({...}? => (otherlv_30= Align otherlv_31= Colon ( (lv_align_32_0= ruleAlignPossibilities ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Color otherlv_34= Colon ( (lv_color_35_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= Font otherlv_37= Colon ( (lv_font_38_0= ruleFONT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Position otherlv_40= Colon ( (lv_position_41_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= Maxwidth otherlv_43= Colon ( (lv_maxwidth_44_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= Value otherlv_46= Colon ( (lv_value_47_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
                    {
                     
                    						  getUnorderedGroupHelper().enter(grammarAccess.getTextAccess().getUnorderedGroup_1_2_1());
                    						
                    // InternalIDSLParser.g:1872:7: ( ( ({...}? => ( ({...}? => (otherlv_30= Align otherlv_31= Colon ( (lv_align_32_0= ruleAlignPossibilities ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Color otherlv_34= Colon ( (lv_color_35_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= Font otherlv_37= Colon ( (lv_font_38_0= ruleFONT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Position otherlv_40= Colon ( (lv_position_41_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= Maxwidth otherlv_43= Colon ( (lv_maxwidth_44_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= Value otherlv_46= Colon ( (lv_value_47_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
                    // InternalIDSLParser.g:1873:8: ( ({...}? => ( ({...}? => (otherlv_30= Align otherlv_31= Colon ( (lv_align_32_0= ruleAlignPossibilities ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Color otherlv_34= Colon ( (lv_color_35_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= Font otherlv_37= Colon ( (lv_font_38_0= ruleFONT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Position otherlv_40= Colon ( (lv_position_41_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= Maxwidth otherlv_43= Colon ( (lv_maxwidth_44_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= Value otherlv_46= Colon ( (lv_value_47_0= RULE_STRING ) ) ) ) ) ) )+ {...}?
                    {
                    // InternalIDSLParser.g:1873:8: ( ({...}? => ( ({...}? => (otherlv_30= Align otherlv_31= Colon ( (lv_align_32_0= ruleAlignPossibilities ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Color otherlv_34= Colon ( (lv_color_35_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= Font otherlv_37= Colon ( (lv_font_38_0= ruleFONT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Position otherlv_40= Colon ( (lv_position_41_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= Maxwidth otherlv_43= Colon ( (lv_maxwidth_44_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= Value otherlv_46= Colon ( (lv_value_47_0= RULE_STRING ) ) ) ) ) ) )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=7;
                        int LA18_0 = input.LA(1);

                        if ( LA18_0 == Align && getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_1_2_1(), 0) ) {
                            alt18=1;
                        }
                        else if ( LA18_0 == Color && getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_1_2_1(), 1) ) {
                            alt18=2;
                        }
                        else if ( LA18_0 == Font && getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_1_2_1(), 2) ) {
                            alt18=3;
                        }
                        else if ( LA18_0 == Position && getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_1_2_1(), 3) ) {
                            alt18=4;
                        }
                        else if ( LA18_0 == Maxwidth && getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_1_2_1(), 4) ) {
                            alt18=5;
                        }
                        else if ( LA18_0 == Value && getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_1_2_1(), 5) ) {
                            alt18=6;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalIDSLParser.g:1874:6: ({...}? => ( ({...}? => (otherlv_30= Align otherlv_31= Colon ( (lv_align_32_0= ruleAlignPossibilities ) ) ) ) ) )
                    	    {
                    	    // InternalIDSLParser.g:1874:6: ({...}? => ( ({...}? => (otherlv_30= Align otherlv_31= Colon ( (lv_align_32_0= ruleAlignPossibilities ) ) ) ) ) )
                    	    // InternalIDSLParser.g:1875:7: {...}? => ( ({...}? => (otherlv_30= Align otherlv_31= Colon ( (lv_align_32_0= ruleAlignPossibilities ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_1_2_1(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_1_2_1(), 0)");
                    	    }
                    	    // InternalIDSLParser.g:1875:107: ( ({...}? => (otherlv_30= Align otherlv_31= Colon ( (lv_align_32_0= ruleAlignPossibilities ) ) ) ) )
                    	    // InternalIDSLParser.g:1876:8: ({...}? => (otherlv_30= Align otherlv_31= Colon ( (lv_align_32_0= ruleAlignPossibilities ) ) ) )
                    	    {

                    	    								getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_1_2_1(), 0);
                    	    							
                    	    // InternalIDSLParser.g:1879:11: ({...}? => (otherlv_30= Align otherlv_31= Colon ( (lv_align_32_0= ruleAlignPossibilities ) ) ) )
                    	    // InternalIDSLParser.g:1879:12: {...}? => (otherlv_30= Align otherlv_31= Colon ( (lv_align_32_0= ruleAlignPossibilities ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleText", "true");
                    	    }
                    	    // InternalIDSLParser.g:1879:21: (otherlv_30= Align otherlv_31= Colon ( (lv_align_32_0= ruleAlignPossibilities ) ) )
                    	    // InternalIDSLParser.g:1879:22: otherlv_30= Align otherlv_31= Colon ( (lv_align_32_0= ruleAlignPossibilities ) )
                    	    {
                    	    otherlv_30=(Token)match(input,Align,FOLLOW_3); 

                    	    											newLeafNode(otherlv_30, grammarAccess.getTextAccess().getAlignKeyword_1_2_1_0_0());
                    	    										
                    	    otherlv_31=(Token)match(input,Colon,FOLLOW_14); 

                    	    											newLeafNode(otherlv_31, grammarAccess.getTextAccess().getColonKeyword_1_2_1_0_1());
                    	    										
                    	    // InternalIDSLParser.g:1887:11: ( (lv_align_32_0= ruleAlignPossibilities ) )
                    	    // InternalIDSLParser.g:1888:12: (lv_align_32_0= ruleAlignPossibilities )
                    	    {
                    	    // InternalIDSLParser.g:1888:12: (lv_align_32_0= ruleAlignPossibilities )
                    	    // InternalIDSLParser.g:1889:13: lv_align_32_0= ruleAlignPossibilities
                    	    {

                    	    													newCompositeNode(grammarAccess.getTextAccess().getAlignAlignPossibilitiesEnumRuleCall_1_2_1_0_2_0());
                    	    												
                    	    pushFollow(FOLLOW_13);
                    	    lv_align_32_0=ruleAlignPossibilities();

                    	    state._fsp--;


                    	    													if (current==null) {
                    	    														current = createModelElementForParent(grammarAccess.getTextRule());
                    	    													}
                    	    													set(
                    	    														current,
                    	    														"align",
                    	    														lv_align_32_0,
                    	    														"org.xtext.example.mydsl.IDSL.AlignPossibilities");
                    	    													afterParserOrEnumRuleCall();
                    	    												

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTextAccess().getUnorderedGroup_1_2_1());
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalIDSLParser.g:1912:6: ({...}? => ( ({...}? => (otherlv_33= Color otherlv_34= Colon ( (lv_color_35_0= ruleColor ) ) ) ) ) )
                    	    {
                    	    // InternalIDSLParser.g:1912:6: ({...}? => ( ({...}? => (otherlv_33= Color otherlv_34= Colon ( (lv_color_35_0= ruleColor ) ) ) ) ) )
                    	    // InternalIDSLParser.g:1913:7: {...}? => ( ({...}? => (otherlv_33= Color otherlv_34= Colon ( (lv_color_35_0= ruleColor ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_1_2_1(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_1_2_1(), 1)");
                    	    }
                    	    // InternalIDSLParser.g:1913:107: ( ({...}? => (otherlv_33= Color otherlv_34= Colon ( (lv_color_35_0= ruleColor ) ) ) ) )
                    	    // InternalIDSLParser.g:1914:8: ({...}? => (otherlv_33= Color otherlv_34= Colon ( (lv_color_35_0= ruleColor ) ) ) )
                    	    {

                    	    								getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_1_2_1(), 1);
                    	    							
                    	    // InternalIDSLParser.g:1917:11: ({...}? => (otherlv_33= Color otherlv_34= Colon ( (lv_color_35_0= ruleColor ) ) ) )
                    	    // InternalIDSLParser.g:1917:12: {...}? => (otherlv_33= Color otherlv_34= Colon ( (lv_color_35_0= ruleColor ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleText", "true");
                    	    }
                    	    // InternalIDSLParser.g:1917:21: (otherlv_33= Color otherlv_34= Colon ( (lv_color_35_0= ruleColor ) ) )
                    	    // InternalIDSLParser.g:1917:22: otherlv_33= Color otherlv_34= Colon ( (lv_color_35_0= ruleColor ) )
                    	    {
                    	    otherlv_33=(Token)match(input,Color,FOLLOW_3); 

                    	    											newLeafNode(otherlv_33, grammarAccess.getTextAccess().getColorKeyword_1_2_1_1_0());
                    	    										
                    	    otherlv_34=(Token)match(input,Colon,FOLLOW_6); 

                    	    											newLeafNode(otherlv_34, grammarAccess.getTextAccess().getColonKeyword_1_2_1_1_1());
                    	    										
                    	    // InternalIDSLParser.g:1925:11: ( (lv_color_35_0= ruleColor ) )
                    	    // InternalIDSLParser.g:1926:12: (lv_color_35_0= ruleColor )
                    	    {
                    	    // InternalIDSLParser.g:1926:12: (lv_color_35_0= ruleColor )
                    	    // InternalIDSLParser.g:1927:13: lv_color_35_0= ruleColor
                    	    {

                    	    													newCompositeNode(grammarAccess.getTextAccess().getColorColorParserRuleCall_1_2_1_1_2_0());
                    	    												
                    	    pushFollow(FOLLOW_13);
                    	    lv_color_35_0=ruleColor();

                    	    state._fsp--;


                    	    													if (current==null) {
                    	    														current = createModelElementForParent(grammarAccess.getTextRule());
                    	    													}
                    	    													set(
                    	    														current,
                    	    														"color",
                    	    														lv_color_35_0,
                    	    														"org.xtext.example.mydsl.IDSL.Color");
                    	    													afterParserOrEnumRuleCall();
                    	    												

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTextAccess().getUnorderedGroup_1_2_1());
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalIDSLParser.g:1950:6: ({...}? => ( ({...}? => (otherlv_36= Font otherlv_37= Colon ( (lv_font_38_0= ruleFONT ) ) ) ) ) )
                    	    {
                    	    // InternalIDSLParser.g:1950:6: ({...}? => ( ({...}? => (otherlv_36= Font otherlv_37= Colon ( (lv_font_38_0= ruleFONT ) ) ) ) ) )
                    	    // InternalIDSLParser.g:1951:7: {...}? => ( ({...}? => (otherlv_36= Font otherlv_37= Colon ( (lv_font_38_0= ruleFONT ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_1_2_1(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_1_2_1(), 2)");
                    	    }
                    	    // InternalIDSLParser.g:1951:107: ( ({...}? => (otherlv_36= Font otherlv_37= Colon ( (lv_font_38_0= ruleFONT ) ) ) ) )
                    	    // InternalIDSLParser.g:1952:8: ({...}? => (otherlv_36= Font otherlv_37= Colon ( (lv_font_38_0= ruleFONT ) ) ) )
                    	    {

                    	    								getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_1_2_1(), 2);
                    	    							
                    	    // InternalIDSLParser.g:1955:11: ({...}? => (otherlv_36= Font otherlv_37= Colon ( (lv_font_38_0= ruleFONT ) ) ) )
                    	    // InternalIDSLParser.g:1955:12: {...}? => (otherlv_36= Font otherlv_37= Colon ( (lv_font_38_0= ruleFONT ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleText", "true");
                    	    }
                    	    // InternalIDSLParser.g:1955:21: (otherlv_36= Font otherlv_37= Colon ( (lv_font_38_0= ruleFONT ) ) )
                    	    // InternalIDSLParser.g:1955:22: otherlv_36= Font otherlv_37= Colon ( (lv_font_38_0= ruleFONT ) )
                    	    {
                    	    otherlv_36=(Token)match(input,Font,FOLLOW_3); 

                    	    											newLeafNode(otherlv_36, grammarAccess.getTextAccess().getFontKeyword_1_2_1_2_0());
                    	    										
                    	    otherlv_37=(Token)match(input,Colon,FOLLOW_15); 

                    	    											newLeafNode(otherlv_37, grammarAccess.getTextAccess().getColonKeyword_1_2_1_2_1());
                    	    										
                    	    // InternalIDSLParser.g:1963:11: ( (lv_font_38_0= ruleFONT ) )
                    	    // InternalIDSLParser.g:1964:12: (lv_font_38_0= ruleFONT )
                    	    {
                    	    // InternalIDSLParser.g:1964:12: (lv_font_38_0= ruleFONT )
                    	    // InternalIDSLParser.g:1965:13: lv_font_38_0= ruleFONT
                    	    {

                    	    													newCompositeNode(grammarAccess.getTextAccess().getFontFONTParserRuleCall_1_2_1_2_2_0());
                    	    												
                    	    pushFollow(FOLLOW_13);
                    	    lv_font_38_0=ruleFONT();

                    	    state._fsp--;


                    	    													if (current==null) {
                    	    														current = createModelElementForParent(grammarAccess.getTextRule());
                    	    													}
                    	    													set(
                    	    														current,
                    	    														"font",
                    	    														lv_font_38_0,
                    	    														"org.xtext.example.mydsl.IDSL.FONT");
                    	    													afterParserOrEnumRuleCall();
                    	    												

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTextAccess().getUnorderedGroup_1_2_1());
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // InternalIDSLParser.g:1988:6: ({...}? => ( ({...}? => (otherlv_39= Position otherlv_40= Colon ( (lv_position_41_0= RULE_SIZE_POS ) ) ) ) ) )
                    	    {
                    	    // InternalIDSLParser.g:1988:6: ({...}? => ( ({...}? => (otherlv_39= Position otherlv_40= Colon ( (lv_position_41_0= RULE_SIZE_POS ) ) ) ) ) )
                    	    // InternalIDSLParser.g:1989:7: {...}? => ( ({...}? => (otherlv_39= Position otherlv_40= Colon ( (lv_position_41_0= RULE_SIZE_POS ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_1_2_1(), 3) ) {
                    	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_1_2_1(), 3)");
                    	    }
                    	    // InternalIDSLParser.g:1989:107: ( ({...}? => (otherlv_39= Position otherlv_40= Colon ( (lv_position_41_0= RULE_SIZE_POS ) ) ) ) )
                    	    // InternalIDSLParser.g:1990:8: ({...}? => (otherlv_39= Position otherlv_40= Colon ( (lv_position_41_0= RULE_SIZE_POS ) ) ) )
                    	    {

                    	    								getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_1_2_1(), 3);
                    	    							
                    	    // InternalIDSLParser.g:1993:11: ({...}? => (otherlv_39= Position otherlv_40= Colon ( (lv_position_41_0= RULE_SIZE_POS ) ) ) )
                    	    // InternalIDSLParser.g:1993:12: {...}? => (otherlv_39= Position otherlv_40= Colon ( (lv_position_41_0= RULE_SIZE_POS ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleText", "true");
                    	    }
                    	    // InternalIDSLParser.g:1993:21: (otherlv_39= Position otherlv_40= Colon ( (lv_position_41_0= RULE_SIZE_POS ) ) )
                    	    // InternalIDSLParser.g:1993:22: otherlv_39= Position otherlv_40= Colon ( (lv_position_41_0= RULE_SIZE_POS ) )
                    	    {
                    	    otherlv_39=(Token)match(input,Position,FOLLOW_3); 

                    	    											newLeafNode(otherlv_39, grammarAccess.getTextAccess().getPositionKeyword_1_2_1_3_0());
                    	    										
                    	    otherlv_40=(Token)match(input,Colon,FOLLOW_9); 

                    	    											newLeafNode(otherlv_40, grammarAccess.getTextAccess().getColonKeyword_1_2_1_3_1());
                    	    										
                    	    // InternalIDSLParser.g:2001:11: ( (lv_position_41_0= RULE_SIZE_POS ) )
                    	    // InternalIDSLParser.g:2002:12: (lv_position_41_0= RULE_SIZE_POS )
                    	    {
                    	    // InternalIDSLParser.g:2002:12: (lv_position_41_0= RULE_SIZE_POS )
                    	    // InternalIDSLParser.g:2003:13: lv_position_41_0= RULE_SIZE_POS
                    	    {
                    	    lv_position_41_0=(Token)match(input,RULE_SIZE_POS,FOLLOW_13); 

                    	    													newLeafNode(lv_position_41_0, grammarAccess.getTextAccess().getPositionSIZE_POSTerminalRuleCall_1_2_1_3_2_0());
                    	    												

                    	    													if (current==null) {
                    	    														current = createModelElement(grammarAccess.getTextRule());
                    	    													}
                    	    													setWithLastConsumed(
                    	    														current,
                    	    														"position",
                    	    														lv_position_41_0,
                    	    														"org.xtext.example.mydsl.IDSL.SIZE_POS");
                    	    												

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTextAccess().getUnorderedGroup_1_2_1());
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 5 :
                    	    // InternalIDSLParser.g:2025:6: ({...}? => ( ({...}? => (otherlv_42= Maxwidth otherlv_43= Colon ( (lv_maxwidth_44_0= RULE_INT ) ) ) ) ) )
                    	    {
                    	    // InternalIDSLParser.g:2025:6: ({...}? => ( ({...}? => (otherlv_42= Maxwidth otherlv_43= Colon ( (lv_maxwidth_44_0= RULE_INT ) ) ) ) ) )
                    	    // InternalIDSLParser.g:2026:7: {...}? => ( ({...}? => (otherlv_42= Maxwidth otherlv_43= Colon ( (lv_maxwidth_44_0= RULE_INT ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_1_2_1(), 4) ) {
                    	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_1_2_1(), 4)");
                    	    }
                    	    // InternalIDSLParser.g:2026:107: ( ({...}? => (otherlv_42= Maxwidth otherlv_43= Colon ( (lv_maxwidth_44_0= RULE_INT ) ) ) ) )
                    	    // InternalIDSLParser.g:2027:8: ({...}? => (otherlv_42= Maxwidth otherlv_43= Colon ( (lv_maxwidth_44_0= RULE_INT ) ) ) )
                    	    {

                    	    								getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_1_2_1(), 4);
                    	    							
                    	    // InternalIDSLParser.g:2030:11: ({...}? => (otherlv_42= Maxwidth otherlv_43= Colon ( (lv_maxwidth_44_0= RULE_INT ) ) ) )
                    	    // InternalIDSLParser.g:2030:12: {...}? => (otherlv_42= Maxwidth otherlv_43= Colon ( (lv_maxwidth_44_0= RULE_INT ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleText", "true");
                    	    }
                    	    // InternalIDSLParser.g:2030:21: (otherlv_42= Maxwidth otherlv_43= Colon ( (lv_maxwidth_44_0= RULE_INT ) ) )
                    	    // InternalIDSLParser.g:2030:22: otherlv_42= Maxwidth otherlv_43= Colon ( (lv_maxwidth_44_0= RULE_INT ) )
                    	    {
                    	    otherlv_42=(Token)match(input,Maxwidth,FOLLOW_3); 

                    	    											newLeafNode(otherlv_42, grammarAccess.getTextAccess().getMaxwidthKeyword_1_2_1_4_0());
                    	    										
                    	    otherlv_43=(Token)match(input,Colon,FOLLOW_16); 

                    	    											newLeafNode(otherlv_43, grammarAccess.getTextAccess().getColonKeyword_1_2_1_4_1());
                    	    										
                    	    // InternalIDSLParser.g:2038:11: ( (lv_maxwidth_44_0= RULE_INT ) )
                    	    // InternalIDSLParser.g:2039:12: (lv_maxwidth_44_0= RULE_INT )
                    	    {
                    	    // InternalIDSLParser.g:2039:12: (lv_maxwidth_44_0= RULE_INT )
                    	    // InternalIDSLParser.g:2040:13: lv_maxwidth_44_0= RULE_INT
                    	    {
                    	    lv_maxwidth_44_0=(Token)match(input,RULE_INT,FOLLOW_13); 

                    	    													newLeafNode(lv_maxwidth_44_0, grammarAccess.getTextAccess().getMaxwidthINTTerminalRuleCall_1_2_1_4_2_0());
                    	    												

                    	    													if (current==null) {
                    	    														current = createModelElement(grammarAccess.getTextRule());
                    	    													}
                    	    													setWithLastConsumed(
                    	    														current,
                    	    														"maxwidth",
                    	    														lv_maxwidth_44_0,
                    	    														"org.eclipse.xtext.common.Terminals.INT");
                    	    												

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTextAccess().getUnorderedGroup_1_2_1());
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 6 :
                    	    // InternalIDSLParser.g:2062:6: ({...}? => ( ({...}? => (otherlv_45= Value otherlv_46= Colon ( (lv_value_47_0= RULE_STRING ) ) ) ) ) )
                    	    {
                    	    // InternalIDSLParser.g:2062:6: ({...}? => ( ({...}? => (otherlv_45= Value otherlv_46= Colon ( (lv_value_47_0= RULE_STRING ) ) ) ) ) )
                    	    // InternalIDSLParser.g:2063:7: {...}? => ( ({...}? => (otherlv_45= Value otherlv_46= Colon ( (lv_value_47_0= RULE_STRING ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_1_2_1(), 5) ) {
                    	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_1_2_1(), 5)");
                    	    }
                    	    // InternalIDSLParser.g:2063:107: ( ({...}? => (otherlv_45= Value otherlv_46= Colon ( (lv_value_47_0= RULE_STRING ) ) ) ) )
                    	    // InternalIDSLParser.g:2064:8: ({...}? => (otherlv_45= Value otherlv_46= Colon ( (lv_value_47_0= RULE_STRING ) ) ) )
                    	    {

                    	    								getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_1_2_1(), 5);
                    	    							
                    	    // InternalIDSLParser.g:2067:11: ({...}? => (otherlv_45= Value otherlv_46= Colon ( (lv_value_47_0= RULE_STRING ) ) ) )
                    	    // InternalIDSLParser.g:2067:12: {...}? => (otherlv_45= Value otherlv_46= Colon ( (lv_value_47_0= RULE_STRING ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleText", "true");
                    	    }
                    	    // InternalIDSLParser.g:2067:21: (otherlv_45= Value otherlv_46= Colon ( (lv_value_47_0= RULE_STRING ) ) )
                    	    // InternalIDSLParser.g:2067:22: otherlv_45= Value otherlv_46= Colon ( (lv_value_47_0= RULE_STRING ) )
                    	    {
                    	    otherlv_45=(Token)match(input,Value,FOLLOW_3); 

                    	    											newLeafNode(otherlv_45, grammarAccess.getTextAccess().getValueKeyword_1_2_1_5_0());
                    	    										
                    	    otherlv_46=(Token)match(input,Colon,FOLLOW_8); 

                    	    											newLeafNode(otherlv_46, grammarAccess.getTextAccess().getColonKeyword_1_2_1_5_1());
                    	    										
                    	    // InternalIDSLParser.g:2075:11: ( (lv_value_47_0= RULE_STRING ) )
                    	    // InternalIDSLParser.g:2076:12: (lv_value_47_0= RULE_STRING )
                    	    {
                    	    // InternalIDSLParser.g:2076:12: (lv_value_47_0= RULE_STRING )
                    	    // InternalIDSLParser.g:2077:13: lv_value_47_0= RULE_STRING
                    	    {
                    	    lv_value_47_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

                    	    													newLeafNode(lv_value_47_0, grammarAccess.getTextAccess().getValueSTRINGTerminalRuleCall_1_2_1_5_2_0());
                    	    												

                    	    													if (current==null) {
                    	    														current = createModelElement(grammarAccess.getTextRule());
                    	    													}
                    	    													setWithLastConsumed(
                    	    														current,
                    	    														"value",
                    	    														lv_value_47_0,
                    	    														"org.eclipse.xtext.common.Terminals.STRING");
                    	    												

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTextAccess().getUnorderedGroup_1_2_1());
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt18 >= 1 ) break loop18;
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
                    } while (true);

                    if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getTextAccess().getUnorderedGroup_1_2_1()) ) {
                        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canLeave(grammarAccess.getTextAccess().getUnorderedGroup_1_2_1())");
                    }

                    }


                    }

                     
                    						  getUnorderedGroupHelper().leave(grammarAccess.getTextAccess().getUnorderedGroup_1_2_1());
                    						

                    }

                    this_END_48=(Token)match(input,RULE_END,FOLLOW_2); 

                    					newLeafNode(this_END_48, grammarAccess.getTextAccess().getENDTerminalRuleCall_1_2_2());
                    				

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
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleImage"
    // InternalIDSLParser.g:2117:1: entryRuleImage returns [EObject current=null] : iv_ruleImage= ruleImage EOF ;
    public final EObject entryRuleImage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImage = null;


        try {
            // InternalIDSLParser.g:2117:46: (iv_ruleImage= ruleImage EOF )
            // InternalIDSLParser.g:2118:2: iv_ruleImage= ruleImage EOF
            {
             newCompositeNode(grammarAccess.getImageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImage=ruleImage();

            state._fsp--;

             current =iv_ruleImage; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImage"


    // $ANTLR start "ruleImage"
    // InternalIDSLParser.g:2124:1: ruleImage returns [EObject current=null] : ( ( (lv_name_0_0= RULE_IMAGEID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= Position otherlv_5= Colon ( (lv_position_6_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Size otherlv_8= Colon ( (lv_size_9_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Src otherlv_11= Colon ( (lv_src_12_0= ruleImageSrc ) ) ) ) ) ) )+ {...}?) ) ) this_END_13= RULE_END ) ;
    public final EObject ruleImage() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_position_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_size_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token this_END_13=null;
        AntlrDatatypeRuleToken lv_src_12_0 = null;



        	enterRule();

        try {
            // InternalIDSLParser.g:2130:2: ( ( ( (lv_name_0_0= RULE_IMAGEID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= Position otherlv_5= Colon ( (lv_position_6_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Size otherlv_8= Colon ( (lv_size_9_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Src otherlv_11= Colon ( (lv_src_12_0= ruleImageSrc ) ) ) ) ) ) )+ {...}?) ) ) this_END_13= RULE_END ) )
            // InternalIDSLParser.g:2131:2: ( ( (lv_name_0_0= RULE_IMAGEID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= Position otherlv_5= Colon ( (lv_position_6_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Size otherlv_8= Colon ( (lv_size_9_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Src otherlv_11= Colon ( (lv_src_12_0= ruleImageSrc ) ) ) ) ) ) )+ {...}?) ) ) this_END_13= RULE_END )
            {
            // InternalIDSLParser.g:2131:2: ( ( (lv_name_0_0= RULE_IMAGEID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= Position otherlv_5= Colon ( (lv_position_6_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Size otherlv_8= Colon ( (lv_size_9_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Src otherlv_11= Colon ( (lv_src_12_0= ruleImageSrc ) ) ) ) ) ) )+ {...}?) ) ) this_END_13= RULE_END )
            // InternalIDSLParser.g:2132:3: ( (lv_name_0_0= RULE_IMAGEID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= Position otherlv_5= Colon ( (lv_position_6_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Size otherlv_8= Colon ( (lv_size_9_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Src otherlv_11= Colon ( (lv_src_12_0= ruleImageSrc ) ) ) ) ) ) )+ {...}?) ) ) this_END_13= RULE_END
            {
            // InternalIDSLParser.g:2132:3: ( (lv_name_0_0= RULE_IMAGEID ) )
            // InternalIDSLParser.g:2133:4: (lv_name_0_0= RULE_IMAGEID )
            {
            // InternalIDSLParser.g:2133:4: (lv_name_0_0= RULE_IMAGEID )
            // InternalIDSLParser.g:2134:5: lv_name_0_0= RULE_IMAGEID
            {
            lv_name_0_0=(Token)match(input,RULE_IMAGEID,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getImageAccess().getNameIMAGEIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.mydsl.IDSL.IMAGEID");
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getImageAccess().getColonKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_24); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getImageAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalIDSLParser.g:2158:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= Position otherlv_5= Colon ( (lv_position_6_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Size otherlv_8= Colon ( (lv_size_9_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Src otherlv_11= Colon ( (lv_src_12_0= ruleImageSrc ) ) ) ) ) ) )+ {...}?) ) )
            // InternalIDSLParser.g:2159:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= Position otherlv_5= Colon ( (lv_position_6_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Size otherlv_8= Colon ( (lv_size_9_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Src otherlv_11= Colon ( (lv_src_12_0= ruleImageSrc ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalIDSLParser.g:2159:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= Position otherlv_5= Colon ( (lv_position_6_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Size otherlv_8= Colon ( (lv_size_9_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Src otherlv_11= Colon ( (lv_src_12_0= ruleImageSrc ) ) ) ) ) ) )+ {...}?) )
            // InternalIDSLParser.g:2160:5: ( ( ({...}? => ( ({...}? => (otherlv_4= Position otherlv_5= Colon ( (lv_position_6_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Size otherlv_8= Colon ( (lv_size_9_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Src otherlv_11= Colon ( (lv_src_12_0= ruleImageSrc ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getImageAccess().getUnorderedGroup_3());
            				
            // InternalIDSLParser.g:2163:5: ( ( ({...}? => ( ({...}? => (otherlv_4= Position otherlv_5= Colon ( (lv_position_6_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Size otherlv_8= Colon ( (lv_size_9_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Src otherlv_11= Colon ( (lv_src_12_0= ruleImageSrc ) ) ) ) ) ) )+ {...}?)
            // InternalIDSLParser.g:2164:6: ( ({...}? => ( ({...}? => (otherlv_4= Position otherlv_5= Colon ( (lv_position_6_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Size otherlv_8= Colon ( (lv_size_9_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Src otherlv_11= Colon ( (lv_src_12_0= ruleImageSrc ) ) ) ) ) ) )+ {...}?
            {
            // InternalIDSLParser.g:2164:6: ( ({...}? => ( ({...}? => (otherlv_4= Position otherlv_5= Colon ( (lv_position_6_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Size otherlv_8= Colon ( (lv_size_9_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Src otherlv_11= Colon ( (lv_src_12_0= ruleImageSrc ) ) ) ) ) ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=4;
                int LA20_0 = input.LA(1);

                if ( LA20_0 == Position && getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 0) ) {
                    alt20=1;
                }
                else if ( LA20_0 == Size && getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 1) ) {
                    alt20=2;
                }
                else if ( LA20_0 == Src && getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 2) ) {
                    alt20=3;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalIDSLParser.g:2165:4: ({...}? => ( ({...}? => (otherlv_4= Position otherlv_5= Colon ( (lv_position_6_0= RULE_SIZE_POS ) ) ) ) ) )
            	    {
            	    // InternalIDSLParser.g:2165:4: ({...}? => ( ({...}? => (otherlv_4= Position otherlv_5= Colon ( (lv_position_6_0= RULE_SIZE_POS ) ) ) ) ) )
            	    // InternalIDSLParser.g:2166:5: {...}? => ( ({...}? => (otherlv_4= Position otherlv_5= Colon ( (lv_position_6_0= RULE_SIZE_POS ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalIDSLParser.g:2166:102: ( ({...}? => (otherlv_4= Position otherlv_5= Colon ( (lv_position_6_0= RULE_SIZE_POS ) ) ) ) )
            	    // InternalIDSLParser.g:2167:6: ({...}? => (otherlv_4= Position otherlv_5= Colon ( (lv_position_6_0= RULE_SIZE_POS ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getImageAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalIDSLParser.g:2170:9: ({...}? => (otherlv_4= Position otherlv_5= Colon ( (lv_position_6_0= RULE_SIZE_POS ) ) ) )
            	    // InternalIDSLParser.g:2170:10: {...}? => (otherlv_4= Position otherlv_5= Colon ( (lv_position_6_0= RULE_SIZE_POS ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "true");
            	    }
            	    // InternalIDSLParser.g:2170:19: (otherlv_4= Position otherlv_5= Colon ( (lv_position_6_0= RULE_SIZE_POS ) ) )
            	    // InternalIDSLParser.g:2170:20: otherlv_4= Position otherlv_5= Colon ( (lv_position_6_0= RULE_SIZE_POS ) )
            	    {
            	    otherlv_4=(Token)match(input,Position,FOLLOW_3); 

            	    									newLeafNode(otherlv_4, grammarAccess.getImageAccess().getPositionKeyword_3_0_0());
            	    								
            	    otherlv_5=(Token)match(input,Colon,FOLLOW_9); 

            	    									newLeafNode(otherlv_5, grammarAccess.getImageAccess().getColonKeyword_3_0_1());
            	    								
            	    // InternalIDSLParser.g:2178:9: ( (lv_position_6_0= RULE_SIZE_POS ) )
            	    // InternalIDSLParser.g:2179:10: (lv_position_6_0= RULE_SIZE_POS )
            	    {
            	    // InternalIDSLParser.g:2179:10: (lv_position_6_0= RULE_SIZE_POS )
            	    // InternalIDSLParser.g:2180:11: lv_position_6_0= RULE_SIZE_POS
            	    {
            	    lv_position_6_0=(Token)match(input,RULE_SIZE_POS,FOLLOW_25); 

            	    											newLeafNode(lv_position_6_0, grammarAccess.getImageAccess().getPositionSIZE_POSTerminalRuleCall_3_0_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getImageRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"position",
            	    												lv_position_6_0,
            	    												"org.xtext.example.mydsl.IDSL.SIZE_POS");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getImageAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalIDSLParser.g:2202:4: ({...}? => ( ({...}? => (otherlv_7= Size otherlv_8= Colon ( (lv_size_9_0= RULE_SIZE_POS ) ) ) ) ) )
            	    {
            	    // InternalIDSLParser.g:2202:4: ({...}? => ( ({...}? => (otherlv_7= Size otherlv_8= Colon ( (lv_size_9_0= RULE_SIZE_POS ) ) ) ) ) )
            	    // InternalIDSLParser.g:2203:5: {...}? => ( ({...}? => (otherlv_7= Size otherlv_8= Colon ( (lv_size_9_0= RULE_SIZE_POS ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalIDSLParser.g:2203:102: ( ({...}? => (otherlv_7= Size otherlv_8= Colon ( (lv_size_9_0= RULE_SIZE_POS ) ) ) ) )
            	    // InternalIDSLParser.g:2204:6: ({...}? => (otherlv_7= Size otherlv_8= Colon ( (lv_size_9_0= RULE_SIZE_POS ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getImageAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalIDSLParser.g:2207:9: ({...}? => (otherlv_7= Size otherlv_8= Colon ( (lv_size_9_0= RULE_SIZE_POS ) ) ) )
            	    // InternalIDSLParser.g:2207:10: {...}? => (otherlv_7= Size otherlv_8= Colon ( (lv_size_9_0= RULE_SIZE_POS ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "true");
            	    }
            	    // InternalIDSLParser.g:2207:19: (otherlv_7= Size otherlv_8= Colon ( (lv_size_9_0= RULE_SIZE_POS ) ) )
            	    // InternalIDSLParser.g:2207:20: otherlv_7= Size otherlv_8= Colon ( (lv_size_9_0= RULE_SIZE_POS ) )
            	    {
            	    otherlv_7=(Token)match(input,Size,FOLLOW_3); 

            	    									newLeafNode(otherlv_7, grammarAccess.getImageAccess().getSizeKeyword_3_1_0());
            	    								
            	    otherlv_8=(Token)match(input,Colon,FOLLOW_9); 

            	    									newLeafNode(otherlv_8, grammarAccess.getImageAccess().getColonKeyword_3_1_1());
            	    								
            	    // InternalIDSLParser.g:2215:9: ( (lv_size_9_0= RULE_SIZE_POS ) )
            	    // InternalIDSLParser.g:2216:10: (lv_size_9_0= RULE_SIZE_POS )
            	    {
            	    // InternalIDSLParser.g:2216:10: (lv_size_9_0= RULE_SIZE_POS )
            	    // InternalIDSLParser.g:2217:11: lv_size_9_0= RULE_SIZE_POS
            	    {
            	    lv_size_9_0=(Token)match(input,RULE_SIZE_POS,FOLLOW_25); 

            	    											newLeafNode(lv_size_9_0, grammarAccess.getImageAccess().getSizeSIZE_POSTerminalRuleCall_3_1_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getImageRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"size",
            	    												lv_size_9_0,
            	    												"org.xtext.example.mydsl.IDSL.SIZE_POS");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getImageAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalIDSLParser.g:2239:4: ({...}? => ( ({...}? => (otherlv_10= Src otherlv_11= Colon ( (lv_src_12_0= ruleImageSrc ) ) ) ) ) )
            	    {
            	    // InternalIDSLParser.g:2239:4: ({...}? => ( ({...}? => (otherlv_10= Src otherlv_11= Colon ( (lv_src_12_0= ruleImageSrc ) ) ) ) ) )
            	    // InternalIDSLParser.g:2240:5: {...}? => ( ({...}? => (otherlv_10= Src otherlv_11= Colon ( (lv_src_12_0= ruleImageSrc ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalIDSLParser.g:2240:102: ( ({...}? => (otherlv_10= Src otherlv_11= Colon ( (lv_src_12_0= ruleImageSrc ) ) ) ) )
            	    // InternalIDSLParser.g:2241:6: ({...}? => (otherlv_10= Src otherlv_11= Colon ( (lv_src_12_0= ruleImageSrc ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getImageAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalIDSLParser.g:2244:9: ({...}? => (otherlv_10= Src otherlv_11= Colon ( (lv_src_12_0= ruleImageSrc ) ) ) )
            	    // InternalIDSLParser.g:2244:10: {...}? => (otherlv_10= Src otherlv_11= Colon ( (lv_src_12_0= ruleImageSrc ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "true");
            	    }
            	    // InternalIDSLParser.g:2244:19: (otherlv_10= Src otherlv_11= Colon ( (lv_src_12_0= ruleImageSrc ) ) )
            	    // InternalIDSLParser.g:2244:20: otherlv_10= Src otherlv_11= Colon ( (lv_src_12_0= ruleImageSrc ) )
            	    {
            	    otherlv_10=(Token)match(input,Src,FOLLOW_3); 

            	    									newLeafNode(otherlv_10, grammarAccess.getImageAccess().getSrcKeyword_3_2_0());
            	    								
            	    otherlv_11=(Token)match(input,Colon,FOLLOW_8); 

            	    									newLeafNode(otherlv_11, grammarAccess.getImageAccess().getColonKeyword_3_2_1());
            	    								
            	    // InternalIDSLParser.g:2252:9: ( (lv_src_12_0= ruleImageSrc ) )
            	    // InternalIDSLParser.g:2253:10: (lv_src_12_0= ruleImageSrc )
            	    {
            	    // InternalIDSLParser.g:2253:10: (lv_src_12_0= ruleImageSrc )
            	    // InternalIDSLParser.g:2254:11: lv_src_12_0= ruleImageSrc
            	    {

            	    											newCompositeNode(grammarAccess.getImageAccess().getSrcImageSrcParserRuleCall_3_2_2_0());
            	    										
            	    pushFollow(FOLLOW_25);
            	    lv_src_12_0=ruleImageSrc();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getImageRule());
            	    											}
            	    											set(
            	    												current,
            	    												"src",
            	    												lv_src_12_0,
            	    												"org.xtext.example.mydsl.IDSL.ImageSrc");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getImageAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getImageAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleImage", "getUnorderedGroupHelper().canLeave(grammarAccess.getImageAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getImageAccess().getUnorderedGroup_3());
            				

            }

            this_END_13=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_13, grammarAccess.getImageAccess().getENDTerminalRuleCall_4());
            		

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
    // $ANTLR end "ruleImage"


    // $ANTLR start "entryRulePiechart"
    // InternalIDSLParser.g:2293:1: entryRulePiechart returns [EObject current=null] : iv_rulePiechart= rulePiechart EOF ;
    public final EObject entryRulePiechart() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePiechart = null;


        try {
            // InternalIDSLParser.g:2293:49: (iv_rulePiechart= rulePiechart EOF )
            // InternalIDSLParser.g:2294:2: iv_rulePiechart= rulePiechart EOF
            {
             newCompositeNode(grammarAccess.getPiechartRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePiechart=rulePiechart();

            state._fsp--;

             current =iv_rulePiechart; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePiechart"


    // $ANTLR start "rulePiechart"
    // InternalIDSLParser.g:2300:1: rulePiechart returns [EObject current=null] : ( ( (lv_name_0_0= RULE_PIECHARTID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_piedata_14_0= ruleChartData ) )* this_END_15= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Legendstyle otherlv_17= Colon ( (lv_legendstyle_18_0= ruleLegendStyle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Padding otherlv_20= Colon ( (lv_padding_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Position otherlv_23= Colon ( (lv_position_24_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Showlegend otherlv_26= Colon ( (lv_showlegend_27_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= Showtitle otherlv_29= Colon ( (lv_showtitle_30_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Showpercentage otherlv_32= Colon ( (lv_showpercentage_33_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= Size otherlv_35= Colon ( (lv_size_36_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Title otherlv_38= Colon ( (lv_title_39_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= Type otherlv_41= Colon ( (lv_type_42_0= rulePieType ) ) ) ) ) ) )+ {...}?) ) ) this_END_43= RULE_END ) ;
    public final EObject rulePiechart() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_colors_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token this_BEGIN_12=null;
        Token this_END_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token lv_padding_21_0=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token lv_position_24_0=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token lv_size_36_0=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token lv_title_39_0=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        Token this_END_43=null;
        EObject lv_color_6_0 = null;

        AntlrDatatypeRuleToken lv_piedata_14_0 = null;

        Enumerator lv_legendstyle_18_0 = null;

        Enumerator lv_showlegend_27_0 = null;

        Enumerator lv_showtitle_30_0 = null;

        Enumerator lv_showpercentage_33_0 = null;

        Enumerator lv_type_42_0 = null;



        	enterRule();

        try {
            // InternalIDSLParser.g:2306:2: ( ( ( (lv_name_0_0= RULE_PIECHARTID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_piedata_14_0= ruleChartData ) )* this_END_15= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Legendstyle otherlv_17= Colon ( (lv_legendstyle_18_0= ruleLegendStyle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Padding otherlv_20= Colon ( (lv_padding_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Position otherlv_23= Colon ( (lv_position_24_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Showlegend otherlv_26= Colon ( (lv_showlegend_27_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= Showtitle otherlv_29= Colon ( (lv_showtitle_30_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Showpercentage otherlv_32= Colon ( (lv_showpercentage_33_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= Size otherlv_35= Colon ( (lv_size_36_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Title otherlv_38= Colon ( (lv_title_39_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= Type otherlv_41= Colon ( (lv_type_42_0= rulePieType ) ) ) ) ) ) )+ {...}?) ) ) this_END_43= RULE_END ) )
            // InternalIDSLParser.g:2307:2: ( ( (lv_name_0_0= RULE_PIECHARTID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_piedata_14_0= ruleChartData ) )* this_END_15= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Legendstyle otherlv_17= Colon ( (lv_legendstyle_18_0= ruleLegendStyle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Padding otherlv_20= Colon ( (lv_padding_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Position otherlv_23= Colon ( (lv_position_24_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Showlegend otherlv_26= Colon ( (lv_showlegend_27_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= Showtitle otherlv_29= Colon ( (lv_showtitle_30_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Showpercentage otherlv_32= Colon ( (lv_showpercentage_33_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= Size otherlv_35= Colon ( (lv_size_36_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Title otherlv_38= Colon ( (lv_title_39_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= Type otherlv_41= Colon ( (lv_type_42_0= rulePieType ) ) ) ) ) ) )+ {...}?) ) ) this_END_43= RULE_END )
            {
            // InternalIDSLParser.g:2307:2: ( ( (lv_name_0_0= RULE_PIECHARTID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_piedata_14_0= ruleChartData ) )* this_END_15= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Legendstyle otherlv_17= Colon ( (lv_legendstyle_18_0= ruleLegendStyle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Padding otherlv_20= Colon ( (lv_padding_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Position otherlv_23= Colon ( (lv_position_24_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Showlegend otherlv_26= Colon ( (lv_showlegend_27_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= Showtitle otherlv_29= Colon ( (lv_showtitle_30_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Showpercentage otherlv_32= Colon ( (lv_showpercentage_33_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= Size otherlv_35= Colon ( (lv_size_36_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Title otherlv_38= Colon ( (lv_title_39_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= Type otherlv_41= Colon ( (lv_type_42_0= rulePieType ) ) ) ) ) ) )+ {...}?) ) ) this_END_43= RULE_END )
            // InternalIDSLParser.g:2308:3: ( (lv_name_0_0= RULE_PIECHARTID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_piedata_14_0= ruleChartData ) )* this_END_15= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Legendstyle otherlv_17= Colon ( (lv_legendstyle_18_0= ruleLegendStyle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Padding otherlv_20= Colon ( (lv_padding_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Position otherlv_23= Colon ( (lv_position_24_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Showlegend otherlv_26= Colon ( (lv_showlegend_27_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= Showtitle otherlv_29= Colon ( (lv_showtitle_30_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Showpercentage otherlv_32= Colon ( (lv_showpercentage_33_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= Size otherlv_35= Colon ( (lv_size_36_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Title otherlv_38= Colon ( (lv_title_39_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= Type otherlv_41= Colon ( (lv_type_42_0= rulePieType ) ) ) ) ) ) )+ {...}?) ) ) this_END_43= RULE_END
            {
            // InternalIDSLParser.g:2308:3: ( (lv_name_0_0= RULE_PIECHARTID ) )
            // InternalIDSLParser.g:2309:4: (lv_name_0_0= RULE_PIECHARTID )
            {
            // InternalIDSLParser.g:2309:4: (lv_name_0_0= RULE_PIECHARTID )
            // InternalIDSLParser.g:2310:5: lv_name_0_0= RULE_PIECHARTID
            {
            lv_name_0_0=(Token)match(input,RULE_PIECHARTID,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getPiechartAccess().getNamePIECHARTIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPiechartRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.mydsl.IDSL.PIECHARTID");
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getPiechartAccess().getColonKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_26); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getPiechartAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalIDSLParser.g:2334:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_piedata_14_0= ruleChartData ) )* this_END_15= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Legendstyle otherlv_17= Colon ( (lv_legendstyle_18_0= ruleLegendStyle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Padding otherlv_20= Colon ( (lv_padding_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Position otherlv_23= Colon ( (lv_position_24_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Showlegend otherlv_26= Colon ( (lv_showlegend_27_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= Showtitle otherlv_29= Colon ( (lv_showtitle_30_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Showpercentage otherlv_32= Colon ( (lv_showpercentage_33_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= Size otherlv_35= Colon ( (lv_size_36_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Title otherlv_38= Colon ( (lv_title_39_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= Type otherlv_41= Colon ( (lv_type_42_0= rulePieType ) ) ) ) ) ) )+ {...}?) ) )
            // InternalIDSLParser.g:2335:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_piedata_14_0= ruleChartData ) )* this_END_15= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Legendstyle otherlv_17= Colon ( (lv_legendstyle_18_0= ruleLegendStyle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Padding otherlv_20= Colon ( (lv_padding_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Position otherlv_23= Colon ( (lv_position_24_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Showlegend otherlv_26= Colon ( (lv_showlegend_27_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= Showtitle otherlv_29= Colon ( (lv_showtitle_30_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Showpercentage otherlv_32= Colon ( (lv_showpercentage_33_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= Size otherlv_35= Colon ( (lv_size_36_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Title otherlv_38= Colon ( (lv_title_39_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= Type otherlv_41= Colon ( (lv_type_42_0= rulePieType ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalIDSLParser.g:2335:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_piedata_14_0= ruleChartData ) )* this_END_15= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Legendstyle otherlv_17= Colon ( (lv_legendstyle_18_0= ruleLegendStyle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Padding otherlv_20= Colon ( (lv_padding_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Position otherlv_23= Colon ( (lv_position_24_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Showlegend otherlv_26= Colon ( (lv_showlegend_27_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= Showtitle otherlv_29= Colon ( (lv_showtitle_30_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Showpercentage otherlv_32= Colon ( (lv_showpercentage_33_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= Size otherlv_35= Colon ( (lv_size_36_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Title otherlv_38= Colon ( (lv_title_39_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= Type otherlv_41= Colon ( (lv_type_42_0= rulePieType ) ) ) ) ) ) )+ {...}?) )
            // InternalIDSLParser.g:2336:5: ( ( ({...}? => ( ({...}? => (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_piedata_14_0= ruleChartData ) )* this_END_15= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Legendstyle otherlv_17= Colon ( (lv_legendstyle_18_0= ruleLegendStyle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Padding otherlv_20= Colon ( (lv_padding_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Position otherlv_23= Colon ( (lv_position_24_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Showlegend otherlv_26= Colon ( (lv_showlegend_27_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= Showtitle otherlv_29= Colon ( (lv_showtitle_30_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Showpercentage otherlv_32= Colon ( (lv_showpercentage_33_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= Size otherlv_35= Colon ( (lv_size_36_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Title otherlv_38= Colon ( (lv_title_39_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= Type otherlv_41= Colon ( (lv_type_42_0= rulePieType ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getPiechartAccess().getUnorderedGroup_3());
            				
            // InternalIDSLParser.g:2339:5: ( ( ({...}? => ( ({...}? => (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_piedata_14_0= ruleChartData ) )* this_END_15= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Legendstyle otherlv_17= Colon ( (lv_legendstyle_18_0= ruleLegendStyle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Padding otherlv_20= Colon ( (lv_padding_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Position otherlv_23= Colon ( (lv_position_24_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Showlegend otherlv_26= Colon ( (lv_showlegend_27_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= Showtitle otherlv_29= Colon ( (lv_showtitle_30_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Showpercentage otherlv_32= Colon ( (lv_showpercentage_33_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= Size otherlv_35= Colon ( (lv_size_36_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Title otherlv_38= Colon ( (lv_title_39_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= Type otherlv_41= Colon ( (lv_type_42_0= rulePieType ) ) ) ) ) ) )+ {...}?)
            // InternalIDSLParser.g:2340:6: ( ({...}? => ( ({...}? => (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_piedata_14_0= ruleChartData ) )* this_END_15= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Legendstyle otherlv_17= Colon ( (lv_legendstyle_18_0= ruleLegendStyle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Padding otherlv_20= Colon ( (lv_padding_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Position otherlv_23= Colon ( (lv_position_24_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Showlegend otherlv_26= Colon ( (lv_showlegend_27_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= Showtitle otherlv_29= Colon ( (lv_showtitle_30_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Showpercentage otherlv_32= Colon ( (lv_showpercentage_33_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= Size otherlv_35= Colon ( (lv_size_36_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Title otherlv_38= Colon ( (lv_title_39_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= Type otherlv_41= Colon ( (lv_type_42_0= rulePieType ) ) ) ) ) ) )+ {...}?
            {
            // InternalIDSLParser.g:2340:6: ( ({...}? => ( ({...}? => (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_piedata_14_0= ruleChartData ) )* this_END_15= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Legendstyle otherlv_17= Colon ( (lv_legendstyle_18_0= ruleLegendStyle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Padding otherlv_20= Colon ( (lv_padding_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Position otherlv_23= Colon ( (lv_position_24_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Showlegend otherlv_26= Colon ( (lv_showlegend_27_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= Showtitle otherlv_29= Colon ( (lv_showtitle_30_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Showpercentage otherlv_32= Colon ( (lv_showpercentage_33_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= Size otherlv_35= Colon ( (lv_size_36_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Title otherlv_38= Colon ( (lv_title_39_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= Type otherlv_41= Colon ( (lv_type_42_0= rulePieType ) ) ) ) ) ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=13;
                alt22 = dfa22.predict(input);
                switch (alt22) {
            	case 1 :
            	    // InternalIDSLParser.g:2341:4: ({...}? => ( ({...}? => (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) ) ) ) ) )
            	    {
            	    // InternalIDSLParser.g:2341:4: ({...}? => ( ({...}? => (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) ) ) ) ) )
            	    // InternalIDSLParser.g:2342:5: {...}? => ( ({...}? => (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPiechartAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePiechart", "getUnorderedGroupHelper().canSelect(grammarAccess.getPiechartAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalIDSLParser.g:2342:105: ( ({...}? => (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) ) ) ) )
            	    // InternalIDSLParser.g:2343:6: ({...}? => (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPiechartAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalIDSLParser.g:2346:9: ({...}? => (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) ) ) )
            	    // InternalIDSLParser.g:2346:10: {...}? => (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePiechart", "true");
            	    }
            	    // InternalIDSLParser.g:2346:19: (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) ) )
            	    // InternalIDSLParser.g:2346:20: otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) )
            	    {
            	    otherlv_4=(Token)match(input,Bgcolor,FOLLOW_3); 

            	    									newLeafNode(otherlv_4, grammarAccess.getPiechartAccess().getBgcolorKeyword_3_0_0());
            	    								
            	    otherlv_5=(Token)match(input,Colon,FOLLOW_6); 

            	    									newLeafNode(otherlv_5, grammarAccess.getPiechartAccess().getColonKeyword_3_0_1());
            	    								
            	    // InternalIDSLParser.g:2354:9: ( (lv_color_6_0= ruleColor ) )
            	    // InternalIDSLParser.g:2355:10: (lv_color_6_0= ruleColor )
            	    {
            	    // InternalIDSLParser.g:2355:10: (lv_color_6_0= ruleColor )
            	    // InternalIDSLParser.g:2356:11: lv_color_6_0= ruleColor
            	    {

            	    											newCompositeNode(grammarAccess.getPiechartAccess().getColorColorParserRuleCall_3_0_2_0());
            	    										
            	    pushFollow(FOLLOW_27);
            	    lv_color_6_0=ruleColor();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getPiechartRule());
            	    											}
            	    											set(
            	    												current,
            	    												"color",
            	    												lv_color_6_0,
            	    												"org.xtext.example.mydsl.IDSL.Color");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPiechartAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalIDSLParser.g:2379:4: ({...}? => ( ({...}? => (otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) ) ) ) ) )
            	    {
            	    // InternalIDSLParser.g:2379:4: ({...}? => ( ({...}? => (otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) ) ) ) ) )
            	    // InternalIDSLParser.g:2380:5: {...}? => ( ({...}? => (otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPiechartAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePiechart", "getUnorderedGroupHelper().canSelect(grammarAccess.getPiechartAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalIDSLParser.g:2380:105: ( ({...}? => (otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) ) ) ) )
            	    // InternalIDSLParser.g:2381:6: ({...}? => (otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPiechartAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalIDSLParser.g:2384:9: ({...}? => (otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) ) ) )
            	    // InternalIDSLParser.g:2384:10: {...}? => (otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePiechart", "true");
            	    }
            	    // InternalIDSLParser.g:2384:19: (otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) ) )
            	    // InternalIDSLParser.g:2384:20: otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) )
            	    {
            	    otherlv_7=(Token)match(input,Colors,FOLLOW_3); 

            	    									newLeafNode(otherlv_7, grammarAccess.getPiechartAccess().getColorsKeyword_3_1_0());
            	    								
            	    otherlv_8=(Token)match(input,Colon,FOLLOW_28); 

            	    									newLeafNode(otherlv_8, grammarAccess.getPiechartAccess().getColonKeyword_3_1_1());
            	    								
            	    // InternalIDSLParser.g:2392:9: ( (lv_colors_9_0= RULE_COLOR_CHARTS ) )
            	    // InternalIDSLParser.g:2393:10: (lv_colors_9_0= RULE_COLOR_CHARTS )
            	    {
            	    // InternalIDSLParser.g:2393:10: (lv_colors_9_0= RULE_COLOR_CHARTS )
            	    // InternalIDSLParser.g:2394:11: lv_colors_9_0= RULE_COLOR_CHARTS
            	    {
            	    lv_colors_9_0=(Token)match(input,RULE_COLOR_CHARTS,FOLLOW_27); 

            	    											newLeafNode(lv_colors_9_0, grammarAccess.getPiechartAccess().getColorsCOLOR_CHARTSTerminalRuleCall_3_1_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getPiechartRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"colors",
            	    												lv_colors_9_0,
            	    												"org.xtext.example.mydsl.IDSL.COLOR_CHARTS");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPiechartAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalIDSLParser.g:2416:4: ({...}? => ( ({...}? => (otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_piedata_14_0= ruleChartData ) )* this_END_15= RULE_END ) ) ) )
            	    {
            	    // InternalIDSLParser.g:2416:4: ({...}? => ( ({...}? => (otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_piedata_14_0= ruleChartData ) )* this_END_15= RULE_END ) ) ) )
            	    // InternalIDSLParser.g:2417:5: {...}? => ( ({...}? => (otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_piedata_14_0= ruleChartData ) )* this_END_15= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPiechartAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "rulePiechart", "getUnorderedGroupHelper().canSelect(grammarAccess.getPiechartAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalIDSLParser.g:2417:105: ( ({...}? => (otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_piedata_14_0= ruleChartData ) )* this_END_15= RULE_END ) ) )
            	    // InternalIDSLParser.g:2418:6: ({...}? => (otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_piedata_14_0= ruleChartData ) )* this_END_15= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPiechartAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalIDSLParser.g:2421:9: ({...}? => (otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_piedata_14_0= ruleChartData ) )* this_END_15= RULE_END ) )
            	    // InternalIDSLParser.g:2421:10: {...}? => (otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_piedata_14_0= ruleChartData ) )* this_END_15= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePiechart", "true");
            	    }
            	    // InternalIDSLParser.g:2421:19: (otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_piedata_14_0= ruleChartData ) )* this_END_15= RULE_END )
            	    // InternalIDSLParser.g:2421:20: otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_piedata_14_0= ruleChartData ) )* this_END_15= RULE_END
            	    {
            	    otherlv_10=(Token)match(input,Data,FOLLOW_3); 

            	    									newLeafNode(otherlv_10, grammarAccess.getPiechartAccess().getDataKeyword_3_2_0());
            	    								
            	    otherlv_11=(Token)match(input,Colon,FOLLOW_12); 

            	    									newLeafNode(otherlv_11, grammarAccess.getPiechartAccess().getColonKeyword_3_2_1());
            	    								
            	    this_BEGIN_12=(Token)match(input,RULE_BEGIN,FOLLOW_8); 

            	    									newLeafNode(this_BEGIN_12, grammarAccess.getPiechartAccess().getBEGINTerminalRuleCall_3_2_2());
            	    								

            	    									newCompositeNode(grammarAccess.getPiechartAccess().getChartDataParserRuleCall_3_2_3());
            	    								
            	    pushFollow(FOLLOW_29);
            	    ruleChartData();

            	    state._fsp--;


            	    									afterParserOrEnumRuleCall();
            	    								
            	    // InternalIDSLParser.g:2440:9: ( (lv_piedata_14_0= ruleChartData ) )*
            	    loop21:
            	    do {
            	        int alt21=2;
            	        int LA21_0 = input.LA(1);

            	        if ( (LA21_0==RULE_STRING) ) {
            	            alt21=1;
            	        }


            	        switch (alt21) {
            	    	case 1 :
            	    	    // InternalIDSLParser.g:2441:10: (lv_piedata_14_0= ruleChartData )
            	    	    {
            	    	    // InternalIDSLParser.g:2441:10: (lv_piedata_14_0= ruleChartData )
            	    	    // InternalIDSLParser.g:2442:11: lv_piedata_14_0= ruleChartData
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getPiechartAccess().getPiedataChartDataParserRuleCall_3_2_4_0());
            	    	    										
            	    	    pushFollow(FOLLOW_29);
            	    	    lv_piedata_14_0=ruleChartData();

            	    	    state._fsp--;


            	    	    											if (current==null) {
            	    	    												current = createModelElementForParent(grammarAccess.getPiechartRule());
            	    	    											}
            	    	    											add(
            	    	    												current,
            	    	    												"piedata",
            	    	    												lv_piedata_14_0,
            	    	    												"org.xtext.example.mydsl.IDSL.ChartData");
            	    	    											afterParserOrEnumRuleCall();
            	    	    										

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop21;
            	        }
            	    } while (true);

            	    this_END_15=(Token)match(input,RULE_END,FOLLOW_27); 

            	    									newLeafNode(this_END_15, grammarAccess.getPiechartAccess().getENDTerminalRuleCall_3_2_5());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPiechartAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalIDSLParser.g:2469:4: ({...}? => ( ({...}? => (otherlv_16= Legendstyle otherlv_17= Colon ( (lv_legendstyle_18_0= ruleLegendStyle ) ) ) ) ) )
            	    {
            	    // InternalIDSLParser.g:2469:4: ({...}? => ( ({...}? => (otherlv_16= Legendstyle otherlv_17= Colon ( (lv_legendstyle_18_0= ruleLegendStyle ) ) ) ) ) )
            	    // InternalIDSLParser.g:2470:5: {...}? => ( ({...}? => (otherlv_16= Legendstyle otherlv_17= Colon ( (lv_legendstyle_18_0= ruleLegendStyle ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPiechartAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "rulePiechart", "getUnorderedGroupHelper().canSelect(grammarAccess.getPiechartAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalIDSLParser.g:2470:105: ( ({...}? => (otherlv_16= Legendstyle otherlv_17= Colon ( (lv_legendstyle_18_0= ruleLegendStyle ) ) ) ) )
            	    // InternalIDSLParser.g:2471:6: ({...}? => (otherlv_16= Legendstyle otherlv_17= Colon ( (lv_legendstyle_18_0= ruleLegendStyle ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPiechartAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalIDSLParser.g:2474:9: ({...}? => (otherlv_16= Legendstyle otherlv_17= Colon ( (lv_legendstyle_18_0= ruleLegendStyle ) ) ) )
            	    // InternalIDSLParser.g:2474:10: {...}? => (otherlv_16= Legendstyle otherlv_17= Colon ( (lv_legendstyle_18_0= ruleLegendStyle ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePiechart", "true");
            	    }
            	    // InternalIDSLParser.g:2474:19: (otherlv_16= Legendstyle otherlv_17= Colon ( (lv_legendstyle_18_0= ruleLegendStyle ) ) )
            	    // InternalIDSLParser.g:2474:20: otherlv_16= Legendstyle otherlv_17= Colon ( (lv_legendstyle_18_0= ruleLegendStyle ) )
            	    {
            	    otherlv_16=(Token)match(input,Legendstyle,FOLLOW_3); 

            	    									newLeafNode(otherlv_16, grammarAccess.getPiechartAccess().getLegendstyleKeyword_3_3_0());
            	    								
            	    otherlv_17=(Token)match(input,Colon,FOLLOW_30); 

            	    									newLeafNode(otherlv_17, grammarAccess.getPiechartAccess().getColonKeyword_3_3_1());
            	    								
            	    // InternalIDSLParser.g:2482:9: ( (lv_legendstyle_18_0= ruleLegendStyle ) )
            	    // InternalIDSLParser.g:2483:10: (lv_legendstyle_18_0= ruleLegendStyle )
            	    {
            	    // InternalIDSLParser.g:2483:10: (lv_legendstyle_18_0= ruleLegendStyle )
            	    // InternalIDSLParser.g:2484:11: lv_legendstyle_18_0= ruleLegendStyle
            	    {

            	    											newCompositeNode(grammarAccess.getPiechartAccess().getLegendstyleLegendStyleEnumRuleCall_3_3_2_0());
            	    										
            	    pushFollow(FOLLOW_27);
            	    lv_legendstyle_18_0=ruleLegendStyle();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getPiechartRule());
            	    											}
            	    											set(
            	    												current,
            	    												"legendstyle",
            	    												lv_legendstyle_18_0,
            	    												"org.xtext.example.mydsl.IDSL.LegendStyle");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPiechartAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalIDSLParser.g:2507:4: ({...}? => ( ({...}? => (otherlv_19= Padding otherlv_20= Colon ( (lv_padding_21_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalIDSLParser.g:2507:4: ({...}? => ( ({...}? => (otherlv_19= Padding otherlv_20= Colon ( (lv_padding_21_0= RULE_INT ) ) ) ) ) )
            	    // InternalIDSLParser.g:2508:5: {...}? => ( ({...}? => (otherlv_19= Padding otherlv_20= Colon ( (lv_padding_21_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPiechartAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "rulePiechart", "getUnorderedGroupHelper().canSelect(grammarAccess.getPiechartAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // InternalIDSLParser.g:2508:105: ( ({...}? => (otherlv_19= Padding otherlv_20= Colon ( (lv_padding_21_0= RULE_INT ) ) ) ) )
            	    // InternalIDSLParser.g:2509:6: ({...}? => (otherlv_19= Padding otherlv_20= Colon ( (lv_padding_21_0= RULE_INT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPiechartAccess().getUnorderedGroup_3(), 4);
            	    					
            	    // InternalIDSLParser.g:2512:9: ({...}? => (otherlv_19= Padding otherlv_20= Colon ( (lv_padding_21_0= RULE_INT ) ) ) )
            	    // InternalIDSLParser.g:2512:10: {...}? => (otherlv_19= Padding otherlv_20= Colon ( (lv_padding_21_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePiechart", "true");
            	    }
            	    // InternalIDSLParser.g:2512:19: (otherlv_19= Padding otherlv_20= Colon ( (lv_padding_21_0= RULE_INT ) ) )
            	    // InternalIDSLParser.g:2512:20: otherlv_19= Padding otherlv_20= Colon ( (lv_padding_21_0= RULE_INT ) )
            	    {
            	    otherlv_19=(Token)match(input,Padding,FOLLOW_3); 

            	    									newLeafNode(otherlv_19, grammarAccess.getPiechartAccess().getPaddingKeyword_3_4_0());
            	    								
            	    otherlv_20=(Token)match(input,Colon,FOLLOW_16); 

            	    									newLeafNode(otherlv_20, grammarAccess.getPiechartAccess().getColonKeyword_3_4_1());
            	    								
            	    // InternalIDSLParser.g:2520:9: ( (lv_padding_21_0= RULE_INT ) )
            	    // InternalIDSLParser.g:2521:10: (lv_padding_21_0= RULE_INT )
            	    {
            	    // InternalIDSLParser.g:2521:10: (lv_padding_21_0= RULE_INT )
            	    // InternalIDSLParser.g:2522:11: lv_padding_21_0= RULE_INT
            	    {
            	    lv_padding_21_0=(Token)match(input,RULE_INT,FOLLOW_27); 

            	    											newLeafNode(lv_padding_21_0, grammarAccess.getPiechartAccess().getPaddingINTTerminalRuleCall_3_4_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getPiechartRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"padding",
            	    												lv_padding_21_0,
            	    												"org.eclipse.xtext.common.Terminals.INT");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPiechartAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalIDSLParser.g:2544:4: ({...}? => ( ({...}? => (otherlv_22= Position otherlv_23= Colon ( (lv_position_24_0= RULE_SIZE_POS ) ) ) ) ) )
            	    {
            	    // InternalIDSLParser.g:2544:4: ({...}? => ( ({...}? => (otherlv_22= Position otherlv_23= Colon ( (lv_position_24_0= RULE_SIZE_POS ) ) ) ) ) )
            	    // InternalIDSLParser.g:2545:5: {...}? => ( ({...}? => (otherlv_22= Position otherlv_23= Colon ( (lv_position_24_0= RULE_SIZE_POS ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPiechartAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "rulePiechart", "getUnorderedGroupHelper().canSelect(grammarAccess.getPiechartAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // InternalIDSLParser.g:2545:105: ( ({...}? => (otherlv_22= Position otherlv_23= Colon ( (lv_position_24_0= RULE_SIZE_POS ) ) ) ) )
            	    // InternalIDSLParser.g:2546:6: ({...}? => (otherlv_22= Position otherlv_23= Colon ( (lv_position_24_0= RULE_SIZE_POS ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPiechartAccess().getUnorderedGroup_3(), 5);
            	    					
            	    // InternalIDSLParser.g:2549:9: ({...}? => (otherlv_22= Position otherlv_23= Colon ( (lv_position_24_0= RULE_SIZE_POS ) ) ) )
            	    // InternalIDSLParser.g:2549:10: {...}? => (otherlv_22= Position otherlv_23= Colon ( (lv_position_24_0= RULE_SIZE_POS ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePiechart", "true");
            	    }
            	    // InternalIDSLParser.g:2549:19: (otherlv_22= Position otherlv_23= Colon ( (lv_position_24_0= RULE_SIZE_POS ) ) )
            	    // InternalIDSLParser.g:2549:20: otherlv_22= Position otherlv_23= Colon ( (lv_position_24_0= RULE_SIZE_POS ) )
            	    {
            	    otherlv_22=(Token)match(input,Position,FOLLOW_3); 

            	    									newLeafNode(otherlv_22, grammarAccess.getPiechartAccess().getPositionKeyword_3_5_0());
            	    								
            	    otherlv_23=(Token)match(input,Colon,FOLLOW_9); 

            	    									newLeafNode(otherlv_23, grammarAccess.getPiechartAccess().getColonKeyword_3_5_1());
            	    								
            	    // InternalIDSLParser.g:2557:9: ( (lv_position_24_0= RULE_SIZE_POS ) )
            	    // InternalIDSLParser.g:2558:10: (lv_position_24_0= RULE_SIZE_POS )
            	    {
            	    // InternalIDSLParser.g:2558:10: (lv_position_24_0= RULE_SIZE_POS )
            	    // InternalIDSLParser.g:2559:11: lv_position_24_0= RULE_SIZE_POS
            	    {
            	    lv_position_24_0=(Token)match(input,RULE_SIZE_POS,FOLLOW_27); 

            	    											newLeafNode(lv_position_24_0, grammarAccess.getPiechartAccess().getPositionSIZE_POSTerminalRuleCall_3_5_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getPiechartRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"position",
            	    												lv_position_24_0,
            	    												"org.xtext.example.mydsl.IDSL.SIZE_POS");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPiechartAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalIDSLParser.g:2581:4: ({...}? => ( ({...}? => (otherlv_25= Showlegend otherlv_26= Colon ( (lv_showlegend_27_0= ruleShowOptionsOff ) ) ) ) ) )
            	    {
            	    // InternalIDSLParser.g:2581:4: ({...}? => ( ({...}? => (otherlv_25= Showlegend otherlv_26= Colon ( (lv_showlegend_27_0= ruleShowOptionsOff ) ) ) ) ) )
            	    // InternalIDSLParser.g:2582:5: {...}? => ( ({...}? => (otherlv_25= Showlegend otherlv_26= Colon ( (lv_showlegend_27_0= ruleShowOptionsOff ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPiechartAccess().getUnorderedGroup_3(), 6) ) {
            	        throw new FailedPredicateException(input, "rulePiechart", "getUnorderedGroupHelper().canSelect(grammarAccess.getPiechartAccess().getUnorderedGroup_3(), 6)");
            	    }
            	    // InternalIDSLParser.g:2582:105: ( ({...}? => (otherlv_25= Showlegend otherlv_26= Colon ( (lv_showlegend_27_0= ruleShowOptionsOff ) ) ) ) )
            	    // InternalIDSLParser.g:2583:6: ({...}? => (otherlv_25= Showlegend otherlv_26= Colon ( (lv_showlegend_27_0= ruleShowOptionsOff ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPiechartAccess().getUnorderedGroup_3(), 6);
            	    					
            	    // InternalIDSLParser.g:2586:9: ({...}? => (otherlv_25= Showlegend otherlv_26= Colon ( (lv_showlegend_27_0= ruleShowOptionsOff ) ) ) )
            	    // InternalIDSLParser.g:2586:10: {...}? => (otherlv_25= Showlegend otherlv_26= Colon ( (lv_showlegend_27_0= ruleShowOptionsOff ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePiechart", "true");
            	    }
            	    // InternalIDSLParser.g:2586:19: (otherlv_25= Showlegend otherlv_26= Colon ( (lv_showlegend_27_0= ruleShowOptionsOff ) ) )
            	    // InternalIDSLParser.g:2586:20: otherlv_25= Showlegend otherlv_26= Colon ( (lv_showlegend_27_0= ruleShowOptionsOff ) )
            	    {
            	    otherlv_25=(Token)match(input,Showlegend,FOLLOW_3); 

            	    									newLeafNode(otherlv_25, grammarAccess.getPiechartAccess().getShowlegendKeyword_3_6_0());
            	    								
            	    otherlv_26=(Token)match(input,Colon,FOLLOW_31); 

            	    									newLeafNode(otherlv_26, grammarAccess.getPiechartAccess().getColonKeyword_3_6_1());
            	    								
            	    // InternalIDSLParser.g:2594:9: ( (lv_showlegend_27_0= ruleShowOptionsOff ) )
            	    // InternalIDSLParser.g:2595:10: (lv_showlegend_27_0= ruleShowOptionsOff )
            	    {
            	    // InternalIDSLParser.g:2595:10: (lv_showlegend_27_0= ruleShowOptionsOff )
            	    // InternalIDSLParser.g:2596:11: lv_showlegend_27_0= ruleShowOptionsOff
            	    {

            	    											newCompositeNode(grammarAccess.getPiechartAccess().getShowlegendShowOptionsOffEnumRuleCall_3_6_2_0());
            	    										
            	    pushFollow(FOLLOW_27);
            	    lv_showlegend_27_0=ruleShowOptionsOff();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getPiechartRule());
            	    											}
            	    											set(
            	    												current,
            	    												"showlegend",
            	    												lv_showlegend_27_0,
            	    												"org.xtext.example.mydsl.IDSL.ShowOptionsOff");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPiechartAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalIDSLParser.g:2619:4: ({...}? => ( ({...}? => (otherlv_28= Showtitle otherlv_29= Colon ( (lv_showtitle_30_0= ruleShowOptionsOff ) ) ) ) ) )
            	    {
            	    // InternalIDSLParser.g:2619:4: ({...}? => ( ({...}? => (otherlv_28= Showtitle otherlv_29= Colon ( (lv_showtitle_30_0= ruleShowOptionsOff ) ) ) ) ) )
            	    // InternalIDSLParser.g:2620:5: {...}? => ( ({...}? => (otherlv_28= Showtitle otherlv_29= Colon ( (lv_showtitle_30_0= ruleShowOptionsOff ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPiechartAccess().getUnorderedGroup_3(), 7) ) {
            	        throw new FailedPredicateException(input, "rulePiechart", "getUnorderedGroupHelper().canSelect(grammarAccess.getPiechartAccess().getUnorderedGroup_3(), 7)");
            	    }
            	    // InternalIDSLParser.g:2620:105: ( ({...}? => (otherlv_28= Showtitle otherlv_29= Colon ( (lv_showtitle_30_0= ruleShowOptionsOff ) ) ) ) )
            	    // InternalIDSLParser.g:2621:6: ({...}? => (otherlv_28= Showtitle otherlv_29= Colon ( (lv_showtitle_30_0= ruleShowOptionsOff ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPiechartAccess().getUnorderedGroup_3(), 7);
            	    					
            	    // InternalIDSLParser.g:2624:9: ({...}? => (otherlv_28= Showtitle otherlv_29= Colon ( (lv_showtitle_30_0= ruleShowOptionsOff ) ) ) )
            	    // InternalIDSLParser.g:2624:10: {...}? => (otherlv_28= Showtitle otherlv_29= Colon ( (lv_showtitle_30_0= ruleShowOptionsOff ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePiechart", "true");
            	    }
            	    // InternalIDSLParser.g:2624:19: (otherlv_28= Showtitle otherlv_29= Colon ( (lv_showtitle_30_0= ruleShowOptionsOff ) ) )
            	    // InternalIDSLParser.g:2624:20: otherlv_28= Showtitle otherlv_29= Colon ( (lv_showtitle_30_0= ruleShowOptionsOff ) )
            	    {
            	    otherlv_28=(Token)match(input,Showtitle,FOLLOW_3); 

            	    									newLeafNode(otherlv_28, grammarAccess.getPiechartAccess().getShowtitleKeyword_3_7_0());
            	    								
            	    otherlv_29=(Token)match(input,Colon,FOLLOW_31); 

            	    									newLeafNode(otherlv_29, grammarAccess.getPiechartAccess().getColonKeyword_3_7_1());
            	    								
            	    // InternalIDSLParser.g:2632:9: ( (lv_showtitle_30_0= ruleShowOptionsOff ) )
            	    // InternalIDSLParser.g:2633:10: (lv_showtitle_30_0= ruleShowOptionsOff )
            	    {
            	    // InternalIDSLParser.g:2633:10: (lv_showtitle_30_0= ruleShowOptionsOff )
            	    // InternalIDSLParser.g:2634:11: lv_showtitle_30_0= ruleShowOptionsOff
            	    {

            	    											newCompositeNode(grammarAccess.getPiechartAccess().getShowtitleShowOptionsOffEnumRuleCall_3_7_2_0());
            	    										
            	    pushFollow(FOLLOW_27);
            	    lv_showtitle_30_0=ruleShowOptionsOff();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getPiechartRule());
            	    											}
            	    											set(
            	    												current,
            	    												"showtitle",
            	    												lv_showtitle_30_0,
            	    												"org.xtext.example.mydsl.IDSL.ShowOptionsOff");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPiechartAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // InternalIDSLParser.g:2657:4: ({...}? => ( ({...}? => (otherlv_31= Showpercentage otherlv_32= Colon ( (lv_showpercentage_33_0= ruleShowOptionsOff ) ) ) ) ) )
            	    {
            	    // InternalIDSLParser.g:2657:4: ({...}? => ( ({...}? => (otherlv_31= Showpercentage otherlv_32= Colon ( (lv_showpercentage_33_0= ruleShowOptionsOff ) ) ) ) ) )
            	    // InternalIDSLParser.g:2658:5: {...}? => ( ({...}? => (otherlv_31= Showpercentage otherlv_32= Colon ( (lv_showpercentage_33_0= ruleShowOptionsOff ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPiechartAccess().getUnorderedGroup_3(), 8) ) {
            	        throw new FailedPredicateException(input, "rulePiechart", "getUnorderedGroupHelper().canSelect(grammarAccess.getPiechartAccess().getUnorderedGroup_3(), 8)");
            	    }
            	    // InternalIDSLParser.g:2658:105: ( ({...}? => (otherlv_31= Showpercentage otherlv_32= Colon ( (lv_showpercentage_33_0= ruleShowOptionsOff ) ) ) ) )
            	    // InternalIDSLParser.g:2659:6: ({...}? => (otherlv_31= Showpercentage otherlv_32= Colon ( (lv_showpercentage_33_0= ruleShowOptionsOff ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPiechartAccess().getUnorderedGroup_3(), 8);
            	    					
            	    // InternalIDSLParser.g:2662:9: ({...}? => (otherlv_31= Showpercentage otherlv_32= Colon ( (lv_showpercentage_33_0= ruleShowOptionsOff ) ) ) )
            	    // InternalIDSLParser.g:2662:10: {...}? => (otherlv_31= Showpercentage otherlv_32= Colon ( (lv_showpercentage_33_0= ruleShowOptionsOff ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePiechart", "true");
            	    }
            	    // InternalIDSLParser.g:2662:19: (otherlv_31= Showpercentage otherlv_32= Colon ( (lv_showpercentage_33_0= ruleShowOptionsOff ) ) )
            	    // InternalIDSLParser.g:2662:20: otherlv_31= Showpercentage otherlv_32= Colon ( (lv_showpercentage_33_0= ruleShowOptionsOff ) )
            	    {
            	    otherlv_31=(Token)match(input,Showpercentage,FOLLOW_3); 

            	    									newLeafNode(otherlv_31, grammarAccess.getPiechartAccess().getShowpercentageKeyword_3_8_0());
            	    								
            	    otherlv_32=(Token)match(input,Colon,FOLLOW_31); 

            	    									newLeafNode(otherlv_32, grammarAccess.getPiechartAccess().getColonKeyword_3_8_1());
            	    								
            	    // InternalIDSLParser.g:2670:9: ( (lv_showpercentage_33_0= ruleShowOptionsOff ) )
            	    // InternalIDSLParser.g:2671:10: (lv_showpercentage_33_0= ruleShowOptionsOff )
            	    {
            	    // InternalIDSLParser.g:2671:10: (lv_showpercentage_33_0= ruleShowOptionsOff )
            	    // InternalIDSLParser.g:2672:11: lv_showpercentage_33_0= ruleShowOptionsOff
            	    {

            	    											newCompositeNode(grammarAccess.getPiechartAccess().getShowpercentageShowOptionsOffEnumRuleCall_3_8_2_0());
            	    										
            	    pushFollow(FOLLOW_27);
            	    lv_showpercentage_33_0=ruleShowOptionsOff();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getPiechartRule());
            	    											}
            	    											set(
            	    												current,
            	    												"showpercentage",
            	    												lv_showpercentage_33_0,
            	    												"org.xtext.example.mydsl.IDSL.ShowOptionsOff");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPiechartAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // InternalIDSLParser.g:2695:4: ({...}? => ( ({...}? => (otherlv_34= Size otherlv_35= Colon ( (lv_size_36_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalIDSLParser.g:2695:4: ({...}? => ( ({...}? => (otherlv_34= Size otherlv_35= Colon ( (lv_size_36_0= RULE_INT ) ) ) ) ) )
            	    // InternalIDSLParser.g:2696:5: {...}? => ( ({...}? => (otherlv_34= Size otherlv_35= Colon ( (lv_size_36_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPiechartAccess().getUnorderedGroup_3(), 9) ) {
            	        throw new FailedPredicateException(input, "rulePiechart", "getUnorderedGroupHelper().canSelect(grammarAccess.getPiechartAccess().getUnorderedGroup_3(), 9)");
            	    }
            	    // InternalIDSLParser.g:2696:105: ( ({...}? => (otherlv_34= Size otherlv_35= Colon ( (lv_size_36_0= RULE_INT ) ) ) ) )
            	    // InternalIDSLParser.g:2697:6: ({...}? => (otherlv_34= Size otherlv_35= Colon ( (lv_size_36_0= RULE_INT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPiechartAccess().getUnorderedGroup_3(), 9);
            	    					
            	    // InternalIDSLParser.g:2700:9: ({...}? => (otherlv_34= Size otherlv_35= Colon ( (lv_size_36_0= RULE_INT ) ) ) )
            	    // InternalIDSLParser.g:2700:10: {...}? => (otherlv_34= Size otherlv_35= Colon ( (lv_size_36_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePiechart", "true");
            	    }
            	    // InternalIDSLParser.g:2700:19: (otherlv_34= Size otherlv_35= Colon ( (lv_size_36_0= RULE_INT ) ) )
            	    // InternalIDSLParser.g:2700:20: otherlv_34= Size otherlv_35= Colon ( (lv_size_36_0= RULE_INT ) )
            	    {
            	    otherlv_34=(Token)match(input,Size,FOLLOW_3); 

            	    									newLeafNode(otherlv_34, grammarAccess.getPiechartAccess().getSizeKeyword_3_9_0());
            	    								
            	    otherlv_35=(Token)match(input,Colon,FOLLOW_16); 

            	    									newLeafNode(otherlv_35, grammarAccess.getPiechartAccess().getColonKeyword_3_9_1());
            	    								
            	    // InternalIDSLParser.g:2708:9: ( (lv_size_36_0= RULE_INT ) )
            	    // InternalIDSLParser.g:2709:10: (lv_size_36_0= RULE_INT )
            	    {
            	    // InternalIDSLParser.g:2709:10: (lv_size_36_0= RULE_INT )
            	    // InternalIDSLParser.g:2710:11: lv_size_36_0= RULE_INT
            	    {
            	    lv_size_36_0=(Token)match(input,RULE_INT,FOLLOW_27); 

            	    											newLeafNode(lv_size_36_0, grammarAccess.getPiechartAccess().getSizeINTTerminalRuleCall_3_9_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getPiechartRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"size",
            	    												lv_size_36_0,
            	    												"org.eclipse.xtext.common.Terminals.INT");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPiechartAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // InternalIDSLParser.g:2732:4: ({...}? => ( ({...}? => (otherlv_37= Title otherlv_38= Colon ( (lv_title_39_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalIDSLParser.g:2732:4: ({...}? => ( ({...}? => (otherlv_37= Title otherlv_38= Colon ( (lv_title_39_0= RULE_STRING ) ) ) ) ) )
            	    // InternalIDSLParser.g:2733:5: {...}? => ( ({...}? => (otherlv_37= Title otherlv_38= Colon ( (lv_title_39_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPiechartAccess().getUnorderedGroup_3(), 10) ) {
            	        throw new FailedPredicateException(input, "rulePiechart", "getUnorderedGroupHelper().canSelect(grammarAccess.getPiechartAccess().getUnorderedGroup_3(), 10)");
            	    }
            	    // InternalIDSLParser.g:2733:106: ( ({...}? => (otherlv_37= Title otherlv_38= Colon ( (lv_title_39_0= RULE_STRING ) ) ) ) )
            	    // InternalIDSLParser.g:2734:6: ({...}? => (otherlv_37= Title otherlv_38= Colon ( (lv_title_39_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPiechartAccess().getUnorderedGroup_3(), 10);
            	    					
            	    // InternalIDSLParser.g:2737:9: ({...}? => (otherlv_37= Title otherlv_38= Colon ( (lv_title_39_0= RULE_STRING ) ) ) )
            	    // InternalIDSLParser.g:2737:10: {...}? => (otherlv_37= Title otherlv_38= Colon ( (lv_title_39_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePiechart", "true");
            	    }
            	    // InternalIDSLParser.g:2737:19: (otherlv_37= Title otherlv_38= Colon ( (lv_title_39_0= RULE_STRING ) ) )
            	    // InternalIDSLParser.g:2737:20: otherlv_37= Title otherlv_38= Colon ( (lv_title_39_0= RULE_STRING ) )
            	    {
            	    otherlv_37=(Token)match(input,Title,FOLLOW_3); 

            	    									newLeafNode(otherlv_37, grammarAccess.getPiechartAccess().getTitleKeyword_3_10_0());
            	    								
            	    otherlv_38=(Token)match(input,Colon,FOLLOW_8); 

            	    									newLeafNode(otherlv_38, grammarAccess.getPiechartAccess().getColonKeyword_3_10_1());
            	    								
            	    // InternalIDSLParser.g:2745:9: ( (lv_title_39_0= RULE_STRING ) )
            	    // InternalIDSLParser.g:2746:10: (lv_title_39_0= RULE_STRING )
            	    {
            	    // InternalIDSLParser.g:2746:10: (lv_title_39_0= RULE_STRING )
            	    // InternalIDSLParser.g:2747:11: lv_title_39_0= RULE_STRING
            	    {
            	    lv_title_39_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

            	    											newLeafNode(lv_title_39_0, grammarAccess.getPiechartAccess().getTitleSTRINGTerminalRuleCall_3_10_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getPiechartRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"title",
            	    												lv_title_39_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPiechartAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 12 :
            	    // InternalIDSLParser.g:2769:4: ({...}? => ( ({...}? => (otherlv_40= Type otherlv_41= Colon ( (lv_type_42_0= rulePieType ) ) ) ) ) )
            	    {
            	    // InternalIDSLParser.g:2769:4: ({...}? => ( ({...}? => (otherlv_40= Type otherlv_41= Colon ( (lv_type_42_0= rulePieType ) ) ) ) ) )
            	    // InternalIDSLParser.g:2770:5: {...}? => ( ({...}? => (otherlv_40= Type otherlv_41= Colon ( (lv_type_42_0= rulePieType ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPiechartAccess().getUnorderedGroup_3(), 11) ) {
            	        throw new FailedPredicateException(input, "rulePiechart", "getUnorderedGroupHelper().canSelect(grammarAccess.getPiechartAccess().getUnorderedGroup_3(), 11)");
            	    }
            	    // InternalIDSLParser.g:2770:106: ( ({...}? => (otherlv_40= Type otherlv_41= Colon ( (lv_type_42_0= rulePieType ) ) ) ) )
            	    // InternalIDSLParser.g:2771:6: ({...}? => (otherlv_40= Type otherlv_41= Colon ( (lv_type_42_0= rulePieType ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPiechartAccess().getUnorderedGroup_3(), 11);
            	    					
            	    // InternalIDSLParser.g:2774:9: ({...}? => (otherlv_40= Type otherlv_41= Colon ( (lv_type_42_0= rulePieType ) ) ) )
            	    // InternalIDSLParser.g:2774:10: {...}? => (otherlv_40= Type otherlv_41= Colon ( (lv_type_42_0= rulePieType ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePiechart", "true");
            	    }
            	    // InternalIDSLParser.g:2774:19: (otherlv_40= Type otherlv_41= Colon ( (lv_type_42_0= rulePieType ) ) )
            	    // InternalIDSLParser.g:2774:20: otherlv_40= Type otherlv_41= Colon ( (lv_type_42_0= rulePieType ) )
            	    {
            	    otherlv_40=(Token)match(input,Type,FOLLOW_3); 

            	    									newLeafNode(otherlv_40, grammarAccess.getPiechartAccess().getTypeKeyword_3_11_0());
            	    								
            	    otherlv_41=(Token)match(input,Colon,FOLLOW_32); 

            	    									newLeafNode(otherlv_41, grammarAccess.getPiechartAccess().getColonKeyword_3_11_1());
            	    								
            	    // InternalIDSLParser.g:2782:9: ( (lv_type_42_0= rulePieType ) )
            	    // InternalIDSLParser.g:2783:10: (lv_type_42_0= rulePieType )
            	    {
            	    // InternalIDSLParser.g:2783:10: (lv_type_42_0= rulePieType )
            	    // InternalIDSLParser.g:2784:11: lv_type_42_0= rulePieType
            	    {

            	    											newCompositeNode(grammarAccess.getPiechartAccess().getTypePieTypeEnumRuleCall_3_11_2_0());
            	    										
            	    pushFollow(FOLLOW_27);
            	    lv_type_42_0=rulePieType();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getPiechartRule());
            	    											}
            	    											set(
            	    												current,
            	    												"type",
            	    												lv_type_42_0,
            	    												"org.xtext.example.mydsl.IDSL.PieType");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPiechartAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getPiechartAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "rulePiechart", "getUnorderedGroupHelper().canLeave(grammarAccess.getPiechartAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getPiechartAccess().getUnorderedGroup_3());
            				

            }

            this_END_43=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_43, grammarAccess.getPiechartAccess().getENDTerminalRuleCall_4());
            		

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
    // $ANTLR end "rulePiechart"


    // $ANTLR start "entryRuleBarchart"
    // InternalIDSLParser.g:2823:1: entryRuleBarchart returns [EObject current=null] : iv_ruleBarchart= ruleBarchart EOF ;
    public final EObject entryRuleBarchart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBarchart = null;


        try {
            // InternalIDSLParser.g:2823:49: (iv_ruleBarchart= ruleBarchart EOF )
            // InternalIDSLParser.g:2824:2: iv_ruleBarchart= ruleBarchart EOF
            {
             newCompositeNode(grammarAccess.getBarchartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBarchart=ruleBarchart();

            state._fsp--;

             current =iv_ruleBarchart; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBarchart"


    // $ANTLR start "ruleBarchart"
    // InternalIDSLParser.g:2830:1: ruleBarchart returns [EObject current=null] : ( ( (lv_name_0_0= RULE_BARCHARTID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_bardata_14_0= ruleChartData ) )* this_END_15= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Gridscale otherlv_17= Colon ( (lv_gridscale_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Legendstyle otherlv_20= Colon ( (lv_legendstyle_21_0= ruleLegendStyle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Padding otherlv_23= Colon ( (lv_padding_24_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Position otherlv_26= Colon ( (lv_position_27_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= Showgrid otherlv_29= Colon ( (lv_showgrid_30_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Showlegend otherlv_32= Colon ( (lv_showlegend_33_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= Showtitle otherlv_35= Colon ( (lv_showtitle_36_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Size otherlv_38= Colon ( (lv_size_39_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= Title otherlv_41= Colon ( (lv_title_42_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= Type otherlv_44= Colon ( (lv_type_45_0= ruleBarType ) ) ) ) ) ) )+ {...}?) ) ) this_END_46= RULE_END ) ;
    public final EObject ruleBarchart() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_colors_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token this_BEGIN_12=null;
        Token this_END_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_gridscale_18_0=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token lv_padding_24_0=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token lv_position_27_0=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token lv_size_39_0=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        Token lv_title_42_0=null;
        Token otherlv_43=null;
        Token otherlv_44=null;
        Token this_END_46=null;
        EObject lv_color_6_0 = null;

        AntlrDatatypeRuleToken lv_bardata_14_0 = null;

        Enumerator lv_legendstyle_21_0 = null;

        Enumerator lv_showgrid_30_0 = null;

        Enumerator lv_showlegend_33_0 = null;

        Enumerator lv_showtitle_36_0 = null;

        Enumerator lv_type_45_0 = null;



        	enterRule();

        try {
            // InternalIDSLParser.g:2836:2: ( ( ( (lv_name_0_0= RULE_BARCHARTID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_bardata_14_0= ruleChartData ) )* this_END_15= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Gridscale otherlv_17= Colon ( (lv_gridscale_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Legendstyle otherlv_20= Colon ( (lv_legendstyle_21_0= ruleLegendStyle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Padding otherlv_23= Colon ( (lv_padding_24_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Position otherlv_26= Colon ( (lv_position_27_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= Showgrid otherlv_29= Colon ( (lv_showgrid_30_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Showlegend otherlv_32= Colon ( (lv_showlegend_33_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= Showtitle otherlv_35= Colon ( (lv_showtitle_36_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Size otherlv_38= Colon ( (lv_size_39_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= Title otherlv_41= Colon ( (lv_title_42_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= Type otherlv_44= Colon ( (lv_type_45_0= ruleBarType ) ) ) ) ) ) )+ {...}?) ) ) this_END_46= RULE_END ) )
            // InternalIDSLParser.g:2837:2: ( ( (lv_name_0_0= RULE_BARCHARTID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_bardata_14_0= ruleChartData ) )* this_END_15= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Gridscale otherlv_17= Colon ( (lv_gridscale_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Legendstyle otherlv_20= Colon ( (lv_legendstyle_21_0= ruleLegendStyle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Padding otherlv_23= Colon ( (lv_padding_24_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Position otherlv_26= Colon ( (lv_position_27_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= Showgrid otherlv_29= Colon ( (lv_showgrid_30_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Showlegend otherlv_32= Colon ( (lv_showlegend_33_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= Showtitle otherlv_35= Colon ( (lv_showtitle_36_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Size otherlv_38= Colon ( (lv_size_39_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= Title otherlv_41= Colon ( (lv_title_42_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= Type otherlv_44= Colon ( (lv_type_45_0= ruleBarType ) ) ) ) ) ) )+ {...}?) ) ) this_END_46= RULE_END )
            {
            // InternalIDSLParser.g:2837:2: ( ( (lv_name_0_0= RULE_BARCHARTID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_bardata_14_0= ruleChartData ) )* this_END_15= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Gridscale otherlv_17= Colon ( (lv_gridscale_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Legendstyle otherlv_20= Colon ( (lv_legendstyle_21_0= ruleLegendStyle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Padding otherlv_23= Colon ( (lv_padding_24_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Position otherlv_26= Colon ( (lv_position_27_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= Showgrid otherlv_29= Colon ( (lv_showgrid_30_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Showlegend otherlv_32= Colon ( (lv_showlegend_33_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= Showtitle otherlv_35= Colon ( (lv_showtitle_36_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Size otherlv_38= Colon ( (lv_size_39_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= Title otherlv_41= Colon ( (lv_title_42_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= Type otherlv_44= Colon ( (lv_type_45_0= ruleBarType ) ) ) ) ) ) )+ {...}?) ) ) this_END_46= RULE_END )
            // InternalIDSLParser.g:2838:3: ( (lv_name_0_0= RULE_BARCHARTID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_bardata_14_0= ruleChartData ) )* this_END_15= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Gridscale otherlv_17= Colon ( (lv_gridscale_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Legendstyle otherlv_20= Colon ( (lv_legendstyle_21_0= ruleLegendStyle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Padding otherlv_23= Colon ( (lv_padding_24_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Position otherlv_26= Colon ( (lv_position_27_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= Showgrid otherlv_29= Colon ( (lv_showgrid_30_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Showlegend otherlv_32= Colon ( (lv_showlegend_33_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= Showtitle otherlv_35= Colon ( (lv_showtitle_36_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Size otherlv_38= Colon ( (lv_size_39_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= Title otherlv_41= Colon ( (lv_title_42_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= Type otherlv_44= Colon ( (lv_type_45_0= ruleBarType ) ) ) ) ) ) )+ {...}?) ) ) this_END_46= RULE_END
            {
            // InternalIDSLParser.g:2838:3: ( (lv_name_0_0= RULE_BARCHARTID ) )
            // InternalIDSLParser.g:2839:4: (lv_name_0_0= RULE_BARCHARTID )
            {
            // InternalIDSLParser.g:2839:4: (lv_name_0_0= RULE_BARCHARTID )
            // InternalIDSLParser.g:2840:5: lv_name_0_0= RULE_BARCHARTID
            {
            lv_name_0_0=(Token)match(input,RULE_BARCHARTID,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getBarchartAccess().getNameBARCHARTIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBarchartRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.mydsl.IDSL.BARCHARTID");
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getBarchartAccess().getColonKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_33); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getBarchartAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalIDSLParser.g:2864:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_bardata_14_0= ruleChartData ) )* this_END_15= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Gridscale otherlv_17= Colon ( (lv_gridscale_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Legendstyle otherlv_20= Colon ( (lv_legendstyle_21_0= ruleLegendStyle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Padding otherlv_23= Colon ( (lv_padding_24_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Position otherlv_26= Colon ( (lv_position_27_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= Showgrid otherlv_29= Colon ( (lv_showgrid_30_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Showlegend otherlv_32= Colon ( (lv_showlegend_33_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= Showtitle otherlv_35= Colon ( (lv_showtitle_36_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Size otherlv_38= Colon ( (lv_size_39_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= Title otherlv_41= Colon ( (lv_title_42_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= Type otherlv_44= Colon ( (lv_type_45_0= ruleBarType ) ) ) ) ) ) )+ {...}?) ) )
            // InternalIDSLParser.g:2865:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_bardata_14_0= ruleChartData ) )* this_END_15= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Gridscale otherlv_17= Colon ( (lv_gridscale_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Legendstyle otherlv_20= Colon ( (lv_legendstyle_21_0= ruleLegendStyle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Padding otherlv_23= Colon ( (lv_padding_24_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Position otherlv_26= Colon ( (lv_position_27_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= Showgrid otherlv_29= Colon ( (lv_showgrid_30_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Showlegend otherlv_32= Colon ( (lv_showlegend_33_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= Showtitle otherlv_35= Colon ( (lv_showtitle_36_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Size otherlv_38= Colon ( (lv_size_39_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= Title otherlv_41= Colon ( (lv_title_42_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= Type otherlv_44= Colon ( (lv_type_45_0= ruleBarType ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalIDSLParser.g:2865:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_bardata_14_0= ruleChartData ) )* this_END_15= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Gridscale otherlv_17= Colon ( (lv_gridscale_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Legendstyle otherlv_20= Colon ( (lv_legendstyle_21_0= ruleLegendStyle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Padding otherlv_23= Colon ( (lv_padding_24_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Position otherlv_26= Colon ( (lv_position_27_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= Showgrid otherlv_29= Colon ( (lv_showgrid_30_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Showlegend otherlv_32= Colon ( (lv_showlegend_33_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= Showtitle otherlv_35= Colon ( (lv_showtitle_36_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Size otherlv_38= Colon ( (lv_size_39_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= Title otherlv_41= Colon ( (lv_title_42_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= Type otherlv_44= Colon ( (lv_type_45_0= ruleBarType ) ) ) ) ) ) )+ {...}?) )
            // InternalIDSLParser.g:2866:5: ( ( ({...}? => ( ({...}? => (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_bardata_14_0= ruleChartData ) )* this_END_15= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Gridscale otherlv_17= Colon ( (lv_gridscale_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Legendstyle otherlv_20= Colon ( (lv_legendstyle_21_0= ruleLegendStyle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Padding otherlv_23= Colon ( (lv_padding_24_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Position otherlv_26= Colon ( (lv_position_27_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= Showgrid otherlv_29= Colon ( (lv_showgrid_30_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Showlegend otherlv_32= Colon ( (lv_showlegend_33_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= Showtitle otherlv_35= Colon ( (lv_showtitle_36_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Size otherlv_38= Colon ( (lv_size_39_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= Title otherlv_41= Colon ( (lv_title_42_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= Type otherlv_44= Colon ( (lv_type_45_0= ruleBarType ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getBarchartAccess().getUnorderedGroup_3());
            				
            // InternalIDSLParser.g:2869:5: ( ( ({...}? => ( ({...}? => (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_bardata_14_0= ruleChartData ) )* this_END_15= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Gridscale otherlv_17= Colon ( (lv_gridscale_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Legendstyle otherlv_20= Colon ( (lv_legendstyle_21_0= ruleLegendStyle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Padding otherlv_23= Colon ( (lv_padding_24_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Position otherlv_26= Colon ( (lv_position_27_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= Showgrid otherlv_29= Colon ( (lv_showgrid_30_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Showlegend otherlv_32= Colon ( (lv_showlegend_33_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= Showtitle otherlv_35= Colon ( (lv_showtitle_36_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Size otherlv_38= Colon ( (lv_size_39_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= Title otherlv_41= Colon ( (lv_title_42_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= Type otherlv_44= Colon ( (lv_type_45_0= ruleBarType ) ) ) ) ) ) )+ {...}?)
            // InternalIDSLParser.g:2870:6: ( ({...}? => ( ({...}? => (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_bardata_14_0= ruleChartData ) )* this_END_15= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Gridscale otherlv_17= Colon ( (lv_gridscale_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Legendstyle otherlv_20= Colon ( (lv_legendstyle_21_0= ruleLegendStyle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Padding otherlv_23= Colon ( (lv_padding_24_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Position otherlv_26= Colon ( (lv_position_27_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= Showgrid otherlv_29= Colon ( (lv_showgrid_30_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Showlegend otherlv_32= Colon ( (lv_showlegend_33_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= Showtitle otherlv_35= Colon ( (lv_showtitle_36_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Size otherlv_38= Colon ( (lv_size_39_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= Title otherlv_41= Colon ( (lv_title_42_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= Type otherlv_44= Colon ( (lv_type_45_0= ruleBarType ) ) ) ) ) ) )+ {...}?
            {
            // InternalIDSLParser.g:2870:6: ( ({...}? => ( ({...}? => (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_bardata_14_0= ruleChartData ) )* this_END_15= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Gridscale otherlv_17= Colon ( (lv_gridscale_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Legendstyle otherlv_20= Colon ( (lv_legendstyle_21_0= ruleLegendStyle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Padding otherlv_23= Colon ( (lv_padding_24_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Position otherlv_26= Colon ( (lv_position_27_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= Showgrid otherlv_29= Colon ( (lv_showgrid_30_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Showlegend otherlv_32= Colon ( (lv_showlegend_33_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= Showtitle otherlv_35= Colon ( (lv_showtitle_36_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Size otherlv_38= Colon ( (lv_size_39_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= Title otherlv_41= Colon ( (lv_title_42_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= Type otherlv_44= Colon ( (lv_type_45_0= ruleBarType ) ) ) ) ) ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=14;
                alt24 = dfa24.predict(input);
                switch (alt24) {
            	case 1 :
            	    // InternalIDSLParser.g:2871:4: ({...}? => ( ({...}? => (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) ) ) ) ) )
            	    {
            	    // InternalIDSLParser.g:2871:4: ({...}? => ( ({...}? => (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) ) ) ) ) )
            	    // InternalIDSLParser.g:2872:5: {...}? => ( ({...}? => (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBarchartAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleBarchart", "getUnorderedGroupHelper().canSelect(grammarAccess.getBarchartAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalIDSLParser.g:2872:105: ( ({...}? => (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) ) ) ) )
            	    // InternalIDSLParser.g:2873:6: ({...}? => (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getBarchartAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalIDSLParser.g:2876:9: ({...}? => (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) ) ) )
            	    // InternalIDSLParser.g:2876:10: {...}? => (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBarchart", "true");
            	    }
            	    // InternalIDSLParser.g:2876:19: (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) ) )
            	    // InternalIDSLParser.g:2876:20: otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) )
            	    {
            	    otherlv_4=(Token)match(input,Bgcolor,FOLLOW_3); 

            	    									newLeafNode(otherlv_4, grammarAccess.getBarchartAccess().getBgcolorKeyword_3_0_0());
            	    								
            	    otherlv_5=(Token)match(input,Colon,FOLLOW_6); 

            	    									newLeafNode(otherlv_5, grammarAccess.getBarchartAccess().getColonKeyword_3_0_1());
            	    								
            	    // InternalIDSLParser.g:2884:9: ( (lv_color_6_0= ruleColor ) )
            	    // InternalIDSLParser.g:2885:10: (lv_color_6_0= ruleColor )
            	    {
            	    // InternalIDSLParser.g:2885:10: (lv_color_6_0= ruleColor )
            	    // InternalIDSLParser.g:2886:11: lv_color_6_0= ruleColor
            	    {

            	    											newCompositeNode(grammarAccess.getBarchartAccess().getColorColorParserRuleCall_3_0_2_0());
            	    										
            	    pushFollow(FOLLOW_34);
            	    lv_color_6_0=ruleColor();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getBarchartRule());
            	    											}
            	    											set(
            	    												current,
            	    												"color",
            	    												lv_color_6_0,
            	    												"org.xtext.example.mydsl.IDSL.Color");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBarchartAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalIDSLParser.g:2909:4: ({...}? => ( ({...}? => (otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) ) ) ) ) )
            	    {
            	    // InternalIDSLParser.g:2909:4: ({...}? => ( ({...}? => (otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) ) ) ) ) )
            	    // InternalIDSLParser.g:2910:5: {...}? => ( ({...}? => (otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBarchartAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleBarchart", "getUnorderedGroupHelper().canSelect(grammarAccess.getBarchartAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalIDSLParser.g:2910:105: ( ({...}? => (otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) ) ) ) )
            	    // InternalIDSLParser.g:2911:6: ({...}? => (otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getBarchartAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalIDSLParser.g:2914:9: ({...}? => (otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) ) ) )
            	    // InternalIDSLParser.g:2914:10: {...}? => (otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBarchart", "true");
            	    }
            	    // InternalIDSLParser.g:2914:19: (otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) ) )
            	    // InternalIDSLParser.g:2914:20: otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) )
            	    {
            	    otherlv_7=(Token)match(input,Colors,FOLLOW_3); 

            	    									newLeafNode(otherlv_7, grammarAccess.getBarchartAccess().getColorsKeyword_3_1_0());
            	    								
            	    otherlv_8=(Token)match(input,Colon,FOLLOW_28); 

            	    									newLeafNode(otherlv_8, grammarAccess.getBarchartAccess().getColonKeyword_3_1_1());
            	    								
            	    // InternalIDSLParser.g:2922:9: ( (lv_colors_9_0= RULE_COLOR_CHARTS ) )
            	    // InternalIDSLParser.g:2923:10: (lv_colors_9_0= RULE_COLOR_CHARTS )
            	    {
            	    // InternalIDSLParser.g:2923:10: (lv_colors_9_0= RULE_COLOR_CHARTS )
            	    // InternalIDSLParser.g:2924:11: lv_colors_9_0= RULE_COLOR_CHARTS
            	    {
            	    lv_colors_9_0=(Token)match(input,RULE_COLOR_CHARTS,FOLLOW_34); 

            	    											newLeafNode(lv_colors_9_0, grammarAccess.getBarchartAccess().getColorsCOLOR_CHARTSTerminalRuleCall_3_1_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getBarchartRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"colors",
            	    												lv_colors_9_0,
            	    												"org.xtext.example.mydsl.IDSL.COLOR_CHARTS");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBarchartAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalIDSLParser.g:2946:4: ({...}? => ( ({...}? => (otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_bardata_14_0= ruleChartData ) )* this_END_15= RULE_END ) ) ) )
            	    {
            	    // InternalIDSLParser.g:2946:4: ({...}? => ( ({...}? => (otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_bardata_14_0= ruleChartData ) )* this_END_15= RULE_END ) ) ) )
            	    // InternalIDSLParser.g:2947:5: {...}? => ( ({...}? => (otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_bardata_14_0= ruleChartData ) )* this_END_15= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBarchartAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleBarchart", "getUnorderedGroupHelper().canSelect(grammarAccess.getBarchartAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalIDSLParser.g:2947:105: ( ({...}? => (otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_bardata_14_0= ruleChartData ) )* this_END_15= RULE_END ) ) )
            	    // InternalIDSLParser.g:2948:6: ({...}? => (otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_bardata_14_0= ruleChartData ) )* this_END_15= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getBarchartAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalIDSLParser.g:2951:9: ({...}? => (otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_bardata_14_0= ruleChartData ) )* this_END_15= RULE_END ) )
            	    // InternalIDSLParser.g:2951:10: {...}? => (otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_bardata_14_0= ruleChartData ) )* this_END_15= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBarchart", "true");
            	    }
            	    // InternalIDSLParser.g:2951:19: (otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_bardata_14_0= ruleChartData ) )* this_END_15= RULE_END )
            	    // InternalIDSLParser.g:2951:20: otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_bardata_14_0= ruleChartData ) )* this_END_15= RULE_END
            	    {
            	    otherlv_10=(Token)match(input,Data,FOLLOW_3); 

            	    									newLeafNode(otherlv_10, grammarAccess.getBarchartAccess().getDataKeyword_3_2_0());
            	    								
            	    otherlv_11=(Token)match(input,Colon,FOLLOW_12); 

            	    									newLeafNode(otherlv_11, grammarAccess.getBarchartAccess().getColonKeyword_3_2_1());
            	    								
            	    this_BEGIN_12=(Token)match(input,RULE_BEGIN,FOLLOW_8); 

            	    									newLeafNode(this_BEGIN_12, grammarAccess.getBarchartAccess().getBEGINTerminalRuleCall_3_2_2());
            	    								

            	    									newCompositeNode(grammarAccess.getBarchartAccess().getChartDataParserRuleCall_3_2_3());
            	    								
            	    pushFollow(FOLLOW_29);
            	    ruleChartData();

            	    state._fsp--;


            	    									afterParserOrEnumRuleCall();
            	    								
            	    // InternalIDSLParser.g:2970:9: ( (lv_bardata_14_0= ruleChartData ) )*
            	    loop23:
            	    do {
            	        int alt23=2;
            	        int LA23_0 = input.LA(1);

            	        if ( (LA23_0==RULE_STRING) ) {
            	            alt23=1;
            	        }


            	        switch (alt23) {
            	    	case 1 :
            	    	    // InternalIDSLParser.g:2971:10: (lv_bardata_14_0= ruleChartData )
            	    	    {
            	    	    // InternalIDSLParser.g:2971:10: (lv_bardata_14_0= ruleChartData )
            	    	    // InternalIDSLParser.g:2972:11: lv_bardata_14_0= ruleChartData
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getBarchartAccess().getBardataChartDataParserRuleCall_3_2_4_0());
            	    	    										
            	    	    pushFollow(FOLLOW_29);
            	    	    lv_bardata_14_0=ruleChartData();

            	    	    state._fsp--;


            	    	    											if (current==null) {
            	    	    												current = createModelElementForParent(grammarAccess.getBarchartRule());
            	    	    											}
            	    	    											add(
            	    	    												current,
            	    	    												"bardata",
            	    	    												lv_bardata_14_0,
            	    	    												"org.xtext.example.mydsl.IDSL.ChartData");
            	    	    											afterParserOrEnumRuleCall();
            	    	    										

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop23;
            	        }
            	    } while (true);

            	    this_END_15=(Token)match(input,RULE_END,FOLLOW_34); 

            	    									newLeafNode(this_END_15, grammarAccess.getBarchartAccess().getENDTerminalRuleCall_3_2_5());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBarchartAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalIDSLParser.g:2999:4: ({...}? => ( ({...}? => (otherlv_16= Gridscale otherlv_17= Colon ( (lv_gridscale_18_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalIDSLParser.g:2999:4: ({...}? => ( ({...}? => (otherlv_16= Gridscale otherlv_17= Colon ( (lv_gridscale_18_0= RULE_INT ) ) ) ) ) )
            	    // InternalIDSLParser.g:3000:5: {...}? => ( ({...}? => (otherlv_16= Gridscale otherlv_17= Colon ( (lv_gridscale_18_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBarchartAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleBarchart", "getUnorderedGroupHelper().canSelect(grammarAccess.getBarchartAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalIDSLParser.g:3000:105: ( ({...}? => (otherlv_16= Gridscale otherlv_17= Colon ( (lv_gridscale_18_0= RULE_INT ) ) ) ) )
            	    // InternalIDSLParser.g:3001:6: ({...}? => (otherlv_16= Gridscale otherlv_17= Colon ( (lv_gridscale_18_0= RULE_INT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getBarchartAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalIDSLParser.g:3004:9: ({...}? => (otherlv_16= Gridscale otherlv_17= Colon ( (lv_gridscale_18_0= RULE_INT ) ) ) )
            	    // InternalIDSLParser.g:3004:10: {...}? => (otherlv_16= Gridscale otherlv_17= Colon ( (lv_gridscale_18_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBarchart", "true");
            	    }
            	    // InternalIDSLParser.g:3004:19: (otherlv_16= Gridscale otherlv_17= Colon ( (lv_gridscale_18_0= RULE_INT ) ) )
            	    // InternalIDSLParser.g:3004:20: otherlv_16= Gridscale otherlv_17= Colon ( (lv_gridscale_18_0= RULE_INT ) )
            	    {
            	    otherlv_16=(Token)match(input,Gridscale,FOLLOW_3); 

            	    									newLeafNode(otherlv_16, grammarAccess.getBarchartAccess().getGridscaleKeyword_3_3_0());
            	    								
            	    otherlv_17=(Token)match(input,Colon,FOLLOW_16); 

            	    									newLeafNode(otherlv_17, grammarAccess.getBarchartAccess().getColonKeyword_3_3_1());
            	    								
            	    // InternalIDSLParser.g:3012:9: ( (lv_gridscale_18_0= RULE_INT ) )
            	    // InternalIDSLParser.g:3013:10: (lv_gridscale_18_0= RULE_INT )
            	    {
            	    // InternalIDSLParser.g:3013:10: (lv_gridscale_18_0= RULE_INT )
            	    // InternalIDSLParser.g:3014:11: lv_gridscale_18_0= RULE_INT
            	    {
            	    lv_gridscale_18_0=(Token)match(input,RULE_INT,FOLLOW_34); 

            	    											newLeafNode(lv_gridscale_18_0, grammarAccess.getBarchartAccess().getGridscaleINTTerminalRuleCall_3_3_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getBarchartRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"gridscale",
            	    												lv_gridscale_18_0,
            	    												"org.eclipse.xtext.common.Terminals.INT");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBarchartAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalIDSLParser.g:3036:4: ({...}? => ( ({...}? => (otherlv_19= Legendstyle otherlv_20= Colon ( (lv_legendstyle_21_0= ruleLegendStyle ) ) ) ) ) )
            	    {
            	    // InternalIDSLParser.g:3036:4: ({...}? => ( ({...}? => (otherlv_19= Legendstyle otherlv_20= Colon ( (lv_legendstyle_21_0= ruleLegendStyle ) ) ) ) ) )
            	    // InternalIDSLParser.g:3037:5: {...}? => ( ({...}? => (otherlv_19= Legendstyle otherlv_20= Colon ( (lv_legendstyle_21_0= ruleLegendStyle ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBarchartAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleBarchart", "getUnorderedGroupHelper().canSelect(grammarAccess.getBarchartAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // InternalIDSLParser.g:3037:105: ( ({...}? => (otherlv_19= Legendstyle otherlv_20= Colon ( (lv_legendstyle_21_0= ruleLegendStyle ) ) ) ) )
            	    // InternalIDSLParser.g:3038:6: ({...}? => (otherlv_19= Legendstyle otherlv_20= Colon ( (lv_legendstyle_21_0= ruleLegendStyle ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getBarchartAccess().getUnorderedGroup_3(), 4);
            	    					
            	    // InternalIDSLParser.g:3041:9: ({...}? => (otherlv_19= Legendstyle otherlv_20= Colon ( (lv_legendstyle_21_0= ruleLegendStyle ) ) ) )
            	    // InternalIDSLParser.g:3041:10: {...}? => (otherlv_19= Legendstyle otherlv_20= Colon ( (lv_legendstyle_21_0= ruleLegendStyle ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBarchart", "true");
            	    }
            	    // InternalIDSLParser.g:3041:19: (otherlv_19= Legendstyle otherlv_20= Colon ( (lv_legendstyle_21_0= ruleLegendStyle ) ) )
            	    // InternalIDSLParser.g:3041:20: otherlv_19= Legendstyle otherlv_20= Colon ( (lv_legendstyle_21_0= ruleLegendStyle ) )
            	    {
            	    otherlv_19=(Token)match(input,Legendstyle,FOLLOW_3); 

            	    									newLeafNode(otherlv_19, grammarAccess.getBarchartAccess().getLegendstyleKeyword_3_4_0());
            	    								
            	    otherlv_20=(Token)match(input,Colon,FOLLOW_30); 

            	    									newLeafNode(otherlv_20, grammarAccess.getBarchartAccess().getColonKeyword_3_4_1());
            	    								
            	    // InternalIDSLParser.g:3049:9: ( (lv_legendstyle_21_0= ruleLegendStyle ) )
            	    // InternalIDSLParser.g:3050:10: (lv_legendstyle_21_0= ruleLegendStyle )
            	    {
            	    // InternalIDSLParser.g:3050:10: (lv_legendstyle_21_0= ruleLegendStyle )
            	    // InternalIDSLParser.g:3051:11: lv_legendstyle_21_0= ruleLegendStyle
            	    {

            	    											newCompositeNode(grammarAccess.getBarchartAccess().getLegendstyleLegendStyleEnumRuleCall_3_4_2_0());
            	    										
            	    pushFollow(FOLLOW_34);
            	    lv_legendstyle_21_0=ruleLegendStyle();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getBarchartRule());
            	    											}
            	    											set(
            	    												current,
            	    												"legendstyle",
            	    												lv_legendstyle_21_0,
            	    												"org.xtext.example.mydsl.IDSL.LegendStyle");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBarchartAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalIDSLParser.g:3074:4: ({...}? => ( ({...}? => (otherlv_22= Padding otherlv_23= Colon ( (lv_padding_24_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalIDSLParser.g:3074:4: ({...}? => ( ({...}? => (otherlv_22= Padding otherlv_23= Colon ( (lv_padding_24_0= RULE_INT ) ) ) ) ) )
            	    // InternalIDSLParser.g:3075:5: {...}? => ( ({...}? => (otherlv_22= Padding otherlv_23= Colon ( (lv_padding_24_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBarchartAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleBarchart", "getUnorderedGroupHelper().canSelect(grammarAccess.getBarchartAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // InternalIDSLParser.g:3075:105: ( ({...}? => (otherlv_22= Padding otherlv_23= Colon ( (lv_padding_24_0= RULE_INT ) ) ) ) )
            	    // InternalIDSLParser.g:3076:6: ({...}? => (otherlv_22= Padding otherlv_23= Colon ( (lv_padding_24_0= RULE_INT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getBarchartAccess().getUnorderedGroup_3(), 5);
            	    					
            	    // InternalIDSLParser.g:3079:9: ({...}? => (otherlv_22= Padding otherlv_23= Colon ( (lv_padding_24_0= RULE_INT ) ) ) )
            	    // InternalIDSLParser.g:3079:10: {...}? => (otherlv_22= Padding otherlv_23= Colon ( (lv_padding_24_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBarchart", "true");
            	    }
            	    // InternalIDSLParser.g:3079:19: (otherlv_22= Padding otherlv_23= Colon ( (lv_padding_24_0= RULE_INT ) ) )
            	    // InternalIDSLParser.g:3079:20: otherlv_22= Padding otherlv_23= Colon ( (lv_padding_24_0= RULE_INT ) )
            	    {
            	    otherlv_22=(Token)match(input,Padding,FOLLOW_3); 

            	    									newLeafNode(otherlv_22, grammarAccess.getBarchartAccess().getPaddingKeyword_3_5_0());
            	    								
            	    otherlv_23=(Token)match(input,Colon,FOLLOW_16); 

            	    									newLeafNode(otherlv_23, grammarAccess.getBarchartAccess().getColonKeyword_3_5_1());
            	    								
            	    // InternalIDSLParser.g:3087:9: ( (lv_padding_24_0= RULE_INT ) )
            	    // InternalIDSLParser.g:3088:10: (lv_padding_24_0= RULE_INT )
            	    {
            	    // InternalIDSLParser.g:3088:10: (lv_padding_24_0= RULE_INT )
            	    // InternalIDSLParser.g:3089:11: lv_padding_24_0= RULE_INT
            	    {
            	    lv_padding_24_0=(Token)match(input,RULE_INT,FOLLOW_34); 

            	    											newLeafNode(lv_padding_24_0, grammarAccess.getBarchartAccess().getPaddingINTTerminalRuleCall_3_5_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getBarchartRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"padding",
            	    												lv_padding_24_0,
            	    												"org.eclipse.xtext.common.Terminals.INT");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBarchartAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalIDSLParser.g:3111:4: ({...}? => ( ({...}? => (otherlv_25= Position otherlv_26= Colon ( (lv_position_27_0= RULE_SIZE_POS ) ) ) ) ) )
            	    {
            	    // InternalIDSLParser.g:3111:4: ({...}? => ( ({...}? => (otherlv_25= Position otherlv_26= Colon ( (lv_position_27_0= RULE_SIZE_POS ) ) ) ) ) )
            	    // InternalIDSLParser.g:3112:5: {...}? => ( ({...}? => (otherlv_25= Position otherlv_26= Colon ( (lv_position_27_0= RULE_SIZE_POS ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBarchartAccess().getUnorderedGroup_3(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleBarchart", "getUnorderedGroupHelper().canSelect(grammarAccess.getBarchartAccess().getUnorderedGroup_3(), 6)");
            	    }
            	    // InternalIDSLParser.g:3112:105: ( ({...}? => (otherlv_25= Position otherlv_26= Colon ( (lv_position_27_0= RULE_SIZE_POS ) ) ) ) )
            	    // InternalIDSLParser.g:3113:6: ({...}? => (otherlv_25= Position otherlv_26= Colon ( (lv_position_27_0= RULE_SIZE_POS ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getBarchartAccess().getUnorderedGroup_3(), 6);
            	    					
            	    // InternalIDSLParser.g:3116:9: ({...}? => (otherlv_25= Position otherlv_26= Colon ( (lv_position_27_0= RULE_SIZE_POS ) ) ) )
            	    // InternalIDSLParser.g:3116:10: {...}? => (otherlv_25= Position otherlv_26= Colon ( (lv_position_27_0= RULE_SIZE_POS ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBarchart", "true");
            	    }
            	    // InternalIDSLParser.g:3116:19: (otherlv_25= Position otherlv_26= Colon ( (lv_position_27_0= RULE_SIZE_POS ) ) )
            	    // InternalIDSLParser.g:3116:20: otherlv_25= Position otherlv_26= Colon ( (lv_position_27_0= RULE_SIZE_POS ) )
            	    {
            	    otherlv_25=(Token)match(input,Position,FOLLOW_3); 

            	    									newLeafNode(otherlv_25, grammarAccess.getBarchartAccess().getPositionKeyword_3_6_0());
            	    								
            	    otherlv_26=(Token)match(input,Colon,FOLLOW_9); 

            	    									newLeafNode(otherlv_26, grammarAccess.getBarchartAccess().getColonKeyword_3_6_1());
            	    								
            	    // InternalIDSLParser.g:3124:9: ( (lv_position_27_0= RULE_SIZE_POS ) )
            	    // InternalIDSLParser.g:3125:10: (lv_position_27_0= RULE_SIZE_POS )
            	    {
            	    // InternalIDSLParser.g:3125:10: (lv_position_27_0= RULE_SIZE_POS )
            	    // InternalIDSLParser.g:3126:11: lv_position_27_0= RULE_SIZE_POS
            	    {
            	    lv_position_27_0=(Token)match(input,RULE_SIZE_POS,FOLLOW_34); 

            	    											newLeafNode(lv_position_27_0, grammarAccess.getBarchartAccess().getPositionSIZE_POSTerminalRuleCall_3_6_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getBarchartRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"position",
            	    												lv_position_27_0,
            	    												"org.xtext.example.mydsl.IDSL.SIZE_POS");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBarchartAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalIDSLParser.g:3148:4: ({...}? => ( ({...}? => (otherlv_28= Showgrid otherlv_29= Colon ( (lv_showgrid_30_0= ruleShowOptionsOff ) ) ) ) ) )
            	    {
            	    // InternalIDSLParser.g:3148:4: ({...}? => ( ({...}? => (otherlv_28= Showgrid otherlv_29= Colon ( (lv_showgrid_30_0= ruleShowOptionsOff ) ) ) ) ) )
            	    // InternalIDSLParser.g:3149:5: {...}? => ( ({...}? => (otherlv_28= Showgrid otherlv_29= Colon ( (lv_showgrid_30_0= ruleShowOptionsOff ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBarchartAccess().getUnorderedGroup_3(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleBarchart", "getUnorderedGroupHelper().canSelect(grammarAccess.getBarchartAccess().getUnorderedGroup_3(), 7)");
            	    }
            	    // InternalIDSLParser.g:3149:105: ( ({...}? => (otherlv_28= Showgrid otherlv_29= Colon ( (lv_showgrid_30_0= ruleShowOptionsOff ) ) ) ) )
            	    // InternalIDSLParser.g:3150:6: ({...}? => (otherlv_28= Showgrid otherlv_29= Colon ( (lv_showgrid_30_0= ruleShowOptionsOff ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getBarchartAccess().getUnorderedGroup_3(), 7);
            	    					
            	    // InternalIDSLParser.g:3153:9: ({...}? => (otherlv_28= Showgrid otherlv_29= Colon ( (lv_showgrid_30_0= ruleShowOptionsOff ) ) ) )
            	    // InternalIDSLParser.g:3153:10: {...}? => (otherlv_28= Showgrid otherlv_29= Colon ( (lv_showgrid_30_0= ruleShowOptionsOff ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBarchart", "true");
            	    }
            	    // InternalIDSLParser.g:3153:19: (otherlv_28= Showgrid otherlv_29= Colon ( (lv_showgrid_30_0= ruleShowOptionsOff ) ) )
            	    // InternalIDSLParser.g:3153:20: otherlv_28= Showgrid otherlv_29= Colon ( (lv_showgrid_30_0= ruleShowOptionsOff ) )
            	    {
            	    otherlv_28=(Token)match(input,Showgrid,FOLLOW_3); 

            	    									newLeafNode(otherlv_28, grammarAccess.getBarchartAccess().getShowgridKeyword_3_7_0());
            	    								
            	    otherlv_29=(Token)match(input,Colon,FOLLOW_31); 

            	    									newLeafNode(otherlv_29, grammarAccess.getBarchartAccess().getColonKeyword_3_7_1());
            	    								
            	    // InternalIDSLParser.g:3161:9: ( (lv_showgrid_30_0= ruleShowOptionsOff ) )
            	    // InternalIDSLParser.g:3162:10: (lv_showgrid_30_0= ruleShowOptionsOff )
            	    {
            	    // InternalIDSLParser.g:3162:10: (lv_showgrid_30_0= ruleShowOptionsOff )
            	    // InternalIDSLParser.g:3163:11: lv_showgrid_30_0= ruleShowOptionsOff
            	    {

            	    											newCompositeNode(grammarAccess.getBarchartAccess().getShowgridShowOptionsOffEnumRuleCall_3_7_2_0());
            	    										
            	    pushFollow(FOLLOW_34);
            	    lv_showgrid_30_0=ruleShowOptionsOff();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getBarchartRule());
            	    											}
            	    											set(
            	    												current,
            	    												"showgrid",
            	    												lv_showgrid_30_0,
            	    												"org.xtext.example.mydsl.IDSL.ShowOptionsOff");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBarchartAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // InternalIDSLParser.g:3186:4: ({...}? => ( ({...}? => (otherlv_31= Showlegend otherlv_32= Colon ( (lv_showlegend_33_0= ruleShowOptionsOff ) ) ) ) ) )
            	    {
            	    // InternalIDSLParser.g:3186:4: ({...}? => ( ({...}? => (otherlv_31= Showlegend otherlv_32= Colon ( (lv_showlegend_33_0= ruleShowOptionsOff ) ) ) ) ) )
            	    // InternalIDSLParser.g:3187:5: {...}? => ( ({...}? => (otherlv_31= Showlegend otherlv_32= Colon ( (lv_showlegend_33_0= ruleShowOptionsOff ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBarchartAccess().getUnorderedGroup_3(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleBarchart", "getUnorderedGroupHelper().canSelect(grammarAccess.getBarchartAccess().getUnorderedGroup_3(), 8)");
            	    }
            	    // InternalIDSLParser.g:3187:105: ( ({...}? => (otherlv_31= Showlegend otherlv_32= Colon ( (lv_showlegend_33_0= ruleShowOptionsOff ) ) ) ) )
            	    // InternalIDSLParser.g:3188:6: ({...}? => (otherlv_31= Showlegend otherlv_32= Colon ( (lv_showlegend_33_0= ruleShowOptionsOff ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getBarchartAccess().getUnorderedGroup_3(), 8);
            	    					
            	    // InternalIDSLParser.g:3191:9: ({...}? => (otherlv_31= Showlegend otherlv_32= Colon ( (lv_showlegend_33_0= ruleShowOptionsOff ) ) ) )
            	    // InternalIDSLParser.g:3191:10: {...}? => (otherlv_31= Showlegend otherlv_32= Colon ( (lv_showlegend_33_0= ruleShowOptionsOff ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBarchart", "true");
            	    }
            	    // InternalIDSLParser.g:3191:19: (otherlv_31= Showlegend otherlv_32= Colon ( (lv_showlegend_33_0= ruleShowOptionsOff ) ) )
            	    // InternalIDSLParser.g:3191:20: otherlv_31= Showlegend otherlv_32= Colon ( (lv_showlegend_33_0= ruleShowOptionsOff ) )
            	    {
            	    otherlv_31=(Token)match(input,Showlegend,FOLLOW_3); 

            	    									newLeafNode(otherlv_31, grammarAccess.getBarchartAccess().getShowlegendKeyword_3_8_0());
            	    								
            	    otherlv_32=(Token)match(input,Colon,FOLLOW_31); 

            	    									newLeafNode(otherlv_32, grammarAccess.getBarchartAccess().getColonKeyword_3_8_1());
            	    								
            	    // InternalIDSLParser.g:3199:9: ( (lv_showlegend_33_0= ruleShowOptionsOff ) )
            	    // InternalIDSLParser.g:3200:10: (lv_showlegend_33_0= ruleShowOptionsOff )
            	    {
            	    // InternalIDSLParser.g:3200:10: (lv_showlegend_33_0= ruleShowOptionsOff )
            	    // InternalIDSLParser.g:3201:11: lv_showlegend_33_0= ruleShowOptionsOff
            	    {

            	    											newCompositeNode(grammarAccess.getBarchartAccess().getShowlegendShowOptionsOffEnumRuleCall_3_8_2_0());
            	    										
            	    pushFollow(FOLLOW_34);
            	    lv_showlegend_33_0=ruleShowOptionsOff();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getBarchartRule());
            	    											}
            	    											set(
            	    												current,
            	    												"showlegend",
            	    												lv_showlegend_33_0,
            	    												"org.xtext.example.mydsl.IDSL.ShowOptionsOff");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBarchartAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // InternalIDSLParser.g:3224:4: ({...}? => ( ({...}? => (otherlv_34= Showtitle otherlv_35= Colon ( (lv_showtitle_36_0= ruleShowOptionsOff ) ) ) ) ) )
            	    {
            	    // InternalIDSLParser.g:3224:4: ({...}? => ( ({...}? => (otherlv_34= Showtitle otherlv_35= Colon ( (lv_showtitle_36_0= ruleShowOptionsOff ) ) ) ) ) )
            	    // InternalIDSLParser.g:3225:5: {...}? => ( ({...}? => (otherlv_34= Showtitle otherlv_35= Colon ( (lv_showtitle_36_0= ruleShowOptionsOff ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBarchartAccess().getUnorderedGroup_3(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleBarchart", "getUnorderedGroupHelper().canSelect(grammarAccess.getBarchartAccess().getUnorderedGroup_3(), 9)");
            	    }
            	    // InternalIDSLParser.g:3225:105: ( ({...}? => (otherlv_34= Showtitle otherlv_35= Colon ( (lv_showtitle_36_0= ruleShowOptionsOff ) ) ) ) )
            	    // InternalIDSLParser.g:3226:6: ({...}? => (otherlv_34= Showtitle otherlv_35= Colon ( (lv_showtitle_36_0= ruleShowOptionsOff ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getBarchartAccess().getUnorderedGroup_3(), 9);
            	    					
            	    // InternalIDSLParser.g:3229:9: ({...}? => (otherlv_34= Showtitle otherlv_35= Colon ( (lv_showtitle_36_0= ruleShowOptionsOff ) ) ) )
            	    // InternalIDSLParser.g:3229:10: {...}? => (otherlv_34= Showtitle otherlv_35= Colon ( (lv_showtitle_36_0= ruleShowOptionsOff ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBarchart", "true");
            	    }
            	    // InternalIDSLParser.g:3229:19: (otherlv_34= Showtitle otherlv_35= Colon ( (lv_showtitle_36_0= ruleShowOptionsOff ) ) )
            	    // InternalIDSLParser.g:3229:20: otherlv_34= Showtitle otherlv_35= Colon ( (lv_showtitle_36_0= ruleShowOptionsOff ) )
            	    {
            	    otherlv_34=(Token)match(input,Showtitle,FOLLOW_3); 

            	    									newLeafNode(otherlv_34, grammarAccess.getBarchartAccess().getShowtitleKeyword_3_9_0());
            	    								
            	    otherlv_35=(Token)match(input,Colon,FOLLOW_31); 

            	    									newLeafNode(otherlv_35, grammarAccess.getBarchartAccess().getColonKeyword_3_9_1());
            	    								
            	    // InternalIDSLParser.g:3237:9: ( (lv_showtitle_36_0= ruleShowOptionsOff ) )
            	    // InternalIDSLParser.g:3238:10: (lv_showtitle_36_0= ruleShowOptionsOff )
            	    {
            	    // InternalIDSLParser.g:3238:10: (lv_showtitle_36_0= ruleShowOptionsOff )
            	    // InternalIDSLParser.g:3239:11: lv_showtitle_36_0= ruleShowOptionsOff
            	    {

            	    											newCompositeNode(grammarAccess.getBarchartAccess().getShowtitleShowOptionsOffEnumRuleCall_3_9_2_0());
            	    										
            	    pushFollow(FOLLOW_34);
            	    lv_showtitle_36_0=ruleShowOptionsOff();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getBarchartRule());
            	    											}
            	    											set(
            	    												current,
            	    												"showtitle",
            	    												lv_showtitle_36_0,
            	    												"org.xtext.example.mydsl.IDSL.ShowOptionsOff");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBarchartAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // InternalIDSLParser.g:3262:4: ({...}? => ( ({...}? => (otherlv_37= Size otherlv_38= Colon ( (lv_size_39_0= RULE_SIZE_POS ) ) ) ) ) )
            	    {
            	    // InternalIDSLParser.g:3262:4: ({...}? => ( ({...}? => (otherlv_37= Size otherlv_38= Colon ( (lv_size_39_0= RULE_SIZE_POS ) ) ) ) ) )
            	    // InternalIDSLParser.g:3263:5: {...}? => ( ({...}? => (otherlv_37= Size otherlv_38= Colon ( (lv_size_39_0= RULE_SIZE_POS ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBarchartAccess().getUnorderedGroup_3(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleBarchart", "getUnorderedGroupHelper().canSelect(grammarAccess.getBarchartAccess().getUnorderedGroup_3(), 10)");
            	    }
            	    // InternalIDSLParser.g:3263:106: ( ({...}? => (otherlv_37= Size otherlv_38= Colon ( (lv_size_39_0= RULE_SIZE_POS ) ) ) ) )
            	    // InternalIDSLParser.g:3264:6: ({...}? => (otherlv_37= Size otherlv_38= Colon ( (lv_size_39_0= RULE_SIZE_POS ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getBarchartAccess().getUnorderedGroup_3(), 10);
            	    					
            	    // InternalIDSLParser.g:3267:9: ({...}? => (otherlv_37= Size otherlv_38= Colon ( (lv_size_39_0= RULE_SIZE_POS ) ) ) )
            	    // InternalIDSLParser.g:3267:10: {...}? => (otherlv_37= Size otherlv_38= Colon ( (lv_size_39_0= RULE_SIZE_POS ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBarchart", "true");
            	    }
            	    // InternalIDSLParser.g:3267:19: (otherlv_37= Size otherlv_38= Colon ( (lv_size_39_0= RULE_SIZE_POS ) ) )
            	    // InternalIDSLParser.g:3267:20: otherlv_37= Size otherlv_38= Colon ( (lv_size_39_0= RULE_SIZE_POS ) )
            	    {
            	    otherlv_37=(Token)match(input,Size,FOLLOW_3); 

            	    									newLeafNode(otherlv_37, grammarAccess.getBarchartAccess().getSizeKeyword_3_10_0());
            	    								
            	    otherlv_38=(Token)match(input,Colon,FOLLOW_9); 

            	    									newLeafNode(otherlv_38, grammarAccess.getBarchartAccess().getColonKeyword_3_10_1());
            	    								
            	    // InternalIDSLParser.g:3275:9: ( (lv_size_39_0= RULE_SIZE_POS ) )
            	    // InternalIDSLParser.g:3276:10: (lv_size_39_0= RULE_SIZE_POS )
            	    {
            	    // InternalIDSLParser.g:3276:10: (lv_size_39_0= RULE_SIZE_POS )
            	    // InternalIDSLParser.g:3277:11: lv_size_39_0= RULE_SIZE_POS
            	    {
            	    lv_size_39_0=(Token)match(input,RULE_SIZE_POS,FOLLOW_34); 

            	    											newLeafNode(lv_size_39_0, grammarAccess.getBarchartAccess().getSizeSIZE_POSTerminalRuleCall_3_10_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getBarchartRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"size",
            	    												lv_size_39_0,
            	    												"org.xtext.example.mydsl.IDSL.SIZE_POS");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBarchartAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 12 :
            	    // InternalIDSLParser.g:3299:4: ({...}? => ( ({...}? => (otherlv_40= Title otherlv_41= Colon ( (lv_title_42_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalIDSLParser.g:3299:4: ({...}? => ( ({...}? => (otherlv_40= Title otherlv_41= Colon ( (lv_title_42_0= RULE_STRING ) ) ) ) ) )
            	    // InternalIDSLParser.g:3300:5: {...}? => ( ({...}? => (otherlv_40= Title otherlv_41= Colon ( (lv_title_42_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBarchartAccess().getUnorderedGroup_3(), 11) ) {
            	        throw new FailedPredicateException(input, "ruleBarchart", "getUnorderedGroupHelper().canSelect(grammarAccess.getBarchartAccess().getUnorderedGroup_3(), 11)");
            	    }
            	    // InternalIDSLParser.g:3300:106: ( ({...}? => (otherlv_40= Title otherlv_41= Colon ( (lv_title_42_0= RULE_STRING ) ) ) ) )
            	    // InternalIDSLParser.g:3301:6: ({...}? => (otherlv_40= Title otherlv_41= Colon ( (lv_title_42_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getBarchartAccess().getUnorderedGroup_3(), 11);
            	    					
            	    // InternalIDSLParser.g:3304:9: ({...}? => (otherlv_40= Title otherlv_41= Colon ( (lv_title_42_0= RULE_STRING ) ) ) )
            	    // InternalIDSLParser.g:3304:10: {...}? => (otherlv_40= Title otherlv_41= Colon ( (lv_title_42_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBarchart", "true");
            	    }
            	    // InternalIDSLParser.g:3304:19: (otherlv_40= Title otherlv_41= Colon ( (lv_title_42_0= RULE_STRING ) ) )
            	    // InternalIDSLParser.g:3304:20: otherlv_40= Title otherlv_41= Colon ( (lv_title_42_0= RULE_STRING ) )
            	    {
            	    otherlv_40=(Token)match(input,Title,FOLLOW_3); 

            	    									newLeafNode(otherlv_40, grammarAccess.getBarchartAccess().getTitleKeyword_3_11_0());
            	    								
            	    otherlv_41=(Token)match(input,Colon,FOLLOW_8); 

            	    									newLeafNode(otherlv_41, grammarAccess.getBarchartAccess().getColonKeyword_3_11_1());
            	    								
            	    // InternalIDSLParser.g:3312:9: ( (lv_title_42_0= RULE_STRING ) )
            	    // InternalIDSLParser.g:3313:10: (lv_title_42_0= RULE_STRING )
            	    {
            	    // InternalIDSLParser.g:3313:10: (lv_title_42_0= RULE_STRING )
            	    // InternalIDSLParser.g:3314:11: lv_title_42_0= RULE_STRING
            	    {
            	    lv_title_42_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

            	    											newLeafNode(lv_title_42_0, grammarAccess.getBarchartAccess().getTitleSTRINGTerminalRuleCall_3_11_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getBarchartRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"title",
            	    												lv_title_42_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBarchartAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 13 :
            	    // InternalIDSLParser.g:3336:4: ({...}? => ( ({...}? => (otherlv_43= Type otherlv_44= Colon ( (lv_type_45_0= ruleBarType ) ) ) ) ) )
            	    {
            	    // InternalIDSLParser.g:3336:4: ({...}? => ( ({...}? => (otherlv_43= Type otherlv_44= Colon ( (lv_type_45_0= ruleBarType ) ) ) ) ) )
            	    // InternalIDSLParser.g:3337:5: {...}? => ( ({...}? => (otherlv_43= Type otherlv_44= Colon ( (lv_type_45_0= ruleBarType ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBarchartAccess().getUnorderedGroup_3(), 12) ) {
            	        throw new FailedPredicateException(input, "ruleBarchart", "getUnorderedGroupHelper().canSelect(grammarAccess.getBarchartAccess().getUnorderedGroup_3(), 12)");
            	    }
            	    // InternalIDSLParser.g:3337:106: ( ({...}? => (otherlv_43= Type otherlv_44= Colon ( (lv_type_45_0= ruleBarType ) ) ) ) )
            	    // InternalIDSLParser.g:3338:6: ({...}? => (otherlv_43= Type otherlv_44= Colon ( (lv_type_45_0= ruleBarType ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getBarchartAccess().getUnorderedGroup_3(), 12);
            	    					
            	    // InternalIDSLParser.g:3341:9: ({...}? => (otherlv_43= Type otherlv_44= Colon ( (lv_type_45_0= ruleBarType ) ) ) )
            	    // InternalIDSLParser.g:3341:10: {...}? => (otherlv_43= Type otherlv_44= Colon ( (lv_type_45_0= ruleBarType ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBarchart", "true");
            	    }
            	    // InternalIDSLParser.g:3341:19: (otherlv_43= Type otherlv_44= Colon ( (lv_type_45_0= ruleBarType ) ) )
            	    // InternalIDSLParser.g:3341:20: otherlv_43= Type otherlv_44= Colon ( (lv_type_45_0= ruleBarType ) )
            	    {
            	    otherlv_43=(Token)match(input,Type,FOLLOW_3); 

            	    									newLeafNode(otherlv_43, grammarAccess.getBarchartAccess().getTypeKeyword_3_12_0());
            	    								
            	    otherlv_44=(Token)match(input,Colon,FOLLOW_35); 

            	    									newLeafNode(otherlv_44, grammarAccess.getBarchartAccess().getColonKeyword_3_12_1());
            	    								
            	    // InternalIDSLParser.g:3349:9: ( (lv_type_45_0= ruleBarType ) )
            	    // InternalIDSLParser.g:3350:10: (lv_type_45_0= ruleBarType )
            	    {
            	    // InternalIDSLParser.g:3350:10: (lv_type_45_0= ruleBarType )
            	    // InternalIDSLParser.g:3351:11: lv_type_45_0= ruleBarType
            	    {

            	    											newCompositeNode(grammarAccess.getBarchartAccess().getTypeBarTypeEnumRuleCall_3_12_2_0());
            	    										
            	    pushFollow(FOLLOW_34);
            	    lv_type_45_0=ruleBarType();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getBarchartRule());
            	    											}
            	    											set(
            	    												current,
            	    												"type",
            	    												lv_type_45_0,
            	    												"org.xtext.example.mydsl.IDSL.BarType");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBarchartAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getBarchartAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleBarchart", "getUnorderedGroupHelper().canLeave(grammarAccess.getBarchartAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getBarchartAccess().getUnorderedGroup_3());
            				

            }

            this_END_46=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_46, grammarAccess.getBarchartAccess().getENDTerminalRuleCall_4());
            		

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
    // $ANTLR end "ruleBarchart"


    // $ANTLR start "entryRulePicturegraph"
    // InternalIDSLParser.g:3390:1: entryRulePicturegraph returns [EObject current=null] : iv_rulePicturegraph= rulePicturegraph EOF ;
    public final EObject entryRulePicturegraph() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePicturegraph = null;


        try {
            // InternalIDSLParser.g:3390:53: (iv_rulePicturegraph= rulePicturegraph EOF )
            // InternalIDSLParser.g:3391:2: iv_rulePicturegraph= rulePicturegraph EOF
            {
             newCompositeNode(grammarAccess.getPicturegraphRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePicturegraph=rulePicturegraph();

            state._fsp--;

             current =iv_rulePicturegraph; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePicturegraph"


    // $ANTLR start "rulePicturegraph"
    // InternalIDSLParser.g:3397:1: rulePicturegraph returns [EObject current=null] : ( ( (lv_name_0_0= RULE_PICTUREGRAPHID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_picturegraphdata_14_0= ruleChartData ) )* this_END_15= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Label otherlv_17= Colon ( (lv_label_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Padding otherlv_20= Colon ( (lv_padding_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Position otherlv_23= Colon ( (lv_position_24_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Showlegend otherlv_26= Colon ( (lv_showlegend_27_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= Showtitle otherlv_29= Colon ( (lv_showtitle_30_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Size otherlv_32= Colon ( (lv_size_33_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= Title otherlv_35= Colon ( (lv_title_36_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Type otherlv_38= Colon ( (lv_type_39_0= rulePicturegraphType ) ) ) ) ) ) )+ {...}?) ) ) this_END_40= RULE_END ) ;
    public final EObject rulePicturegraph() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_colors_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token this_BEGIN_12=null;
        Token this_END_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_label_18_0=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token lv_padding_21_0=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token lv_position_24_0=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token lv_size_33_0=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token lv_title_36_0=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token this_END_40=null;
        EObject lv_color_6_0 = null;

        AntlrDatatypeRuleToken lv_picturegraphdata_14_0 = null;

        Enumerator lv_showlegend_27_0 = null;

        Enumerator lv_showtitle_30_0 = null;

        Enumerator lv_type_39_0 = null;



        	enterRule();

        try {
            // InternalIDSLParser.g:3403:2: ( ( ( (lv_name_0_0= RULE_PICTUREGRAPHID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_picturegraphdata_14_0= ruleChartData ) )* this_END_15= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Label otherlv_17= Colon ( (lv_label_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Padding otherlv_20= Colon ( (lv_padding_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Position otherlv_23= Colon ( (lv_position_24_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Showlegend otherlv_26= Colon ( (lv_showlegend_27_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= Showtitle otherlv_29= Colon ( (lv_showtitle_30_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Size otherlv_32= Colon ( (lv_size_33_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= Title otherlv_35= Colon ( (lv_title_36_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Type otherlv_38= Colon ( (lv_type_39_0= rulePicturegraphType ) ) ) ) ) ) )+ {...}?) ) ) this_END_40= RULE_END ) )
            // InternalIDSLParser.g:3404:2: ( ( (lv_name_0_0= RULE_PICTUREGRAPHID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_picturegraphdata_14_0= ruleChartData ) )* this_END_15= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Label otherlv_17= Colon ( (lv_label_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Padding otherlv_20= Colon ( (lv_padding_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Position otherlv_23= Colon ( (lv_position_24_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Showlegend otherlv_26= Colon ( (lv_showlegend_27_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= Showtitle otherlv_29= Colon ( (lv_showtitle_30_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Size otherlv_32= Colon ( (lv_size_33_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= Title otherlv_35= Colon ( (lv_title_36_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Type otherlv_38= Colon ( (lv_type_39_0= rulePicturegraphType ) ) ) ) ) ) )+ {...}?) ) ) this_END_40= RULE_END )
            {
            // InternalIDSLParser.g:3404:2: ( ( (lv_name_0_0= RULE_PICTUREGRAPHID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_picturegraphdata_14_0= ruleChartData ) )* this_END_15= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Label otherlv_17= Colon ( (lv_label_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Padding otherlv_20= Colon ( (lv_padding_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Position otherlv_23= Colon ( (lv_position_24_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Showlegend otherlv_26= Colon ( (lv_showlegend_27_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= Showtitle otherlv_29= Colon ( (lv_showtitle_30_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Size otherlv_32= Colon ( (lv_size_33_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= Title otherlv_35= Colon ( (lv_title_36_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Type otherlv_38= Colon ( (lv_type_39_0= rulePicturegraphType ) ) ) ) ) ) )+ {...}?) ) ) this_END_40= RULE_END )
            // InternalIDSLParser.g:3405:3: ( (lv_name_0_0= RULE_PICTUREGRAPHID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_picturegraphdata_14_0= ruleChartData ) )* this_END_15= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Label otherlv_17= Colon ( (lv_label_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Padding otherlv_20= Colon ( (lv_padding_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Position otherlv_23= Colon ( (lv_position_24_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Showlegend otherlv_26= Colon ( (lv_showlegend_27_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= Showtitle otherlv_29= Colon ( (lv_showtitle_30_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Size otherlv_32= Colon ( (lv_size_33_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= Title otherlv_35= Colon ( (lv_title_36_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Type otherlv_38= Colon ( (lv_type_39_0= rulePicturegraphType ) ) ) ) ) ) )+ {...}?) ) ) this_END_40= RULE_END
            {
            // InternalIDSLParser.g:3405:3: ( (lv_name_0_0= RULE_PICTUREGRAPHID ) )
            // InternalIDSLParser.g:3406:4: (lv_name_0_0= RULE_PICTUREGRAPHID )
            {
            // InternalIDSLParser.g:3406:4: (lv_name_0_0= RULE_PICTUREGRAPHID )
            // InternalIDSLParser.g:3407:5: lv_name_0_0= RULE_PICTUREGRAPHID
            {
            lv_name_0_0=(Token)match(input,RULE_PICTUREGRAPHID,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getPicturegraphAccess().getNamePICTUREGRAPHIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPicturegraphRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.mydsl.IDSL.PICTUREGRAPHID");
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getPicturegraphAccess().getColonKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_36); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getPicturegraphAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalIDSLParser.g:3431:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_picturegraphdata_14_0= ruleChartData ) )* this_END_15= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Label otherlv_17= Colon ( (lv_label_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Padding otherlv_20= Colon ( (lv_padding_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Position otherlv_23= Colon ( (lv_position_24_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Showlegend otherlv_26= Colon ( (lv_showlegend_27_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= Showtitle otherlv_29= Colon ( (lv_showtitle_30_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Size otherlv_32= Colon ( (lv_size_33_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= Title otherlv_35= Colon ( (lv_title_36_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Type otherlv_38= Colon ( (lv_type_39_0= rulePicturegraphType ) ) ) ) ) ) )+ {...}?) ) )
            // InternalIDSLParser.g:3432:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_picturegraphdata_14_0= ruleChartData ) )* this_END_15= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Label otherlv_17= Colon ( (lv_label_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Padding otherlv_20= Colon ( (lv_padding_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Position otherlv_23= Colon ( (lv_position_24_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Showlegend otherlv_26= Colon ( (lv_showlegend_27_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= Showtitle otherlv_29= Colon ( (lv_showtitle_30_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Size otherlv_32= Colon ( (lv_size_33_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= Title otherlv_35= Colon ( (lv_title_36_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Type otherlv_38= Colon ( (lv_type_39_0= rulePicturegraphType ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalIDSLParser.g:3432:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_picturegraphdata_14_0= ruleChartData ) )* this_END_15= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Label otherlv_17= Colon ( (lv_label_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Padding otherlv_20= Colon ( (lv_padding_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Position otherlv_23= Colon ( (lv_position_24_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Showlegend otherlv_26= Colon ( (lv_showlegend_27_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= Showtitle otherlv_29= Colon ( (lv_showtitle_30_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Size otherlv_32= Colon ( (lv_size_33_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= Title otherlv_35= Colon ( (lv_title_36_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Type otherlv_38= Colon ( (lv_type_39_0= rulePicturegraphType ) ) ) ) ) ) )+ {...}?) )
            // InternalIDSLParser.g:3433:5: ( ( ({...}? => ( ({...}? => (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_picturegraphdata_14_0= ruleChartData ) )* this_END_15= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Label otherlv_17= Colon ( (lv_label_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Padding otherlv_20= Colon ( (lv_padding_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Position otherlv_23= Colon ( (lv_position_24_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Showlegend otherlv_26= Colon ( (lv_showlegend_27_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= Showtitle otherlv_29= Colon ( (lv_showtitle_30_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Size otherlv_32= Colon ( (lv_size_33_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= Title otherlv_35= Colon ( (lv_title_36_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Type otherlv_38= Colon ( (lv_type_39_0= rulePicturegraphType ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getPicturegraphAccess().getUnorderedGroup_3());
            				
            // InternalIDSLParser.g:3436:5: ( ( ({...}? => ( ({...}? => (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_picturegraphdata_14_0= ruleChartData ) )* this_END_15= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Label otherlv_17= Colon ( (lv_label_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Padding otherlv_20= Colon ( (lv_padding_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Position otherlv_23= Colon ( (lv_position_24_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Showlegend otherlv_26= Colon ( (lv_showlegend_27_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= Showtitle otherlv_29= Colon ( (lv_showtitle_30_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Size otherlv_32= Colon ( (lv_size_33_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= Title otherlv_35= Colon ( (lv_title_36_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Type otherlv_38= Colon ( (lv_type_39_0= rulePicturegraphType ) ) ) ) ) ) )+ {...}?)
            // InternalIDSLParser.g:3437:6: ( ({...}? => ( ({...}? => (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_picturegraphdata_14_0= ruleChartData ) )* this_END_15= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Label otherlv_17= Colon ( (lv_label_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Padding otherlv_20= Colon ( (lv_padding_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Position otherlv_23= Colon ( (lv_position_24_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Showlegend otherlv_26= Colon ( (lv_showlegend_27_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= Showtitle otherlv_29= Colon ( (lv_showtitle_30_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Size otherlv_32= Colon ( (lv_size_33_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= Title otherlv_35= Colon ( (lv_title_36_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Type otherlv_38= Colon ( (lv_type_39_0= rulePicturegraphType ) ) ) ) ) ) )+ {...}?
            {
            // InternalIDSLParser.g:3437:6: ( ({...}? => ( ({...}? => (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_picturegraphdata_14_0= ruleChartData ) )* this_END_15= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Label otherlv_17= Colon ( (lv_label_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Padding otherlv_20= Colon ( (lv_padding_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Position otherlv_23= Colon ( (lv_position_24_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Showlegend otherlv_26= Colon ( (lv_showlegend_27_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= Showtitle otherlv_29= Colon ( (lv_showtitle_30_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Size otherlv_32= Colon ( (lv_size_33_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= Title otherlv_35= Colon ( (lv_title_36_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Type otherlv_38= Colon ( (lv_type_39_0= rulePicturegraphType ) ) ) ) ) ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=12;
                alt26 = dfa26.predict(input);
                switch (alt26) {
            	case 1 :
            	    // InternalIDSLParser.g:3438:4: ({...}? => ( ({...}? => (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) ) ) ) ) )
            	    {
            	    // InternalIDSLParser.g:3438:4: ({...}? => ( ({...}? => (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) ) ) ) ) )
            	    // InternalIDSLParser.g:3439:5: {...}? => ( ({...}? => (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPicturegraphAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePicturegraph", "getUnorderedGroupHelper().canSelect(grammarAccess.getPicturegraphAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalIDSLParser.g:3439:109: ( ({...}? => (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) ) ) ) )
            	    // InternalIDSLParser.g:3440:6: ({...}? => (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPicturegraphAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalIDSLParser.g:3443:9: ({...}? => (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) ) ) )
            	    // InternalIDSLParser.g:3443:10: {...}? => (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePicturegraph", "true");
            	    }
            	    // InternalIDSLParser.g:3443:19: (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) ) )
            	    // InternalIDSLParser.g:3443:20: otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) )
            	    {
            	    otherlv_4=(Token)match(input,Bgcolor,FOLLOW_3); 

            	    									newLeafNode(otherlv_4, grammarAccess.getPicturegraphAccess().getBgcolorKeyword_3_0_0());
            	    								
            	    otherlv_5=(Token)match(input,Colon,FOLLOW_6); 

            	    									newLeafNode(otherlv_5, grammarAccess.getPicturegraphAccess().getColonKeyword_3_0_1());
            	    								
            	    // InternalIDSLParser.g:3451:9: ( (lv_color_6_0= ruleColor ) )
            	    // InternalIDSLParser.g:3452:10: (lv_color_6_0= ruleColor )
            	    {
            	    // InternalIDSLParser.g:3452:10: (lv_color_6_0= ruleColor )
            	    // InternalIDSLParser.g:3453:11: lv_color_6_0= ruleColor
            	    {

            	    											newCompositeNode(grammarAccess.getPicturegraphAccess().getColorColorParserRuleCall_3_0_2_0());
            	    										
            	    pushFollow(FOLLOW_37);
            	    lv_color_6_0=ruleColor();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getPicturegraphRule());
            	    											}
            	    											set(
            	    												current,
            	    												"color",
            	    												lv_color_6_0,
            	    												"org.xtext.example.mydsl.IDSL.Color");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPicturegraphAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalIDSLParser.g:3476:4: ({...}? => ( ({...}? => (otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) ) ) ) ) )
            	    {
            	    // InternalIDSLParser.g:3476:4: ({...}? => ( ({...}? => (otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) ) ) ) ) )
            	    // InternalIDSLParser.g:3477:5: {...}? => ( ({...}? => (otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPicturegraphAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePicturegraph", "getUnorderedGroupHelper().canSelect(grammarAccess.getPicturegraphAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalIDSLParser.g:3477:109: ( ({...}? => (otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) ) ) ) )
            	    // InternalIDSLParser.g:3478:6: ({...}? => (otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPicturegraphAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalIDSLParser.g:3481:9: ({...}? => (otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) ) ) )
            	    // InternalIDSLParser.g:3481:10: {...}? => (otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePicturegraph", "true");
            	    }
            	    // InternalIDSLParser.g:3481:19: (otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) ) )
            	    // InternalIDSLParser.g:3481:20: otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) )
            	    {
            	    otherlv_7=(Token)match(input,Colors,FOLLOW_3); 

            	    									newLeafNode(otherlv_7, grammarAccess.getPicturegraphAccess().getColorsKeyword_3_1_0());
            	    								
            	    otherlv_8=(Token)match(input,Colon,FOLLOW_28); 

            	    									newLeafNode(otherlv_8, grammarAccess.getPicturegraphAccess().getColonKeyword_3_1_1());
            	    								
            	    // InternalIDSLParser.g:3489:9: ( (lv_colors_9_0= RULE_COLOR_CHARTS ) )
            	    // InternalIDSLParser.g:3490:10: (lv_colors_9_0= RULE_COLOR_CHARTS )
            	    {
            	    // InternalIDSLParser.g:3490:10: (lv_colors_9_0= RULE_COLOR_CHARTS )
            	    // InternalIDSLParser.g:3491:11: lv_colors_9_0= RULE_COLOR_CHARTS
            	    {
            	    lv_colors_9_0=(Token)match(input,RULE_COLOR_CHARTS,FOLLOW_37); 

            	    											newLeafNode(lv_colors_9_0, grammarAccess.getPicturegraphAccess().getColorsCOLOR_CHARTSTerminalRuleCall_3_1_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getPicturegraphRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"colors",
            	    												lv_colors_9_0,
            	    												"org.xtext.example.mydsl.IDSL.COLOR_CHARTS");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPicturegraphAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalIDSLParser.g:3513:4: ({...}? => ( ({...}? => (otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_picturegraphdata_14_0= ruleChartData ) )* this_END_15= RULE_END ) ) ) )
            	    {
            	    // InternalIDSLParser.g:3513:4: ({...}? => ( ({...}? => (otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_picturegraphdata_14_0= ruleChartData ) )* this_END_15= RULE_END ) ) ) )
            	    // InternalIDSLParser.g:3514:5: {...}? => ( ({...}? => (otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_picturegraphdata_14_0= ruleChartData ) )* this_END_15= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPicturegraphAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "rulePicturegraph", "getUnorderedGroupHelper().canSelect(grammarAccess.getPicturegraphAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalIDSLParser.g:3514:109: ( ({...}? => (otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_picturegraphdata_14_0= ruleChartData ) )* this_END_15= RULE_END ) ) )
            	    // InternalIDSLParser.g:3515:6: ({...}? => (otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_picturegraphdata_14_0= ruleChartData ) )* this_END_15= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPicturegraphAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalIDSLParser.g:3518:9: ({...}? => (otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_picturegraphdata_14_0= ruleChartData ) )* this_END_15= RULE_END ) )
            	    // InternalIDSLParser.g:3518:10: {...}? => (otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_picturegraphdata_14_0= ruleChartData ) )* this_END_15= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePicturegraph", "true");
            	    }
            	    // InternalIDSLParser.g:3518:19: (otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_picturegraphdata_14_0= ruleChartData ) )* this_END_15= RULE_END )
            	    // InternalIDSLParser.g:3518:20: otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_picturegraphdata_14_0= ruleChartData ) )* this_END_15= RULE_END
            	    {
            	    otherlv_10=(Token)match(input,Data,FOLLOW_3); 

            	    									newLeafNode(otherlv_10, grammarAccess.getPicturegraphAccess().getDataKeyword_3_2_0());
            	    								
            	    otherlv_11=(Token)match(input,Colon,FOLLOW_12); 

            	    									newLeafNode(otherlv_11, grammarAccess.getPicturegraphAccess().getColonKeyword_3_2_1());
            	    								
            	    this_BEGIN_12=(Token)match(input,RULE_BEGIN,FOLLOW_8); 

            	    									newLeafNode(this_BEGIN_12, grammarAccess.getPicturegraphAccess().getBEGINTerminalRuleCall_3_2_2());
            	    								

            	    									newCompositeNode(grammarAccess.getPicturegraphAccess().getChartDataParserRuleCall_3_2_3());
            	    								
            	    pushFollow(FOLLOW_29);
            	    ruleChartData();

            	    state._fsp--;


            	    									afterParserOrEnumRuleCall();
            	    								
            	    // InternalIDSLParser.g:3537:9: ( (lv_picturegraphdata_14_0= ruleChartData ) )*
            	    loop25:
            	    do {
            	        int alt25=2;
            	        int LA25_0 = input.LA(1);

            	        if ( (LA25_0==RULE_STRING) ) {
            	            alt25=1;
            	        }


            	        switch (alt25) {
            	    	case 1 :
            	    	    // InternalIDSLParser.g:3538:10: (lv_picturegraphdata_14_0= ruleChartData )
            	    	    {
            	    	    // InternalIDSLParser.g:3538:10: (lv_picturegraphdata_14_0= ruleChartData )
            	    	    // InternalIDSLParser.g:3539:11: lv_picturegraphdata_14_0= ruleChartData
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getPicturegraphAccess().getPicturegraphdataChartDataParserRuleCall_3_2_4_0());
            	    	    										
            	    	    pushFollow(FOLLOW_29);
            	    	    lv_picturegraphdata_14_0=ruleChartData();

            	    	    state._fsp--;


            	    	    											if (current==null) {
            	    	    												current = createModelElementForParent(grammarAccess.getPicturegraphRule());
            	    	    											}
            	    	    											add(
            	    	    												current,
            	    	    												"picturegraphdata",
            	    	    												lv_picturegraphdata_14_0,
            	    	    												"org.xtext.example.mydsl.IDSL.ChartData");
            	    	    											afterParserOrEnumRuleCall();
            	    	    										

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop25;
            	        }
            	    } while (true);

            	    this_END_15=(Token)match(input,RULE_END,FOLLOW_37); 

            	    									newLeafNode(this_END_15, grammarAccess.getPicturegraphAccess().getENDTerminalRuleCall_3_2_5());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPicturegraphAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalIDSLParser.g:3566:4: ({...}? => ( ({...}? => (otherlv_16= Label otherlv_17= Colon ( (lv_label_18_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalIDSLParser.g:3566:4: ({...}? => ( ({...}? => (otherlv_16= Label otherlv_17= Colon ( (lv_label_18_0= RULE_STRING ) ) ) ) ) )
            	    // InternalIDSLParser.g:3567:5: {...}? => ( ({...}? => (otherlv_16= Label otherlv_17= Colon ( (lv_label_18_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPicturegraphAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "rulePicturegraph", "getUnorderedGroupHelper().canSelect(grammarAccess.getPicturegraphAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalIDSLParser.g:3567:109: ( ({...}? => (otherlv_16= Label otherlv_17= Colon ( (lv_label_18_0= RULE_STRING ) ) ) ) )
            	    // InternalIDSLParser.g:3568:6: ({...}? => (otherlv_16= Label otherlv_17= Colon ( (lv_label_18_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPicturegraphAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalIDSLParser.g:3571:9: ({...}? => (otherlv_16= Label otherlv_17= Colon ( (lv_label_18_0= RULE_STRING ) ) ) )
            	    // InternalIDSLParser.g:3571:10: {...}? => (otherlv_16= Label otherlv_17= Colon ( (lv_label_18_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePicturegraph", "true");
            	    }
            	    // InternalIDSLParser.g:3571:19: (otherlv_16= Label otherlv_17= Colon ( (lv_label_18_0= RULE_STRING ) ) )
            	    // InternalIDSLParser.g:3571:20: otherlv_16= Label otherlv_17= Colon ( (lv_label_18_0= RULE_STRING ) )
            	    {
            	    otherlv_16=(Token)match(input,Label,FOLLOW_3); 

            	    									newLeafNode(otherlv_16, grammarAccess.getPicturegraphAccess().getLabelKeyword_3_3_0());
            	    								
            	    otherlv_17=(Token)match(input,Colon,FOLLOW_8); 

            	    									newLeafNode(otherlv_17, grammarAccess.getPicturegraphAccess().getColonKeyword_3_3_1());
            	    								
            	    // InternalIDSLParser.g:3579:9: ( (lv_label_18_0= RULE_STRING ) )
            	    // InternalIDSLParser.g:3580:10: (lv_label_18_0= RULE_STRING )
            	    {
            	    // InternalIDSLParser.g:3580:10: (lv_label_18_0= RULE_STRING )
            	    // InternalIDSLParser.g:3581:11: lv_label_18_0= RULE_STRING
            	    {
            	    lv_label_18_0=(Token)match(input,RULE_STRING,FOLLOW_37); 

            	    											newLeafNode(lv_label_18_0, grammarAccess.getPicturegraphAccess().getLabelSTRINGTerminalRuleCall_3_3_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getPicturegraphRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"label",
            	    												lv_label_18_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPicturegraphAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalIDSLParser.g:3603:4: ({...}? => ( ({...}? => (otherlv_19= Padding otherlv_20= Colon ( (lv_padding_21_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalIDSLParser.g:3603:4: ({...}? => ( ({...}? => (otherlv_19= Padding otherlv_20= Colon ( (lv_padding_21_0= RULE_INT ) ) ) ) ) )
            	    // InternalIDSLParser.g:3604:5: {...}? => ( ({...}? => (otherlv_19= Padding otherlv_20= Colon ( (lv_padding_21_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPicturegraphAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "rulePicturegraph", "getUnorderedGroupHelper().canSelect(grammarAccess.getPicturegraphAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // InternalIDSLParser.g:3604:109: ( ({...}? => (otherlv_19= Padding otherlv_20= Colon ( (lv_padding_21_0= RULE_INT ) ) ) ) )
            	    // InternalIDSLParser.g:3605:6: ({...}? => (otherlv_19= Padding otherlv_20= Colon ( (lv_padding_21_0= RULE_INT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPicturegraphAccess().getUnorderedGroup_3(), 4);
            	    					
            	    // InternalIDSLParser.g:3608:9: ({...}? => (otherlv_19= Padding otherlv_20= Colon ( (lv_padding_21_0= RULE_INT ) ) ) )
            	    // InternalIDSLParser.g:3608:10: {...}? => (otherlv_19= Padding otherlv_20= Colon ( (lv_padding_21_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePicturegraph", "true");
            	    }
            	    // InternalIDSLParser.g:3608:19: (otherlv_19= Padding otherlv_20= Colon ( (lv_padding_21_0= RULE_INT ) ) )
            	    // InternalIDSLParser.g:3608:20: otherlv_19= Padding otherlv_20= Colon ( (lv_padding_21_0= RULE_INT ) )
            	    {
            	    otherlv_19=(Token)match(input,Padding,FOLLOW_3); 

            	    									newLeafNode(otherlv_19, grammarAccess.getPicturegraphAccess().getPaddingKeyword_3_4_0());
            	    								
            	    otherlv_20=(Token)match(input,Colon,FOLLOW_16); 

            	    									newLeafNode(otherlv_20, grammarAccess.getPicturegraphAccess().getColonKeyword_3_4_1());
            	    								
            	    // InternalIDSLParser.g:3616:9: ( (lv_padding_21_0= RULE_INT ) )
            	    // InternalIDSLParser.g:3617:10: (lv_padding_21_0= RULE_INT )
            	    {
            	    // InternalIDSLParser.g:3617:10: (lv_padding_21_0= RULE_INT )
            	    // InternalIDSLParser.g:3618:11: lv_padding_21_0= RULE_INT
            	    {
            	    lv_padding_21_0=(Token)match(input,RULE_INT,FOLLOW_37); 

            	    											newLeafNode(lv_padding_21_0, grammarAccess.getPicturegraphAccess().getPaddingINTTerminalRuleCall_3_4_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getPicturegraphRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"padding",
            	    												lv_padding_21_0,
            	    												"org.eclipse.xtext.common.Terminals.INT");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPicturegraphAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalIDSLParser.g:3640:4: ({...}? => ( ({...}? => (otherlv_22= Position otherlv_23= Colon ( (lv_position_24_0= RULE_SIZE_POS ) ) ) ) ) )
            	    {
            	    // InternalIDSLParser.g:3640:4: ({...}? => ( ({...}? => (otherlv_22= Position otherlv_23= Colon ( (lv_position_24_0= RULE_SIZE_POS ) ) ) ) ) )
            	    // InternalIDSLParser.g:3641:5: {...}? => ( ({...}? => (otherlv_22= Position otherlv_23= Colon ( (lv_position_24_0= RULE_SIZE_POS ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPicturegraphAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "rulePicturegraph", "getUnorderedGroupHelper().canSelect(grammarAccess.getPicturegraphAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // InternalIDSLParser.g:3641:109: ( ({...}? => (otherlv_22= Position otherlv_23= Colon ( (lv_position_24_0= RULE_SIZE_POS ) ) ) ) )
            	    // InternalIDSLParser.g:3642:6: ({...}? => (otherlv_22= Position otherlv_23= Colon ( (lv_position_24_0= RULE_SIZE_POS ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPicturegraphAccess().getUnorderedGroup_3(), 5);
            	    					
            	    // InternalIDSLParser.g:3645:9: ({...}? => (otherlv_22= Position otherlv_23= Colon ( (lv_position_24_0= RULE_SIZE_POS ) ) ) )
            	    // InternalIDSLParser.g:3645:10: {...}? => (otherlv_22= Position otherlv_23= Colon ( (lv_position_24_0= RULE_SIZE_POS ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePicturegraph", "true");
            	    }
            	    // InternalIDSLParser.g:3645:19: (otherlv_22= Position otherlv_23= Colon ( (lv_position_24_0= RULE_SIZE_POS ) ) )
            	    // InternalIDSLParser.g:3645:20: otherlv_22= Position otherlv_23= Colon ( (lv_position_24_0= RULE_SIZE_POS ) )
            	    {
            	    otherlv_22=(Token)match(input,Position,FOLLOW_3); 

            	    									newLeafNode(otherlv_22, grammarAccess.getPicturegraphAccess().getPositionKeyword_3_5_0());
            	    								
            	    otherlv_23=(Token)match(input,Colon,FOLLOW_9); 

            	    									newLeafNode(otherlv_23, grammarAccess.getPicturegraphAccess().getColonKeyword_3_5_1());
            	    								
            	    // InternalIDSLParser.g:3653:9: ( (lv_position_24_0= RULE_SIZE_POS ) )
            	    // InternalIDSLParser.g:3654:10: (lv_position_24_0= RULE_SIZE_POS )
            	    {
            	    // InternalIDSLParser.g:3654:10: (lv_position_24_0= RULE_SIZE_POS )
            	    // InternalIDSLParser.g:3655:11: lv_position_24_0= RULE_SIZE_POS
            	    {
            	    lv_position_24_0=(Token)match(input,RULE_SIZE_POS,FOLLOW_37); 

            	    											newLeafNode(lv_position_24_0, grammarAccess.getPicturegraphAccess().getPositionSIZE_POSTerminalRuleCall_3_5_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getPicturegraphRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"position",
            	    												lv_position_24_0,
            	    												"org.xtext.example.mydsl.IDSL.SIZE_POS");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPicturegraphAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalIDSLParser.g:3677:4: ({...}? => ( ({...}? => (otherlv_25= Showlegend otherlv_26= Colon ( (lv_showlegend_27_0= ruleShowOptionsOff ) ) ) ) ) )
            	    {
            	    // InternalIDSLParser.g:3677:4: ({...}? => ( ({...}? => (otherlv_25= Showlegend otherlv_26= Colon ( (lv_showlegend_27_0= ruleShowOptionsOff ) ) ) ) ) )
            	    // InternalIDSLParser.g:3678:5: {...}? => ( ({...}? => (otherlv_25= Showlegend otherlv_26= Colon ( (lv_showlegend_27_0= ruleShowOptionsOff ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPicturegraphAccess().getUnorderedGroup_3(), 6) ) {
            	        throw new FailedPredicateException(input, "rulePicturegraph", "getUnorderedGroupHelper().canSelect(grammarAccess.getPicturegraphAccess().getUnorderedGroup_3(), 6)");
            	    }
            	    // InternalIDSLParser.g:3678:109: ( ({...}? => (otherlv_25= Showlegend otherlv_26= Colon ( (lv_showlegend_27_0= ruleShowOptionsOff ) ) ) ) )
            	    // InternalIDSLParser.g:3679:6: ({...}? => (otherlv_25= Showlegend otherlv_26= Colon ( (lv_showlegend_27_0= ruleShowOptionsOff ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPicturegraphAccess().getUnorderedGroup_3(), 6);
            	    					
            	    // InternalIDSLParser.g:3682:9: ({...}? => (otherlv_25= Showlegend otherlv_26= Colon ( (lv_showlegend_27_0= ruleShowOptionsOff ) ) ) )
            	    // InternalIDSLParser.g:3682:10: {...}? => (otherlv_25= Showlegend otherlv_26= Colon ( (lv_showlegend_27_0= ruleShowOptionsOff ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePicturegraph", "true");
            	    }
            	    // InternalIDSLParser.g:3682:19: (otherlv_25= Showlegend otherlv_26= Colon ( (lv_showlegend_27_0= ruleShowOptionsOff ) ) )
            	    // InternalIDSLParser.g:3682:20: otherlv_25= Showlegend otherlv_26= Colon ( (lv_showlegend_27_0= ruleShowOptionsOff ) )
            	    {
            	    otherlv_25=(Token)match(input,Showlegend,FOLLOW_3); 

            	    									newLeafNode(otherlv_25, grammarAccess.getPicturegraphAccess().getShowlegendKeyword_3_6_0());
            	    								
            	    otherlv_26=(Token)match(input,Colon,FOLLOW_31); 

            	    									newLeafNode(otherlv_26, grammarAccess.getPicturegraphAccess().getColonKeyword_3_6_1());
            	    								
            	    // InternalIDSLParser.g:3690:9: ( (lv_showlegend_27_0= ruleShowOptionsOff ) )
            	    // InternalIDSLParser.g:3691:10: (lv_showlegend_27_0= ruleShowOptionsOff )
            	    {
            	    // InternalIDSLParser.g:3691:10: (lv_showlegend_27_0= ruleShowOptionsOff )
            	    // InternalIDSLParser.g:3692:11: lv_showlegend_27_0= ruleShowOptionsOff
            	    {

            	    											newCompositeNode(grammarAccess.getPicturegraphAccess().getShowlegendShowOptionsOffEnumRuleCall_3_6_2_0());
            	    										
            	    pushFollow(FOLLOW_37);
            	    lv_showlegend_27_0=ruleShowOptionsOff();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getPicturegraphRule());
            	    											}
            	    											set(
            	    												current,
            	    												"showlegend",
            	    												lv_showlegend_27_0,
            	    												"org.xtext.example.mydsl.IDSL.ShowOptionsOff");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPicturegraphAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalIDSLParser.g:3715:4: ({...}? => ( ({...}? => (otherlv_28= Showtitle otherlv_29= Colon ( (lv_showtitle_30_0= ruleShowOptionsOff ) ) ) ) ) )
            	    {
            	    // InternalIDSLParser.g:3715:4: ({...}? => ( ({...}? => (otherlv_28= Showtitle otherlv_29= Colon ( (lv_showtitle_30_0= ruleShowOptionsOff ) ) ) ) ) )
            	    // InternalIDSLParser.g:3716:5: {...}? => ( ({...}? => (otherlv_28= Showtitle otherlv_29= Colon ( (lv_showtitle_30_0= ruleShowOptionsOff ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPicturegraphAccess().getUnorderedGroup_3(), 7) ) {
            	        throw new FailedPredicateException(input, "rulePicturegraph", "getUnorderedGroupHelper().canSelect(grammarAccess.getPicturegraphAccess().getUnorderedGroup_3(), 7)");
            	    }
            	    // InternalIDSLParser.g:3716:109: ( ({...}? => (otherlv_28= Showtitle otherlv_29= Colon ( (lv_showtitle_30_0= ruleShowOptionsOff ) ) ) ) )
            	    // InternalIDSLParser.g:3717:6: ({...}? => (otherlv_28= Showtitle otherlv_29= Colon ( (lv_showtitle_30_0= ruleShowOptionsOff ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPicturegraphAccess().getUnorderedGroup_3(), 7);
            	    					
            	    // InternalIDSLParser.g:3720:9: ({...}? => (otherlv_28= Showtitle otherlv_29= Colon ( (lv_showtitle_30_0= ruleShowOptionsOff ) ) ) )
            	    // InternalIDSLParser.g:3720:10: {...}? => (otherlv_28= Showtitle otherlv_29= Colon ( (lv_showtitle_30_0= ruleShowOptionsOff ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePicturegraph", "true");
            	    }
            	    // InternalIDSLParser.g:3720:19: (otherlv_28= Showtitle otherlv_29= Colon ( (lv_showtitle_30_0= ruleShowOptionsOff ) ) )
            	    // InternalIDSLParser.g:3720:20: otherlv_28= Showtitle otherlv_29= Colon ( (lv_showtitle_30_0= ruleShowOptionsOff ) )
            	    {
            	    otherlv_28=(Token)match(input,Showtitle,FOLLOW_3); 

            	    									newLeafNode(otherlv_28, grammarAccess.getPicturegraphAccess().getShowtitleKeyword_3_7_0());
            	    								
            	    otherlv_29=(Token)match(input,Colon,FOLLOW_31); 

            	    									newLeafNode(otherlv_29, grammarAccess.getPicturegraphAccess().getColonKeyword_3_7_1());
            	    								
            	    // InternalIDSLParser.g:3728:9: ( (lv_showtitle_30_0= ruleShowOptionsOff ) )
            	    // InternalIDSLParser.g:3729:10: (lv_showtitle_30_0= ruleShowOptionsOff )
            	    {
            	    // InternalIDSLParser.g:3729:10: (lv_showtitle_30_0= ruleShowOptionsOff )
            	    // InternalIDSLParser.g:3730:11: lv_showtitle_30_0= ruleShowOptionsOff
            	    {

            	    											newCompositeNode(grammarAccess.getPicturegraphAccess().getShowtitleShowOptionsOffEnumRuleCall_3_7_2_0());
            	    										
            	    pushFollow(FOLLOW_37);
            	    lv_showtitle_30_0=ruleShowOptionsOff();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getPicturegraphRule());
            	    											}
            	    											set(
            	    												current,
            	    												"showtitle",
            	    												lv_showtitle_30_0,
            	    												"org.xtext.example.mydsl.IDSL.ShowOptionsOff");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPicturegraphAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // InternalIDSLParser.g:3753:4: ({...}? => ( ({...}? => (otherlv_31= Size otherlv_32= Colon ( (lv_size_33_0= RULE_SIZE_POS ) ) ) ) ) )
            	    {
            	    // InternalIDSLParser.g:3753:4: ({...}? => ( ({...}? => (otherlv_31= Size otherlv_32= Colon ( (lv_size_33_0= RULE_SIZE_POS ) ) ) ) ) )
            	    // InternalIDSLParser.g:3754:5: {...}? => ( ({...}? => (otherlv_31= Size otherlv_32= Colon ( (lv_size_33_0= RULE_SIZE_POS ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPicturegraphAccess().getUnorderedGroup_3(), 8) ) {
            	        throw new FailedPredicateException(input, "rulePicturegraph", "getUnorderedGroupHelper().canSelect(grammarAccess.getPicturegraphAccess().getUnorderedGroup_3(), 8)");
            	    }
            	    // InternalIDSLParser.g:3754:109: ( ({...}? => (otherlv_31= Size otherlv_32= Colon ( (lv_size_33_0= RULE_SIZE_POS ) ) ) ) )
            	    // InternalIDSLParser.g:3755:6: ({...}? => (otherlv_31= Size otherlv_32= Colon ( (lv_size_33_0= RULE_SIZE_POS ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPicturegraphAccess().getUnorderedGroup_3(), 8);
            	    					
            	    // InternalIDSLParser.g:3758:9: ({...}? => (otherlv_31= Size otherlv_32= Colon ( (lv_size_33_0= RULE_SIZE_POS ) ) ) )
            	    // InternalIDSLParser.g:3758:10: {...}? => (otherlv_31= Size otherlv_32= Colon ( (lv_size_33_0= RULE_SIZE_POS ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePicturegraph", "true");
            	    }
            	    // InternalIDSLParser.g:3758:19: (otherlv_31= Size otherlv_32= Colon ( (lv_size_33_0= RULE_SIZE_POS ) ) )
            	    // InternalIDSLParser.g:3758:20: otherlv_31= Size otherlv_32= Colon ( (lv_size_33_0= RULE_SIZE_POS ) )
            	    {
            	    otherlv_31=(Token)match(input,Size,FOLLOW_3); 

            	    									newLeafNode(otherlv_31, grammarAccess.getPicturegraphAccess().getSizeKeyword_3_8_0());
            	    								
            	    otherlv_32=(Token)match(input,Colon,FOLLOW_9); 

            	    									newLeafNode(otherlv_32, grammarAccess.getPicturegraphAccess().getColonKeyword_3_8_1());
            	    								
            	    // InternalIDSLParser.g:3766:9: ( (lv_size_33_0= RULE_SIZE_POS ) )
            	    // InternalIDSLParser.g:3767:10: (lv_size_33_0= RULE_SIZE_POS )
            	    {
            	    // InternalIDSLParser.g:3767:10: (lv_size_33_0= RULE_SIZE_POS )
            	    // InternalIDSLParser.g:3768:11: lv_size_33_0= RULE_SIZE_POS
            	    {
            	    lv_size_33_0=(Token)match(input,RULE_SIZE_POS,FOLLOW_37); 

            	    											newLeafNode(lv_size_33_0, grammarAccess.getPicturegraphAccess().getSizeSIZE_POSTerminalRuleCall_3_8_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getPicturegraphRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"size",
            	    												lv_size_33_0,
            	    												"org.xtext.example.mydsl.IDSL.SIZE_POS");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPicturegraphAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // InternalIDSLParser.g:3790:4: ({...}? => ( ({...}? => (otherlv_34= Title otherlv_35= Colon ( (lv_title_36_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalIDSLParser.g:3790:4: ({...}? => ( ({...}? => (otherlv_34= Title otherlv_35= Colon ( (lv_title_36_0= RULE_STRING ) ) ) ) ) )
            	    // InternalIDSLParser.g:3791:5: {...}? => ( ({...}? => (otherlv_34= Title otherlv_35= Colon ( (lv_title_36_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPicturegraphAccess().getUnorderedGroup_3(), 9) ) {
            	        throw new FailedPredicateException(input, "rulePicturegraph", "getUnorderedGroupHelper().canSelect(grammarAccess.getPicturegraphAccess().getUnorderedGroup_3(), 9)");
            	    }
            	    // InternalIDSLParser.g:3791:109: ( ({...}? => (otherlv_34= Title otherlv_35= Colon ( (lv_title_36_0= RULE_STRING ) ) ) ) )
            	    // InternalIDSLParser.g:3792:6: ({...}? => (otherlv_34= Title otherlv_35= Colon ( (lv_title_36_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPicturegraphAccess().getUnorderedGroup_3(), 9);
            	    					
            	    // InternalIDSLParser.g:3795:9: ({...}? => (otherlv_34= Title otherlv_35= Colon ( (lv_title_36_0= RULE_STRING ) ) ) )
            	    // InternalIDSLParser.g:3795:10: {...}? => (otherlv_34= Title otherlv_35= Colon ( (lv_title_36_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePicturegraph", "true");
            	    }
            	    // InternalIDSLParser.g:3795:19: (otherlv_34= Title otherlv_35= Colon ( (lv_title_36_0= RULE_STRING ) ) )
            	    // InternalIDSLParser.g:3795:20: otherlv_34= Title otherlv_35= Colon ( (lv_title_36_0= RULE_STRING ) )
            	    {
            	    otherlv_34=(Token)match(input,Title,FOLLOW_3); 

            	    									newLeafNode(otherlv_34, grammarAccess.getPicturegraphAccess().getTitleKeyword_3_9_0());
            	    								
            	    otherlv_35=(Token)match(input,Colon,FOLLOW_8); 

            	    									newLeafNode(otherlv_35, grammarAccess.getPicturegraphAccess().getColonKeyword_3_9_1());
            	    								
            	    // InternalIDSLParser.g:3803:9: ( (lv_title_36_0= RULE_STRING ) )
            	    // InternalIDSLParser.g:3804:10: (lv_title_36_0= RULE_STRING )
            	    {
            	    // InternalIDSLParser.g:3804:10: (lv_title_36_0= RULE_STRING )
            	    // InternalIDSLParser.g:3805:11: lv_title_36_0= RULE_STRING
            	    {
            	    lv_title_36_0=(Token)match(input,RULE_STRING,FOLLOW_37); 

            	    											newLeafNode(lv_title_36_0, grammarAccess.getPicturegraphAccess().getTitleSTRINGTerminalRuleCall_3_9_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getPicturegraphRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"title",
            	    												lv_title_36_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPicturegraphAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // InternalIDSLParser.g:3827:4: ({...}? => ( ({...}? => (otherlv_37= Type otherlv_38= Colon ( (lv_type_39_0= rulePicturegraphType ) ) ) ) ) )
            	    {
            	    // InternalIDSLParser.g:3827:4: ({...}? => ( ({...}? => (otherlv_37= Type otherlv_38= Colon ( (lv_type_39_0= rulePicturegraphType ) ) ) ) ) )
            	    // InternalIDSLParser.g:3828:5: {...}? => ( ({...}? => (otherlv_37= Type otherlv_38= Colon ( (lv_type_39_0= rulePicturegraphType ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPicturegraphAccess().getUnorderedGroup_3(), 10) ) {
            	        throw new FailedPredicateException(input, "rulePicturegraph", "getUnorderedGroupHelper().canSelect(grammarAccess.getPicturegraphAccess().getUnorderedGroup_3(), 10)");
            	    }
            	    // InternalIDSLParser.g:3828:110: ( ({...}? => (otherlv_37= Type otherlv_38= Colon ( (lv_type_39_0= rulePicturegraphType ) ) ) ) )
            	    // InternalIDSLParser.g:3829:6: ({...}? => (otherlv_37= Type otherlv_38= Colon ( (lv_type_39_0= rulePicturegraphType ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPicturegraphAccess().getUnorderedGroup_3(), 10);
            	    					
            	    // InternalIDSLParser.g:3832:9: ({...}? => (otherlv_37= Type otherlv_38= Colon ( (lv_type_39_0= rulePicturegraphType ) ) ) )
            	    // InternalIDSLParser.g:3832:10: {...}? => (otherlv_37= Type otherlv_38= Colon ( (lv_type_39_0= rulePicturegraphType ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePicturegraph", "true");
            	    }
            	    // InternalIDSLParser.g:3832:19: (otherlv_37= Type otherlv_38= Colon ( (lv_type_39_0= rulePicturegraphType ) ) )
            	    // InternalIDSLParser.g:3832:20: otherlv_37= Type otherlv_38= Colon ( (lv_type_39_0= rulePicturegraphType ) )
            	    {
            	    otherlv_37=(Token)match(input,Type,FOLLOW_3); 

            	    									newLeafNode(otherlv_37, grammarAccess.getPicturegraphAccess().getTypeKeyword_3_10_0());
            	    								
            	    otherlv_38=(Token)match(input,Colon,FOLLOW_38); 

            	    									newLeafNode(otherlv_38, grammarAccess.getPicturegraphAccess().getColonKeyword_3_10_1());
            	    								
            	    // InternalIDSLParser.g:3840:9: ( (lv_type_39_0= rulePicturegraphType ) )
            	    // InternalIDSLParser.g:3841:10: (lv_type_39_0= rulePicturegraphType )
            	    {
            	    // InternalIDSLParser.g:3841:10: (lv_type_39_0= rulePicturegraphType )
            	    // InternalIDSLParser.g:3842:11: lv_type_39_0= rulePicturegraphType
            	    {

            	    											newCompositeNode(grammarAccess.getPicturegraphAccess().getTypePicturegraphTypeEnumRuleCall_3_10_2_0());
            	    										
            	    pushFollow(FOLLOW_37);
            	    lv_type_39_0=rulePicturegraphType();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getPicturegraphRule());
            	    											}
            	    											set(
            	    												current,
            	    												"type",
            	    												lv_type_39_0,
            	    												"org.xtext.example.mydsl.IDSL.PicturegraphType");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPicturegraphAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getPicturegraphAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "rulePicturegraph", "getUnorderedGroupHelper().canLeave(grammarAccess.getPicturegraphAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getPicturegraphAccess().getUnorderedGroup_3());
            				

            }

            this_END_40=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_40, grammarAccess.getPicturegraphAccess().getENDTerminalRuleCall_4());
            		

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
    // $ANTLR end "rulePicturegraph"


    // $ANTLR start "entryRuleFoot"
    // InternalIDSLParser.g:3881:1: entryRuleFoot returns [EObject current=null] : iv_ruleFoot= ruleFoot EOF ;
    public final EObject entryRuleFoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFoot = null;


        try {
            // InternalIDSLParser.g:3881:45: (iv_ruleFoot= ruleFoot EOF )
            // InternalIDSLParser.g:3882:2: iv_ruleFoot= ruleFoot EOF
            {
             newCompositeNode(grammarAccess.getFootRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFoot=ruleFoot();

            state._fsp--;

             current =iv_ruleFoot; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFoot"


    // $ANTLR start "ruleFoot"
    // InternalIDSLParser.g:3888:1: ruleFoot returns [EObject current=null] : ( ( (lv_name_0_0= Foot ) ) otherlv_1= Colon (otherlv_2= Off | ( ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN ( (otherlv_5= Bgcolor otherlv_6= Colon ( (lv_bgcolor_7_0= ruleColor ) ) ) | (otherlv_8= Bgpattern otherlv_9= Colon ( (lv_bgpattern_10_0= rulePattern ) ) ) | (otherlv_11= Bgimage otherlv_12= Colon ( (lv_bgimage_13_0= ruleImageSrc ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Position otherlv_15= Colon ( (lv_position_16_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Size otherlv_18= Colon ( (lv_size_19_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= Text otherlv_21= Colon ( (lv_text_22_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) this_END_23= RULE_END ) ) ) ;
    public final EObject ruleFoot() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_BEGIN_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_position_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_size_19_0=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token lv_text_22_0=null;
        Token this_END_23=null;
        EObject lv_bgcolor_7_0 = null;

        AntlrDatatypeRuleToken lv_bgpattern_10_0 = null;

        AntlrDatatypeRuleToken lv_bgimage_13_0 = null;



        	enterRule();

        try {
            // InternalIDSLParser.g:3894:2: ( ( ( (lv_name_0_0= Foot ) ) otherlv_1= Colon (otherlv_2= Off | ( ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN ( (otherlv_5= Bgcolor otherlv_6= Colon ( (lv_bgcolor_7_0= ruleColor ) ) ) | (otherlv_8= Bgpattern otherlv_9= Colon ( (lv_bgpattern_10_0= rulePattern ) ) ) | (otherlv_11= Bgimage otherlv_12= Colon ( (lv_bgimage_13_0= ruleImageSrc ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Position otherlv_15= Colon ( (lv_position_16_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Size otherlv_18= Colon ( (lv_size_19_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= Text otherlv_21= Colon ( (lv_text_22_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) this_END_23= RULE_END ) ) ) )
            // InternalIDSLParser.g:3895:2: ( ( (lv_name_0_0= Foot ) ) otherlv_1= Colon (otherlv_2= Off | ( ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN ( (otherlv_5= Bgcolor otherlv_6= Colon ( (lv_bgcolor_7_0= ruleColor ) ) ) | (otherlv_8= Bgpattern otherlv_9= Colon ( (lv_bgpattern_10_0= rulePattern ) ) ) | (otherlv_11= Bgimage otherlv_12= Colon ( (lv_bgimage_13_0= ruleImageSrc ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Position otherlv_15= Colon ( (lv_position_16_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Size otherlv_18= Colon ( (lv_size_19_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= Text otherlv_21= Colon ( (lv_text_22_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) this_END_23= RULE_END ) ) )
            {
            // InternalIDSLParser.g:3895:2: ( ( (lv_name_0_0= Foot ) ) otherlv_1= Colon (otherlv_2= Off | ( ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN ( (otherlv_5= Bgcolor otherlv_6= Colon ( (lv_bgcolor_7_0= ruleColor ) ) ) | (otherlv_8= Bgpattern otherlv_9= Colon ( (lv_bgpattern_10_0= rulePattern ) ) ) | (otherlv_11= Bgimage otherlv_12= Colon ( (lv_bgimage_13_0= ruleImageSrc ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Position otherlv_15= Colon ( (lv_position_16_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Size otherlv_18= Colon ( (lv_size_19_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= Text otherlv_21= Colon ( (lv_text_22_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) this_END_23= RULE_END ) ) )
            // InternalIDSLParser.g:3896:3: ( (lv_name_0_0= Foot ) ) otherlv_1= Colon (otherlv_2= Off | ( ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN ( (otherlv_5= Bgcolor otherlv_6= Colon ( (lv_bgcolor_7_0= ruleColor ) ) ) | (otherlv_8= Bgpattern otherlv_9= Colon ( (lv_bgpattern_10_0= rulePattern ) ) ) | (otherlv_11= Bgimage otherlv_12= Colon ( (lv_bgimage_13_0= ruleImageSrc ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Position otherlv_15= Colon ( (lv_position_16_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Size otherlv_18= Colon ( (lv_size_19_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= Text otherlv_21= Colon ( (lv_text_22_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) this_END_23= RULE_END ) )
            {
            // InternalIDSLParser.g:3896:3: ( (lv_name_0_0= Foot ) )
            // InternalIDSLParser.g:3897:4: (lv_name_0_0= Foot )
            {
            // InternalIDSLParser.g:3897:4: (lv_name_0_0= Foot )
            // InternalIDSLParser.g:3898:5: lv_name_0_0= Foot
            {
            lv_name_0_0=(Token)match(input,Foot,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getFootAccess().getNameFootKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFootRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "foot");
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getFootAccess().getColonKeyword_1());
            		
            // InternalIDSLParser.g:3914:3: (otherlv_2= Off | ( ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN ( (otherlv_5= Bgcolor otherlv_6= Colon ( (lv_bgcolor_7_0= ruleColor ) ) ) | (otherlv_8= Bgpattern otherlv_9= Colon ( (lv_bgpattern_10_0= rulePattern ) ) ) | (otherlv_11= Bgimage otherlv_12= Colon ( (lv_bgimage_13_0= ruleImageSrc ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Position otherlv_15= Colon ( (lv_position_16_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Size otherlv_18= Colon ( (lv_size_19_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= Text otherlv_21= Colon ( (lv_text_22_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) this_END_23= RULE_END ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==Off) ) {
                alt29=1;
            }
            else if ( (LA29_0==Position||(LA29_0>=Size && LA29_0<=Text)||LA29_0==RULE_BEGIN) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalIDSLParser.g:3915:4: otherlv_2= Off
                    {
                    otherlv_2=(Token)match(input,Off,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getFootAccess().getOffKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalIDSLParser.g:3920:4: ( ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN ( (otherlv_5= Bgcolor otherlv_6= Colon ( (lv_bgcolor_7_0= ruleColor ) ) ) | (otherlv_8= Bgpattern otherlv_9= Colon ( (lv_bgpattern_10_0= rulePattern ) ) ) | (otherlv_11= Bgimage otherlv_12= Colon ( (lv_bgimage_13_0= ruleImageSrc ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Position otherlv_15= Colon ( (lv_position_16_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Size otherlv_18= Colon ( (lv_size_19_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= Text otherlv_21= Colon ( (lv_text_22_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) this_END_23= RULE_END )
                    {
                    // InternalIDSLParser.g:3920:4: ( ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN ( (otherlv_5= Bgcolor otherlv_6= Colon ( (lv_bgcolor_7_0= ruleColor ) ) ) | (otherlv_8= Bgpattern otherlv_9= Colon ( (lv_bgpattern_10_0= rulePattern ) ) ) | (otherlv_11= Bgimage otherlv_12= Colon ( (lv_bgimage_13_0= ruleImageSrc ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Position otherlv_15= Colon ( (lv_position_16_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Size otherlv_18= Colon ( (lv_size_19_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= Text otherlv_21= Colon ( (lv_text_22_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) this_END_23= RULE_END )
                    // InternalIDSLParser.g:3921:5: ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN ( (otherlv_5= Bgcolor otherlv_6= Colon ( (lv_bgcolor_7_0= ruleColor ) ) ) | (otherlv_8= Bgpattern otherlv_9= Colon ( (lv_bgpattern_10_0= rulePattern ) ) ) | (otherlv_11= Bgimage otherlv_12= Colon ( (lv_bgimage_13_0= ruleImageSrc ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Position otherlv_15= Colon ( (lv_position_16_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Size otherlv_18= Colon ( (lv_size_19_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= Text otherlv_21= Colon ( (lv_text_22_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) this_END_23= RULE_END
                    {
                    // InternalIDSLParser.g:3921:5: ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN ( (otherlv_5= Bgcolor otherlv_6= Colon ( (lv_bgcolor_7_0= ruleColor ) ) ) | (otherlv_8= Bgpattern otherlv_9= Colon ( (lv_bgpattern_10_0= rulePattern ) ) ) | (otherlv_11= Bgimage otherlv_12= Colon ( (lv_bgimage_13_0= ruleImageSrc ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Position otherlv_15= Colon ( (lv_position_16_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Size otherlv_18= Colon ( (lv_size_19_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= Text otherlv_21= Colon ( (lv_text_22_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )
                    // InternalIDSLParser.g:3922:6: ( ( ( ({...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN ( (otherlv_5= Bgcolor otherlv_6= Colon ( (lv_bgcolor_7_0= ruleColor ) ) ) | (otherlv_8= Bgpattern otherlv_9= Colon ( (lv_bgpattern_10_0= rulePattern ) ) ) | (otherlv_11= Bgimage otherlv_12= Colon ( (lv_bgimage_13_0= ruleImageSrc ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Position otherlv_15= Colon ( (lv_position_16_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Size otherlv_18= Colon ( (lv_size_19_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= Text otherlv_21= Colon ( (lv_text_22_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
                    {
                    // InternalIDSLParser.g:3922:6: ( ( ( ({...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN ( (otherlv_5= Bgcolor otherlv_6= Colon ( (lv_bgcolor_7_0= ruleColor ) ) ) | (otherlv_8= Bgpattern otherlv_9= Colon ( (lv_bgpattern_10_0= rulePattern ) ) ) | (otherlv_11= Bgimage otherlv_12= Colon ( (lv_bgimage_13_0= ruleImageSrc ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Position otherlv_15= Colon ( (lv_position_16_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Size otherlv_18= Colon ( (lv_size_19_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= Text otherlv_21= Colon ( (lv_text_22_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
                    // InternalIDSLParser.g:3923:7: ( ( ({...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN ( (otherlv_5= Bgcolor otherlv_6= Colon ( (lv_bgcolor_7_0= ruleColor ) ) ) | (otherlv_8= Bgpattern otherlv_9= Colon ( (lv_bgpattern_10_0= rulePattern ) ) ) | (otherlv_11= Bgimage otherlv_12= Colon ( (lv_bgimage_13_0= ruleImageSrc ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Position otherlv_15= Colon ( (lv_position_16_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Size otherlv_18= Colon ( (lv_size_19_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= Text otherlv_21= Colon ( (lv_text_22_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
                    {
                     
                    						  getUnorderedGroupHelper().enter(grammarAccess.getFootAccess().getUnorderedGroup_2_1_0());
                    						
                    // InternalIDSLParser.g:3926:7: ( ( ({...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN ( (otherlv_5= Bgcolor otherlv_6= Colon ( (lv_bgcolor_7_0= ruleColor ) ) ) | (otherlv_8= Bgpattern otherlv_9= Colon ( (lv_bgpattern_10_0= rulePattern ) ) ) | (otherlv_11= Bgimage otherlv_12= Colon ( (lv_bgimage_13_0= ruleImageSrc ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Position otherlv_15= Colon ( (lv_position_16_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Size otherlv_18= Colon ( (lv_size_19_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= Text otherlv_21= Colon ( (lv_text_22_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
                    // InternalIDSLParser.g:3927:8: ( ({...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN ( (otherlv_5= Bgcolor otherlv_6= Colon ( (lv_bgcolor_7_0= ruleColor ) ) ) | (otherlv_8= Bgpattern otherlv_9= Colon ( (lv_bgpattern_10_0= rulePattern ) ) ) | (otherlv_11= Bgimage otherlv_12= Colon ( (lv_bgimage_13_0= ruleImageSrc ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Position otherlv_15= Colon ( (lv_position_16_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Size otherlv_18= Colon ( (lv_size_19_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= Text otherlv_21= Colon ( (lv_text_22_0= RULE_STRING ) ) ) ) ) ) )+ {...}?
                    {
                    // InternalIDSLParser.g:3927:8: ( ({...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN ( (otherlv_5= Bgcolor otherlv_6= Colon ( (lv_bgcolor_7_0= ruleColor ) ) ) | (otherlv_8= Bgpattern otherlv_9= Colon ( (lv_bgpattern_10_0= rulePattern ) ) ) | (otherlv_11= Bgimage otherlv_12= Colon ( (lv_bgimage_13_0= ruleImageSrc ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Position otherlv_15= Colon ( (lv_position_16_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Size otherlv_18= Colon ( (lv_size_19_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= Text otherlv_21= Colon ( (lv_text_22_0= RULE_STRING ) ) ) ) ) ) )+
                    int cnt28=0;
                    loop28:
                    do {
                        int alt28=5;
                        int LA28_0 = input.LA(1);

                        if ( LA28_0 == RULE_BEGIN && getUnorderedGroupHelper().canSelect(grammarAccess.getFootAccess().getUnorderedGroup_2_1_0(), 0) ) {
                            alt28=1;
                        }
                        else if ( LA28_0 == Position && getUnorderedGroupHelper().canSelect(grammarAccess.getFootAccess().getUnorderedGroup_2_1_0(), 1) ) {
                            alt28=2;
                        }
                        else if ( LA28_0 == Size && getUnorderedGroupHelper().canSelect(grammarAccess.getFootAccess().getUnorderedGroup_2_1_0(), 2) ) {
                            alt28=3;
                        }
                        else if ( LA28_0 == Text && getUnorderedGroupHelper().canSelect(grammarAccess.getFootAccess().getUnorderedGroup_2_1_0(), 3) ) {
                            alt28=4;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalIDSLParser.g:3928:6: ({...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN ( (otherlv_5= Bgcolor otherlv_6= Colon ( (lv_bgcolor_7_0= ruleColor ) ) ) | (otherlv_8= Bgpattern otherlv_9= Colon ( (lv_bgpattern_10_0= rulePattern ) ) ) | (otherlv_11= Bgimage otherlv_12= Colon ( (lv_bgimage_13_0= ruleImageSrc ) ) ) )? ) ) ) )
                    	    {
                    	    // InternalIDSLParser.g:3928:6: ({...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN ( (otherlv_5= Bgcolor otherlv_6= Colon ( (lv_bgcolor_7_0= ruleColor ) ) ) | (otherlv_8= Bgpattern otherlv_9= Colon ( (lv_bgpattern_10_0= rulePattern ) ) ) | (otherlv_11= Bgimage otherlv_12= Colon ( (lv_bgimage_13_0= ruleImageSrc ) ) ) )? ) ) ) )
                    	    // InternalIDSLParser.g:3929:7: {...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN ( (otherlv_5= Bgcolor otherlv_6= Colon ( (lv_bgcolor_7_0= ruleColor ) ) ) | (otherlv_8= Bgpattern otherlv_9= Colon ( (lv_bgpattern_10_0= rulePattern ) ) ) | (otherlv_11= Bgimage otherlv_12= Colon ( (lv_bgimage_13_0= ruleImageSrc ) ) ) )? ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFootAccess().getUnorderedGroup_2_1_0(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleFoot", "getUnorderedGroupHelper().canSelect(grammarAccess.getFootAccess().getUnorderedGroup_2_1_0(), 0)");
                    	    }
                    	    // InternalIDSLParser.g:3929:107: ( ({...}? => (this_BEGIN_4= RULE_BEGIN ( (otherlv_5= Bgcolor otherlv_6= Colon ( (lv_bgcolor_7_0= ruleColor ) ) ) | (otherlv_8= Bgpattern otherlv_9= Colon ( (lv_bgpattern_10_0= rulePattern ) ) ) | (otherlv_11= Bgimage otherlv_12= Colon ( (lv_bgimage_13_0= ruleImageSrc ) ) ) )? ) ) )
                    	    // InternalIDSLParser.g:3930:8: ({...}? => (this_BEGIN_4= RULE_BEGIN ( (otherlv_5= Bgcolor otherlv_6= Colon ( (lv_bgcolor_7_0= ruleColor ) ) ) | (otherlv_8= Bgpattern otherlv_9= Colon ( (lv_bgpattern_10_0= rulePattern ) ) ) | (otherlv_11= Bgimage otherlv_12= Colon ( (lv_bgimage_13_0= ruleImageSrc ) ) ) )? ) )
                    	    {

                    	    								getUnorderedGroupHelper().select(grammarAccess.getFootAccess().getUnorderedGroup_2_1_0(), 0);
                    	    							
                    	    // InternalIDSLParser.g:3933:11: ({...}? => (this_BEGIN_4= RULE_BEGIN ( (otherlv_5= Bgcolor otherlv_6= Colon ( (lv_bgcolor_7_0= ruleColor ) ) ) | (otherlv_8= Bgpattern otherlv_9= Colon ( (lv_bgpattern_10_0= rulePattern ) ) ) | (otherlv_11= Bgimage otherlv_12= Colon ( (lv_bgimage_13_0= ruleImageSrc ) ) ) )? ) )
                    	    // InternalIDSLParser.g:3933:12: {...}? => (this_BEGIN_4= RULE_BEGIN ( (otherlv_5= Bgcolor otherlv_6= Colon ( (lv_bgcolor_7_0= ruleColor ) ) ) | (otherlv_8= Bgpattern otherlv_9= Colon ( (lv_bgpattern_10_0= rulePattern ) ) ) | (otherlv_11= Bgimage otherlv_12= Colon ( (lv_bgimage_13_0= ruleImageSrc ) ) ) )? )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleFoot", "true");
                    	    }
                    	    // InternalIDSLParser.g:3933:21: (this_BEGIN_4= RULE_BEGIN ( (otherlv_5= Bgcolor otherlv_6= Colon ( (lv_bgcolor_7_0= ruleColor ) ) ) | (otherlv_8= Bgpattern otherlv_9= Colon ( (lv_bgpattern_10_0= rulePattern ) ) ) | (otherlv_11= Bgimage otherlv_12= Colon ( (lv_bgimage_13_0= ruleImageSrc ) ) ) )? )
                    	    // InternalIDSLParser.g:3933:22: this_BEGIN_4= RULE_BEGIN ( (otherlv_5= Bgcolor otherlv_6= Colon ( (lv_bgcolor_7_0= ruleColor ) ) ) | (otherlv_8= Bgpattern otherlv_9= Colon ( (lv_bgpattern_10_0= rulePattern ) ) ) | (otherlv_11= Bgimage otherlv_12= Colon ( (lv_bgimage_13_0= ruleImageSrc ) ) ) )?
                    	    {
                    	    this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_40); 

                    	    											newLeafNode(this_BEGIN_4, grammarAccess.getFootAccess().getBEGINTerminalRuleCall_2_1_0_0_0());
                    	    										
                    	    // InternalIDSLParser.g:3937:11: ( (otherlv_5= Bgcolor otherlv_6= Colon ( (lv_bgcolor_7_0= ruleColor ) ) ) | (otherlv_8= Bgpattern otherlv_9= Colon ( (lv_bgpattern_10_0= rulePattern ) ) ) | (otherlv_11= Bgimage otherlv_12= Colon ( (lv_bgimage_13_0= ruleImageSrc ) ) ) )?
                    	    int alt27=4;
                    	    switch ( input.LA(1) ) {
                    	        case Bgcolor:
                    	            {
                    	            alt27=1;
                    	            }
                    	            break;
                    	        case Bgpattern:
                    	            {
                    	            alt27=2;
                    	            }
                    	            break;
                    	        case Bgimage:
                    	            {
                    	            alt27=3;
                    	            }
                    	            break;
                    	    }

                    	    switch (alt27) {
                    	        case 1 :
                    	            // InternalIDSLParser.g:3938:12: (otherlv_5= Bgcolor otherlv_6= Colon ( (lv_bgcolor_7_0= ruleColor ) ) )
                    	            {
                    	            // InternalIDSLParser.g:3938:12: (otherlv_5= Bgcolor otherlv_6= Colon ( (lv_bgcolor_7_0= ruleColor ) ) )
                    	            // InternalIDSLParser.g:3939:13: otherlv_5= Bgcolor otherlv_6= Colon ( (lv_bgcolor_7_0= ruleColor ) )
                    	            {
                    	            otherlv_5=(Token)match(input,Bgcolor,FOLLOW_3); 

                    	            													newLeafNode(otherlv_5, grammarAccess.getFootAccess().getBgcolorKeyword_2_1_0_0_1_0_0());
                    	            												
                    	            otherlv_6=(Token)match(input,Colon,FOLLOW_6); 

                    	            													newLeafNode(otherlv_6, grammarAccess.getFootAccess().getColonKeyword_2_1_0_0_1_0_1());
                    	            												
                    	            // InternalIDSLParser.g:3947:13: ( (lv_bgcolor_7_0= ruleColor ) )
                    	            // InternalIDSLParser.g:3948:14: (lv_bgcolor_7_0= ruleColor )
                    	            {
                    	            // InternalIDSLParser.g:3948:14: (lv_bgcolor_7_0= ruleColor )
                    	            // InternalIDSLParser.g:3949:15: lv_bgcolor_7_0= ruleColor
                    	            {

                    	            															newCompositeNode(grammarAccess.getFootAccess().getBgcolorColorParserRuleCall_2_1_0_0_1_0_2_0());
                    	            														
                    	            pushFollow(FOLLOW_41);
                    	            lv_bgcolor_7_0=ruleColor();

                    	            state._fsp--;


                    	            															if (current==null) {
                    	            																current = createModelElementForParent(grammarAccess.getFootRule());
                    	            															}
                    	            															set(
                    	            																current,
                    	            																"bgcolor",
                    	            																lv_bgcolor_7_0,
                    	            																"org.xtext.example.mydsl.IDSL.Color");
                    	            															afterParserOrEnumRuleCall();
                    	            														

                    	            }


                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalIDSLParser.g:3968:12: (otherlv_8= Bgpattern otherlv_9= Colon ( (lv_bgpattern_10_0= rulePattern ) ) )
                    	            {
                    	            // InternalIDSLParser.g:3968:12: (otherlv_8= Bgpattern otherlv_9= Colon ( (lv_bgpattern_10_0= rulePattern ) ) )
                    	            // InternalIDSLParser.g:3969:13: otherlv_8= Bgpattern otherlv_9= Colon ( (lv_bgpattern_10_0= rulePattern ) )
                    	            {
                    	            otherlv_8=(Token)match(input,Bgpattern,FOLLOW_3); 

                    	            													newLeafNode(otherlv_8, grammarAccess.getFootAccess().getBgpatternKeyword_2_1_0_0_1_1_0());
                    	            												
                    	            otherlv_9=(Token)match(input,Colon,FOLLOW_7); 

                    	            													newLeafNode(otherlv_9, grammarAccess.getFootAccess().getColonKeyword_2_1_0_0_1_1_1());
                    	            												
                    	            // InternalIDSLParser.g:3977:13: ( (lv_bgpattern_10_0= rulePattern ) )
                    	            // InternalIDSLParser.g:3978:14: (lv_bgpattern_10_0= rulePattern )
                    	            {
                    	            // InternalIDSLParser.g:3978:14: (lv_bgpattern_10_0= rulePattern )
                    	            // InternalIDSLParser.g:3979:15: lv_bgpattern_10_0= rulePattern
                    	            {

                    	            															newCompositeNode(grammarAccess.getFootAccess().getBgpatternPatternParserRuleCall_2_1_0_0_1_1_2_0());
                    	            														
                    	            pushFollow(FOLLOW_41);
                    	            lv_bgpattern_10_0=rulePattern();

                    	            state._fsp--;


                    	            															if (current==null) {
                    	            																current = createModelElementForParent(grammarAccess.getFootRule());
                    	            															}
                    	            															set(
                    	            																current,
                    	            																"bgpattern",
                    	            																lv_bgpattern_10_0,
                    	            																"org.xtext.example.mydsl.IDSL.Pattern");
                    	            															afterParserOrEnumRuleCall();
                    	            														

                    	            }


                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 3 :
                    	            // InternalIDSLParser.g:3998:12: (otherlv_11= Bgimage otherlv_12= Colon ( (lv_bgimage_13_0= ruleImageSrc ) ) )
                    	            {
                    	            // InternalIDSLParser.g:3998:12: (otherlv_11= Bgimage otherlv_12= Colon ( (lv_bgimage_13_0= ruleImageSrc ) ) )
                    	            // InternalIDSLParser.g:3999:13: otherlv_11= Bgimage otherlv_12= Colon ( (lv_bgimage_13_0= ruleImageSrc ) )
                    	            {
                    	            otherlv_11=(Token)match(input,Bgimage,FOLLOW_3); 

                    	            													newLeafNode(otherlv_11, grammarAccess.getFootAccess().getBgimageKeyword_2_1_0_0_1_2_0());
                    	            												
                    	            otherlv_12=(Token)match(input,Colon,FOLLOW_8); 

                    	            													newLeafNode(otherlv_12, grammarAccess.getFootAccess().getColonKeyword_2_1_0_0_1_2_1());
                    	            												
                    	            // InternalIDSLParser.g:4007:13: ( (lv_bgimage_13_0= ruleImageSrc ) )
                    	            // InternalIDSLParser.g:4008:14: (lv_bgimage_13_0= ruleImageSrc )
                    	            {
                    	            // InternalIDSLParser.g:4008:14: (lv_bgimage_13_0= ruleImageSrc )
                    	            // InternalIDSLParser.g:4009:15: lv_bgimage_13_0= ruleImageSrc
                    	            {

                    	            															newCompositeNode(grammarAccess.getFootAccess().getBgimageImageSrcParserRuleCall_2_1_0_0_1_2_2_0());
                    	            														
                    	            pushFollow(FOLLOW_41);
                    	            lv_bgimage_13_0=ruleImageSrc();

                    	            state._fsp--;


                    	            															if (current==null) {
                    	            																current = createModelElementForParent(grammarAccess.getFootRule());
                    	            															}
                    	            															set(
                    	            																current,
                    	            																"bgimage",
                    	            																lv_bgimage_13_0,
                    	            																"org.xtext.example.mydsl.IDSL.ImageSrc");
                    	            															afterParserOrEnumRuleCall();
                    	            														

                    	            }


                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }

                    	     
                    	    								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFootAccess().getUnorderedGroup_2_1_0());
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalIDSLParser.g:4034:6: ({...}? => ( ({...}? => (otherlv_14= Position otherlv_15= Colon ( (lv_position_16_0= RULE_SIZE_POS ) ) ) ) ) )
                    	    {
                    	    // InternalIDSLParser.g:4034:6: ({...}? => ( ({...}? => (otherlv_14= Position otherlv_15= Colon ( (lv_position_16_0= RULE_SIZE_POS ) ) ) ) ) )
                    	    // InternalIDSLParser.g:4035:7: {...}? => ( ({...}? => (otherlv_14= Position otherlv_15= Colon ( (lv_position_16_0= RULE_SIZE_POS ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFootAccess().getUnorderedGroup_2_1_0(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleFoot", "getUnorderedGroupHelper().canSelect(grammarAccess.getFootAccess().getUnorderedGroup_2_1_0(), 1)");
                    	    }
                    	    // InternalIDSLParser.g:4035:107: ( ({...}? => (otherlv_14= Position otherlv_15= Colon ( (lv_position_16_0= RULE_SIZE_POS ) ) ) ) )
                    	    // InternalIDSLParser.g:4036:8: ({...}? => (otherlv_14= Position otherlv_15= Colon ( (lv_position_16_0= RULE_SIZE_POS ) ) ) )
                    	    {

                    	    								getUnorderedGroupHelper().select(grammarAccess.getFootAccess().getUnorderedGroup_2_1_0(), 1);
                    	    							
                    	    // InternalIDSLParser.g:4039:11: ({...}? => (otherlv_14= Position otherlv_15= Colon ( (lv_position_16_0= RULE_SIZE_POS ) ) ) )
                    	    // InternalIDSLParser.g:4039:12: {...}? => (otherlv_14= Position otherlv_15= Colon ( (lv_position_16_0= RULE_SIZE_POS ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleFoot", "true");
                    	    }
                    	    // InternalIDSLParser.g:4039:21: (otherlv_14= Position otherlv_15= Colon ( (lv_position_16_0= RULE_SIZE_POS ) ) )
                    	    // InternalIDSLParser.g:4039:22: otherlv_14= Position otherlv_15= Colon ( (lv_position_16_0= RULE_SIZE_POS ) )
                    	    {
                    	    otherlv_14=(Token)match(input,Position,FOLLOW_3); 

                    	    											newLeafNode(otherlv_14, grammarAccess.getFootAccess().getPositionKeyword_2_1_0_1_0());
                    	    										
                    	    otherlv_15=(Token)match(input,Colon,FOLLOW_9); 

                    	    											newLeafNode(otherlv_15, grammarAccess.getFootAccess().getColonKeyword_2_1_0_1_1());
                    	    										
                    	    // InternalIDSLParser.g:4047:11: ( (lv_position_16_0= RULE_SIZE_POS ) )
                    	    // InternalIDSLParser.g:4048:12: (lv_position_16_0= RULE_SIZE_POS )
                    	    {
                    	    // InternalIDSLParser.g:4048:12: (lv_position_16_0= RULE_SIZE_POS )
                    	    // InternalIDSLParser.g:4049:13: lv_position_16_0= RULE_SIZE_POS
                    	    {
                    	    lv_position_16_0=(Token)match(input,RULE_SIZE_POS,FOLLOW_41); 

                    	    													newLeafNode(lv_position_16_0, grammarAccess.getFootAccess().getPositionSIZE_POSTerminalRuleCall_2_1_0_1_2_0());
                    	    												

                    	    													if (current==null) {
                    	    														current = createModelElement(grammarAccess.getFootRule());
                    	    													}
                    	    													setWithLastConsumed(
                    	    														current,
                    	    														"position",
                    	    														lv_position_16_0,
                    	    														"org.xtext.example.mydsl.IDSL.SIZE_POS");
                    	    												

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFootAccess().getUnorderedGroup_2_1_0());
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalIDSLParser.g:4071:6: ({...}? => ( ({...}? => (otherlv_17= Size otherlv_18= Colon ( (lv_size_19_0= RULE_SIZE_POS ) ) ) ) ) )
                    	    {
                    	    // InternalIDSLParser.g:4071:6: ({...}? => ( ({...}? => (otherlv_17= Size otherlv_18= Colon ( (lv_size_19_0= RULE_SIZE_POS ) ) ) ) ) )
                    	    // InternalIDSLParser.g:4072:7: {...}? => ( ({...}? => (otherlv_17= Size otherlv_18= Colon ( (lv_size_19_0= RULE_SIZE_POS ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFootAccess().getUnorderedGroup_2_1_0(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleFoot", "getUnorderedGroupHelper().canSelect(grammarAccess.getFootAccess().getUnorderedGroup_2_1_0(), 2)");
                    	    }
                    	    // InternalIDSLParser.g:4072:107: ( ({...}? => (otherlv_17= Size otherlv_18= Colon ( (lv_size_19_0= RULE_SIZE_POS ) ) ) ) )
                    	    // InternalIDSLParser.g:4073:8: ({...}? => (otherlv_17= Size otherlv_18= Colon ( (lv_size_19_0= RULE_SIZE_POS ) ) ) )
                    	    {

                    	    								getUnorderedGroupHelper().select(grammarAccess.getFootAccess().getUnorderedGroup_2_1_0(), 2);
                    	    							
                    	    // InternalIDSLParser.g:4076:11: ({...}? => (otherlv_17= Size otherlv_18= Colon ( (lv_size_19_0= RULE_SIZE_POS ) ) ) )
                    	    // InternalIDSLParser.g:4076:12: {...}? => (otherlv_17= Size otherlv_18= Colon ( (lv_size_19_0= RULE_SIZE_POS ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleFoot", "true");
                    	    }
                    	    // InternalIDSLParser.g:4076:21: (otherlv_17= Size otherlv_18= Colon ( (lv_size_19_0= RULE_SIZE_POS ) ) )
                    	    // InternalIDSLParser.g:4076:22: otherlv_17= Size otherlv_18= Colon ( (lv_size_19_0= RULE_SIZE_POS ) )
                    	    {
                    	    otherlv_17=(Token)match(input,Size,FOLLOW_3); 

                    	    											newLeafNode(otherlv_17, grammarAccess.getFootAccess().getSizeKeyword_2_1_0_2_0());
                    	    										
                    	    otherlv_18=(Token)match(input,Colon,FOLLOW_9); 

                    	    											newLeafNode(otherlv_18, grammarAccess.getFootAccess().getColonKeyword_2_1_0_2_1());
                    	    										
                    	    // InternalIDSLParser.g:4084:11: ( (lv_size_19_0= RULE_SIZE_POS ) )
                    	    // InternalIDSLParser.g:4085:12: (lv_size_19_0= RULE_SIZE_POS )
                    	    {
                    	    // InternalIDSLParser.g:4085:12: (lv_size_19_0= RULE_SIZE_POS )
                    	    // InternalIDSLParser.g:4086:13: lv_size_19_0= RULE_SIZE_POS
                    	    {
                    	    lv_size_19_0=(Token)match(input,RULE_SIZE_POS,FOLLOW_41); 

                    	    													newLeafNode(lv_size_19_0, grammarAccess.getFootAccess().getSizeSIZE_POSTerminalRuleCall_2_1_0_2_2_0());
                    	    												

                    	    													if (current==null) {
                    	    														current = createModelElement(grammarAccess.getFootRule());
                    	    													}
                    	    													setWithLastConsumed(
                    	    														current,
                    	    														"size",
                    	    														lv_size_19_0,
                    	    														"org.xtext.example.mydsl.IDSL.SIZE_POS");
                    	    												

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFootAccess().getUnorderedGroup_2_1_0());
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // InternalIDSLParser.g:4108:6: ({...}? => ( ({...}? => (otherlv_20= Text otherlv_21= Colon ( (lv_text_22_0= RULE_STRING ) ) ) ) ) )
                    	    {
                    	    // InternalIDSLParser.g:4108:6: ({...}? => ( ({...}? => (otherlv_20= Text otherlv_21= Colon ( (lv_text_22_0= RULE_STRING ) ) ) ) ) )
                    	    // InternalIDSLParser.g:4109:7: {...}? => ( ({...}? => (otherlv_20= Text otherlv_21= Colon ( (lv_text_22_0= RULE_STRING ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFootAccess().getUnorderedGroup_2_1_0(), 3) ) {
                    	        throw new FailedPredicateException(input, "ruleFoot", "getUnorderedGroupHelper().canSelect(grammarAccess.getFootAccess().getUnorderedGroup_2_1_0(), 3)");
                    	    }
                    	    // InternalIDSLParser.g:4109:107: ( ({...}? => (otherlv_20= Text otherlv_21= Colon ( (lv_text_22_0= RULE_STRING ) ) ) ) )
                    	    // InternalIDSLParser.g:4110:8: ({...}? => (otherlv_20= Text otherlv_21= Colon ( (lv_text_22_0= RULE_STRING ) ) ) )
                    	    {

                    	    								getUnorderedGroupHelper().select(grammarAccess.getFootAccess().getUnorderedGroup_2_1_0(), 3);
                    	    							
                    	    // InternalIDSLParser.g:4113:11: ({...}? => (otherlv_20= Text otherlv_21= Colon ( (lv_text_22_0= RULE_STRING ) ) ) )
                    	    // InternalIDSLParser.g:4113:12: {...}? => (otherlv_20= Text otherlv_21= Colon ( (lv_text_22_0= RULE_STRING ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleFoot", "true");
                    	    }
                    	    // InternalIDSLParser.g:4113:21: (otherlv_20= Text otherlv_21= Colon ( (lv_text_22_0= RULE_STRING ) ) )
                    	    // InternalIDSLParser.g:4113:22: otherlv_20= Text otherlv_21= Colon ( (lv_text_22_0= RULE_STRING ) )
                    	    {
                    	    otherlv_20=(Token)match(input,Text,FOLLOW_3); 

                    	    											newLeafNode(otherlv_20, grammarAccess.getFootAccess().getTextKeyword_2_1_0_3_0());
                    	    										
                    	    otherlv_21=(Token)match(input,Colon,FOLLOW_8); 

                    	    											newLeafNode(otherlv_21, grammarAccess.getFootAccess().getColonKeyword_2_1_0_3_1());
                    	    										
                    	    // InternalIDSLParser.g:4121:11: ( (lv_text_22_0= RULE_STRING ) )
                    	    // InternalIDSLParser.g:4122:12: (lv_text_22_0= RULE_STRING )
                    	    {
                    	    // InternalIDSLParser.g:4122:12: (lv_text_22_0= RULE_STRING )
                    	    // InternalIDSLParser.g:4123:13: lv_text_22_0= RULE_STRING
                    	    {
                    	    lv_text_22_0=(Token)match(input,RULE_STRING,FOLLOW_41); 

                    	    													newLeafNode(lv_text_22_0, grammarAccess.getFootAccess().getTextSTRINGTerminalRuleCall_2_1_0_3_2_0());
                    	    												

                    	    													if (current==null) {
                    	    														current = createModelElement(grammarAccess.getFootRule());
                    	    													}
                    	    													setWithLastConsumed(
                    	    														current,
                    	    														"text",
                    	    														lv_text_22_0,
                    	    														"org.eclipse.xtext.common.Terminals.STRING");
                    	    												

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFootAccess().getUnorderedGroup_2_1_0());
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt28 >= 1 ) break loop28;
                                EarlyExitException eee =
                                    new EarlyExitException(28, input);
                                throw eee;
                        }
                        cnt28++;
                    } while (true);

                    if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getFootAccess().getUnorderedGroup_2_1_0()) ) {
                        throw new FailedPredicateException(input, "ruleFoot", "getUnorderedGroupHelper().canLeave(grammarAccess.getFootAccess().getUnorderedGroup_2_1_0())");
                    }

                    }


                    }

                     
                    						  getUnorderedGroupHelper().leave(grammarAccess.getFootAccess().getUnorderedGroup_2_1_0());
                    						

                    }

                    this_END_23=(Token)match(input,RULE_END,FOLLOW_2); 

                    					newLeafNode(this_END_23, grammarAccess.getFootAccess().getENDTerminalRuleCall_2_1_1());
                    				

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
    // $ANTLR end "ruleFoot"


    // $ANTLR start "entryRuleColor"
    // InternalIDSLParser.g:4163:1: entryRuleColor returns [EObject current=null] : iv_ruleColor= ruleColor EOF ;
    public final EObject entryRuleColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColor = null;


        try {
            // InternalIDSLParser.g:4163:46: (iv_ruleColor= ruleColor EOF )
            // InternalIDSLParser.g:4164:2: iv_ruleColor= ruleColor EOF
            {
             newCompositeNode(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColor=ruleColor();

            state._fsp--;

             current =iv_ruleColor; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // InternalIDSLParser.g:4170:1: ruleColor returns [EObject current=null] : ( ( () ( (lv_color_1_0= ruleColor_Basic ) ) ) | ( () this_COLOR_HEX_3= RULE_COLOR_HEX ) ) ;
    public final EObject ruleColor() throws RecognitionException {
        EObject current = null;

        Token this_COLOR_HEX_3=null;
        Enumerator lv_color_1_0 = null;



        	enterRule();

        try {
            // InternalIDSLParser.g:4176:2: ( ( ( () ( (lv_color_1_0= ruleColor_Basic ) ) ) | ( () this_COLOR_HEX_3= RULE_COLOR_HEX ) ) )
            // InternalIDSLParser.g:4177:2: ( ( () ( (lv_color_1_0= ruleColor_Basic ) ) ) | ( () this_COLOR_HEX_3= RULE_COLOR_HEX ) )
            {
            // InternalIDSLParser.g:4177:2: ( ( () ( (lv_color_1_0= ruleColor_Basic ) ) ) | ( () this_COLOR_HEX_3= RULE_COLOR_HEX ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=Orange && LA30_0<=Yellow)||LA30_0==Black||LA30_0==Green||LA30_0==White||LA30_0==Blue||LA30_0==Pink||LA30_0==Red) ) {
                alt30=1;
            }
            else if ( (LA30_0==RULE_COLOR_HEX) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalIDSLParser.g:4178:3: ( () ( (lv_color_1_0= ruleColor_Basic ) ) )
                    {
                    // InternalIDSLParser.g:4178:3: ( () ( (lv_color_1_0= ruleColor_Basic ) ) )
                    // InternalIDSLParser.g:4179:4: () ( (lv_color_1_0= ruleColor_Basic ) )
                    {
                    // InternalIDSLParser.g:4179:4: ()
                    // InternalIDSLParser.g:4180:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getColorAccess().getColorAction_0_0(),
                    						current);
                    				

                    }

                    // InternalIDSLParser.g:4186:4: ( (lv_color_1_0= ruleColor_Basic ) )
                    // InternalIDSLParser.g:4187:5: (lv_color_1_0= ruleColor_Basic )
                    {
                    // InternalIDSLParser.g:4187:5: (lv_color_1_0= ruleColor_Basic )
                    // InternalIDSLParser.g:4188:6: lv_color_1_0= ruleColor_Basic
                    {

                    						newCompositeNode(grammarAccess.getColorAccess().getColorColor_BasicEnumRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_color_1_0=ruleColor_Basic();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColorRule());
                    						}
                    						set(
                    							current,
                    							"color",
                    							lv_color_1_0,
                    							"org.xtext.example.mydsl.IDSL.Color_Basic");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalIDSLParser.g:4207:3: ( () this_COLOR_HEX_3= RULE_COLOR_HEX )
                    {
                    // InternalIDSLParser.g:4207:3: ( () this_COLOR_HEX_3= RULE_COLOR_HEX )
                    // InternalIDSLParser.g:4208:4: () this_COLOR_HEX_3= RULE_COLOR_HEX
                    {
                    // InternalIDSLParser.g:4208:4: ()
                    // InternalIDSLParser.g:4209:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getColorAccess().getColorAction_1_0(),
                    						current);
                    				

                    }

                    this_COLOR_HEX_3=(Token)match(input,RULE_COLOR_HEX,FOLLOW_2); 

                    				newLeafNode(this_COLOR_HEX_3, grammarAccess.getColorAccess().getCOLOR_HEXTerminalRuleCall_1_1());
                    			

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
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRulePattern"
    // InternalIDSLParser.g:4224:1: entryRulePattern returns [String current=null] : iv_rulePattern= rulePattern EOF ;
    public final String entryRulePattern() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePattern = null;


        try {
            // InternalIDSLParser.g:4224:47: (iv_rulePattern= rulePattern EOF )
            // InternalIDSLParser.g:4225:2: iv_rulePattern= rulePattern EOF
            {
             newCompositeNode(grammarAccess.getPatternRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePattern=rulePattern();

            state._fsp--;

             current =iv_rulePattern.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePattern"


    // $ANTLR start "rulePattern"
    // InternalIDSLParser.g:4231:1: rulePattern returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ImageSrc_0= ruleImageSrc | this_PATTERN_DB_1= RULE_PATTERN_DB ) ;
    public final AntlrDatatypeRuleToken rulePattern() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PATTERN_DB_1=null;
        AntlrDatatypeRuleToken this_ImageSrc_0 = null;



        	enterRule();

        try {
            // InternalIDSLParser.g:4237:2: ( (this_ImageSrc_0= ruleImageSrc | this_PATTERN_DB_1= RULE_PATTERN_DB ) )
            // InternalIDSLParser.g:4238:2: (this_ImageSrc_0= ruleImageSrc | this_PATTERN_DB_1= RULE_PATTERN_DB )
            {
            // InternalIDSLParser.g:4238:2: (this_ImageSrc_0= ruleImageSrc | this_PATTERN_DB_1= RULE_PATTERN_DB )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_STRING) ) {
                alt31=1;
            }
            else if ( (LA31_0==RULE_PATTERN_DB) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalIDSLParser.g:4239:3: this_ImageSrc_0= ruleImageSrc
                    {

                    			newCompositeNode(grammarAccess.getPatternAccess().getImageSrcParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ImageSrc_0=ruleImageSrc();

                    state._fsp--;


                    			current.merge(this_ImageSrc_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalIDSLParser.g:4250:3: this_PATTERN_DB_1= RULE_PATTERN_DB
                    {
                    this_PATTERN_DB_1=(Token)match(input,RULE_PATTERN_DB,FOLLOW_2); 

                    			current.merge(this_PATTERN_DB_1);
                    		

                    			newLeafNode(this_PATTERN_DB_1, grammarAccess.getPatternAccess().getPATTERN_DBTerminalRuleCall_1());
                    		

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
    // $ANTLR end "rulePattern"


    // $ANTLR start "entryRuleImageSrc"
    // InternalIDSLParser.g:4261:1: entryRuleImageSrc returns [String current=null] : iv_ruleImageSrc= ruleImageSrc EOF ;
    public final String entryRuleImageSrc() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImageSrc = null;


        try {
            // InternalIDSLParser.g:4261:48: (iv_ruleImageSrc= ruleImageSrc EOF )
            // InternalIDSLParser.g:4262:2: iv_ruleImageSrc= ruleImageSrc EOF
            {
             newCompositeNode(grammarAccess.getImageSrcRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImageSrc=ruleImageSrc();

            state._fsp--;

             current =iv_ruleImageSrc.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImageSrc"


    // $ANTLR start "ruleImageSrc"
    // InternalIDSLParser.g:4268:1: ruleImageSrc returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleImageSrc() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalIDSLParser.g:4274:2: (this_STRING_0= RULE_STRING )
            // InternalIDSLParser.g:4275:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getImageSrcAccess().getSTRINGTerminalRuleCall());
            	

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
    // $ANTLR end "ruleImageSrc"


    // $ANTLR start "entryRuleFONT"
    // InternalIDSLParser.g:4285:1: entryRuleFONT returns [EObject current=null] : iv_ruleFONT= ruleFONT EOF ;
    public final EObject entryRuleFONT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFONT = null;


        try {
            // InternalIDSLParser.g:4285:45: (iv_ruleFONT= ruleFONT EOF )
            // InternalIDSLParser.g:4286:2: iv_ruleFONT= ruleFONT EOF
            {
             newCompositeNode(grammarAccess.getFONTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFONT=ruleFONT();

            state._fsp--;

             current =iv_ruleFONT; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFONT"


    // $ANTLR start "ruleFONT"
    // InternalIDSLParser.g:4292:1: ruleFONT returns [EObject current=null] : ( ( (lv_weight_0_0= ruleFont_Weight ) )? this_FONT_SIZE_1= RULE_FONT_SIZE ( (lv_family_2_0= ruleFont_Family ) ) ) ;
    public final EObject ruleFONT() throws RecognitionException {
        EObject current = null;

        Token this_FONT_SIZE_1=null;
        Enumerator lv_weight_0_0 = null;

        Enumerator lv_family_2_0 = null;



        	enterRule();

        try {
            // InternalIDSLParser.g:4298:2: ( ( ( (lv_weight_0_0= ruleFont_Weight ) )? this_FONT_SIZE_1= RULE_FONT_SIZE ( (lv_family_2_0= ruleFont_Family ) ) ) )
            // InternalIDSLParser.g:4299:2: ( ( (lv_weight_0_0= ruleFont_Weight ) )? this_FONT_SIZE_1= RULE_FONT_SIZE ( (lv_family_2_0= ruleFont_Family ) ) )
            {
            // InternalIDSLParser.g:4299:2: ( ( (lv_weight_0_0= ruleFont_Weight ) )? this_FONT_SIZE_1= RULE_FONT_SIZE ( (lv_family_2_0= ruleFont_Family ) ) )
            // InternalIDSLParser.g:4300:3: ( (lv_weight_0_0= ruleFont_Weight ) )? this_FONT_SIZE_1= RULE_FONT_SIZE ( (lv_family_2_0= ruleFont_Family ) )
            {
            // InternalIDSLParser.g:4300:3: ( (lv_weight_0_0= ruleFont_Weight ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==Bold||(LA32_0>=DigitOneDigitZeroDigitZeroSpace && LA32_0<=DigitNineDigitZeroDigitZeroSpace)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalIDSLParser.g:4301:4: (lv_weight_0_0= ruleFont_Weight )
                    {
                    // InternalIDSLParser.g:4301:4: (lv_weight_0_0= ruleFont_Weight )
                    // InternalIDSLParser.g:4302:5: lv_weight_0_0= ruleFont_Weight
                    {

                    					newCompositeNode(grammarAccess.getFONTAccess().getWeightFont_WeightEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_42);
                    lv_weight_0_0=ruleFont_Weight();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFONTRule());
                    					}
                    					set(
                    						current,
                    						"weight",
                    						lv_weight_0_0,
                    						"org.xtext.example.mydsl.IDSL.Font_Weight");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_FONT_SIZE_1=(Token)match(input,RULE_FONT_SIZE,FOLLOW_43); 

            			newLeafNode(this_FONT_SIZE_1, grammarAccess.getFONTAccess().getFONT_SIZETerminalRuleCall_1());
            		
            // InternalIDSLParser.g:4323:3: ( (lv_family_2_0= ruleFont_Family ) )
            // InternalIDSLParser.g:4324:4: (lv_family_2_0= ruleFont_Family )
            {
            // InternalIDSLParser.g:4324:4: (lv_family_2_0= ruleFont_Family )
            // InternalIDSLParser.g:4325:5: lv_family_2_0= ruleFont_Family
            {

            					newCompositeNode(grammarAccess.getFONTAccess().getFamilyFont_FamilyEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_family_2_0=ruleFont_Family();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFONTRule());
            					}
            					set(
            						current,
            						"family",
            						lv_family_2_0,
            						"org.xtext.example.mydsl.IDSL.Font_Family");
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
    // $ANTLR end "ruleFONT"


    // $ANTLR start "entryRuleChartData"
    // InternalIDSLParser.g:4346:1: entryRuleChartData returns [String current=null] : iv_ruleChartData= ruleChartData EOF ;
    public final String entryRuleChartData() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleChartData = null;


        try {
            // InternalIDSLParser.g:4346:49: (iv_ruleChartData= ruleChartData EOF )
            // InternalIDSLParser.g:4347:2: iv_ruleChartData= ruleChartData EOF
            {
             newCompositeNode(grammarAccess.getChartDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChartData=ruleChartData();

            state._fsp--;

             current =iv_ruleChartData.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleChartData"


    // $ANTLR start "ruleChartData"
    // InternalIDSLParser.g:4353:1: ruleChartData returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING kw= Colon this_STRING_2= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleChartData() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token kw=null;
        Token this_STRING_2=null;


        	enterRule();

        try {
            // InternalIDSLParser.g:4359:2: ( (this_STRING_0= RULE_STRING kw= Colon this_STRING_2= RULE_STRING ) )
            // InternalIDSLParser.g:4360:2: (this_STRING_0= RULE_STRING kw= Colon this_STRING_2= RULE_STRING )
            {
            // InternalIDSLParser.g:4360:2: (this_STRING_0= RULE_STRING kw= Colon this_STRING_2= RULE_STRING )
            // InternalIDSLParser.g:4361:3: this_STRING_0= RULE_STRING kw= Colon this_STRING_2= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_3); 

            			current.merge(this_STRING_0);
            		

            			newLeafNode(this_STRING_0, grammarAccess.getChartDataAccess().getSTRINGTerminalRuleCall_0());
            		
            kw=(Token)match(input,Colon,FOLLOW_8); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getChartDataAccess().getColonKeyword_1());
            		
            this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			current.merge(this_STRING_2);
            		

            			newLeafNode(this_STRING_2, grammarAccess.getChartDataAccess().getSTRINGTerminalRuleCall_2());
            		

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
    // $ANTLR end "ruleChartData"


    // $ANTLR start "ruleColor_Basic"
    // InternalIDSLParser.g:4384:1: ruleColor_Basic returns [Enumerator current=null] : ( (enumLiteral_0= Green ) | (enumLiteral_1= Red ) | (enumLiteral_2= Blue ) | (enumLiteral_3= Yellow ) | (enumLiteral_4= Black ) | (enumLiteral_5= White ) | (enumLiteral_6= Orange ) | (enumLiteral_7= Purple ) | (enumLiteral_8= Pink ) ) ;
    public final Enumerator ruleColor_Basic() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;


        	enterRule();

        try {
            // InternalIDSLParser.g:4390:2: ( ( (enumLiteral_0= Green ) | (enumLiteral_1= Red ) | (enumLiteral_2= Blue ) | (enumLiteral_3= Yellow ) | (enumLiteral_4= Black ) | (enumLiteral_5= White ) | (enumLiteral_6= Orange ) | (enumLiteral_7= Purple ) | (enumLiteral_8= Pink ) ) )
            // InternalIDSLParser.g:4391:2: ( (enumLiteral_0= Green ) | (enumLiteral_1= Red ) | (enumLiteral_2= Blue ) | (enumLiteral_3= Yellow ) | (enumLiteral_4= Black ) | (enumLiteral_5= White ) | (enumLiteral_6= Orange ) | (enumLiteral_7= Purple ) | (enumLiteral_8= Pink ) )
            {
            // InternalIDSLParser.g:4391:2: ( (enumLiteral_0= Green ) | (enumLiteral_1= Red ) | (enumLiteral_2= Blue ) | (enumLiteral_3= Yellow ) | (enumLiteral_4= Black ) | (enumLiteral_5= White ) | (enumLiteral_6= Orange ) | (enumLiteral_7= Purple ) | (enumLiteral_8= Pink ) )
            int alt33=9;
            switch ( input.LA(1) ) {
            case Green:
                {
                alt33=1;
                }
                break;
            case Red:
                {
                alt33=2;
                }
                break;
            case Blue:
                {
                alt33=3;
                }
                break;
            case Yellow:
                {
                alt33=4;
                }
                break;
            case Black:
                {
                alt33=5;
                }
                break;
            case White:
                {
                alt33=6;
                }
                break;
            case Orange:
                {
                alt33=7;
                }
                break;
            case Purple:
                {
                alt33=8;
                }
                break;
            case Pink:
                {
                alt33=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalIDSLParser.g:4392:3: (enumLiteral_0= Green )
                    {
                    // InternalIDSLParser.g:4392:3: (enumLiteral_0= Green )
                    // InternalIDSLParser.g:4393:4: enumLiteral_0= Green
                    {
                    enumLiteral_0=(Token)match(input,Green,FOLLOW_2); 

                    				current = grammarAccess.getColor_BasicAccess().getC1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getColor_BasicAccess().getC1EnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalIDSLParser.g:4400:3: (enumLiteral_1= Red )
                    {
                    // InternalIDSLParser.g:4400:3: (enumLiteral_1= Red )
                    // InternalIDSLParser.g:4401:4: enumLiteral_1= Red
                    {
                    enumLiteral_1=(Token)match(input,Red,FOLLOW_2); 

                    				current = grammarAccess.getColor_BasicAccess().getC2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getColor_BasicAccess().getC2EnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalIDSLParser.g:4408:3: (enumLiteral_2= Blue )
                    {
                    // InternalIDSLParser.g:4408:3: (enumLiteral_2= Blue )
                    // InternalIDSLParser.g:4409:4: enumLiteral_2= Blue
                    {
                    enumLiteral_2=(Token)match(input,Blue,FOLLOW_2); 

                    				current = grammarAccess.getColor_BasicAccess().getC3EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getColor_BasicAccess().getC3EnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalIDSLParser.g:4416:3: (enumLiteral_3= Yellow )
                    {
                    // InternalIDSLParser.g:4416:3: (enumLiteral_3= Yellow )
                    // InternalIDSLParser.g:4417:4: enumLiteral_3= Yellow
                    {
                    enumLiteral_3=(Token)match(input,Yellow,FOLLOW_2); 

                    				current = grammarAccess.getColor_BasicAccess().getC4EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getColor_BasicAccess().getC4EnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalIDSLParser.g:4424:3: (enumLiteral_4= Black )
                    {
                    // InternalIDSLParser.g:4424:3: (enumLiteral_4= Black )
                    // InternalIDSLParser.g:4425:4: enumLiteral_4= Black
                    {
                    enumLiteral_4=(Token)match(input,Black,FOLLOW_2); 

                    				current = grammarAccess.getColor_BasicAccess().getC5EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getColor_BasicAccess().getC5EnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalIDSLParser.g:4432:3: (enumLiteral_5= White )
                    {
                    // InternalIDSLParser.g:4432:3: (enumLiteral_5= White )
                    // InternalIDSLParser.g:4433:4: enumLiteral_5= White
                    {
                    enumLiteral_5=(Token)match(input,White,FOLLOW_2); 

                    				current = grammarAccess.getColor_BasicAccess().getC6EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getColor_BasicAccess().getC6EnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalIDSLParser.g:4440:3: (enumLiteral_6= Orange )
                    {
                    // InternalIDSLParser.g:4440:3: (enumLiteral_6= Orange )
                    // InternalIDSLParser.g:4441:4: enumLiteral_6= Orange
                    {
                    enumLiteral_6=(Token)match(input,Orange,FOLLOW_2); 

                    				current = grammarAccess.getColor_BasicAccess().getC7EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getColor_BasicAccess().getC7EnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalIDSLParser.g:4448:3: (enumLiteral_7= Purple )
                    {
                    // InternalIDSLParser.g:4448:3: (enumLiteral_7= Purple )
                    // InternalIDSLParser.g:4449:4: enumLiteral_7= Purple
                    {
                    enumLiteral_7=(Token)match(input,Purple,FOLLOW_2); 

                    				current = grammarAccess.getColor_BasicAccess().getC8EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getColor_BasicAccess().getC8EnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalIDSLParser.g:4456:3: (enumLiteral_8= Pink )
                    {
                    // InternalIDSLParser.g:4456:3: (enumLiteral_8= Pink )
                    // InternalIDSLParser.g:4457:4: enumLiteral_8= Pink
                    {
                    enumLiteral_8=(Token)match(input,Pink,FOLLOW_2); 

                    				current = grammarAccess.getColor_BasicAccess().getC9EnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getColor_BasicAccess().getC9EnumLiteralDeclaration_8());
                    			

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
    // $ANTLR end "ruleColor_Basic"


    // $ANTLR start "ruleFont_Weight"
    // InternalIDSLParser.g:4467:1: ruleFont_Weight returns [Enumerator current=null] : ( (enumLiteral_0= Bold ) | (enumLiteral_1= DigitOneDigitZeroDigitZeroSpace ) | (enumLiteral_2= DigitTwoDigitZeroDigitZeroSpace ) | (enumLiteral_3= DigitThreeDigitZeroDigitZeroSpace ) | (enumLiteral_4= DigitFourDigitZeroDigitZeroSpace ) | (enumLiteral_5= DigitFiveDigitZeroDigitZeroSpace ) | (enumLiteral_6= DigitSixDigitZeroDigitZeroSpace ) | (enumLiteral_7= DigitSevenDigitZeroDigitZeroSpace ) | (enumLiteral_8= DigitEightDigitZeroDigitZeroSpace ) | (enumLiteral_9= DigitNineDigitZeroDigitZeroSpace ) ) ;
    public final Enumerator ruleFont_Weight() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;


        	enterRule();

        try {
            // InternalIDSLParser.g:4473:2: ( ( (enumLiteral_0= Bold ) | (enumLiteral_1= DigitOneDigitZeroDigitZeroSpace ) | (enumLiteral_2= DigitTwoDigitZeroDigitZeroSpace ) | (enumLiteral_3= DigitThreeDigitZeroDigitZeroSpace ) | (enumLiteral_4= DigitFourDigitZeroDigitZeroSpace ) | (enumLiteral_5= DigitFiveDigitZeroDigitZeroSpace ) | (enumLiteral_6= DigitSixDigitZeroDigitZeroSpace ) | (enumLiteral_7= DigitSevenDigitZeroDigitZeroSpace ) | (enumLiteral_8= DigitEightDigitZeroDigitZeroSpace ) | (enumLiteral_9= DigitNineDigitZeroDigitZeroSpace ) ) )
            // InternalIDSLParser.g:4474:2: ( (enumLiteral_0= Bold ) | (enumLiteral_1= DigitOneDigitZeroDigitZeroSpace ) | (enumLiteral_2= DigitTwoDigitZeroDigitZeroSpace ) | (enumLiteral_3= DigitThreeDigitZeroDigitZeroSpace ) | (enumLiteral_4= DigitFourDigitZeroDigitZeroSpace ) | (enumLiteral_5= DigitFiveDigitZeroDigitZeroSpace ) | (enumLiteral_6= DigitSixDigitZeroDigitZeroSpace ) | (enumLiteral_7= DigitSevenDigitZeroDigitZeroSpace ) | (enumLiteral_8= DigitEightDigitZeroDigitZeroSpace ) | (enumLiteral_9= DigitNineDigitZeroDigitZeroSpace ) )
            {
            // InternalIDSLParser.g:4474:2: ( (enumLiteral_0= Bold ) | (enumLiteral_1= DigitOneDigitZeroDigitZeroSpace ) | (enumLiteral_2= DigitTwoDigitZeroDigitZeroSpace ) | (enumLiteral_3= DigitThreeDigitZeroDigitZeroSpace ) | (enumLiteral_4= DigitFourDigitZeroDigitZeroSpace ) | (enumLiteral_5= DigitFiveDigitZeroDigitZeroSpace ) | (enumLiteral_6= DigitSixDigitZeroDigitZeroSpace ) | (enumLiteral_7= DigitSevenDigitZeroDigitZeroSpace ) | (enumLiteral_8= DigitEightDigitZeroDigitZeroSpace ) | (enumLiteral_9= DigitNineDigitZeroDigitZeroSpace ) )
            int alt34=10;
            switch ( input.LA(1) ) {
            case Bold:
                {
                alt34=1;
                }
                break;
            case DigitOneDigitZeroDigitZeroSpace:
                {
                alt34=2;
                }
                break;
            case DigitTwoDigitZeroDigitZeroSpace:
                {
                alt34=3;
                }
                break;
            case DigitThreeDigitZeroDigitZeroSpace:
                {
                alt34=4;
                }
                break;
            case DigitFourDigitZeroDigitZeroSpace:
                {
                alt34=5;
                }
                break;
            case DigitFiveDigitZeroDigitZeroSpace:
                {
                alt34=6;
                }
                break;
            case DigitSixDigitZeroDigitZeroSpace:
                {
                alt34=7;
                }
                break;
            case DigitSevenDigitZeroDigitZeroSpace:
                {
                alt34=8;
                }
                break;
            case DigitEightDigitZeroDigitZeroSpace:
                {
                alt34=9;
                }
                break;
            case DigitNineDigitZeroDigitZeroSpace:
                {
                alt34=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalIDSLParser.g:4475:3: (enumLiteral_0= Bold )
                    {
                    // InternalIDSLParser.g:4475:3: (enumLiteral_0= Bold )
                    // InternalIDSLParser.g:4476:4: enumLiteral_0= Bold
                    {
                    enumLiteral_0=(Token)match(input,Bold,FOLLOW_2); 

                    				current = grammarAccess.getFont_WeightAccess().getB1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFont_WeightAccess().getB1EnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalIDSLParser.g:4483:3: (enumLiteral_1= DigitOneDigitZeroDigitZeroSpace )
                    {
                    // InternalIDSLParser.g:4483:3: (enumLiteral_1= DigitOneDigitZeroDigitZeroSpace )
                    // InternalIDSLParser.g:4484:4: enumLiteral_1= DigitOneDigitZeroDigitZeroSpace
                    {
                    enumLiteral_1=(Token)match(input,DigitOneDigitZeroDigitZeroSpace,FOLLOW_2); 

                    				current = grammarAccess.getFont_WeightAccess().getB2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFont_WeightAccess().getB2EnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalIDSLParser.g:4491:3: (enumLiteral_2= DigitTwoDigitZeroDigitZeroSpace )
                    {
                    // InternalIDSLParser.g:4491:3: (enumLiteral_2= DigitTwoDigitZeroDigitZeroSpace )
                    // InternalIDSLParser.g:4492:4: enumLiteral_2= DigitTwoDigitZeroDigitZeroSpace
                    {
                    enumLiteral_2=(Token)match(input,DigitTwoDigitZeroDigitZeroSpace,FOLLOW_2); 

                    				current = grammarAccess.getFont_WeightAccess().getB3EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getFont_WeightAccess().getB3EnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalIDSLParser.g:4499:3: (enumLiteral_3= DigitThreeDigitZeroDigitZeroSpace )
                    {
                    // InternalIDSLParser.g:4499:3: (enumLiteral_3= DigitThreeDigitZeroDigitZeroSpace )
                    // InternalIDSLParser.g:4500:4: enumLiteral_3= DigitThreeDigitZeroDigitZeroSpace
                    {
                    enumLiteral_3=(Token)match(input,DigitThreeDigitZeroDigitZeroSpace,FOLLOW_2); 

                    				current = grammarAccess.getFont_WeightAccess().getB4EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getFont_WeightAccess().getB4EnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalIDSLParser.g:4507:3: (enumLiteral_4= DigitFourDigitZeroDigitZeroSpace )
                    {
                    // InternalIDSLParser.g:4507:3: (enumLiteral_4= DigitFourDigitZeroDigitZeroSpace )
                    // InternalIDSLParser.g:4508:4: enumLiteral_4= DigitFourDigitZeroDigitZeroSpace
                    {
                    enumLiteral_4=(Token)match(input,DigitFourDigitZeroDigitZeroSpace,FOLLOW_2); 

                    				current = grammarAccess.getFont_WeightAccess().getB5EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getFont_WeightAccess().getB5EnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalIDSLParser.g:4515:3: (enumLiteral_5= DigitFiveDigitZeroDigitZeroSpace )
                    {
                    // InternalIDSLParser.g:4515:3: (enumLiteral_5= DigitFiveDigitZeroDigitZeroSpace )
                    // InternalIDSLParser.g:4516:4: enumLiteral_5= DigitFiveDigitZeroDigitZeroSpace
                    {
                    enumLiteral_5=(Token)match(input,DigitFiveDigitZeroDigitZeroSpace,FOLLOW_2); 

                    				current = grammarAccess.getFont_WeightAccess().getB6EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getFont_WeightAccess().getB6EnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalIDSLParser.g:4523:3: (enumLiteral_6= DigitSixDigitZeroDigitZeroSpace )
                    {
                    // InternalIDSLParser.g:4523:3: (enumLiteral_6= DigitSixDigitZeroDigitZeroSpace )
                    // InternalIDSLParser.g:4524:4: enumLiteral_6= DigitSixDigitZeroDigitZeroSpace
                    {
                    enumLiteral_6=(Token)match(input,DigitSixDigitZeroDigitZeroSpace,FOLLOW_2); 

                    				current = grammarAccess.getFont_WeightAccess().getB7EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getFont_WeightAccess().getB7EnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalIDSLParser.g:4531:3: (enumLiteral_7= DigitSevenDigitZeroDigitZeroSpace )
                    {
                    // InternalIDSLParser.g:4531:3: (enumLiteral_7= DigitSevenDigitZeroDigitZeroSpace )
                    // InternalIDSLParser.g:4532:4: enumLiteral_7= DigitSevenDigitZeroDigitZeroSpace
                    {
                    enumLiteral_7=(Token)match(input,DigitSevenDigitZeroDigitZeroSpace,FOLLOW_2); 

                    				current = grammarAccess.getFont_WeightAccess().getB8EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getFont_WeightAccess().getB8EnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalIDSLParser.g:4539:3: (enumLiteral_8= DigitEightDigitZeroDigitZeroSpace )
                    {
                    // InternalIDSLParser.g:4539:3: (enumLiteral_8= DigitEightDigitZeroDigitZeroSpace )
                    // InternalIDSLParser.g:4540:4: enumLiteral_8= DigitEightDigitZeroDigitZeroSpace
                    {
                    enumLiteral_8=(Token)match(input,DigitEightDigitZeroDigitZeroSpace,FOLLOW_2); 

                    				current = grammarAccess.getFont_WeightAccess().getB9EnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getFont_WeightAccess().getB9EnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalIDSLParser.g:4547:3: (enumLiteral_9= DigitNineDigitZeroDigitZeroSpace )
                    {
                    // InternalIDSLParser.g:4547:3: (enumLiteral_9= DigitNineDigitZeroDigitZeroSpace )
                    // InternalIDSLParser.g:4548:4: enumLiteral_9= DigitNineDigitZeroDigitZeroSpace
                    {
                    enumLiteral_9=(Token)match(input,DigitNineDigitZeroDigitZeroSpace,FOLLOW_2); 

                    				current = grammarAccess.getFont_WeightAccess().getB10EnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getFont_WeightAccess().getB10EnumLiteralDeclaration_9());
                    			

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
    // $ANTLR end "ruleFont_Weight"


    // $ANTLR start "ruleFont_Family"
    // InternalIDSLParser.g:4558:1: ruleFont_Family returns [Enumerator current=null] : ( (enumLiteral_0= Arial ) | (enumLiteral_1= Verdana ) | (enumLiteral_2= TimesNewRoman ) | (enumLiteral_3= SansSerif ) | (enumLiteral_4= Gotham ) ) ;
    public final Enumerator ruleFont_Family() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalIDSLParser.g:4564:2: ( ( (enumLiteral_0= Arial ) | (enumLiteral_1= Verdana ) | (enumLiteral_2= TimesNewRoman ) | (enumLiteral_3= SansSerif ) | (enumLiteral_4= Gotham ) ) )
            // InternalIDSLParser.g:4565:2: ( (enumLiteral_0= Arial ) | (enumLiteral_1= Verdana ) | (enumLiteral_2= TimesNewRoman ) | (enumLiteral_3= SansSerif ) | (enumLiteral_4= Gotham ) )
            {
            // InternalIDSLParser.g:4565:2: ( (enumLiteral_0= Arial ) | (enumLiteral_1= Verdana ) | (enumLiteral_2= TimesNewRoman ) | (enumLiteral_3= SansSerif ) | (enumLiteral_4= Gotham ) )
            int alt35=5;
            switch ( input.LA(1) ) {
            case Arial:
                {
                alt35=1;
                }
                break;
            case Verdana:
                {
                alt35=2;
                }
                break;
            case TimesNewRoman:
                {
                alt35=3;
                }
                break;
            case SansSerif:
                {
                alt35=4;
                }
                break;
            case Gotham:
                {
                alt35=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalIDSLParser.g:4566:3: (enumLiteral_0= Arial )
                    {
                    // InternalIDSLParser.g:4566:3: (enumLiteral_0= Arial )
                    // InternalIDSLParser.g:4567:4: enumLiteral_0= Arial
                    {
                    enumLiteral_0=(Token)match(input,Arial,FOLLOW_2); 

                    				current = grammarAccess.getFont_FamilyAccess().getFont1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFont_FamilyAccess().getFont1EnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalIDSLParser.g:4574:3: (enumLiteral_1= Verdana )
                    {
                    // InternalIDSLParser.g:4574:3: (enumLiteral_1= Verdana )
                    // InternalIDSLParser.g:4575:4: enumLiteral_1= Verdana
                    {
                    enumLiteral_1=(Token)match(input,Verdana,FOLLOW_2); 

                    				current = grammarAccess.getFont_FamilyAccess().getFont2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFont_FamilyAccess().getFont2EnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalIDSLParser.g:4582:3: (enumLiteral_2= TimesNewRoman )
                    {
                    // InternalIDSLParser.g:4582:3: (enumLiteral_2= TimesNewRoman )
                    // InternalIDSLParser.g:4583:4: enumLiteral_2= TimesNewRoman
                    {
                    enumLiteral_2=(Token)match(input,TimesNewRoman,FOLLOW_2); 

                    				current = grammarAccess.getFont_FamilyAccess().getFont3EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getFont_FamilyAccess().getFont3EnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalIDSLParser.g:4590:3: (enumLiteral_3= SansSerif )
                    {
                    // InternalIDSLParser.g:4590:3: (enumLiteral_3= SansSerif )
                    // InternalIDSLParser.g:4591:4: enumLiteral_3= SansSerif
                    {
                    enumLiteral_3=(Token)match(input,SansSerif,FOLLOW_2); 

                    				current = grammarAccess.getFont_FamilyAccess().getFont4EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getFont_FamilyAccess().getFont4EnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalIDSLParser.g:4598:3: (enumLiteral_4= Gotham )
                    {
                    // InternalIDSLParser.g:4598:3: (enumLiteral_4= Gotham )
                    // InternalIDSLParser.g:4599:4: enumLiteral_4= Gotham
                    {
                    enumLiteral_4=(Token)match(input,Gotham,FOLLOW_2); 

                    				current = grammarAccess.getFont_FamilyAccess().getFont5EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getFont_FamilyAccess().getFont5EnumLiteralDeclaration_4());
                    			

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
    // $ANTLR end "ruleFont_Family"


    // $ANTLR start "ruleAlignPossibilities"
    // InternalIDSLParser.g:4609:1: ruleAlignPossibilities returns [Enumerator current=null] : ( (enumLiteral_0= Left ) | (enumLiteral_1= Right ) | (enumLiteral_2= Center ) ) ;
    public final Enumerator ruleAlignPossibilities() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalIDSLParser.g:4615:2: ( ( (enumLiteral_0= Left ) | (enumLiteral_1= Right ) | (enumLiteral_2= Center ) ) )
            // InternalIDSLParser.g:4616:2: ( (enumLiteral_0= Left ) | (enumLiteral_1= Right ) | (enumLiteral_2= Center ) )
            {
            // InternalIDSLParser.g:4616:2: ( (enumLiteral_0= Left ) | (enumLiteral_1= Right ) | (enumLiteral_2= Center ) )
            int alt36=3;
            switch ( input.LA(1) ) {
            case Left:
                {
                alt36=1;
                }
                break;
            case Right:
                {
                alt36=2;
                }
                break;
            case Center:
                {
                alt36=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalIDSLParser.g:4617:3: (enumLiteral_0= Left )
                    {
                    // InternalIDSLParser.g:4617:3: (enumLiteral_0= Left )
                    // InternalIDSLParser.g:4618:4: enumLiteral_0= Left
                    {
                    enumLiteral_0=(Token)match(input,Left,FOLLOW_2); 

                    				current = grammarAccess.getAlignPossibilitiesAccess().getLeftEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAlignPossibilitiesAccess().getLeftEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalIDSLParser.g:4625:3: (enumLiteral_1= Right )
                    {
                    // InternalIDSLParser.g:4625:3: (enumLiteral_1= Right )
                    // InternalIDSLParser.g:4626:4: enumLiteral_1= Right
                    {
                    enumLiteral_1=(Token)match(input,Right,FOLLOW_2); 

                    				current = grammarAccess.getAlignPossibilitiesAccess().getRightEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAlignPossibilitiesAccess().getRightEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalIDSLParser.g:4633:3: (enumLiteral_2= Center )
                    {
                    // InternalIDSLParser.g:4633:3: (enumLiteral_2= Center )
                    // InternalIDSLParser.g:4634:4: enumLiteral_2= Center
                    {
                    enumLiteral_2=(Token)match(input,Center,FOLLOW_2); 

                    				current = grammarAccess.getAlignPossibilitiesAccess().getCenterEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getAlignPossibilitiesAccess().getCenterEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleAlignPossibilities"


    // $ANTLR start "ruleLegendStyle"
    // InternalIDSLParser.g:4644:1: ruleLegendStyle returns [Enumerator current=null] : ( (enumLiteral_0= DigitOne ) | (enumLiteral_1= DigitTwo ) ) ;
    public final Enumerator ruleLegendStyle() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalIDSLParser.g:4650:2: ( ( (enumLiteral_0= DigitOne ) | (enumLiteral_1= DigitTwo ) ) )
            // InternalIDSLParser.g:4651:2: ( (enumLiteral_0= DigitOne ) | (enumLiteral_1= DigitTwo ) )
            {
            // InternalIDSLParser.g:4651:2: ( (enumLiteral_0= DigitOne ) | (enumLiteral_1= DigitTwo ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==DigitOne) ) {
                alt37=1;
            }
            else if ( (LA37_0==DigitTwo) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalIDSLParser.g:4652:3: (enumLiteral_0= DigitOne )
                    {
                    // InternalIDSLParser.g:4652:3: (enumLiteral_0= DigitOne )
                    // InternalIDSLParser.g:4653:4: enumLiteral_0= DigitOne
                    {
                    enumLiteral_0=(Token)match(input,DigitOne,FOLLOW_2); 

                    				current = grammarAccess.getLegendStyleAccess().getLegend1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLegendStyleAccess().getLegend1EnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalIDSLParser.g:4660:3: (enumLiteral_1= DigitTwo )
                    {
                    // InternalIDSLParser.g:4660:3: (enumLiteral_1= DigitTwo )
                    // InternalIDSLParser.g:4661:4: enumLiteral_1= DigitTwo
                    {
                    enumLiteral_1=(Token)match(input,DigitTwo,FOLLOW_2); 

                    				current = grammarAccess.getLegendStyleAccess().getLegend2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLegendStyleAccess().getLegend2EnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleLegendStyle"


    // $ANTLR start "ruleShowOptionsOff"
    // InternalIDSLParser.g:4671:1: ruleShowOptionsOff returns [Enumerator current=null] : ( (enumLiteral_0= Off ) | (enumLiteral_1= N ) ) ;
    public final Enumerator ruleShowOptionsOff() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalIDSLParser.g:4677:2: ( ( (enumLiteral_0= Off ) | (enumLiteral_1= N ) ) )
            // InternalIDSLParser.g:4678:2: ( (enumLiteral_0= Off ) | (enumLiteral_1= N ) )
            {
            // InternalIDSLParser.g:4678:2: ( (enumLiteral_0= Off ) | (enumLiteral_1= N ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==Off) ) {
                alt38=1;
            }
            else if ( (LA38_0==N) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalIDSLParser.g:4679:3: (enumLiteral_0= Off )
                    {
                    // InternalIDSLParser.g:4679:3: (enumLiteral_0= Off )
                    // InternalIDSLParser.g:4680:4: enumLiteral_0= Off
                    {
                    enumLiteral_0=(Token)match(input,Off,FOLLOW_2); 

                    				current = grammarAccess.getShowOptionsOffAccess().getShow1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getShowOptionsOffAccess().getShow1EnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalIDSLParser.g:4687:3: (enumLiteral_1= N )
                    {
                    // InternalIDSLParser.g:4687:3: (enumLiteral_1= N )
                    // InternalIDSLParser.g:4688:4: enumLiteral_1= N
                    {
                    enumLiteral_1=(Token)match(input,N,FOLLOW_2); 

                    				current = grammarAccess.getShowOptionsOffAccess().getShow2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getShowOptionsOffAccess().getShow2EnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleShowOptionsOff"


    // $ANTLR start "rulePieType"
    // InternalIDSLParser.g:4698:1: rulePieType returns [Enumerator current=null] : ( (enumLiteral_0= Pie ) | (enumLiteral_1= Donut ) ) ;
    public final Enumerator rulePieType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalIDSLParser.g:4704:2: ( ( (enumLiteral_0= Pie ) | (enumLiteral_1= Donut ) ) )
            // InternalIDSLParser.g:4705:2: ( (enumLiteral_0= Pie ) | (enumLiteral_1= Donut ) )
            {
            // InternalIDSLParser.g:4705:2: ( (enumLiteral_0= Pie ) | (enumLiteral_1= Donut ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==Pie) ) {
                alt39=1;
            }
            else if ( (LA39_0==Donut) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalIDSLParser.g:4706:3: (enumLiteral_0= Pie )
                    {
                    // InternalIDSLParser.g:4706:3: (enumLiteral_0= Pie )
                    // InternalIDSLParser.g:4707:4: enumLiteral_0= Pie
                    {
                    enumLiteral_0=(Token)match(input,Pie,FOLLOW_2); 

                    				current = grammarAccess.getPieTypeAccess().getType1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPieTypeAccess().getType1EnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalIDSLParser.g:4714:3: (enumLiteral_1= Donut )
                    {
                    // InternalIDSLParser.g:4714:3: (enumLiteral_1= Donut )
                    // InternalIDSLParser.g:4715:4: enumLiteral_1= Donut
                    {
                    enumLiteral_1=(Token)match(input,Donut,FOLLOW_2); 

                    				current = grammarAccess.getPieTypeAccess().getType2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPieTypeAccess().getType2EnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "rulePieType"


    // $ANTLR start "ruleBarType"
    // InternalIDSLParser.g:4725:1: ruleBarType returns [Enumerator current=null] : ( (enumLiteral_0= Horizontal ) | (enumLiteral_1= Vertical ) ) ;
    public final Enumerator ruleBarType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalIDSLParser.g:4731:2: ( ( (enumLiteral_0= Horizontal ) | (enumLiteral_1= Vertical ) ) )
            // InternalIDSLParser.g:4732:2: ( (enumLiteral_0= Horizontal ) | (enumLiteral_1= Vertical ) )
            {
            // InternalIDSLParser.g:4732:2: ( (enumLiteral_0= Horizontal ) | (enumLiteral_1= Vertical ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==Horizontal) ) {
                alt40=1;
            }
            else if ( (LA40_0==Vertical) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalIDSLParser.g:4733:3: (enumLiteral_0= Horizontal )
                    {
                    // InternalIDSLParser.g:4733:3: (enumLiteral_0= Horizontal )
                    // InternalIDSLParser.g:4734:4: enumLiteral_0= Horizontal
                    {
                    enumLiteral_0=(Token)match(input,Horizontal,FOLLOW_2); 

                    				current = grammarAccess.getBarTypeAccess().getType1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBarTypeAccess().getType1EnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalIDSLParser.g:4741:3: (enumLiteral_1= Vertical )
                    {
                    // InternalIDSLParser.g:4741:3: (enumLiteral_1= Vertical )
                    // InternalIDSLParser.g:4742:4: enumLiteral_1= Vertical
                    {
                    enumLiteral_1=(Token)match(input,Vertical,FOLLOW_2); 

                    				current = grammarAccess.getBarTypeAccess().getType2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBarTypeAccess().getType2EnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleBarType"


    // $ANTLR start "rulePicturegraphType"
    // InternalIDSLParser.g:4752:1: rulePicturegraphType returns [Enumerator current=null] : ( (enumLiteral_0= Bin ) | (enumLiteral_1= Electric ) ) ;
    public final Enumerator rulePicturegraphType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalIDSLParser.g:4758:2: ( ( (enumLiteral_0= Bin ) | (enumLiteral_1= Electric ) ) )
            // InternalIDSLParser.g:4759:2: ( (enumLiteral_0= Bin ) | (enumLiteral_1= Electric ) )
            {
            // InternalIDSLParser.g:4759:2: ( (enumLiteral_0= Bin ) | (enumLiteral_1= Electric ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==Bin) ) {
                alt41=1;
            }
            else if ( (LA41_0==Electric) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalIDSLParser.g:4760:3: (enumLiteral_0= Bin )
                    {
                    // InternalIDSLParser.g:4760:3: (enumLiteral_0= Bin )
                    // InternalIDSLParser.g:4761:4: enumLiteral_0= Bin
                    {
                    enumLiteral_0=(Token)match(input,Bin,FOLLOW_2); 

                    				current = grammarAccess.getPicturegraphTypeAccess().getType1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPicturegraphTypeAccess().getType1EnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalIDSLParser.g:4768:3: (enumLiteral_1= Electric )
                    {
                    // InternalIDSLParser.g:4768:3: (enumLiteral_1= Electric )
                    // InternalIDSLParser.g:4769:4: enumLiteral_1= Electric
                    {
                    enumLiteral_1=(Token)match(input,Electric,FOLLOW_2); 

                    				current = grammarAccess.getPicturegraphTypeAccess().getType2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPicturegraphTypeAccess().getType2EnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "rulePicturegraphType"

    // Delegated rules


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA26 dfa26 = new DFA26(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\1\14\uffff";
    static final String dfa_3s = "\1\13\14\uffff";
    static final String dfa_4s = "\1\125\14\uffff";
    static final String dfa_5s = "\1\uffff\1\14\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String dfa_6s = "\1\0\14\uffff}>";
    static final String[] dfa_7s = {
            "\1\3\11\uffff\2\3\2\uffff\1\4\36\uffff\1\14\1\5\5\uffff\1\2\17\uffff\1\6\2\7\1\10\1\11\1\12\1\13",
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

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()+ loopback of 103:5: ( ({...}? => ( ({...}? => (otherlv_1= Type otherlv_2= Colon ( (lv_type_3_0= Basic ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_bgcolor_6_0= ruleColor ) ) ) | (otherlv_7= Bgpattern otherlv_8= Colon ( (lv_bgpattern_9_0= rulePattern ) ) ) | (otherlv_10= Bgimage otherlv_11= Colon ( (lv_bgimage_12_0= ruleImageSrc ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Bgsize otherlv_14= Colon ( (lv_bgsize_15_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_head_16_0= ruleHead ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_boxes_17_0= ruleBox ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_texts_18_0= ruleText ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_images_19_0= ruleImage ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_piecharts_20_0= rulePiechart ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_barcharts_21_0= ruleBarchart ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_picturegraphs_22_0= rulePicturegraph ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_foot_23_0= ruleFoot ) ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA8_0 = input.LA(1);

                         
                        int index8_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA8_0==EOF) ) {s = 1;}

                        else if ( LA8_0 == Type && getUnorderedGroupHelper().canSelect(grammarAccess.getInfographicElementTypeAccess().getUnorderedGroup(), 0) ) {s = 2;}

                        else if ( ( LA8_0 == Bgpattern || LA8_0 >= Bgcolor && LA8_0 <= Bgimage ) && getUnorderedGroupHelper().canSelect(grammarAccess.getInfographicElementTypeAccess().getUnorderedGroup(), 1) ) {s = 3;}

                        else if ( LA8_0 == Bgsize && getUnorderedGroupHelper().canSelect(grammarAccess.getInfographicElementTypeAccess().getUnorderedGroup(), 2) ) {s = 4;}

                        else if ( LA8_0 == Head && getUnorderedGroupHelper().canSelect(grammarAccess.getInfographicElementTypeAccess().getUnorderedGroup(), 3) ) {s = 5;}

                        else if ( LA8_0 == RULE_BOXID && getUnorderedGroupHelper().canSelect(grammarAccess.getInfographicElementTypeAccess().getUnorderedGroup(), 4) ) {s = 6;}

                        else if ( LA8_0 >= RULE_TEXTID && LA8_0 <= RULE_TITLETEXTID && getUnorderedGroupHelper().canSelect(grammarAccess.getInfographicElementTypeAccess().getUnorderedGroup(), 5) ) {s = 7;}

                        else if ( LA8_0 == RULE_IMAGEID && getUnorderedGroupHelper().canSelect(grammarAccess.getInfographicElementTypeAccess().getUnorderedGroup(), 6) ) {s = 8;}

                        else if ( LA8_0 == RULE_PIECHARTID && getUnorderedGroupHelper().canSelect(grammarAccess.getInfographicElementTypeAccess().getUnorderedGroup(), 7) ) {s = 9;}

                        else if ( LA8_0 == RULE_BARCHARTID && getUnorderedGroupHelper().canSelect(grammarAccess.getInfographicElementTypeAccess().getUnorderedGroup(), 8) ) {s = 10;}

                        else if ( LA8_0 == RULE_PICTUREGRAPHID && getUnorderedGroupHelper().canSelect(grammarAccess.getInfographicElementTypeAccess().getUnorderedGroup(), 9) ) {s = 11;}

                        else if ( LA8_0 == Foot && getUnorderedGroupHelper().canSelect(grammarAccess.getInfographicElementTypeAccess().getUnorderedGroup(), 10) ) {s = 12;}

                         
                        input.seek(index8_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 8, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\16\uffff";
    static final String dfa_9s = "\1\5\15\uffff";
    static final String dfa_10s = "\1\127\15\uffff";
    static final String dfa_11s = "\1\uffff\1\15\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14";
    static final String dfa_12s = "\1\0\15\uffff}>";
    static final String[] dfa_13s = {
            "\1\12\1\5\3\uffff\1\10\2\uffff\1\11\2\uffff\1\7\4\uffff\1\2\1\uffff\1\6\3\uffff\1\3\15\uffff\1\14\14\uffff\1\4\6\uffff\1\13\1\uffff\1\15\27\uffff\1\1",
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
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "()+ loopback of 2340:6: ( ({...}? => ( ({...}? => (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_piedata_14_0= ruleChartData ) )* this_END_15= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Legendstyle otherlv_17= Colon ( (lv_legendstyle_18_0= ruleLegendStyle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Padding otherlv_20= Colon ( (lv_padding_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Position otherlv_23= Colon ( (lv_position_24_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Showlegend otherlv_26= Colon ( (lv_showlegend_27_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= Showtitle otherlv_29= Colon ( (lv_showtitle_30_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Showpercentage otherlv_32= Colon ( (lv_showpercentage_33_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= Size otherlv_35= Colon ( (lv_size_36_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Title otherlv_38= Colon ( (lv_title_39_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= Type otherlv_41= Colon ( (lv_type_42_0= rulePieType ) ) ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_0 = input.LA(1);

                         
                        int index22_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA22_0==RULE_END) ) {s = 1;}

                        else if ( LA22_0 == Bgcolor && getUnorderedGroupHelper().canSelect(grammarAccess.getPiechartAccess().getUnorderedGroup_3(), 0) ) {s = 2;}

                        else if ( LA22_0 == Colors && getUnorderedGroupHelper().canSelect(grammarAccess.getPiechartAccess().getUnorderedGroup_3(), 1) ) {s = 3;}

                        else if ( LA22_0 == Data && getUnorderedGroupHelper().canSelect(grammarAccess.getPiechartAccess().getUnorderedGroup_3(), 2) ) {s = 4;}

                        else if ( LA22_0 == Legendstyle && getUnorderedGroupHelper().canSelect(grammarAccess.getPiechartAccess().getUnorderedGroup_3(), 3) ) {s = 5;}

                        else if ( LA22_0 == Padding && getUnorderedGroupHelper().canSelect(grammarAccess.getPiechartAccess().getUnorderedGroup_3(), 4) ) {s = 6;}

                        else if ( LA22_0 == Position && getUnorderedGroupHelper().canSelect(grammarAccess.getPiechartAccess().getUnorderedGroup_3(), 5) ) {s = 7;}

                        else if ( LA22_0 == Showlegend && getUnorderedGroupHelper().canSelect(grammarAccess.getPiechartAccess().getUnorderedGroup_3(), 6) ) {s = 8;}

                        else if ( LA22_0 == Showtitle && getUnorderedGroupHelper().canSelect(grammarAccess.getPiechartAccess().getUnorderedGroup_3(), 7) ) {s = 9;}

                        else if ( LA22_0 == Showpercentage && getUnorderedGroupHelper().canSelect(grammarAccess.getPiechartAccess().getUnorderedGroup_3(), 8) ) {s = 10;}

                        else if ( LA22_0 == Size && getUnorderedGroupHelper().canSelect(grammarAccess.getPiechartAccess().getUnorderedGroup_3(), 9) ) {s = 11;}

                        else if ( LA22_0 == Title && getUnorderedGroupHelper().canSelect(grammarAccess.getPiechartAccess().getUnorderedGroup_3(), 10) ) {s = 12;}

                        else if ( LA22_0 == Type && getUnorderedGroupHelper().canSelect(grammarAccess.getPiechartAccess().getUnorderedGroup_3(), 11) ) {s = 13;}

                         
                        input.seek(index22_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_14s = "\17\uffff";
    static final String dfa_15s = "\1\6\16\uffff";
    static final String dfa_16s = "\1\127\16\uffff";
    static final String dfa_17s = "\1\uffff\1\16\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15";
    static final String dfa_18s = "\1\0\16\uffff}>";
    static final String[] dfa_19s = {
            "\1\6\3\uffff\1\12\1\uffff\1\5\1\13\2\uffff\1\10\1\11\3\uffff\1\2\1\uffff\1\7\3\uffff\1\3\15\uffff\1\15\14\uffff\1\4\6\uffff\1\14\1\uffff\1\16\27\uffff\1\1",
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
            "",
            "",
            ""
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = dfa_14;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "()+ loopback of 2870:6: ( ({...}? => ( ({...}? => (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_bardata_14_0= ruleChartData ) )* this_END_15= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Gridscale otherlv_17= Colon ( (lv_gridscale_18_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Legendstyle otherlv_20= Colon ( (lv_legendstyle_21_0= ruleLegendStyle ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Padding otherlv_23= Colon ( (lv_padding_24_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Position otherlv_26= Colon ( (lv_position_27_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= Showgrid otherlv_29= Colon ( (lv_showgrid_30_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Showlegend otherlv_32= Colon ( (lv_showlegend_33_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= Showtitle otherlv_35= Colon ( (lv_showtitle_36_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Size otherlv_38= Colon ( (lv_size_39_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= Title otherlv_41= Colon ( (lv_title_42_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= Type otherlv_44= Colon ( (lv_type_45_0= ruleBarType ) ) ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA24_0 = input.LA(1);

                         
                        int index24_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_0==RULE_END) ) {s = 1;}

                        else if ( LA24_0 == Bgcolor && getUnorderedGroupHelper().canSelect(grammarAccess.getBarchartAccess().getUnorderedGroup_3(), 0) ) {s = 2;}

                        else if ( LA24_0 == Colors && getUnorderedGroupHelper().canSelect(grammarAccess.getBarchartAccess().getUnorderedGroup_3(), 1) ) {s = 3;}

                        else if ( LA24_0 == Data && getUnorderedGroupHelper().canSelect(grammarAccess.getBarchartAccess().getUnorderedGroup_3(), 2) ) {s = 4;}

                        else if ( LA24_0 == Gridscale && getUnorderedGroupHelper().canSelect(grammarAccess.getBarchartAccess().getUnorderedGroup_3(), 3) ) {s = 5;}

                        else if ( LA24_0 == Legendstyle && getUnorderedGroupHelper().canSelect(grammarAccess.getBarchartAccess().getUnorderedGroup_3(), 4) ) {s = 6;}

                        else if ( LA24_0 == Padding && getUnorderedGroupHelper().canSelect(grammarAccess.getBarchartAccess().getUnorderedGroup_3(), 5) ) {s = 7;}

                        else if ( LA24_0 == Position && getUnorderedGroupHelper().canSelect(grammarAccess.getBarchartAccess().getUnorderedGroup_3(), 6) ) {s = 8;}

                        else if ( LA24_0 == Showgrid && getUnorderedGroupHelper().canSelect(grammarAccess.getBarchartAccess().getUnorderedGroup_3(), 7) ) {s = 9;}

                        else if ( LA24_0 == Showlegend && getUnorderedGroupHelper().canSelect(grammarAccess.getBarchartAccess().getUnorderedGroup_3(), 8) ) {s = 10;}

                        else if ( LA24_0 == Showtitle && getUnorderedGroupHelper().canSelect(grammarAccess.getBarchartAccess().getUnorderedGroup_3(), 9) ) {s = 11;}

                        else if ( LA24_0 == Size && getUnorderedGroupHelper().canSelect(grammarAccess.getBarchartAccess().getUnorderedGroup_3(), 10) ) {s = 12;}

                        else if ( LA24_0 == Title && getUnorderedGroupHelper().canSelect(grammarAccess.getBarchartAccess().getUnorderedGroup_3(), 11) ) {s = 13;}

                        else if ( LA24_0 == Type && getUnorderedGroupHelper().canSelect(grammarAccess.getBarchartAccess().getUnorderedGroup_3(), 12) ) {s = 14;}

                         
                        input.seek(index24_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 24, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_20s = "\1\12\14\uffff";
    static final String dfa_21s = "\1\127\14\uffff";
    static final String[] dfa_22s = {
            "\1\10\2\uffff\1\11\2\uffff\1\7\4\uffff\1\2\1\uffff\1\6\3\uffff\1\3\13\uffff\1\5\1\uffff\1\13\14\uffff\1\4\6\uffff\1\12\1\uffff\1\14\27\uffff\1\1",
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
    static final char[] dfa_20 = DFA.unpackEncodedStringToUnsignedChars(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final short[][] dfa_22 = unpackEncodedStringArray(dfa_22s);

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_20;
            this.max = dfa_21;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_22;
        }
        public String getDescription() {
            return "()+ loopback of 3437:6: ( ({...}? => ( ({...}? => (otherlv_4= Bgcolor otherlv_5= Colon ( (lv_color_6_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Colors otherlv_8= Colon ( (lv_colors_9_0= RULE_COLOR_CHARTS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Data otherlv_11= Colon this_BEGIN_12= RULE_BEGIN ruleChartData ( (lv_picturegraphdata_14_0= ruleChartData ) )* this_END_15= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Label otherlv_17= Colon ( (lv_label_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Padding otherlv_20= Colon ( (lv_padding_21_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Position otherlv_23= Colon ( (lv_position_24_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Showlegend otherlv_26= Colon ( (lv_showlegend_27_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= Showtitle otherlv_29= Colon ( (lv_showtitle_30_0= ruleShowOptionsOff ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Size otherlv_32= Colon ( (lv_size_33_0= RULE_SIZE_POS ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= Title otherlv_35= Colon ( (lv_title_36_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Type otherlv_38= Colon ( (lv_type_39_0= rulePicturegraphType ) ) ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_0 = input.LA(1);

                         
                        int index26_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA26_0==RULE_END) ) {s = 1;}

                        else if ( LA26_0 == Bgcolor && getUnorderedGroupHelper().canSelect(grammarAccess.getPicturegraphAccess().getUnorderedGroup_3(), 0) ) {s = 2;}

                        else if ( LA26_0 == Colors && getUnorderedGroupHelper().canSelect(grammarAccess.getPicturegraphAccess().getUnorderedGroup_3(), 1) ) {s = 3;}

                        else if ( LA26_0 == Data && getUnorderedGroupHelper().canSelect(grammarAccess.getPicturegraphAccess().getUnorderedGroup_3(), 2) ) {s = 4;}

                        else if ( LA26_0 == Label && getUnorderedGroupHelper().canSelect(grammarAccess.getPicturegraphAccess().getUnorderedGroup_3(), 3) ) {s = 5;}

                        else if ( LA26_0 == Padding && getUnorderedGroupHelper().canSelect(grammarAccess.getPicturegraphAccess().getUnorderedGroup_3(), 4) ) {s = 6;}

                        else if ( LA26_0 == Position && getUnorderedGroupHelper().canSelect(grammarAccess.getPicturegraphAccess().getUnorderedGroup_3(), 5) ) {s = 7;}

                        else if ( LA26_0 == Showlegend && getUnorderedGroupHelper().canSelect(grammarAccess.getPicturegraphAccess().getUnorderedGroup_3(), 6) ) {s = 8;}

                        else if ( LA26_0 == Showtitle && getUnorderedGroupHelper().canSelect(grammarAccess.getPicturegraphAccess().getUnorderedGroup_3(), 7) ) {s = 9;}

                        else if ( LA26_0 == Size && getUnorderedGroupHelper().canSelect(grammarAccess.getPicturegraphAccess().getUnorderedGroup_3(), 8) ) {s = 10;}

                        else if ( LA26_0 == Title && getUnorderedGroupHelper().canSelect(grammarAccess.getPicturegraphAccess().getUnorderedGroup_3(), 9) ) {s = 11;}

                        else if ( LA26_0 == Type && getUnorderedGroupHelper().canSelect(grammarAccess.getPicturegraphAccess().getUnorderedGroup_3(), 10) ) {s = 12;}

                         
                        input.seek(index26_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 26, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x8300000002600802L,0x00000000003F8000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x1020084470000000L,0x0000000000000808L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000000L,0x0000000002002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x2800020000650800L,0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0080041100018000L,0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0400010004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x001FF00800000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x2000000000010000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x2000000000010000L,0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x2000000000610800L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x2000000000610800L,0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0080041100018100L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0080041100018100L,0x0000000000800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0080041100018000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x2000000000010000L,0x0000000000000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x2000000000010000L,0x0000000000800010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0xA040020008A12460L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0xA040020008A12460L,0x0000000000800000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000002800000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000102L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0xA040020008A33440L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0xA040020008A33440L,0x0000000000800000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000080080L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0xA040028008A12400L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0xA040028008A12400L,0x0000000000800000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000001L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x6000000000010000L,0x0000000000400002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x6000000000610800L,0x0000000000C00000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x6000000000010000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000081100210L});

}
