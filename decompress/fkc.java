// 
// Decompiled by Procyon v0.6.0
// 

public final class fkc
{
    public float a;
    public float b;
    public float c;
    public float d;
    public int e;
    public int f;
    public int g;
    public zux$a h;
    public float i;
    public float j;
    
    public fkc(final float a) {
        this.e = -1;
        this.a = a;
        this.b = Float.NaN;
        this.f = 0;
        this.g = 0;
    }
    
    public fkc(final float a, final float b, final float c, final float d, final int f, final zux$a h) {
        this.e = -1;
        this.g = -1;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.f = f;
        this.h = h;
    }
    
    public final boolean a(final fkc fkc) {
        return fkc != null && (this.f == fkc.f && this.a == fkc.a && this.g == fkc.g && this.e == fkc.e);
    }
    
    @Override
    public final String toString() {
        final StringBuilder j = fu8.j("Highlight, x: ");
        j.append(this.a);
        j.append(", y: ");
        j.append(this.b);
        j.append(", dataSetIndex: ");
        j.append(this.f);
        j.append(", stackIndex (only stacked barentry): ");
        j.append(this.g);
        return j.toString();
    }
}
