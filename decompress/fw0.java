import java.util.concurrent.ExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fw0
{
    public final ExecutorService a;
    public final ExecutorService b;
    public final ExecutorService c;
    public final ExecutorService d;
    public final ExecutorService e;
    public final ExecutorService f;
    public final ExecutorService g;
    public final ExecutorService h;
    
    public fw0(final p4c p4c) {
        this.a = p4c.b(1);
        this.b = p4c.b(2);
        this.c = p4c.b(3);
        this.d = p4c.b(4);
        this.e = p4c.b(5);
        this.f = p4c.b(6);
        this.g = p4c.b(7);
        this.h = p4c.b(8);
    }
    
    public final ExecutorService a(final int n) {
        if (n == 0) {
            throw null;
        }
        switch (n - 1) {
            default: {
                return this.a;
            }
            case 7: {
                return this.g;
            }
            case 6: {
                return this.h;
            }
            case 5: {
                return this.f;
            }
            case 4: {
                return this.e;
            }
            case 3: {
                return this.d;
            }
            case 2: {
                return this.c;
            }
            case 1: {
                return this.b;
            }
        }
    }
}
