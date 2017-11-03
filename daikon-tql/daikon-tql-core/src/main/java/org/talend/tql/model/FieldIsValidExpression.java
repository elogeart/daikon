package org.talend.tql.model;

import org.talend.tql.visitor.IASTVisitor;

/**
 * Created by gmzoughi on 02/09/16.
 */
public class FieldIsValidExpression implements Atom {

    private TqlElement field;

    public FieldIsValidExpression(TqlElement field) {
        this.field = field;
    }

    public TqlElement getField() {
        return field;
    }

    @Override
    public String toString() {
        return "FieldIsValidExpression{" + "field=" + field + '}';
    }

    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
