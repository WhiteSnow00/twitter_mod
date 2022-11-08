import android.content.res.TypedArray;
import java.util.Objects;
import java.util.Arrays;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class m0c extends me9<j0c>
{
    public m0c(final Context context) {
        super(context);
        this.e(context, null);
    }
    
    public m0c(final Context context, final AttributeSet set) {
        super(context, set);
        this.e(context, set);
    }
    
    public m0c(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.e(context, set);
    }
    
    public void e(final Context context, final AttributeSet set) {
        srb.b();
        srb.b();
        final k0c k0c = new k0c(context.getResources());
        int indexCount = 0;
        int i = 0;
        int dimensionPixelSize = 0;
        int integer = 0;
        int index = 0;
        int n10 = 0;
        Label_1229: {
            if (set != null) {
                final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, vqb.F0);
                try {
                    indexCount = obtainStyledAttributes.getIndexCount();
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
                    int n = 1;
                    while (i < indexCount) {
                        index = obtainStyledAttributes.getIndex(i);
                        Label_0950: {
                            int n5 = 0;
                            int n6 = 0;
                            int n7 = 0;
                            Label_0938: {
                                int n8 = 0;
                                Label_0784: {
                                    Label_0768: {
                                        if (index == 0) {
                                            k0c.l = l0c.c(obtainStyledAttributes, index);
                                        }
                                        else if (index == 6) {
                                            k0c.d = l0c.a(context, obtainStyledAttributes, index);
                                        }
                                        else if (index == 8) {
                                            final Drawable a = l0c.a(context, obtainStyledAttributes, index);
                                            if (a == null) {
                                                k0c.o = null;
                                            }
                                            else {
                                                final StateListDrawable o = new StateListDrawable();
                                                o.addState(new int[] { 16842919 }, a);
                                                k0c.o = o;
                                            }
                                        }
                                        else if (index == 10) {
                                            k0c.j = l0c.a(context, obtainStyledAttributes, index);
                                        }
                                        else if (index == 2) {
                                            k0c.b = obtainStyledAttributes.getInt(index, 0);
                                        }
                                        else if (index == 28) {
                                            k0c.c = obtainStyledAttributes.getFloat(index, 0.0f);
                                        }
                                        else if (index == 7) {
                                            k0c.e = l0c.c(obtainStyledAttributes, index);
                                        }
                                        else if (index == 12) {
                                            k0c.f = l0c.a(context, obtainStyledAttributes, index);
                                        }
                                        else if (index == 13) {
                                            k0c.g = l0c.c(obtainStyledAttributes, index);
                                        }
                                        else if (index == 3) {
                                            k0c.h = l0c.a(context, obtainStyledAttributes, index);
                                        }
                                        else if (index == 4) {
                                            k0c.i = l0c.c(obtainStyledAttributes, index);
                                        }
                                        else if (index == 11) {
                                            k0c.k = l0c.c(obtainStyledAttributes, index);
                                        }
                                        else {
                                            if (index == 9) {
                                                integer = obtainStyledAttributes.getInteger(index, integer);
                                                break Label_0950;
                                            }
                                            if (index == 1) {
                                                k0c.m = l0c.a(context, obtainStyledAttributes, index);
                                            }
                                            else if (index == 5) {
                                                final Drawable a2 = l0c.a(context, obtainStyledAttributes, index);
                                                if (a2 == null) {
                                                    k0c.n = null;
                                                }
                                                else {
                                                    k0c.n = Arrays.asList(a2);
                                                }
                                            }
                                            else if (index == 14) {
                                                l0c.b(k0c).b = obtainStyledAttributes.getBoolean(index, false);
                                            }
                                            else {
                                                if (index == 24) {
                                                    dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, dimensionPixelSize);
                                                    break Label_0950;
                                                }
                                                int n2;
                                                if (index == 20) {
                                                    boolean3 = obtainStyledAttributes.getBoolean(index, boolean3);
                                                    n2 = n;
                                                }
                                                else if (index == 21) {
                                                    boolean6 = (obtainStyledAttributes.getBoolean(index, (boolean)(boolean6 != 0)) ? 1 : 0);
                                                    n2 = n;
                                                }
                                                else {
                                                    final int n3 = boolean6;
                                                    boolean boolean8;
                                                    if (index == 16) {
                                                        boolean8 = obtainStyledAttributes.getBoolean(index, (boolean)(n != 0));
                                                    }
                                                    else {
                                                        final int n4 = n;
                                                        if (index == 17) {
                                                            boolean7 = (obtainStyledAttributes.getBoolean(index, (boolean)(boolean7 != 0)) ? 1 : 0);
                                                            boolean8 = (n4 != 0);
                                                        }
                                                        else {
                                                            n5 = boolean7;
                                                            if (index == 22) {
                                                                boolean4 = obtainStyledAttributes.getBoolean(index, boolean4);
                                                            }
                                                            else if (index == 19) {
                                                                boolean5 = obtainStyledAttributes.getBoolean(index, boolean5);
                                                            }
                                                            else if (index == 18) {
                                                                boolean2 = obtainStyledAttributes.getBoolean(index, boolean2);
                                                            }
                                                            else if (index == 15) {
                                                                boolean1 = obtainStyledAttributes.getBoolean(index, boolean1);
                                                            }
                                                            else {
                                                                if (index == 23) {
                                                                    final alo b = l0c.b(k0c);
                                                                    b.d = obtainStyledAttributes.getColor(index, 0);
                                                                    b.a = 1;
                                                                    break Label_0768;
                                                                }
                                                                if (index == 27) {
                                                                    final alo b2 = l0c.b(k0c);
                                                                    final float e = (float)obtainStyledAttributes.getDimensionPixelSize(index, 0);
                                                                    Objects.requireNonNull(b2);
                                                                    ri4.n(e >= 0.0f, (Object)"the border width cannot be < 0");
                                                                    b2.e = e;
                                                                }
                                                                else if (index == 25) {
                                                                    l0c.b(k0c).f = obtainStyledAttributes.getColor(index, 0);
                                                                }
                                                                else if (index == 26) {
                                                                    final alo b3 = l0c.b(k0c);
                                                                    boolean b4 = false;
                                                                    final float g = (float)obtainStyledAttributes.getDimensionPixelSize(index, 0);
                                                                    Objects.requireNonNull(b3);
                                                                    if (g >= 0.0f) {
                                                                        b4 = true;
                                                                    }
                                                                    ri4.n(b4, (Object)"the padding cannot be < 0");
                                                                    b3.g = g;
                                                                }
                                                                n6 = n4;
                                                                n7 = n3;
                                                                break Label_0938;
                                                            }
                                                            boolean8 = (n4 != 0);
                                                            boolean7 = n5;
                                                        }
                                                    }
                                                    boolean6 = n3;
                                                    n2 = (boolean8 ? 1 : 0);
                                                }
                                                n7 = boolean6;
                                                n8 = boolean7;
                                                n6 = n2;
                                                break Label_0784;
                                            }
                                        }
                                    }
                                    final int n9 = boolean6;
                                    n8 = boolean7;
                                    n6 = n;
                                    n7 = n9;
                                }
                                n5 = n8;
                            }
                            boolean6 = n7;
                            n = n6;
                            boolean7 = n5;
                        }
                        ++i;
                    }
                    obtainStyledAttributes.recycle();
                    Label_1189: {
                        int n11 = 0;
                        int n12 = 0;
                        Label_1178: {
                            if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
                                if (boolean3 && boolean5) {
                                    indexCount = 1;
                                }
                                else {
                                    indexCount = 0;
                                }
                                if (boolean6 && boolean4) {
                                    i = 1;
                                }
                                else {
                                    i = 0;
                                }
                                if (boolean7 && boolean2) {
                                    index = 1;
                                }
                                else {
                                    index = 0;
                                }
                                n10 = indexCount;
                                n11 = index;
                                n12 = i;
                                if (n == 0) {
                                    break Label_1178;
                                }
                                n10 = indexCount;
                                n11 = index;
                                n12 = i;
                                if (!boolean1) {
                                    break Label_1178;
                                }
                                n10 = indexCount;
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
                                n10 = indexCount;
                                n11 = index;
                                n12 = i;
                                if (n == 0) {
                                    break Label_1178;
                                }
                                n10 = indexCount;
                                n11 = index;
                                n12 = i;
                                if (!boolean2) {
                                    break Label_1178;
                                }
                                n10 = indexCount;
                            }
                            indexCount = index;
                            index = 1;
                            break Label_1189;
                        }
                        indexCount = n11;
                        index = 0;
                        i = n12;
                    }
                    break Label_1229;
                }
                finally {
                    obtainStyledAttributes.recycle();
                    context.getResources().getConfiguration().getLayoutDirection();
                }
            }
            i = 1;
            dimensionPixelSize = 0;
            indexCount = 1;
            integer = 0;
            n10 = 1;
            index = 1;
        }
        if (k0c.j != null && integer > 0) {
            k0c.j = (Drawable)new z81(k0c.j, integer);
        }
        if (dimensionPixelSize > 0) {
            final alo b5 = l0c.b(k0c);
            float n13;
            if (n10 != 0) {
                n13 = (float)dimensionPixelSize;
            }
            else {
                n13 = 0.0f;
            }
            float n14;
            if (i != 0) {
                n14 = (float)dimensionPixelSize;
            }
            else {
                n14 = 0.0f;
            }
            float n15;
            if (indexCount != 0) {
                n15 = (float)dimensionPixelSize;
            }
            else {
                n15 = 0.0f;
            }
            float n16;
            if (index != 0) {
                n16 = (float)dimensionPixelSize;
            }
            else {
                n16 = 0.0f;
            }
            b5.b(n13, n14, n15, n16);
        }
        srb.b();
        this.setAspectRatio(k0c.c);
        this.setHierarchy(k0c.a());
        srb.b();
    }
}
