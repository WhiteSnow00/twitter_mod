// 
// Decompiled by Procyon v0.6.0
// 

public final class jz1
{
    public static final rlp<jz1> g;
    public final String a;
    public final oxm b;
    public final oxm c;
    public final String d;
    public kz1 e;
    public lz1 f;
    
    static {
        jz1.g = new jz1.jz1$a();
    }
    
    public jz1(final jz1.jz1$b jz1$b) {
        this.a = jz1$b.a;
        this.b = jz1$b.b;
        this.c = jz1$b.c;
        this.d = jz1$b.d;
        this.e = jz1$b.e;
        this.f = jz1$b.f;
    }
    
    @Override
    public final String toString() {
        final StringBuilder j = fu8.j("BirdwatchPivot{title=");
        j.append(this.a);
        j.append(" subtitle=");
        j.append(this.b);
        j.append(" footer=");
        j.append(this.c);
        j.append(" destinationUrl=");
        j.append(this.d);
        j.append(" callToAction=");
        j.append(this.e);
        j.append(" iconType=");
        j.append(this.f);
        j.append('}');
        return j.toString();
    }
}
