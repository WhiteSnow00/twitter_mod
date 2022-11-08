// 
// Decompiled by Procyon v0.6.0
// 

public final class flc
{
    public float a;
    public float b;
    public float c;
    public float d;
    public int e;
    public int f;
    public int g;
    public jux.a h;
    public float i;
    public float j;
    
    public flc(final float a) {
        this.e = -1;
        this.a = a;
        this.b = Float.NaN;
        this.f = 0;
        this.g = 0;
    }
    
    public flc(final float a, final float b, final float c, final float d, final int f, final jux.a h) {
        this.e = -1;
        this.g = -1;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.f = f;
        this.h = h;
    }
    
    public final boolean a(final flc flc) {
        return flc != null && (this.f == flc.f && this.a == flc.a && this.g == flc.g && this.e == flc.e);
    }
    
    @Override
    public final String toString() {
        final StringBuilder g = w48.g("Highlight, x: ");
        g.append(this.a);
        g.append(", y: ");
        g.append(this.b);
        g.append(", dataSetIndex: ");
        g.append(this.f);
        g.append(", stackIndex (only stacked barentry): ");
        g.append(this.g);
        return g.toString();
    }
}
