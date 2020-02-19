/*
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import org.antlr.runtime.Token;
import org.antlr.runtime.TokenSource;
import org.eclipse.xtext.parser.antlr.AbstractIndentationTokenSource;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalIDSLParser;

public class IDSLTokenSource extends AbstractIndentationTokenSource {

	public IDSLTokenSource(TokenSource delegate) {
		super(delegate);
	}

	@Override
	protected boolean shouldSplitTokenImpl(Token token) {
		// TODO Review assumption
		return token.getType() == InternalIDSLParser.RULE_WS;
	}

	@Override
	protected int getBeginTokenType() {
		// TODO Review assumption
		return InternalIDSLParser.RULE_BEGIN;
	}

	@Override
	protected int getEndTokenType() {
		// TODO Review assumption
		return InternalIDSLParser.RULE_END;
	}

	@Override
	protected boolean shouldEmitPendingEndTokens() {
		return false;
	}
}