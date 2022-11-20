import android.view.View;
import android.graphics.RectF;
import android.view.ViewGroup;
import android.content.res.TypedArray;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kut
{
    public static final float[][] E;
    public static final float[][] F;
    public float A;
    public float B;
    public int C;
    public int D;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public float g;
    public float h;
    public int i;
    public boolean j;
    public float k;
    public float l;
    public boolean m;
    public float[] n;
    public int[] o;
    public float p;
    public float q;
    public final erh r;
    public float s;
    public float t;
    public boolean u;
    public float v;
    public int w;
    public float x;
    public float y;
    public float z;
    
    static {
        E = new float[][] { { 0.5f, 0.0f }, { 0.0f, 0.5f }, { 1.0f, 0.5f }, { 0.5f, 1.0f }, { 0.5f, 0.5f }, { 0.0f, 0.5f }, { 1.0f, 0.5f } };
        F = new float[][] { { 0.0f, -1.0f }, { 0.0f, 1.0f }, { -1.0f, 0.0f }, { 1.0f, 0.0f }, { -1.0f, 0.0f }, { 1.0f, 0.0f } };
    }
    
    public kut(final Context context, final erh r, final XmlPullParser xmlPullParser) {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.g = 0.5f;
        this.h = 0.5f;
        this.i = -1;
        this.j = false;
        this.k = 0.0f;
        this.l = 1.0f;
        this.m = false;
        this.n = new float[2];
        this.o = new int[2];
        this.s = 4.0f;
        this.t = 1.2f;
        this.u = true;
        this.v = 1.0f;
        this.w = 0;
        this.x = 10.0f;
        this.y = 10.0f;
        this.z = 1.0f;
        this.A = Float.NaN;
        this.B = Float.NaN;
        this.C = 0;
        this.D = 0;
        this.r = r;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), as2.f1);
        for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
            final int index = obtainStyledAttributes.getIndex(i);
            if (index == 16) {
                this.d = obtainStyledAttributes.getResourceId(index, this.d);
            }
            else if (index == 17) {
                final int int1 = obtainStyledAttributes.getInt(index, this.a);
                this.a = int1;
                final float[][] e = kut.E;
                this.h = e[int1][0];
                this.g = e[int1][1];
            }
            else if (index == 1) {
                final int int2 = obtainStyledAttributes.getInt(index, this.b);
                this.b = int2;
                final float[][] f = kut.F;
                if (int2 < 6) {
                    this.k = f[int2][0];
                    this.l = f[int2][1];
                }
                else {
                    this.l = Float.NaN;
                    this.k = Float.NaN;
                    this.j = true;
                }
            }
            else if (index == 6) {
                this.s = obtainStyledAttributes.getFloat(index, this.s);
            }
            else if (index == 5) {
                this.t = obtainStyledAttributes.getFloat(index, this.t);
            }
            else if (index == 7) {
                this.u = obtainStyledAttributes.getBoolean(index, this.u);
            }
            else if (index == 2) {
                this.v = obtainStyledAttributes.getFloat(index, this.v);
            }
            else if (index == 3) {
                this.x = obtainStyledAttributes.getFloat(index, this.x);
            }
            else if (index == 18) {
                this.e = obtainStyledAttributes.getResourceId(index, this.e);
            }
            else if (index == 9) {
                this.c = obtainStyledAttributes.getInt(index, this.c);
            }
            else if (index == 8) {
                this.w = obtainStyledAttributes.getInteger(index, 0);
            }
            else if (index == 4) {
                this.f = obtainStyledAttributes.getResourceId(index, 0);
            }
            else if (index == 10) {
                this.i = obtainStyledAttributes.getResourceId(index, this.i);
            }
            else if (index == 12) {
                this.y = obtainStyledAttributes.getFloat(index, this.y);
            }
            else if (index == 13) {
                this.z = obtainStyledAttributes.getFloat(index, this.z);
            }
            else if (index == 14) {
                this.A = obtainStyledAttributes.getFloat(index, this.A);
            }
            else if (index == 15) {
                this.B = obtainStyledAttributes.getFloat(index, this.B);
            }
            else if (index == 11) {
                this.C = obtainStyledAttributes.getInt(index, this.C);
            }
            else if (index == 0) {
                this.D = obtainStyledAttributes.getInt(index, this.D);
            }
        }
        obtainStyledAttributes.recycle();
    }
    
    public final RectF a(final ViewGroup viewGroup, final RectF rectF) {
        final int f = this.f;
        if (f == -1) {
            return null;
        }
        final View viewById = ((View)viewGroup).findViewById(f);
        if (viewById == null) {
            return null;
        }
        rectF.set((float)viewById.getLeft(), (float)viewById.getTop(), (float)viewById.getRight(), (float)viewById.getBottom());
        return rectF;
    }
    
    public final RectF b(final ViewGroup viewGroup, final RectF rectF) {
        final int e = this.e;
        if (e == -1) {
            return null;
        }
        final View viewById = ((View)viewGroup).findViewById(e);
        if (viewById == null) {
            return null;
        }
        rectF.set((float)viewById.getLeft(), (float)viewById.getTop(), (float)viewById.getRight(), (float)viewById.getBottom());
        return rectF;
    }
    
    public final void c(final boolean b) {
        if (b) {
            final float[][] f = kut.F;
            f[4] = f[3];
            f[5] = f[2];
            final float[][] e = kut.E;
            e[5] = e[2];
            e[6] = e[1];
        }
        else {
            final float[][] f2 = kut.F;
            f2[4] = f2[2];
            f2[5] = f2[3];
            final float[][] e2 = kut.E;
            e2[5] = e2[1];
            e2[6] = e2[2];
        }
        final float[][] e3 = kut.E;
        final int a = this.a;
        this.h = e3[a][0];
        this.g = e3[a][1];
        final int b2 = this.b;
        final float[][] f3 = kut.F;
        if (b2 >= 6) {
            return;
        }
        this.k = f3[b2][0];
        this.l = f3[b2][1];
    }
    
    @Override
    public final String toString() {
        String string;
        if (Float.isNaN(this.k)) {
            string = "rotation";
        }
        else {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.k);
            sb.append(" , ");
            sb.append(this.l);
            string = sb.toString();
        }
        return string;
    }
}
