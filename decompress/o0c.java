import java.util.Objects;
import java.util.Arrays;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class o0c extends xe9<l0c>
{
    public o0c(final Context context) {
        super(context);
        this.e(context, null);
    }
    
    public o0c(final Context context, final AttributeSet set) {
        super(context, set);
        this.e(context, set);
    }
    
    public o0c(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.e(context, set);
    }
    
    public void e(final Context context, AttributeSet obtainStyledAttributes) {
        rrb.b();
        rrb.b();
        final m0c m0c = new m0c(context.getResources());
        int indexCount = 0;
        int i = 0;
        int dimensionPixelSize = 0;
        int integer = 0;
        int index = 0;
        int n3 = 0;
        Label_1166: {
            if (obtainStyledAttributes != null) {
                obtainStyledAttributes = (AttributeSet)context.obtainStyledAttributes(obtainStyledAttributes, b1b.W0);
                try {
                    indexCount = ((TypedArray)obtainStyledAttributes).getIndexCount();
                    i = 0;
                    boolean boolean1 = true;
                    boolean boolean2 = true;
                    dimensionPixelSize = 0;
                    integer = 0;
                    boolean boolean3 = true;
                    boolean boolean4 = true;
                    boolean boolean5 = true;
                    int boolean6 = 1;
                    int boolean7 = 1;
                    boolean boolean8 = true;
                    while (i < indexCount) {
                        index = ((TypedArray)obtainStyledAttributes).getIndex(i);
                        Label_0883: {
                            int n2 = 0;
                            Label_0879: {
                                Label_0729: {
                                    if (index == 0) {
                                        m0c.l = n0c.c((TypedArray)obtainStyledAttributes, index);
                                    }
                                    else if (index == 6) {
                                        m0c.d = n0c.a(context, (TypedArray)obtainStyledAttributes, index);
                                    }
                                    else if (index == 8) {
                                        final Drawable a = n0c.a(context, (TypedArray)obtainStyledAttributes, index);
                                        if (a == null) {
                                            m0c.o = null;
                                        }
                                        else {
                                            final StateListDrawable o = new StateListDrawable();
                                            o.addState(new int[] { 16842919 }, a);
                                            m0c.o = o;
                                        }
                                    }
                                    else if (index == 10) {
                                        m0c.j = n0c.a(context, (TypedArray)obtainStyledAttributes, index);
                                    }
                                    else if (index == 2) {
                                        m0c.b = ((TypedArray)obtainStyledAttributes).getInt(index, 0);
                                    }
                                    else if (index == 28) {
                                        m0c.c = ((TypedArray)obtainStyledAttributes).getFloat(index, 0.0f);
                                    }
                                    else if (index == 7) {
                                        m0c.e = n0c.c((TypedArray)obtainStyledAttributes, index);
                                    }
                                    else if (index == 12) {
                                        m0c.f = n0c.a(context, (TypedArray)obtainStyledAttributes, index);
                                    }
                                    else if (index == 13) {
                                        m0c.g = n0c.c((TypedArray)obtainStyledAttributes, index);
                                    }
                                    else if (index == 3) {
                                        m0c.h = n0c.a(context, (TypedArray)obtainStyledAttributes, index);
                                    }
                                    else if (index == 4) {
                                        m0c.i = n0c.c((TypedArray)obtainStyledAttributes, index);
                                    }
                                    else if (index == 11) {
                                        m0c.k = n0c.c((TypedArray)obtainStyledAttributes, index);
                                    }
                                    else {
                                        if (index == 9) {
                                            integer = ((TypedArray)obtainStyledAttributes).getInteger(index, integer);
                                            break Label_0883;
                                        }
                                        if (index == 1) {
                                            m0c.m = n0c.a(context, (TypedArray)obtainStyledAttributes, index);
                                        }
                                        else if (index == 5) {
                                            final Drawable a2 = n0c.a(context, (TypedArray)obtainStyledAttributes, index);
                                            if (a2 == null) {
                                                m0c.n = null;
                                            }
                                            else {
                                                m0c.n = Arrays.asList(a2);
                                            }
                                        }
                                        else if (index == 14) {
                                            n0c.b(m0c).b = ((TypedArray)obtainStyledAttributes).getBoolean(index, false);
                                        }
                                        else {
                                            if (index == 24) {
                                                dimensionPixelSize = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(index, dimensionPixelSize);
                                                break Label_0883;
                                            }
                                            if (index == 20) {
                                                boolean3 = ((TypedArray)obtainStyledAttributes).getBoolean(index, boolean3);
                                            }
                                            else if (index == 21) {
                                                boolean6 = (((TypedArray)obtainStyledAttributes).getBoolean(index, (boolean)(boolean6 != 0)) ? 1 : 0);
                                            }
                                            else {
                                                final int n = boolean6;
                                                if (index == 16) {
                                                    boolean8 = ((TypedArray)obtainStyledAttributes).getBoolean(index, boolean8);
                                                }
                                                else if (index == 17) {
                                                    boolean7 = (((TypedArray)obtainStyledAttributes).getBoolean(index, (boolean)(boolean7 != 0)) ? 1 : 0);
                                                }
                                                else {
                                                    n2 = boolean7;
                                                    if (index == 22) {
                                                        boolean4 = ((TypedArray)obtainStyledAttributes).getBoolean(index, boolean4);
                                                    }
                                                    else if (index == 19) {
                                                        boolean5 = ((TypedArray)obtainStyledAttributes).getBoolean(index, boolean5);
                                                    }
                                                    else if (index == 18) {
                                                        boolean2 = ((TypedArray)obtainStyledAttributes).getBoolean(index, boolean2);
                                                    }
                                                    else if (index == 15) {
                                                        boolean1 = ((TypedArray)obtainStyledAttributes).getBoolean(index, boolean1);
                                                    }
                                                    else {
                                                        if (index == 23) {
                                                            final imo b = n0c.b(m0c);
                                                            b.d = ((TypedArray)obtainStyledAttributes).getColor(index, 0);
                                                            b.a = 1;
                                                            break Label_0729;
                                                        }
                                                        if (index == 27) {
                                                            final imo b2 = n0c.b(m0c);
                                                            final float e = (float)((TypedArray)obtainStyledAttributes).getDimensionPixelSize(index, 0);
                                                            Objects.requireNonNull(b2);
                                                            xd.F(e >= 0.0f, "the border width cannot be < 0");
                                                            b2.e = e;
                                                        }
                                                        else if (index == 25) {
                                                            n0c.b(m0c).f = ((TypedArray)obtainStyledAttributes).getColor(index, 0);
                                                        }
                                                        else if (index == 26) {
                                                            final imo b3 = n0c.b(m0c);
                                                            boolean b4 = false;
                                                            final float g = (float)((TypedArray)obtainStyledAttributes).getDimensionPixelSize(index, 0);
                                                            Objects.requireNonNull(b3);
                                                            if (g >= 0.0f) {
                                                                b4 = true;
                                                            }
                                                            xd.F(b4, "the padding cannot be < 0");
                                                            b3.g = g;
                                                        }
                                                        boolean6 = n;
                                                        break Label_0879;
                                                    }
                                                    boolean7 = n2;
                                                }
                                                boolean6 = n;
                                            }
                                        }
                                    }
                                }
                                n2 = boolean7;
                            }
                            boolean7 = n2;
                        }
                        ++i;
                    }
                    ((TypedArray)obtainStyledAttributes).recycle();
                    Label_1125: {
                        int n4 = 0;
                        int n5 = 0;
                        Label_1114: {
                            if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
                                if (boolean3 && boolean5) {
                                    i = 1;
                                }
                                else {
                                    i = 0;
                                }
                                if (boolean6 && boolean4) {
                                    indexCount = 1;
                                }
                                else {
                                    indexCount = 0;
                                }
                                if (boolean7 && boolean2) {
                                    index = 1;
                                }
                                else {
                                    index = 0;
                                }
                                n3 = i;
                                n4 = index;
                                n5 = indexCount;
                                if (!boolean8) {
                                    break Label_1114;
                                }
                                n3 = i;
                                n4 = index;
                                n5 = indexCount;
                                if (!boolean1) {
                                    break Label_1114;
                                }
                                n3 = i;
                                i = indexCount;
                            }
                            else {
                                if (boolean3 && boolean4) {
                                    indexCount = 1;
                                }
                                else {
                                    indexCount = 0;
                                }
                                if (boolean6 && boolean5) {
                                    i = 1;
                                }
                                else {
                                    i = 0;
                                }
                                if (boolean7 && boolean1) {
                                    index = 1;
                                }
                                else {
                                    index = 0;
                                }
                                n3 = indexCount;
                                n4 = index;
                                n5 = i;
                                if (!boolean8) {
                                    break Label_1114;
                                }
                                n3 = indexCount;
                                n4 = index;
                                n5 = i;
                                if (!boolean2) {
                                    break Label_1114;
                                }
                                n3 = indexCount;
                            }
                            indexCount = index;
                            index = 1;
                            break Label_1125;
                        }
                        indexCount = n4;
                        index = 0;
                        i = n5;
                    }
                    break Label_1166;
                }
                finally {
                    ((TypedArray)obtainStyledAttributes).recycle();
                    context.getResources().getConfiguration().getLayoutDirection();
                }
            }
            i = 1;
            dimensionPixelSize = 0;
            indexCount = 1;
            integer = 0;
            n3 = 1;
            index = 1;
        }
        if (m0c.j != null && integer > 0) {
            m0c.j = new z81(m0c.j, integer);
        }
        if (dimensionPixelSize > 0) {
            final imo b5 = n0c.b(m0c);
            float n6;
            if (n3 != 0) {
                n6 = (float)dimensionPixelSize;
            }
            else {
                n6 = 0.0f;
            }
            float n7;
            if (i != 0) {
                n7 = (float)dimensionPixelSize;
            }
            else {
                n7 = 0.0f;
            }
            float n8;
            if (indexCount != 0) {
                n8 = (float)dimensionPixelSize;
            }
            else {
                n8 = 0.0f;
            }
            float n9;
            if (index != 0) {
                n9 = (float)dimensionPixelSize;
            }
            else {
                n9 = 0.0f;
            }
            b5.b(n6, n7, n8, n9);
        }
        rrb.b();
        this.setAspectRatio(m0c.c);
        this.setHierarchy((ve9)m0c.a());
        rrb.b();
    }
}
