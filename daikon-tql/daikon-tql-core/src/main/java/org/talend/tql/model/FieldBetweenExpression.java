package org.talend.tql.model;

import org.talend.tql.visitor.IASTVisitor;

/*
 * Tql expression for range matching.
 */

/**
 * Created by bguillon on 23/06/16.
 */
public class FieldBetweenExpression implements Atom {

    private final String fieldName;

    private final LiteralValue left;

    private final LiteralValue right;

    private final boolean isLowerOpen;

    private final boolean isUpperOpen;

    public FieldBetweenExpression(String fieldName, LiteralValue left, LiteralValue right, boolean isLowerOpen,
            boolean isUpperOpen) {
        this.fieldName = fieldName;
        this.left = left;
        this.right = right;
        this.isLowerOpen = isLowerOpen;
        this.isUpperOpen = isUpperOpen;
    }

    public String getFieldName() {
        return fieldName;
    }

    public LiteralValue getLeft() {
        return left;
    }

    public LiteralValue getRight() {
        return right;
    }

    public boolean isLowerOpen() {
        return isLowerOpen;
    }

    public boolean isUpperOpen() {
        return isUpperOpen;
    }

    @Override
    public String toString() {
        return "FieldBetweenExpression{" + "fieldName='" + fieldName + '\'' + ", left=" + left + ", right=" + right
                + ", isLowerOpen=" + isLowerOpen + ", isUpperOpen=" + isUpperOpen + '}';
    }

    @Override
    public <T> T accept(IASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
