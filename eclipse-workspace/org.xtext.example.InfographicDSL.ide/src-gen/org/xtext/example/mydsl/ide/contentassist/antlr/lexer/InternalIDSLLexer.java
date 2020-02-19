package org.xtext.example.mydsl.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalIDSLLexer extends Lexer {
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

    public InternalIDSLLexer() {;} 
    public InternalIDSLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalIDSLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalIDSLLexer.g"; }

    // $ANTLR start "TimesNewRoman"
    public final void mTimesNewRoman() throws RecognitionException {
        try {
            int _type = TimesNewRoman;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:14:15: ( 'Times New Roman' )
            // InternalIDSLLexer.g:14:17: 'Times New Roman'
            {
            match("Times New Roman"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TimesNewRoman"

    // $ANTLR start "Showpercentage"
    public final void mShowpercentage() throws RecognitionException {
        try {
            int _type = Showpercentage;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:16:16: ( 'showpercentage' )
            // InternalIDSLLexer.g:16:18: 'showpercentage'
            {
            match("showpercentage"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Showpercentage"

    // $ANTLR start "Legendstyle"
    public final void mLegendstyle() throws RecognitionException {
        try {
            int _type = Legendstyle;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:18:13: ( 'legendstyle' )
            // InternalIDSLLexer.g:18:15: 'legendstyle'
            {
            match("legendstyle"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Legendstyle"

    // $ANTLR start "Horizontal"
    public final void mHorizontal() throws RecognitionException {
        try {
            int _type = Horizontal;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:20:12: ( 'horizontal' )
            // InternalIDSLLexer.g:20:14: 'horizontal'
            {
            match("horizontal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Horizontal"

    // $ANTLR start "Lineheight"
    public final void mLineheight() throws RecognitionException {
        try {
            int _type = Lineheight;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:22:12: ( 'lineheight' )
            // InternalIDSLLexer.g:22:14: 'lineheight'
            {
            match("lineheight"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Lineheight"

    // $ANTLR start "SansSerif"
    public final void mSansSerif() throws RecognitionException {
        try {
            int _type = SansSerif;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:24:11: ( 'sans-serif' )
            // InternalIDSLLexer.g:24:13: 'sans-serif'
            {
            match("sans-serif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SansSerif"

    // $ANTLR start "Showlegend"
    public final void mShowlegend() throws RecognitionException {
        try {
            int _type = Showlegend;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:26:12: ( 'showlegend' )
            // InternalIDSLLexer.g:26:14: 'showlegend'
            {
            match("showlegend"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Showlegend"

    // $ANTLR start "Bgpattern"
    public final void mBgpattern() throws RecognitionException {
        try {
            int _type = Bgpattern;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:28:11: ( 'bgpattern' )
            // InternalIDSLLexer.g:28:13: 'bgpattern'
            {
            match("bgpattern"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Bgpattern"

    // $ANTLR start "Gridscale"
    public final void mGridscale() throws RecognitionException {
        try {
            int _type = Gridscale;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:30:11: ( 'gridscale' )
            // InternalIDSLLexer.g:30:13: 'gridscale'
            {
            match("gridscale"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Gridscale"

    // $ANTLR start "Showtitle"
    public final void mShowtitle() throws RecognitionException {
        try {
            int _type = Showtitle;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:32:11: ( 'showtitle' )
            // InternalIDSLLexer.g:32:13: 'showtitle'
            {
            match("showtitle"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Showtitle"

    // $ANTLR start "Electric"
    public final void mElectric() throws RecognitionException {
        try {
            int _type = Electric;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:34:10: ( 'electric' )
            // InternalIDSLLexer.g:34:12: 'electric'
            {
            match("electric"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Electric"

    // $ANTLR start "Maxwidth"
    public final void mMaxwidth() throws RecognitionException {
        try {
            int _type = Maxwidth;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:36:10: ( 'maxwidth' )
            // InternalIDSLLexer.g:36:12: 'maxwidth'
            {
            match("maxwidth"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Maxwidth"

    // $ANTLR start "Position"
    public final void mPosition() throws RecognitionException {
        try {
            int _type = Position;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:38:10: ( 'position' )
            // InternalIDSLLexer.g:38:12: 'position'
            {
            match("position"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Position"

    // $ANTLR start "Showgrid"
    public final void mShowgrid() throws RecognitionException {
        try {
            int _type = Showgrid;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:40:10: ( 'showgrid' )
            // InternalIDSLLexer.g:40:12: 'showgrid'
            {
            match("showgrid"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Showgrid"

    // $ANTLR start "Subtitle"
    public final void mSubtitle() throws RecognitionException {
        try {
            int _type = Subtitle;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:42:10: ( 'subtitle' )
            // InternalIDSLLexer.g:42:12: 'subtitle'
            {
            match("subtitle"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Subtitle"

    // $ANTLR start "Vertical"
    public final void mVertical() throws RecognitionException {
        try {
            int _type = Vertical;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:44:10: ( 'vertical' )
            // InternalIDSLLexer.g:44:12: 'vertical'
            {
            match("vertical"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Vertical"

    // $ANTLR start "Verdana"
    public final void mVerdana() throws RecognitionException {
        try {
            int _type = Verdana;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:46:9: ( 'Verdana' )
            // InternalIDSLLexer.g:46:11: 'Verdana'
            {
            match("Verdana"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Verdana"

    // $ANTLR start "Bgcolor"
    public final void mBgcolor() throws RecognitionException {
        try {
            int _type = Bgcolor;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:48:9: ( 'bgcolor' )
            // InternalIDSLLexer.g:48:11: 'bgcolor'
            {
            match("bgcolor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Bgcolor"

    // $ANTLR start "Bgimage"
    public final void mBgimage() throws RecognitionException {
        try {
            int _type = Bgimage;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:50:9: ( 'bgimage' )
            // InternalIDSLLexer.g:50:11: 'bgimage'
            {
            match("bgimage"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Bgimage"

    // $ANTLR start "Padding"
    public final void mPadding() throws RecognitionException {
        try {
            int _type = Padding;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:52:9: ( 'padding' )
            // InternalIDSLLexer.g:52:11: 'padding'
            {
            match("padding"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Padding"

    // $ANTLR start "Gotham"
    public final void mGotham() throws RecognitionException {
        try {
            int _type = Gotham;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:54:8: ( 'Gotham' )
            // InternalIDSLLexer.g:54:10: 'Gotham'
            {
            match("Gotham"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Gotham"

    // $ANTLR start "Bgsize"
    public final void mBgsize() throws RecognitionException {
        try {
            int _type = Bgsize;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:56:8: ( 'bgsize' )
            // InternalIDSLLexer.g:56:10: 'bgsize'
            {
            match("bgsize"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Bgsize"

    // $ANTLR start "Center"
    public final void mCenter() throws RecognitionException {
        try {
            int _type = Center;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:58:8: ( 'center' )
            // InternalIDSLLexer.g:58:10: 'center'
            {
            match("center"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Center"

    // $ANTLR start "Colors"
    public final void mColors() throws RecognitionException {
        try {
            int _type = Colors;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:60:8: ( 'colors' )
            // InternalIDSLLexer.g:60:10: 'colors'
            {
            match("colors"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Colors"

    // $ANTLR start "Orange"
    public final void mOrange() throws RecognitionException {
        try {
            int _type = Orange;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:62:8: ( 'orange' )
            // InternalIDSLLexer.g:62:10: 'orange'
            {
            match("orange"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Orange"

    // $ANTLR start "Purple"
    public final void mPurple() throws RecognitionException {
        try {
            int _type = Purple;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:64:8: ( 'purple' )
            // InternalIDSLLexer.g:64:10: 'purple'
            {
            match("purple"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Purple"

    // $ANTLR start "Yellow"
    public final void mYellow() throws RecognitionException {
        try {
            int _type = Yellow;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:66:8: ( 'yellow' )
            // InternalIDSLLexer.g:66:10: 'yellow'
            {
            match("yellow"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Yellow"

    // $ANTLR start "Arial"
    public final void mArial() throws RecognitionException {
        try {
            int _type = Arial;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:68:7: ( 'Arial' )
            // InternalIDSLLexer.g:68:9: 'Arial'
            {
            match("Arial"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Arial"

    // $ANTLR start "Align"
    public final void mAlign() throws RecognitionException {
        try {
            int _type = Align;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:70:7: ( 'align' )
            // InternalIDSLLexer.g:70:9: 'align'
            {
            match("align"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Align"

    // $ANTLR start "Basic"
    public final void mBasic() throws RecognitionException {
        try {
            int _type = Basic;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:72:7: ( 'basic' )
            // InternalIDSLLexer.g:72:9: 'basic'
            {
            match("basic"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Basic"

    // $ANTLR start "Black"
    public final void mBlack() throws RecognitionException {
        try {
            int _type = Black;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:74:7: ( 'black' )
            // InternalIDSLLexer.g:74:9: 'black'
            {
            match("black"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Black"

    // $ANTLR start "Bold"
    public final void mBold() throws RecognitionException {
        try {
            int _type = Bold;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:76:6: ( 'bold ' )
            // InternalIDSLLexer.g:76:8: 'bold '
            {
            match("bold "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Bold"

    // $ANTLR start "Color"
    public final void mColor() throws RecognitionException {
        try {
            int _type = Color;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:78:7: ( 'color' )
            // InternalIDSLLexer.g:78:9: 'color'
            {
            match("color"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Color"

    // $ANTLR start "Donut"
    public final void mDonut() throws RecognitionException {
        try {
            int _type = Donut;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:80:7: ( 'donut' )
            // InternalIDSLLexer.g:80:9: 'donut'
            {
            match("donut"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Donut"

    // $ANTLR start "Green"
    public final void mGreen() throws RecognitionException {
        try {
            int _type = Green;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:82:7: ( 'green' )
            // InternalIDSLLexer.g:82:9: 'green'
            {
            match("green"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Green"

    // $ANTLR start "Label"
    public final void mLabel() throws RecognitionException {
        try {
            int _type = Label;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:84:7: ( 'label' )
            // InternalIDSLLexer.g:84:9: 'label'
            {
            match("label"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Label"

    // $ANTLR start "Right"
    public final void mRight() throws RecognitionException {
        try {
            int _type = Right;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:86:7: ( 'right' )
            // InternalIDSLLexer.g:86:9: 'right'
            {
            match("right"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Right"

    // $ANTLR start "Title"
    public final void mTitle() throws RecognitionException {
        try {
            int _type = Title;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:88:7: ( 'title' )
            // InternalIDSLLexer.g:88:9: 'title'
            {
            match("title"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Title"

    // $ANTLR start "Value"
    public final void mValue() throws RecognitionException {
        try {
            int _type = Value;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:90:7: ( 'value' )
            // InternalIDSLLexer.g:90:9: 'value'
            {
            match("value"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Value"

    // $ANTLR start "White"
    public final void mWhite() throws RecognitionException {
        try {
            int _type = White;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:92:7: ( 'white' )
            // InternalIDSLLexer.g:92:9: 'white'
            {
            match("white"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "White"

    // $ANTLR start "DigitOneDigitZeroDigitZeroSpace"
    public final void mDigitOneDigitZeroDigitZeroSpace() throws RecognitionException {
        try {
            int _type = DigitOneDigitZeroDigitZeroSpace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:94:33: ( '100 ' )
            // InternalIDSLLexer.g:94:35: '100 '
            {
            match("100 "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DigitOneDigitZeroDigitZeroSpace"

    // $ANTLR start "DigitTwoDigitZeroDigitZeroSpace"
    public final void mDigitTwoDigitZeroDigitZeroSpace() throws RecognitionException {
        try {
            int _type = DigitTwoDigitZeroDigitZeroSpace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:96:33: ( '200 ' )
            // InternalIDSLLexer.g:96:35: '200 '
            {
            match("200 "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DigitTwoDigitZeroDigitZeroSpace"

    // $ANTLR start "DigitThreeDigitZeroDigitZeroSpace"
    public final void mDigitThreeDigitZeroDigitZeroSpace() throws RecognitionException {
        try {
            int _type = DigitThreeDigitZeroDigitZeroSpace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:98:35: ( '300 ' )
            // InternalIDSLLexer.g:98:37: '300 '
            {
            match("300 "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DigitThreeDigitZeroDigitZeroSpace"

    // $ANTLR start "DigitFourDigitZeroDigitZeroSpace"
    public final void mDigitFourDigitZeroDigitZeroSpace() throws RecognitionException {
        try {
            int _type = DigitFourDigitZeroDigitZeroSpace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:100:34: ( '400 ' )
            // InternalIDSLLexer.g:100:36: '400 '
            {
            match("400 "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DigitFourDigitZeroDigitZeroSpace"

    // $ANTLR start "DigitFiveDigitZeroDigitZeroSpace"
    public final void mDigitFiveDigitZeroDigitZeroSpace() throws RecognitionException {
        try {
            int _type = DigitFiveDigitZeroDigitZeroSpace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:102:34: ( '500 ' )
            // InternalIDSLLexer.g:102:36: '500 '
            {
            match("500 "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DigitFiveDigitZeroDigitZeroSpace"

    // $ANTLR start "DigitSixDigitZeroDigitZeroSpace"
    public final void mDigitSixDigitZeroDigitZeroSpace() throws RecognitionException {
        try {
            int _type = DigitSixDigitZeroDigitZeroSpace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:104:33: ( '600 ' )
            // InternalIDSLLexer.g:104:35: '600 '
            {
            match("600 "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DigitSixDigitZeroDigitZeroSpace"

    // $ANTLR start "DigitSevenDigitZeroDigitZeroSpace"
    public final void mDigitSevenDigitZeroDigitZeroSpace() throws RecognitionException {
        try {
            int _type = DigitSevenDigitZeroDigitZeroSpace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:106:35: ( '700 ' )
            // InternalIDSLLexer.g:106:37: '700 '
            {
            match("700 "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DigitSevenDigitZeroDigitZeroSpace"

    // $ANTLR start "DigitEightDigitZeroDigitZeroSpace"
    public final void mDigitEightDigitZeroDigitZeroSpace() throws RecognitionException {
        try {
            int _type = DigitEightDigitZeroDigitZeroSpace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:108:35: ( '800 ' )
            // InternalIDSLLexer.g:108:37: '800 '
            {
            match("800 "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DigitEightDigitZeroDigitZeroSpace"

    // $ANTLR start "DigitNineDigitZeroDigitZeroSpace"
    public final void mDigitNineDigitZeroDigitZeroSpace() throws RecognitionException {
        try {
            int _type = DigitNineDigitZeroDigitZeroSpace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:110:34: ( '900 ' )
            // InternalIDSLLexer.g:110:36: '900 '
            {
            match("900 "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DigitNineDigitZeroDigitZeroSpace"

    // $ANTLR start "Blue"
    public final void mBlue() throws RecognitionException {
        try {
            int _type = Blue;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:112:6: ( 'blue' )
            // InternalIDSLLexer.g:112:8: 'blue'
            {
            match("blue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Blue"

    // $ANTLR start "Data"
    public final void mData() throws RecognitionException {
        try {
            int _type = Data;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:114:6: ( 'data' )
            // InternalIDSLLexer.g:114:8: 'data'
            {
            match("data"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Data"

    // $ANTLR start "Font"
    public final void mFont() throws RecognitionException {
        try {
            int _type = Font;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:116:6: ( 'font' )
            // InternalIDSLLexer.g:116:8: 'font'
            {
            match("font"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Font"

    // $ANTLR start "Foot"
    public final void mFoot() throws RecognitionException {
        try {
            int _type = Foot;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:118:6: ( 'foot' )
            // InternalIDSLLexer.g:118:8: 'foot'
            {
            match("foot"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Foot"

    // $ANTLR start "Head"
    public final void mHead() throws RecognitionException {
        try {
            int _type = Head;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:120:6: ( 'head' )
            // InternalIDSLLexer.g:120:8: 'head'
            {
            match("head"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Head"

    // $ANTLR start "Left"
    public final void mLeft() throws RecognitionException {
        try {
            int _type = Left;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:122:6: ( 'left' )
            // InternalIDSLLexer.g:122:8: 'left'
            {
            match("left"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Left"

    // $ANTLR start "Logo"
    public final void mLogo() throws RecognitionException {
        try {
            int _type = Logo;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:124:6: ( 'logo' )
            // InternalIDSLLexer.g:124:8: 'logo'
            {
            match("logo"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Logo"

    // $ANTLR start "Pink"
    public final void mPink() throws RecognitionException {
        try {
            int _type = Pink;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:126:6: ( 'pink' )
            // InternalIDSLLexer.g:126:8: 'pink'
            {
            match("pink"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Pink"

    // $ANTLR start "Size"
    public final void mSize() throws RecognitionException {
        try {
            int _type = Size;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:128:6: ( 'size' )
            // InternalIDSLLexer.g:128:8: 'size'
            {
            match("size"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Size"

    // $ANTLR start "Text"
    public final void mText() throws RecognitionException {
        try {
            int _type = Text;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:130:6: ( 'text' )
            // InternalIDSLLexer.g:130:8: 'text'
            {
            match("text"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Text"

    // $ANTLR start "Type"
    public final void mType() throws RecognitionException {
        try {
            int _type = Type;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:132:6: ( 'type' )
            // InternalIDSLLexer.g:132:8: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Type"

    // $ANTLR start "Bin"
    public final void mBin() throws RecognitionException {
        try {
            int _type = Bin;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:134:5: ( 'bin' )
            // InternalIDSLLexer.g:134:7: 'bin'
            {
            match("bin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Bin"

    // $ANTLR start "Off"
    public final void mOff() throws RecognitionException {
        try {
            int _type = Off;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:136:5: ( 'off' )
            // InternalIDSLLexer.g:136:7: 'off'
            {
            match("off"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Off"

    // $ANTLR start "Pie"
    public final void mPie() throws RecognitionException {
        try {
            int _type = Pie;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:138:5: ( 'pie' )
            // InternalIDSLLexer.g:138:7: 'pie'
            {
            match("pie"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Pie"

    // $ANTLR start "Red"
    public final void mRed() throws RecognitionException {
        try {
            int _type = Red;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:140:5: ( 'red' )
            // InternalIDSLLexer.g:140:7: 'red'
            {
            match("red"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Red"

    // $ANTLR start "Src"
    public final void mSrc() throws RecognitionException {
        try {
            int _type = Src;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:142:5: ( 'src' )
            // InternalIDSLLexer.g:142:7: 'src'
            {
            match("src"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Src"

    // $ANTLR start "DigitOne"
    public final void mDigitOne() throws RecognitionException {
        try {
            int _type = DigitOne;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:144:10: ( '1' )
            // InternalIDSLLexer.g:144:12: '1'
            {
            match('1'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DigitOne"

    // $ANTLR start "DigitTwo"
    public final void mDigitTwo() throws RecognitionException {
        try {
            int _type = DigitTwo;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:146:10: ( '2' )
            // InternalIDSLLexer.g:146:12: '2'
            {
            match('2'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DigitTwo"

    // $ANTLR start "Colon"
    public final void mColon() throws RecognitionException {
        try {
            int _type = Colon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:148:7: ( ':' )
            // InternalIDSLLexer.g:148:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Colon"

    // $ANTLR start "N"
    public final void mN() throws RecognitionException {
        try {
            int _type = N;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:150:3: ( 'n' )
            // InternalIDSLLexer.g:150:5: 'n'
            {
            match('n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "N"

    // $ANTLR start "RULE_SIZE_POS"
    public final void mRULE_SIZE_POS() throws RecognitionException {
        try {
            int _type = RULE_SIZE_POS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:152:15: ( RULE_INT 'x' RULE_INT )
            // InternalIDSLLexer.g:152:17: RULE_INT 'x' RULE_INT
            {
            mRULE_INT(); 
            match('x'); 
            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SIZE_POS"

    // $ANTLR start "RULE_COLOR_HEX"
    public final void mRULE_COLOR_HEX() throws RecognitionException {
        try {
            int _type = RULE_COLOR_HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:154:16: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // InternalIDSLLexer.g:154:18: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COLOR_HEX"

    // $ANTLR start "RULE_COLOR_CHARTS"
    public final void mRULE_COLOR_CHARTS() throws RecognitionException {
        try {
            int _type = RULE_COLOR_CHARTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:156:19: ( ( RULE_COLOR_HEX ',' )* RULE_COLOR_HEX )
            // InternalIDSLLexer.g:156:21: ( RULE_COLOR_HEX ',' )* RULE_COLOR_HEX
            {
            // InternalIDSLLexer.g:156:21: ( RULE_COLOR_HEX ',' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='F')||(LA1_0>='a' && LA1_0<='f')) ) {
                    int LA1_1 = input.LA(2);

                    if ( ((LA1_1>='0' && LA1_1<='9')||(LA1_1>='A' && LA1_1<='F')||(LA1_1>='a' && LA1_1<='f')) ) {
                        int LA1_2 = input.LA(3);

                        if ( ((LA1_2>='0' && LA1_2<='9')||(LA1_2>='A' && LA1_2<='F')||(LA1_2>='a' && LA1_2<='f')) ) {
                            int LA1_3 = input.LA(4);

                            if ( ((LA1_3>='0' && LA1_3<='9')||(LA1_3>='A' && LA1_3<='F')||(LA1_3>='a' && LA1_3<='f')) ) {
                                int LA1_4 = input.LA(5);

                                if ( ((LA1_4>='0' && LA1_4<='9')||(LA1_4>='A' && LA1_4<='F')||(LA1_4>='a' && LA1_4<='f')) ) {
                                    int LA1_5 = input.LA(6);

                                    if ( ((LA1_5>='0' && LA1_5<='9')||(LA1_5>='A' && LA1_5<='F')||(LA1_5>='a' && LA1_5<='f')) ) {
                                        int LA1_6 = input.LA(7);

                                        if ( (LA1_6==',') ) {
                                            alt1=1;
                                        }


                                    }


                                }


                            }


                        }


                    }


                }


                switch (alt1) {
            	case 1 :
            	    // InternalIDSLLexer.g:156:22: RULE_COLOR_HEX ','
            	    {
            	    mRULE_COLOR_HEX(); 
            	    match(','); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            mRULE_COLOR_HEX(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COLOR_CHARTS"

    // $ANTLR start "RULE_PATTERN_DB"
    public final void mRULE_PATTERN_DB() throws RecognitionException {
        try {
            int _type = RULE_PATTERN_DB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:158:17: ( 'pattern' RULE_INT )
            // InternalIDSLLexer.g:158:19: 'pattern' RULE_INT
            {
            match("pattern"); 

            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PATTERN_DB"

    // $ANTLR start "RULE_FONT_SIZE"
    public final void mRULE_FONT_SIZE() throws RecognitionException {
        try {
            int _type = RULE_FONT_SIZE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:160:16: ( ( '0' .. '9' )+ 'px ' )
            // InternalIDSLLexer.g:160:18: ( '0' .. '9' )+ 'px '
            {
            // InternalIDSLLexer.g:160:18: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalIDSLLexer.g:160:19: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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

            match("px "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FONT_SIZE"

    // $ANTLR start "RULE_BOXID"
    public final void mRULE_BOXID() throws RecognitionException {
        try {
            int _type = RULE_BOXID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:162:12: ( 'box' RULE_INT )
            // InternalIDSLLexer.g:162:14: 'box' RULE_INT
            {
            match("box"); 

            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOXID"

    // $ANTLR start "RULE_TEXTID"
    public final void mRULE_TEXTID() throws RecognitionException {
        try {
            int _type = RULE_TEXTID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:164:13: ( 'text' RULE_INT )
            // InternalIDSLLexer.g:164:15: 'text' RULE_INT
            {
            match("text"); 

            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TEXTID"

    // $ANTLR start "RULE_TITLETEXTID"
    public final void mRULE_TITLETEXTID() throws RecognitionException {
        try {
            int _type = RULE_TITLETEXTID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:166:18: ( 'titletext' RULE_INT )
            // InternalIDSLLexer.g:166:20: 'titletext' RULE_INT
            {
            match("titletext"); 

            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TITLETEXTID"

    // $ANTLR start "RULE_IMAGEID"
    public final void mRULE_IMAGEID() throws RecognitionException {
        try {
            int _type = RULE_IMAGEID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:168:14: ( 'image' RULE_INT )
            // InternalIDSLLexer.g:168:16: 'image' RULE_INT
            {
            match("image"); 

            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IMAGEID"

    // $ANTLR start "RULE_PIECHARTID"
    public final void mRULE_PIECHARTID() throws RecognitionException {
        try {
            int _type = RULE_PIECHARTID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:170:17: ( 'piechart' RULE_INT )
            // InternalIDSLLexer.g:170:19: 'piechart' RULE_INT
            {
            match("piechart"); 

            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PIECHARTID"

    // $ANTLR start "RULE_BARCHARTID"
    public final void mRULE_BARCHARTID() throws RecognitionException {
        try {
            int _type = RULE_BARCHARTID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:172:17: ( 'barchart' RULE_INT )
            // InternalIDSLLexer.g:172:19: 'barchart' RULE_INT
            {
            match("barchart"); 

            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BARCHARTID"

    // $ANTLR start "RULE_PICTUREGRAPHID"
    public final void mRULE_PICTUREGRAPHID() throws RecognitionException {
        try {
            int _type = RULE_PICTUREGRAPHID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:174:21: ( 'picturegraph' RULE_INT )
            // InternalIDSLLexer.g:174:23: 'picturegraph' RULE_INT
            {
            match("picturegraph"); 

            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PICTUREGRAPHID"

    // $ANTLR start "RULE_BEGIN"
    public final void mRULE_BEGIN() throws RecognitionException {
        try {
            // InternalIDSLLexer.g:176:21: ()
            // InternalIDSLLexer.g:176:23: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_BEGIN"

    // $ANTLR start "RULE_END"
    public final void mRULE_END() throws RecognitionException {
        try {
            // InternalIDSLLexer.g:178:19: ()
            // InternalIDSLLexer.g:178:21: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_END"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:180:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalIDSLLexer.g:180:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalIDSLLexer.g:180:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalIDSLLexer.g:180:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalIDSLLexer.g:180:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalIDSLLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:182:10: ( ( '0' .. '9' )+ )
            // InternalIDSLLexer.g:182:12: ( '0' .. '9' )+
            {
            // InternalIDSLLexer.g:182:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalIDSLLexer.g:182:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:184:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalIDSLLexer.g:184:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalIDSLLexer.g:184:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalIDSLLexer.g:184:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalIDSLLexer.g:184:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalIDSLLexer.g:184:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalIDSLLexer.g:184:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalIDSLLexer.g:184:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalIDSLLexer.g:184:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalIDSLLexer.g:184:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalIDSLLexer.g:184:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:186:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalIDSLLexer.g:186:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalIDSLLexer.g:186:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalIDSLLexer.g:186:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:188:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalIDSLLexer.g:188:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalIDSLLexer.g:188:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalIDSLLexer.g:188:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalIDSLLexer.g:188:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalIDSLLexer.g:188:41: ( '\\r' )? '\\n'
                    {
                    // InternalIDSLLexer.g:188:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalIDSLLexer.g:188:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:190:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalIDSLLexer.g:190:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalIDSLLexer.g:190:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalIDSLLexer.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalIDSLLexer.g:192:16: ( . )
            // InternalIDSLLexer.g:192:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalIDSLLexer.g:1:8: ( TimesNewRoman | Showpercentage | Legendstyle | Horizontal | Lineheight | SansSerif | Showlegend | Bgpattern | Gridscale | Showtitle | Electric | Maxwidth | Position | Showgrid | Subtitle | Vertical | Verdana | Bgcolor | Bgimage | Padding | Gotham | Bgsize | Center | Colors | Orange | Purple | Yellow | Arial | Align | Basic | Black | Bold | Color | Donut | Green | Label | Right | Title | Value | White | DigitOneDigitZeroDigitZeroSpace | DigitTwoDigitZeroDigitZeroSpace | DigitThreeDigitZeroDigitZeroSpace | DigitFourDigitZeroDigitZeroSpace | DigitFiveDigitZeroDigitZeroSpace | DigitSixDigitZeroDigitZeroSpace | DigitSevenDigitZeroDigitZeroSpace | DigitEightDigitZeroDigitZeroSpace | DigitNineDigitZeroDigitZeroSpace | Blue | Data | Font | Foot | Head | Left | Logo | Pink | Size | Text | Type | Bin | Off | Pie | Red | Src | DigitOne | DigitTwo | Colon | N | RULE_SIZE_POS | RULE_COLOR_HEX | RULE_COLOR_CHARTS | RULE_PATTERN_DB | RULE_FONT_SIZE | RULE_BOXID | RULE_TEXTID | RULE_TITLETEXTID | RULE_IMAGEID | RULE_PIECHARTID | RULE_BARCHARTID | RULE_PICTUREGRAPHID | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=88;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalIDSLLexer.g:1:10: TimesNewRoman
                {
                mTimesNewRoman(); 

                }
                break;
            case 2 :
                // InternalIDSLLexer.g:1:24: Showpercentage
                {
                mShowpercentage(); 

                }
                break;
            case 3 :
                // InternalIDSLLexer.g:1:39: Legendstyle
                {
                mLegendstyle(); 

                }
                break;
            case 4 :
                // InternalIDSLLexer.g:1:51: Horizontal
                {
                mHorizontal(); 

                }
                break;
            case 5 :
                // InternalIDSLLexer.g:1:62: Lineheight
                {
                mLineheight(); 

                }
                break;
            case 6 :
                // InternalIDSLLexer.g:1:73: SansSerif
                {
                mSansSerif(); 

                }
                break;
            case 7 :
                // InternalIDSLLexer.g:1:83: Showlegend
                {
                mShowlegend(); 

                }
                break;
            case 8 :
                // InternalIDSLLexer.g:1:94: Bgpattern
                {
                mBgpattern(); 

                }
                break;
            case 9 :
                // InternalIDSLLexer.g:1:104: Gridscale
                {
                mGridscale(); 

                }
                break;
            case 10 :
                // InternalIDSLLexer.g:1:114: Showtitle
                {
                mShowtitle(); 

                }
                break;
            case 11 :
                // InternalIDSLLexer.g:1:124: Electric
                {
                mElectric(); 

                }
                break;
            case 12 :
                // InternalIDSLLexer.g:1:133: Maxwidth
                {
                mMaxwidth(); 

                }
                break;
            case 13 :
                // InternalIDSLLexer.g:1:142: Position
                {
                mPosition(); 

                }
                break;
            case 14 :
                // InternalIDSLLexer.g:1:151: Showgrid
                {
                mShowgrid(); 

                }
                break;
            case 15 :
                // InternalIDSLLexer.g:1:160: Subtitle
                {
                mSubtitle(); 

                }
                break;
            case 16 :
                // InternalIDSLLexer.g:1:169: Vertical
                {
                mVertical(); 

                }
                break;
            case 17 :
                // InternalIDSLLexer.g:1:178: Verdana
                {
                mVerdana(); 

                }
                break;
            case 18 :
                // InternalIDSLLexer.g:1:186: Bgcolor
                {
                mBgcolor(); 

                }
                break;
            case 19 :
                // InternalIDSLLexer.g:1:194: Bgimage
                {
                mBgimage(); 

                }
                break;
            case 20 :
                // InternalIDSLLexer.g:1:202: Padding
                {
                mPadding(); 

                }
                break;
            case 21 :
                // InternalIDSLLexer.g:1:210: Gotham
                {
                mGotham(); 

                }
                break;
            case 22 :
                // InternalIDSLLexer.g:1:217: Bgsize
                {
                mBgsize(); 

                }
                break;
            case 23 :
                // InternalIDSLLexer.g:1:224: Center
                {
                mCenter(); 

                }
                break;
            case 24 :
                // InternalIDSLLexer.g:1:231: Colors
                {
                mColors(); 

                }
                break;
            case 25 :
                // InternalIDSLLexer.g:1:238: Orange
                {
                mOrange(); 

                }
                break;
            case 26 :
                // InternalIDSLLexer.g:1:245: Purple
                {
                mPurple(); 

                }
                break;
            case 27 :
                // InternalIDSLLexer.g:1:252: Yellow
                {
                mYellow(); 

                }
                break;
            case 28 :
                // InternalIDSLLexer.g:1:259: Arial
                {
                mArial(); 

                }
                break;
            case 29 :
                // InternalIDSLLexer.g:1:265: Align
                {
                mAlign(); 

                }
                break;
            case 30 :
                // InternalIDSLLexer.g:1:271: Basic
                {
                mBasic(); 

                }
                break;
            case 31 :
                // InternalIDSLLexer.g:1:277: Black
                {
                mBlack(); 

                }
                break;
            case 32 :
                // InternalIDSLLexer.g:1:283: Bold
                {
                mBold(); 

                }
                break;
            case 33 :
                // InternalIDSLLexer.g:1:288: Color
                {
                mColor(); 

                }
                break;
            case 34 :
                // InternalIDSLLexer.g:1:294: Donut
                {
                mDonut(); 

                }
                break;
            case 35 :
                // InternalIDSLLexer.g:1:300: Green
                {
                mGreen(); 

                }
                break;
            case 36 :
                // InternalIDSLLexer.g:1:306: Label
                {
                mLabel(); 

                }
                break;
            case 37 :
                // InternalIDSLLexer.g:1:312: Right
                {
                mRight(); 

                }
                break;
            case 38 :
                // InternalIDSLLexer.g:1:318: Title
                {
                mTitle(); 

                }
                break;
            case 39 :
                // InternalIDSLLexer.g:1:324: Value
                {
                mValue(); 

                }
                break;
            case 40 :
                // InternalIDSLLexer.g:1:330: White
                {
                mWhite(); 

                }
                break;
            case 41 :
                // InternalIDSLLexer.g:1:336: DigitOneDigitZeroDigitZeroSpace
                {
                mDigitOneDigitZeroDigitZeroSpace(); 

                }
                break;
            case 42 :
                // InternalIDSLLexer.g:1:368: DigitTwoDigitZeroDigitZeroSpace
                {
                mDigitTwoDigitZeroDigitZeroSpace(); 

                }
                break;
            case 43 :
                // InternalIDSLLexer.g:1:400: DigitThreeDigitZeroDigitZeroSpace
                {
                mDigitThreeDigitZeroDigitZeroSpace(); 

                }
                break;
            case 44 :
                // InternalIDSLLexer.g:1:434: DigitFourDigitZeroDigitZeroSpace
                {
                mDigitFourDigitZeroDigitZeroSpace(); 

                }
                break;
            case 45 :
                // InternalIDSLLexer.g:1:467: DigitFiveDigitZeroDigitZeroSpace
                {
                mDigitFiveDigitZeroDigitZeroSpace(); 

                }
                break;
            case 46 :
                // InternalIDSLLexer.g:1:500: DigitSixDigitZeroDigitZeroSpace
                {
                mDigitSixDigitZeroDigitZeroSpace(); 

                }
                break;
            case 47 :
                // InternalIDSLLexer.g:1:532: DigitSevenDigitZeroDigitZeroSpace
                {
                mDigitSevenDigitZeroDigitZeroSpace(); 

                }
                break;
            case 48 :
                // InternalIDSLLexer.g:1:566: DigitEightDigitZeroDigitZeroSpace
                {
                mDigitEightDigitZeroDigitZeroSpace(); 

                }
                break;
            case 49 :
                // InternalIDSLLexer.g:1:600: DigitNineDigitZeroDigitZeroSpace
                {
                mDigitNineDigitZeroDigitZeroSpace(); 

                }
                break;
            case 50 :
                // InternalIDSLLexer.g:1:633: Blue
                {
                mBlue(); 

                }
                break;
            case 51 :
                // InternalIDSLLexer.g:1:638: Data
                {
                mData(); 

                }
                break;
            case 52 :
                // InternalIDSLLexer.g:1:643: Font
                {
                mFont(); 

                }
                break;
            case 53 :
                // InternalIDSLLexer.g:1:648: Foot
                {
                mFoot(); 

                }
                break;
            case 54 :
                // InternalIDSLLexer.g:1:653: Head
                {
                mHead(); 

                }
                break;
            case 55 :
                // InternalIDSLLexer.g:1:658: Left
                {
                mLeft(); 

                }
                break;
            case 56 :
                // InternalIDSLLexer.g:1:663: Logo
                {
                mLogo(); 

                }
                break;
            case 57 :
                // InternalIDSLLexer.g:1:668: Pink
                {
                mPink(); 

                }
                break;
            case 58 :
                // InternalIDSLLexer.g:1:673: Size
                {
                mSize(); 

                }
                break;
            case 59 :
                // InternalIDSLLexer.g:1:678: Text
                {
                mText(); 

                }
                break;
            case 60 :
                // InternalIDSLLexer.g:1:683: Type
                {
                mType(); 

                }
                break;
            case 61 :
                // InternalIDSLLexer.g:1:688: Bin
                {
                mBin(); 

                }
                break;
            case 62 :
                // InternalIDSLLexer.g:1:692: Off
                {
                mOff(); 

                }
                break;
            case 63 :
                // InternalIDSLLexer.g:1:696: Pie
                {
                mPie(); 

                }
                break;
            case 64 :
                // InternalIDSLLexer.g:1:700: Red
                {
                mRed(); 

                }
                break;
            case 65 :
                // InternalIDSLLexer.g:1:704: Src
                {
                mSrc(); 

                }
                break;
            case 66 :
                // InternalIDSLLexer.g:1:708: DigitOne
                {
                mDigitOne(); 

                }
                break;
            case 67 :
                // InternalIDSLLexer.g:1:717: DigitTwo
                {
                mDigitTwo(); 

                }
                break;
            case 68 :
                // InternalIDSLLexer.g:1:726: Colon
                {
                mColon(); 

                }
                break;
            case 69 :
                // InternalIDSLLexer.g:1:732: N
                {
                mN(); 

                }
                break;
            case 70 :
                // InternalIDSLLexer.g:1:734: RULE_SIZE_POS
                {
                mRULE_SIZE_POS(); 

                }
                break;
            case 71 :
                // InternalIDSLLexer.g:1:748: RULE_COLOR_HEX
                {
                mRULE_COLOR_HEX(); 

                }
                break;
            case 72 :
                // InternalIDSLLexer.g:1:763: RULE_COLOR_CHARTS
                {
                mRULE_COLOR_CHARTS(); 

                }
                break;
            case 73 :
                // InternalIDSLLexer.g:1:781: RULE_PATTERN_DB
                {
                mRULE_PATTERN_DB(); 

                }
                break;
            case 74 :
                // InternalIDSLLexer.g:1:797: RULE_FONT_SIZE
                {
                mRULE_FONT_SIZE(); 

                }
                break;
            case 75 :
                // InternalIDSLLexer.g:1:812: RULE_BOXID
                {
                mRULE_BOXID(); 

                }
                break;
            case 76 :
                // InternalIDSLLexer.g:1:823: RULE_TEXTID
                {
                mRULE_TEXTID(); 

                }
                break;
            case 77 :
                // InternalIDSLLexer.g:1:835: RULE_TITLETEXTID
                {
                mRULE_TITLETEXTID(); 

                }
                break;
            case 78 :
                // InternalIDSLLexer.g:1:852: RULE_IMAGEID
                {
                mRULE_IMAGEID(); 

                }
                break;
            case 79 :
                // InternalIDSLLexer.g:1:865: RULE_PIECHARTID
                {
                mRULE_PIECHARTID(); 

                }
                break;
            case 80 :
                // InternalIDSLLexer.g:1:881: RULE_BARCHARTID
                {
                mRULE_BARCHARTID(); 

                }
                break;
            case 81 :
                // InternalIDSLLexer.g:1:897: RULE_PICTUREGRAPHID
                {
                mRULE_PICTUREGRAPHID(); 

                }
                break;
            case 82 :
                // InternalIDSLLexer.g:1:917: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 83 :
                // InternalIDSLLexer.g:1:925: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 84 :
                // InternalIDSLLexer.g:1:934: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 85 :
                // InternalIDSLLexer.g:1:946: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 86 :
                // InternalIDSLLexer.g:1:962: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 87 :
                // InternalIDSLLexer.g:1:978: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 88 :
                // InternalIDSLLexer.g:1:986: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\25\55\1\135\1\140\7\142\1\55\1\uffff\1\153\1\142\2\55\1\53\1\uffff\3\53\2\uffff\1\55\1\uffff\53\55\2\142\4\uffff\1\142\1\uffff\1\142\1\uffff\6\142\1\55\2\uffff\1\55\4\uffff\5\55\1\u00bb\22\55\1\u00ce\11\55\1\u00d9\10\55\1\u00e2\6\55\1\u00e9\4\55\2\142\1\uffff\10\142\7\55\1\u0103\1\uffff\1\55\1\u0105\2\55\1\u0108\1\55\1\u010a\10\55\1\u0113\1\55\1\u0115\1\uffff\10\55\1\u011e\1\55\1\uffff\10\55\1\uffff\4\55\1\u012c\1\55\1\uffff\1\55\1\u0130\1\u0131\1\55\1\uffff\1\142\11\uffff\1\u0135\1\u0136\6\55\1\uffff\1\55\1\uffff\1\55\1\uffff\1\55\1\u0140\1\uffff\1\55\1\uffff\4\55\1\u0146\2\55\1\u0149\3\uffff\1\55\1\u014b\6\55\1\uffff\3\55\1\u0155\3\55\1\u015a\2\55\1\u015d\1\u015e\1\u015f\1\uffff\1\u0160\1\u0162\1\u0163\2\uffff\1\u0164\1\142\3\uffff\1\55\1\uffff\7\55\1\uffff\4\55\1\u0173\1\uffff\1\u0174\1\55\1\uffff\1\55\1\uffff\5\55\1\u017d\3\55\1\uffff\1\55\1\u0182\1\u0183\1\u0184\1\uffff\1\u0185\1\u0186\4\uffff\1\55\3\uffff\2\u0174\1\u0189\11\55\1\u0193\1\u0194\3\uffff\5\55\1\u019a\1\55\1\uffff\3\55\1\u019f\5\uffff\1\55\1\142\1\uffff\3\55\1\u01a4\1\u01a5\4\55\2\uffff\2\55\1\u01ac\1\u01ad\1\u01ae\1\uffff\1\u01af\2\55\1\u01b2\1\uffff\3\55\1\u01b6\2\uffff\3\55\1\u01ba\1\u01bb\1\u01bc\4\uffff\1\u01bd\1\55\1\uffff\2\55\1\u01c1\1\uffff\1\55\1\u01c3\1\u01c4\4\uffff\1\55\1\u01c6\1\55\1\uffff\1\u01c8\2\uffff\1\55\1\uffff\1\55\1\uffff\2\55\1\u01cd\1\u01ce\2\uffff";
    static final String DFA14_eofS =
        "\u01cf\uffff";
    static final String DFA14_minS =
        "\1\0\1\151\2\141\1\145\1\60\1\162\1\60\3\141\1\145\1\157\1\60\1\146\1\145\3\60\2\145\1\150\12\60\1\uffff\3\60\1\155\1\101\1\uffff\2\0\1\52\2\uffff\1\155\1\uffff\1\157\1\156\1\142\1\172\1\143\1\146\1\156\1\142\1\147\1\162\1\141\1\143\1\60\1\141\1\154\1\156\1\60\2\145\1\170\1\163\1\144\1\162\1\143\1\162\1\154\1\162\1\164\1\60\1\154\1\141\1\146\1\154\2\151\1\156\1\60\1\147\1\144\1\164\1\170\1\160\1\151\2\60\1\uffff\1\60\2\uffff\1\60\1\uffff\1\60\1\uffff\6\60\1\156\2\uffff\1\141\4\uffff\1\145\1\167\1\163\1\164\1\145\1\60\1\145\1\164\2\145\1\157\1\151\1\144\1\141\1\157\1\155\2\151\1\60\2\143\1\145\1\144\2\60\1\144\1\145\1\143\1\167\1\151\1\144\1\164\1\160\1\153\1\60\2\164\1\165\1\144\1\150\1\164\1\157\1\156\1\60\1\154\1\141\1\147\1\165\1\141\1\150\1\60\1\154\1\164\1\145\1\164\1\40\2\60\10\40\2\164\1\147\1\163\1\147\1\55\1\151\1\60\1\uffff\1\156\1\60\1\150\1\154\1\60\1\172\1\60\1\164\1\154\1\141\1\172\1\143\1\60\1\150\1\153\1\60\1\40\1\60\1\uffff\1\163\1\156\1\164\1\151\1\164\1\151\1\145\1\154\1\60\1\150\1\uffff\1\165\1\151\1\145\2\141\1\145\1\162\1\147\1\uffff\1\157\1\154\1\156\1\164\1\60\1\164\1\uffff\1\145\2\60\1\145\1\uffff\2\60\10\uffff\2\60\1\145\1\40\2\145\1\151\1\162\1\uffff\1\164\1\uffff\1\144\1\uffff\1\145\1\60\1\uffff\1\157\1\uffff\1\164\1\157\1\147\1\145\2\60\1\141\1\60\3\uffff\1\143\1\60\1\162\1\144\1\151\1\156\1\162\1\145\1\uffff\1\141\1\162\1\143\1\60\1\156\1\155\1\162\1\60\1\145\1\167\3\60\1\uffff\3\60\2\uffff\3\60\2\uffff\1\60\1\uffff\1\162\1\147\1\164\1\151\1\154\1\163\1\151\1\uffff\1\156\1\145\1\162\1\145\1\60\1\uffff\1\54\1\162\1\uffff\1\141\1\uffff\1\151\1\164\1\157\1\147\1\156\1\60\1\162\1\145\1\141\1\uffff\1\141\3\60\1\uffff\2\60\4\uffff\1\145\3\uffff\2\54\1\60\1\143\1\145\1\154\1\144\1\145\1\164\1\147\1\164\1\162\2\60\3\uffff\1\164\1\154\1\143\1\150\1\156\2\60\1\uffff\1\164\1\147\1\154\1\60\5\uffff\1\170\1\60\1\uffff\1\145\1\156\1\145\2\60\1\171\1\150\1\141\1\156\2\uffff\1\60\1\145\3\60\1\uffff\2\60\1\162\1\60\1\uffff\1\164\1\156\1\144\1\60\2\uffff\1\154\1\164\1\154\3\60\4\uffff\1\60\1\141\1\uffff\1\60\1\164\1\60\1\uffff\1\145\2\60\4\uffff\1\160\1\60\1\141\1\uffff\1\60\2\uffff\1\150\1\uffff\1\147\1\uffff\1\60\1\145\2\60\2\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\151\1\165\3\157\1\162\1\154\1\141\1\165\2\145\2\157\1\162\1\145\1\162\1\154\1\157\1\151\1\171\1\150\11\170\1\157\1\uffff\1\172\1\170\1\146\1\155\1\172\1\uffff\2\uffff\1\57\2\uffff\1\155\1\uffff\1\157\1\156\1\142\1\172\1\143\1\147\1\156\1\142\1\147\1\162\1\141\2\163\1\165\1\170\1\156\1\146\1\151\1\145\1\170\1\163\1\164\1\162\1\156\1\162\1\154\1\162\1\164\1\156\1\154\1\141\1\146\1\154\2\151\1\156\1\164\1\147\1\144\1\164\1\170\1\160\1\151\2\170\1\uffff\1\146\2\uffff\1\170\1\uffff\1\170\1\uffff\6\170\1\157\2\uffff\1\141\4\uffff\1\145\1\167\1\163\1\164\1\145\1\172\1\145\1\164\2\145\1\157\1\151\1\144\1\141\1\157\1\155\2\151\1\146\2\143\1\145\1\144\1\71\1\172\1\144\1\145\1\143\1\167\1\151\1\144\1\164\1\160\1\153\1\172\2\164\1\165\1\144\1\150\1\164\1\157\1\156\1\172\1\154\1\141\1\147\1\165\1\141\1\150\1\172\1\154\1\164\1\145\1\164\2\170\1\146\10\170\2\164\1\147\1\163\1\164\1\55\1\151\1\172\1\uffff\1\156\1\172\1\150\1\154\3\172\1\164\1\154\1\141\1\172\1\143\1\146\1\150\1\153\1\172\1\40\1\172\1\uffff\1\163\1\156\1\164\1\151\1\164\1\151\1\145\1\154\1\172\1\150\1\uffff\1\165\1\151\1\145\2\141\1\145\1\162\1\147\1\uffff\1\157\1\154\1\156\1\164\1\172\1\164\1\uffff\1\145\2\172\1\145\1\uffff\1\170\1\146\10\uffff\2\172\1\145\1\40\2\145\1\151\1\162\1\uffff\1\164\1\uffff\1\144\1\uffff\1\145\1\172\1\uffff\1\157\1\uffff\1\164\1\157\1\147\1\145\1\172\1\146\1\141\1\172\3\uffff\1\143\1\172\1\162\1\144\1\151\1\156\1\162\1\145\1\uffff\1\141\1\162\1\143\1\172\1\156\1\155\1\162\1\172\1\145\1\167\3\172\1\uffff\3\172\2\uffff\1\172\1\170\1\146\2\uffff\1\71\1\uffff\1\162\1\147\1\164\1\151\1\154\1\163\1\151\1\uffff\1\156\1\145\1\162\1\145\1\172\1\uffff\1\172\1\162\1\uffff\1\141\1\uffff\1\151\1\164\1\157\1\147\1\156\1\172\1\162\1\145\1\141\1\uffff\1\141\3\172\1\uffff\2\172\4\uffff\1\145\3\uffff\1\170\1\54\1\172\1\143\1\145\1\154\1\144\1\145\1\164\1\147\1\164\1\162\2\172\3\uffff\1\164\1\154\1\143\1\150\1\156\1\172\1\71\1\uffff\1\164\1\147\1\154\1\172\5\uffff\2\170\1\uffff\1\145\1\156\1\145\2\172\1\171\1\150\1\141\1\156\2\uffff\1\71\1\145\3\172\1\uffff\1\172\1\71\1\162\1\172\1\uffff\1\164\1\156\1\144\1\172\2\uffff\1\154\1\164\1\154\3\172\4\uffff\1\172\1\141\1\uffff\1\71\1\164\1\172\1\uffff\1\145\2\172\4\uffff\1\160\1\172\1\141\1\uffff\1\172\2\uffff\1\150\1\uffff\1\147\1\uffff\1\71\1\145\2\172\2\uffff";
    static final String DFA14_acceptS =
        "\40\uffff\1\104\5\uffff\1\122\3\uffff\1\127\1\130\1\uffff\1\122\55\uffff\1\112\1\uffff\1\102\1\106\1\uffff\1\103\1\uffff\1\123\7\uffff\1\104\1\105\1\uffff\1\124\1\125\1\126\1\127\112\uffff\1\101\22\uffff\1\75\12\uffff\1\77\10\uffff\1\76\6\uffff\1\100\4\uffff\1\51\2\uffff\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\10\uffff\1\6\1\uffff\1\72\1\uffff\1\67\2\uffff\1\70\1\uffff\1\66\10\uffff\1\62\1\40\1\113\10\uffff\1\71\15\uffff\1\63\3\uffff\1\73\1\74\3\uffff\1\64\1\65\1\uffff\1\1\7\uffff\1\44\5\uffff\1\36\2\uffff\1\37\1\uffff\1\43\11\uffff\1\47\4\uffff\1\41\2\uffff\1\34\1\35\1\42\1\45\1\uffff\1\46\1\114\1\50\16\uffff\1\26\1\107\1\110\7\uffff\1\32\4\uffff\1\25\1\27\1\30\1\31\1\33\2\uffff\1\116\11\uffff\1\22\1\23\5\uffff\1\24\4\uffff\1\21\4\uffff\1\16\1\17\6\uffff\1\13\1\14\1\15\1\111\2\uffff\1\20\3\uffff\1\12\3\uffff\1\10\1\120\1\11\1\117\3\uffff\1\7\1\uffff\1\5\1\4\1\uffff\1\115\1\uffff\1\3\4\uffff\1\121\1\2";
    static final String DFA14_specialS =
        "\1\2\46\uffff\1\0\1\1\u01a6\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\53\2\52\2\53\1\52\22\53\1\52\1\53\1\47\4\53\1\50\7\53\1\51\1\42\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\40\6\53\1\20\5\43\1\14\14\46\1\1\1\46\1\13\4\46\3\53\1\45\1\46\1\53\1\21\1\5\1\15\1\22\1\7\1\37\1\6\1\4\1\44\2\46\1\3\1\10\1\41\1\16\1\11\1\46\1\23\1\2\1\24\1\46\1\12\1\25\1\46\1\17\1\46\uff85\53",
            "\1\54",
            "\1\57\6\uffff\1\56\1\61\10\uffff\1\62\2\uffff\1\60",
            "\1\65\3\uffff\1\63\3\uffff\1\64\5\uffff\1\66",
            "\1\70\11\uffff\1\67",
            "\12\76\7\uffff\6\76\32\uffff\1\72\5\76\1\71\1\uffff\1\75\2\uffff\1\73\2\uffff\1\74",
            "\1\77",
            "\12\76\7\uffff\6\76\32\uffff\6\76\5\uffff\1\100",
            "\1\101",
            "\1\103\7\uffff\1\105\5\uffff\1\102\5\uffff\1\104",
            "\1\107\3\uffff\1\106",
            "\1\110",
            "\1\111",
            "\12\76\7\uffff\6\76\32\uffff\4\76\1\112\1\76\10\uffff\1\113",
            "\1\115\13\uffff\1\114",
            "\1\116",
            "\12\76\7\uffff\6\76\32\uffff\6\76\13\uffff\1\117",
            "\12\76\7\uffff\6\76\32\uffff\6\76\5\uffff\1\120",
            "\12\76\7\uffff\6\76\32\uffff\1\122\5\76\10\uffff\1\121",
            "\1\124\3\uffff\1\123",
            "\1\126\3\uffff\1\125\17\uffff\1\127",
            "\1\130",
            "\1\131\11\132\7\uffff\6\134\32\uffff\6\134\11\uffff\1\133\7\uffff\1\136",
            "\1\137\11\132\7\uffff\6\134\32\uffff\6\134\11\uffff\1\133\7\uffff\1\136",
            "\1\141\11\132\7\uffff\6\134\32\uffff\6\134\11\uffff\1\133\7\uffff\1\136",
            "\1\143\11\132\7\uffff\6\134\32\uffff\6\134\11\uffff\1\133\7\uffff\1\136",
            "\1\144\11\132\7\uffff\6\134\32\uffff\6\134\11\uffff\1\133\7\uffff\1\136",
            "\1\145\11\132\7\uffff\6\134\32\uffff\6\134\11\uffff\1\133\7\uffff\1\136",
            "\1\146\11\132\7\uffff\6\134\32\uffff\6\134\11\uffff\1\133\7\uffff\1\136",
            "\1\147\11\132\7\uffff\6\134\32\uffff\6\134\11\uffff\1\133\7\uffff\1\136",
            "\1\150\11\132\7\uffff\6\134\32\uffff\6\134\11\uffff\1\133\7\uffff\1\136",
            "\12\76\7\uffff\6\76\32\uffff\6\76\10\uffff\1\151",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\132\7\uffff\6\134\32\uffff\6\134\11\uffff\1\133\7\uffff\1\136",
            "\12\76\7\uffff\6\76\32\uffff\6\76",
            "\1\154",
            "\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\0\155",
            "\0\155",
            "\1\156\4\uffff\1\157",
            "",
            "",
            "\1\161",
            "",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\170\1\167",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\177\5\uffff\1\u0080\6\uffff\1\176\2\uffff\1\u0081",
            "\12\u0083\7\uffff\6\u0083\32\uffff\6\u0083\13\uffff\1\u0084\1\u0082",
            "\1\u0085\23\uffff\1\u0086",
            "\1\u0087\13\uffff\1\u0088",
            "\1\u0089",
            "\12\u0083\7\uffff\6\u0083\32\uffff\6\u0083",
            "\1\u008b\3\uffff\1\u008a",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f\17\uffff\1\u0090",
            "\1\u0091",
            "\1\u0094\1\uffff\1\u0093\10\uffff\1\u0092",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\12\u0083\7\uffff\6\u0083\32\uffff\6\u0083\7\uffff\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\12\u0083\7\uffff\6\u0083\32\uffff\6\u0083\15\uffff\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8\11\u00a9\7\uffff\6\u00aa\32\uffff\6\u00aa\11\uffff\1\133\7\uffff\1\136",
            "\12\u00a9\7\uffff\6\u00aa\32\uffff\6\u00aa\11\uffff\1\133\7\uffff\1\136",
            "",
            "\12\u00aa\7\uffff\6\u00aa\32\uffff\6\u00aa",
            "",
            "",
            "\1\u00ab\11\u00a9\7\uffff\6\u00aa\32\uffff\6\u00aa\11\uffff\1\133\7\uffff\1\136",
            "",
            "\1\u00ac\11\u00a9\7\uffff\6\u00aa\32\uffff\6\u00aa\11\uffff\1\133\7\uffff\1\136",
            "",
            "\1\u00ad\11\u00a9\7\uffff\6\u00aa\32\uffff\6\u00aa\11\uffff\1\133\7\uffff\1\136",
            "\1\u00ae\11\u00a9\7\uffff\6\u00aa\32\uffff\6\u00aa\11\uffff\1\133\7\uffff\1\136",
            "\1\u00af\11\u00a9\7\uffff\6\u00aa\32\uffff\6\u00aa\11\uffff\1\133\7\uffff\1\136",
            "\1\u00b0\11\u00a9\7\uffff\6\u00aa\32\uffff\6\u00aa\11\uffff\1\133\7\uffff\1\136",
            "\1\u00b1\11\u00a9\7\uffff\6\u00aa\32\uffff\6\u00aa\11\uffff\1\133\7\uffff\1\136",
            "\1\u00b2\11\u00a9\7\uffff\6\u00aa\32\uffff\6\u00aa\11\uffff\1\133\7\uffff\1\136",
            "\1\u00b3\1\u00b4",
            "",
            "",
            "\1\u00b5",
            "",
            "",
            "",
            "",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\12\u00c8\7\uffff\6\u00c8\32\uffff\6\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\12\u00cd",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\2\55\1\u00d8\27\55",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee\17\uffff\12\u00ef\7\uffff\6\u00f0\32\uffff\6\u00f0\11\uffff\1\133\7\uffff\1\136",
            "\12\u00ef\7\uffff\6\u00f0\32\uffff\6\u00f0\11\uffff\1\133\7\uffff\1\136",
            "\12\u00f0\7\uffff\6\u00f0\32\uffff\6\u00f0",
            "\1\u00f1\17\uffff\12\u00ef\7\uffff\6\u00f0\32\uffff\6\u00f0\11\uffff\1\133\7\uffff\1\136",
            "\1\u00f2\17\uffff\12\u00ef\7\uffff\6\u00f0\32\uffff\6\u00f0\11\uffff\1\133\7\uffff\1\136",
            "\1\u00f3\17\uffff\12\u00ef\7\uffff\6\u00f0\32\uffff\6\u00f0\11\uffff\1\133\7\uffff\1\136",
            "\1\u00f4\17\uffff\12\u00ef\7\uffff\6\u00f0\32\uffff\6\u00f0\11\uffff\1\133\7\uffff\1\136",
            "\1\u00f5\17\uffff\12\u00ef\7\uffff\6\u00f0\32\uffff\6\u00f0\11\uffff\1\133\7\uffff\1\136",
            "\1\u00f6\17\uffff\12\u00ef\7\uffff\6\u00f0\32\uffff\6\u00f0\11\uffff\1\133\7\uffff\1\136",
            "\1\u00f7\17\uffff\12\u00ef\7\uffff\6\u00f0\32\uffff\6\u00f0\11\uffff\1\133\7\uffff\1\136",
            "\1\u00f8\17\uffff\12\u00ef\7\uffff\6\u00f0\32\uffff\6\u00f0\11\uffff\1\133\7\uffff\1\136",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u0100\4\uffff\1\u00fe\3\uffff\1\u00fd\3\uffff\1\u00ff",
            "\1\u0101",
            "\1\u0102",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u0104",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0106",
            "\1\u0107",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0109",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\12\u0110\7\uffff\6\u0110\32\uffff\6\u0110",
            "\1\u0111",
            "\1\u0112",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0114",
            "\12\u00cd\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u011f",
            "",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u012d",
            "",
            "\1\u012e",
            "\12\u012f\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0132",
            "",
            "\12\u0133\7\uffff\6\u0134\32\uffff\6\u0134\11\uffff\1\133\7\uffff\1\136",
            "\12\u0134\7\uffff\6\u0134\32\uffff\6\u0134",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "",
            "\1\u013d",
            "",
            "\1\u013e",
            "",
            "\1\u013f",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u0141",
            "",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\u0147\7\uffff\6\u0147\32\uffff\6\u0147",
            "\1\u0148",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "",
            "\1\u014a",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\22\55\1\u0159\7\55",
            "\1\u015b",
            "\1\u015c",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\23\55\1\u0161\6\55",
            "\12\u012f\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\u0165\7\uffff\6\u0166\32\uffff\6\u0166\11\uffff\1\133\7\uffff\1\136",
            "\12\u0166\7\uffff\6\u0166\32\uffff\6\u0166",
            "",
            "",
            "\12\u0167",
            "",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "",
            "\1\u016f",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u0175\3\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0176",
            "",
            "\1\u0177",
            "",
            "\1\u0178",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "",
            "\1\u0181",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "",
            "",
            "\1\u0187",
            "",
            "",
            "",
            "\1\u0175\3\uffff\12\u0188\66\uffff\1\133\7\uffff\1\136",
            "\1\u0175",
            "\12\u0167\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u018a",
            "\1\u018b",
            "\1\u018c",
            "\1\u018d",
            "\1\u018e",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "\1\u0192",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "",
            "\1\u0195",
            "\1\u0196",
            "\1\u0197",
            "\1\u0198",
            "\1\u0199",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\u019b",
            "",
            "\1\u019c",
            "\1\u019d",
            "\1\u019e",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "",
            "",
            "",
            "\1\u01a0",
            "\12\u0188\66\uffff\1\133\7\uffff\1\136",
            "",
            "\1\u01a1",
            "\1\u01a2",
            "\1\u01a3",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u01a6",
            "\1\u01a7",
            "\1\u01a8",
            "\1\u01a9",
            "",
            "",
            "\12\u01aa",
            "\1\u01ab",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\12\u019b\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\u01b0",
            "\1\u01b1",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u01b3",
            "\1\u01b4",
            "\1\u01b5",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "\1\u01b7",
            "\1\u01b8",
            "\1\u01b9",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\u01aa\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "",
            "",
            "\12\u01b0\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u01be",
            "",
            "\12\u01bf",
            "\1\u01c0",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u01c2",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "",
            "",
            "\1\u01c5",
            "\12\u01bf\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u01c7",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "\1\u01c9",
            "",
            "\1\u01ca",
            "",
            "\12\u01cb",
            "\1\u01cc",
            "\12\u01cb\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
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
            return "1:1: Tokens : ( TimesNewRoman | Showpercentage | Legendstyle | Horizontal | Lineheight | SansSerif | Showlegend | Bgpattern | Gridscale | Showtitle | Electric | Maxwidth | Position | Showgrid | Subtitle | Vertical | Verdana | Bgcolor | Bgimage | Padding | Gotham | Bgsize | Center | Colors | Orange | Purple | Yellow | Arial | Align | Basic | Black | Bold | Color | Donut | Green | Label | Right | Title | Value | White | DigitOneDigitZeroDigitZeroSpace | DigitTwoDigitZeroDigitZeroSpace | DigitThreeDigitZeroDigitZeroSpace | DigitFourDigitZeroDigitZeroSpace | DigitFiveDigitZeroDigitZeroSpace | DigitSixDigitZeroDigitZeroSpace | DigitSevenDigitZeroDigitZeroSpace | DigitEightDigitZeroDigitZeroSpace | DigitNineDigitZeroDigitZeroSpace | Blue | Data | Font | Foot | Head | Left | Logo | Pink | Size | Text | Type | Bin | Off | Pie | Red | Src | DigitOne | DigitTwo | Colon | N | RULE_SIZE_POS | RULE_COLOR_HEX | RULE_COLOR_CHARTS | RULE_PATTERN_DB | RULE_FONT_SIZE | RULE_BOXID | RULE_TEXTID | RULE_TITLETEXTID | RULE_IMAGEID | RULE_PIECHARTID | RULE_BARCHARTID | RULE_PICTUREGRAPHID | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_39 = input.LA(1);

                        s = -1;
                        if ( ((LA14_39>='\u0000' && LA14_39<='\uFFFF')) ) {s = 109;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_40 = input.LA(1);

                        s = -1;
                        if ( ((LA14_40>='\u0000' && LA14_40<='\uFFFF')) ) {s = 109;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='T') ) {s = 1;}

                        else if ( (LA14_0=='s') ) {s = 2;}

                        else if ( (LA14_0=='l') ) {s = 3;}

                        else if ( (LA14_0=='h') ) {s = 4;}

                        else if ( (LA14_0=='b') ) {s = 5;}

                        else if ( (LA14_0=='g') ) {s = 6;}

                        else if ( (LA14_0=='e') ) {s = 7;}

                        else if ( (LA14_0=='m') ) {s = 8;}

                        else if ( (LA14_0=='p') ) {s = 9;}

                        else if ( (LA14_0=='v') ) {s = 10;}

                        else if ( (LA14_0=='V') ) {s = 11;}

                        else if ( (LA14_0=='G') ) {s = 12;}

                        else if ( (LA14_0=='c') ) {s = 13;}

                        else if ( (LA14_0=='o') ) {s = 14;}

                        else if ( (LA14_0=='y') ) {s = 15;}

                        else if ( (LA14_0=='A') ) {s = 16;}

                        else if ( (LA14_0=='a') ) {s = 17;}

                        else if ( (LA14_0=='d') ) {s = 18;}

                        else if ( (LA14_0=='r') ) {s = 19;}

                        else if ( (LA14_0=='t') ) {s = 20;}

                        else if ( (LA14_0=='w') ) {s = 21;}

                        else if ( (LA14_0=='1') ) {s = 22;}

                        else if ( (LA14_0=='2') ) {s = 23;}

                        else if ( (LA14_0=='3') ) {s = 24;}

                        else if ( (LA14_0=='4') ) {s = 25;}

                        else if ( (LA14_0=='5') ) {s = 26;}

                        else if ( (LA14_0=='6') ) {s = 27;}

                        else if ( (LA14_0=='7') ) {s = 28;}

                        else if ( (LA14_0=='8') ) {s = 29;}

                        else if ( (LA14_0=='9') ) {s = 30;}

                        else if ( (LA14_0=='f') ) {s = 31;}

                        else if ( (LA14_0==':') ) {s = 32;}

                        else if ( (LA14_0=='n') ) {s = 33;}

                        else if ( (LA14_0=='0') ) {s = 34;}

                        else if ( ((LA14_0>='B' && LA14_0<='F')) ) {s = 35;}

                        else if ( (LA14_0=='i') ) {s = 36;}

                        else if ( (LA14_0=='^') ) {s = 37;}

                        else if ( ((LA14_0>='H' && LA14_0<='S')||LA14_0=='U'||(LA14_0>='W' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='j' && LA14_0<='k')||LA14_0=='q'||LA14_0=='u'||LA14_0=='x'||LA14_0=='z') ) {s = 38;}

                        else if ( (LA14_0=='\"') ) {s = 39;}

                        else if ( (LA14_0=='\'') ) {s = 40;}

                        else if ( (LA14_0=='/') ) {s = 41;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 42;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='.')||(LA14_0>=';' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||(LA14_0>='{' && LA14_0<='\uFFFF')) ) {s = 43;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}