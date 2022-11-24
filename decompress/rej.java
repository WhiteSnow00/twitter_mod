import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rej
{
    public final a39 a;
    
    public rej(final pdj pdj) {
        this.a = new a39((a39$a)pdj);
    }
    
    public final String a(final fym fym) {
        final a39 a = this.a;
        Objects.requireNonNull(fym);
        final bvh bvh = new bvh(fym);
        a.a(bvh);
        return bvh.I0.toString();
    }
}
