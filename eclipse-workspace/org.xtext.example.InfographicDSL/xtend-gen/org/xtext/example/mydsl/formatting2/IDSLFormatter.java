/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.xtext.example.mydsl.iDSL.Barchart;
import org.xtext.example.mydsl.iDSL.Box;
import org.xtext.example.mydsl.iDSL.Color;
import org.xtext.example.mydsl.iDSL.Foot;
import org.xtext.example.mydsl.iDSL.Head;
import org.xtext.example.mydsl.iDSL.Image;
import org.xtext.example.mydsl.iDSL.Infographic;
import org.xtext.example.mydsl.iDSL.InfographicElementType;
import org.xtext.example.mydsl.iDSL.Picturegraph;
import org.xtext.example.mydsl.iDSL.Piechart;
import org.xtext.example.mydsl.iDSL.Text;
import org.xtext.example.mydsl.services.IDSLGrammarAccess;

@SuppressWarnings("all")
public class IDSLFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private IDSLGrammarAccess _iDSLGrammarAccess;
  
  protected void _format(final Infographic infographic, @Extension final IFormattableDocument document) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field infographicElement is undefined for the type Infographic"
      + "\nformat cannot be resolved");
  }
  
  protected void _format(final InfographicElementType infographicElementType, @Extension final IFormattableDocument document) {
    document.<Color>format(infographicElementType.getBgcolor());
    document.<Head>format(infographicElementType.getHead());
    EList<Box> _boxes = infographicElementType.getBoxes();
    for (final Box box : _boxes) {
      document.<Box>format(box);
    }
    EList<Text> _texts = infographicElementType.getTexts();
    for (final Text text : _texts) {
      document.<Text>format(text);
    }
    EList<Image> _images = infographicElementType.getImages();
    for (final Image image : _images) {
      document.<Image>format(image);
    }
    EList<Piechart> _piecharts = infographicElementType.getPiecharts();
    for (final Piechart piechart : _piecharts) {
      document.<Piechart>format(piechart);
    }
    EList<Barchart> _barcharts = infographicElementType.getBarcharts();
    for (final Barchart barchart : _barcharts) {
      document.<Barchart>format(barchart);
    }
    EList<Picturegraph> _picturegraphs = infographicElementType.getPicturegraphs();
    for (final Picturegraph picturegraph : _picturegraphs) {
      document.<Picturegraph>format(picturegraph);
    }
    document.<Foot>format(infographicElementType.getFoot());
  }
  
  public void format(final Object infographicElementType, final IFormattableDocument document) {
    if (infographicElementType instanceof XtextResource) {
      _format((XtextResource)infographicElementType, document);
      return;
    } else if (infographicElementType instanceof InfographicElementType) {
      _format((InfographicElementType)infographicElementType, document);
      return;
    } else if (infographicElementType instanceof Infographic) {
      _format((Infographic)infographicElementType, document);
      return;
    } else if (infographicElementType instanceof EObject) {
      _format((EObject)infographicElementType, document);
      return;
    } else if (infographicElementType == null) {
      _format((Void)null, document);
      return;
    } else if (infographicElementType != null) {
      _format(infographicElementType, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(infographicElementType, document).toString());
    }
  }
}
