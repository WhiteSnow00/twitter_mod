import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import com.twitter.model.json.common.InvalidJsonFormatException;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class s7c extends twj<q7c>
{
    public static final q7c$c a(final s7c s7c, final khe khe) {
        Objects.requireNonNull(s7c);
        final lje e = khe.e();
        int n;
        if (e == null) {
            n = -1;
        }
        else {
            n = s7c$a.a[((Enum)e).ordinal()];
        }
        Object o = null;
        switch (n) {
            default: {
                final lje e2 = khe.e();
                final StringBuilder sb = new StringBuilder();
                sb.append("Invalid json token encountered: Expected Scalar or Container found ");
                sb.append(e2);
                throw new InvalidJsonFormatException(sb.toString());
            }
            case 11: {
                o = new q7c$c$a(true);
                break;
            }
            case 10: {
                o = new q7c$c$a(false);
                break;
            }
            case 9: {
                o = new q7c$c$e(khe.f());
                break;
            }
            case 8: {
                o = new q7c$c$e(khe.f());
                break;
            }
            case 7: {
                final String j = khe.j();
                zzd.e((Object)j, "jsonParser.text");
                o = new q7c$c$f(j);
                break;
            }
            case 6: {
                o = new q7c$c$b((List)s7c.d(khe, (rtb<? super khe, ?>)new x7c(s7c)));
                break;
            }
            case 4: {
                o = new q7c$c$d();
                break;
            }
            case 3: {
                o = new q7c$c$c((Map)s7c.e(khe, (rtb<? super khe, ?>)new w7c(s7c)));
                break;
            }
        }
        return (q7c$c)o;
    }
    
    public final q7c b(final khe khe) {
        zzd.f((Object)khe, "jsonParser");
        final lje a = khe.a();
        int n;
        if (a == null) {
            n = -1;
        }
        else {
            n = s7c.s7c$a.a[((Enum)a).ordinal()];
        }
        String j = null;
        if (n == 3) {
            Object o = null;
            Object o2;
            List list = (List)(o2 = o);
            while (khe.i0() != null) {
                final lje a2 = khe.a();
                int n2;
                if (a2 == null) {
                    n2 = -1;
                }
                else {
                    n2 = s7c.s7c$a.a[((Enum)a2).ordinal()];
                }
                if (n2 != 1) {
                    if (n2 != 2) {
                        final lje e = khe.e();
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Invalid json token encountered: ");
                        sb.append(e);
                        throw new InvalidJsonFormatException(sb.toString());
                    }
                    if (j != null) {
                        return new q7c(j, (List)o, list, (Map)o2);
                    }
                    throw new InvalidJsonFormatException("Invalid json token encountered: expected FIELD with name \"message\" and found none.");
                }
                else {
                    final String d = khe.d();
                    if (d != null) {
                        switch (d) {
                            case "message": {
                                khe.i0();
                                final lje a3 = khe.a();
                                int n3;
                                if (a3 == null) {
                                    n3 = -1;
                                }
                                else {
                                    n3 = s7c.s7c$a.a[((Enum)a3).ordinal()];
                                }
                                if (n3 == 7) {
                                    j = khe.j();
                                    zzd.e((Object)j, "jsonParser.text");
                                    continue;
                                }
                                final lje e2 = khe.e();
                                final StringBuilder sb2 = new StringBuilder();
                                sb2.append("Invalid json token encountered: Expected STRING found ");
                                sb2.append(e2);
                                throw new InvalidJsonFormatException(sb2.toString());
                            }
                            case "path": {
                                khe.i0();
                                list = this.f(khe, (rtb<? super khe, ? extends List>)new rtb<khe, List<? extends q7c$b>>() {
                                    public final /* synthetic */ s7c C0;
                                    
                                    public final Object invoke(final Object o) {
                                        final khe khe = (khe)o;
                                        zzd.f((Object)khe, "parser");
                                        final s7c c0 = this.C0;
                                        return c0.d(khe, (rtb<? super khe, ?>)new u7c(c0));
                                    }
                                });
                                continue;
                            }
                            case "locations": {
                                khe.i0();
                                o = this.f(khe, (rtb<? super khe, ? extends List>)new rtb<khe, List<? extends q7c$a>>() {
                                    public final /* synthetic */ s7c C0;
                                    
                                    public final Object invoke(final Object o) {
                                        final khe khe = (khe)o;
                                        zzd.f((Object)khe, "parser");
                                        final s7c c0 = this.C0;
                                        return c0.d(khe, (rtb<? super khe, ?>)new t7c(c0));
                                    }
                                });
                                continue;
                            }
                            case "extensions": {
                                khe.i0();
                                o2 = this.f(khe, (rtb<? super khe, ? extends Map>)new rtb<khe, Map<String, ? extends q7c$c>>() {
                                    public final /* synthetic */ s7c C0;
                                    
                                    public final Object invoke(final Object o) {
                                        final khe khe = (khe)o;
                                        zzd.f((Object)khe, "parser");
                                        final s7c c0 = this.C0;
                                        return c0.e(khe, (rtb<? super khe, ?>)new v7c(c0));
                                    }
                                });
                                continue;
                            }
                            default:
                                break;
                        }
                    }
                    if (!khe.i0().G0) {
                        continue;
                    }
                    khe.m0();
                }
            }
            throw new InvalidJsonFormatException("Invalid json unexpected EOF");
        }
        if (n == 4) {
            return null;
        }
        final lje e3 = khe.e();
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("Invalid json token encountered: ");
        sb3.append(e3);
        throw new InvalidJsonFormatException(sb3.toString());
    }
    
    public final int c(final khe khe) {
        final lje a = khe.a();
        int n;
        if (a == null) {
            n = -1;
        }
        else {
            n = s7c.s7c$a.a[((Enum)a).ordinal()];
        }
        int n2;
        if (n != 8) {
            if (n != 9) {
                final lje e = khe.e();
                final StringBuilder sb = new StringBuilder();
                sb.append("Invalid json token encountered: Expected NUMBER found ");
                sb.append(e);
                throw new InvalidJsonFormatException(sb.toString());
            }
            n2 = (int)khe.i();
        }
        else {
            n2 = (int)khe.f();
        }
        return n2;
    }
    
    public final <T> List<T> d(final khe khe, final rtb<? super khe, ? extends T> rtb) {
        final lje e = khe.e();
        int n;
        if (e == null) {
            n = -1;
        }
        else {
            n = s7c.s7c$a.a[((Enum)e).ordinal()];
        }
        if (n == 6) {
            final ArrayList<T> list = new ArrayList<T>();
            while (khe.i0() != null) {
                final lje e2 = khe.e();
                int n2;
                if (e2 == null) {
                    n2 = -1;
                }
                else {
                    n2 = s7c.s7c$a.a[((Enum)e2).ordinal()];
                }
                if (n2 == 5) {
                    return list;
                }
                list.add((T)rtb.invoke((Object)khe));
            }
            throw new InvalidJsonFormatException("Invalid json unexpected EOF");
        }
        final lje e3 = khe.e();
        final StringBuilder sb = new StringBuilder();
        sb.append("Invalid json token encountered: Expected ARRAY found");
        sb.append(e3);
        throw new RuntimeException(sb.toString());
    }
    
    public final <T> Map<String, T> e(final khe khe, final rtb<? super khe, ? extends T> rtb) {
        final lje e = khe.e();
        int n;
        if (e == null) {
            n = -1;
        }
        else {
            n = s7c.s7c$a.a[((Enum)e).ordinal()];
        }
        if (n == 3) {
            final LinkedHashMap<String, T> linkedHashMap = new LinkedHashMap<String, T>();
            while (khe.i0() != null) {
                final lje e2 = khe.e();
                int n2;
                if (e2 == null) {
                    n2 = -1;
                }
                else {
                    n2 = s7c.s7c$a.a[((Enum)e2).ordinal()];
                }
                if (n2 == 2) {
                    return linkedHashMap;
                }
                khe.i0();
                final String d = khe.d();
                zzd.e((Object)d, "jsonParser.currentName");
                linkedHashMap.put(d, (T)rtb.invoke((Object)khe));
            }
            throw new InvalidJsonFormatException("Invalid json unexpected EOF");
        }
        final lje e3 = khe.e();
        final StringBuilder sb = new StringBuilder();
        sb.append("Invalid json token encountered: Expected OBJECT found ");
        sb.append(e3);
        throw new RuntimeException(sb.toString());
    }
    
    public final <T> T f(final khe khe, final rtb<? super khe, ? extends T> rtb) {
        final lje a = khe.a();
        int n;
        if (a == null) {
            n = -1;
        }
        else {
            n = s7c.s7c$a.a[((Enum)a).ordinal()];
        }
        Object invoke;
        if (n == 4) {
            invoke = null;
        }
        else {
            invoke = rtb.invoke((Object)khe);
        }
        return (T)invoke;
    }
}
