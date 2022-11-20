// 
// Decompiled by Procyon v0.6.0
// 

public final class kuh
{
    public float a;
    public float b;
    public float c;
    public float d;
    
    public kuh() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
    }
    
    public final void a(final float n, final float n2, final float n3, final float n4) {
        this.a = Math.max(n, this.a);
        this.b = Math.max(n2, this.b);
        this.c = Math.min(n3, this.c);
        this.d = Math.min(n4, this.d);
    }
    
    public final boolean b() {
        return this.a >= this.c || this.b >= this.d;
    }
    
    @Override
    public final String toString() {
        final StringBuilder j = fu8.j("MutableRect(");
        j.append(max.H(this.a));
        j.append(", ");
        j.append(max.H(this.b));
        j.append(", ");
        j.append(max.H(this.c));
        j.append(", ");
        j.append(max.H(this.d));
        j.append(')');
        return j.toString();
    }
}
