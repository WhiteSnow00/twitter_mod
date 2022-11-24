// 
// Decompiled by Procyon v0.6.0
// 

public final class y9p
{
    public static x9p a(final int n, final String s, String c, final String s2, String b, final kjw kjw, final dmv dmv, final krt krt) {
        if (n == 12) {
            vmw.g((Object)krt);
            return (x9p)new j4m(s, s2, krt);
        }
        switch (n) {
            default: {
                return null;
            }
            case 8: {
                vmw.g((Object)kjw);
                b = (c = kjw.c);
                if (b == null) {
                    c = "";
                }
                b = kjw.b;
                return (x9p)new j4m(s, b, s2, b, c, kjw);
            }
            case 7: {
                vmw.g((Object)kjw);
                return new ljw(s, c, s2, b, kjw, "prefetch", dmv);
            }
            case 6: {
                vmw.g((Object)kjw);
                return new ljw(s, c, s2, b, kjw, "remote", dmv);
            }
            case 5: {
                return (x9p)new uto(s, c, s2, b, b);
            }
            case 4: {
                return (x9p)new j4m(s, c, s2, b, b, kjw);
            }
            case 3: {
                return new rk8(s, c, s2, b, b, n, "prefetch");
            }
            case 2: {
                return (x9p)new a3m(s, c, s2, b, b, dmv);
            }
            case 1: {
                return new rk8(s, c, s2, b, b, n, "directly_typed");
            }
        }
    }
}
