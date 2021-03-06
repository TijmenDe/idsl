/*
 * generated by Xtext 2.19.0
 */
lexer grammar InternalIDSLLexer;

@header {
package org.xtext.example.mydsl.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

TimesNewRoman : 'Times New Roman';

Showpercentage : 'showpercentage';

Legendstyle : 'legendstyle';

Horizontal : 'horizontal';

Lineheight : 'lineheight';

SansSerif : 'sans-serif';

Showlegend : 'showlegend';

Bgpattern : 'bgpattern';

Gridscale : 'gridscale';

Showtitle : 'showtitle';

Electric : 'electric';

Maxwidth : 'maxwidth';

Position : 'position';

Showgrid : 'showgrid';

Subtitle : 'subtitle';

Vertical : 'vertical';

Verdana : 'Verdana';

Bgcolor : 'bgcolor';

Bgimage : 'bgimage';

Padding : 'padding';

Gotham : 'Gotham';

Bgsize : 'bgsize';

Center : 'center';

Colors : 'colors';

Orange : 'orange';

Purple : 'purple';

Yellow : 'yellow';

Arial : 'Arial';

Align : 'align';

Basic : 'basic';

Black : 'black';

Bold : 'bold ';

Color : 'color';

Donut : 'donut';

Green : 'green';

Label : 'label';

Right : 'right';

Title : 'title';

Value : 'value';

White : 'white';

DigitOneDigitZeroDigitZeroSpace : '100 ';

DigitTwoDigitZeroDigitZeroSpace : '200 ';

DigitThreeDigitZeroDigitZeroSpace : '300 ';

DigitFourDigitZeroDigitZeroSpace : '400 ';

DigitFiveDigitZeroDigitZeroSpace : '500 ';

DigitSixDigitZeroDigitZeroSpace : '600 ';

DigitSevenDigitZeroDigitZeroSpace : '700 ';

DigitEightDigitZeroDigitZeroSpace : '800 ';

DigitNineDigitZeroDigitZeroSpace : '900 ';

Blue : 'blue';

Data : 'data';

Font : 'font';

Foot : 'foot';

Head : 'head';

Left : 'left';

Logo : 'logo';

Pink : 'pink';

Size : 'size';

Text : 'text';

Type : 'type';

Bin : 'bin';

Off : 'off';

Pie : 'pie';

Red : 'red';

Src : 'src';

DigitOne : '1';

DigitTwo : '2';

Colon : ':';

N : 'n';

RULE_SIZE_POS : RULE_INT 'x' RULE_INT;

RULE_COLOR_HEX : ('0'..'9'|'a'..'f'|'A'..'F') ('0'..'9'|'a'..'f'|'A'..'F') ('0'..'9'|'a'..'f'|'A'..'F') ('0'..'9'|'a'..'f'|'A'..'F') ('0'..'9'|'a'..'f'|'A'..'F') ('0'..'9'|'a'..'f'|'A'..'F');

RULE_COLOR_CHARTS : (RULE_COLOR_HEX ',')* RULE_COLOR_HEX;

RULE_PATTERN_DB : 'pattern' RULE_INT;

RULE_FONT_SIZE : ('0'..'9')+ 'px ';

RULE_BOXID : 'box' RULE_INT;

RULE_TEXTID : 'text' RULE_INT;

RULE_TITLETEXTID : 'titletext' RULE_INT;

RULE_IMAGEID : 'image' RULE_INT;

RULE_PIECHARTID : 'piechart' RULE_INT;

RULE_BARCHARTID : 'barchart' RULE_INT;

RULE_PICTUREGRAPHID : 'picturegraph' RULE_INT;

fragment RULE_BEGIN : ;

fragment RULE_END : ;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
