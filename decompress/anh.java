import kotlin.NoWhenBranchMatchedException;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anh extends d4e<yoh>
{
    public final woh a;
    public final rg6 b;
    public final y7 c;
    public final fhf d;
    public final j2q e;
    public final sz8 f;
    public final a49 g;
    
    public anh(final woh a, final rg6 b, final y7 c, final fhf d, final j2q e, final sz8 f, final a49 g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public final b4e<? extends yoh, ? extends n8x> a(final int n) {
        Objects.requireNonNull(anh.anh$a.Companion);
        final anh.anh$a[] values = anh.anh$a.values();
        final int length = values.length;
        int i = 0;
        while (true) {
            while (i < length) {
                final anh.anh$a anh$a = values[i];
                if (anh$a.F0 == n) {
                    if (anh$a != null) {
                        Object o = null;
                        switch (((Enum)anh$a).ordinal()) {
                            default: {
                                throw new NoWhenBranchMatchedException();
                            }
                            case 6: {
                                o = this.e;
                                break;
                            }
                            case 5: {
                                o = this.g;
                                break;
                            }
                            case 4: {
                                o = this.f;
                                break;
                            }
                            case 3: {
                                o = this.d;
                                break;
                            }
                            case 2: {
                                o = this.c;
                                break;
                            }
                            case 1: {
                                o = this.b;
                                break;
                            }
                            case 0: {
                                o = this.a;
                                break;
                            }
                        }
                        return (b4e<? extends yoh, ? extends n8x>)o;
                    }
                    throw new IllegalArgumentException(ffe.m("Value `", n, "` does not map to a ModuleOverviewItemViewType"));
                }
                else {
                    ++i;
                }
            }
            final anh.anh$a anh$a = null;
            continue;
        }
    }
    
    public final int b(final Object o) {
        final yoh yoh = (yoh)o;
        e0e.f((Object)yoh, "item");
        anh.anh$a m0;
        if (yoh instanceof yoh$e) {
            m0 = anh.anh$a.M0;
        }
        else {
            Objects.requireNonNull(anh.anh$a.Companion);
            m0 = anh.anh$a.G0.get(yoh.getClass());
        }
        int f0;
        if (m0 != null) {
            f0 = m0.F0;
        }
        else {
            f0 = -1;
        }
        return f0;
    }
    
    public final int c() {
        return anh.anh$a.values().length;
    }
}
