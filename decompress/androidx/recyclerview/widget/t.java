// 
// Decompiled by Procyon v0.6.0
// 

package androidx.recyclerview.widget;

public final class t
{
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    
    public t() {
        this.a = true;
        this.f = 0;
        this.g = 0;
    }
    
    @Override
    public final String toString() {
        final StringBuilder j = fu8.j("LayoutState{mAvailable=");
        j.append(this.b);
        j.append(", mCurrentPosition=");
        j.append(this.c);
        j.append(", mItemDirection=");
        j.append(this.d);
        j.append(", mLayoutDirection=");
        j.append(this.e);
        j.append(", mStartLine=");
        j.append(this.f);
        j.append(", mEndLine=");
        return x70.C(j, this.g, '}');
    }
}
