import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import com.twitter.model.json.common.InvalidJsonFormatException;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class v7c extends nxj<t7c>
{
    public static final t7c$c a(final v7c v7c, final qhe qhe) {
        Objects.requireNonNull(v7c);
        final rje e = qhe.e();
        int n;
        if (e == null) {
            n = -1;
        }
        else {
            n = v7c$a.a[e.ordinal()];
        }
        Object o = null;
        switch (n) {
            default: {
                final rje e2 = qhe.e();
                final StringBuilder sb = new StringBuilder();
                sb.append("Invalid json token encountered: Expected Scalar or Container found ");
                sb.append(e2);
                throw new InvalidJsonFormatException(sb.toString());
            }
            case 11: {
                o = new t7c$c$a(true);
                break;
            }
            case 10: {
                o = new t7c$c$a(false);
                break;
            }
            case 9: {
                o = new t7c$c$e(qhe.f());
                break;
            }
            case 8: {
                o = new t7c$c$e(qhe.f());
                break;
            }
            case 7: {
                final String j = qhe.j();
                e0e.e((Object)j, "jsonParser.text");
                o = new t7c$c$f(j);
                break;
            }
            case 6: {
                o = new t7c$c$b((List)v7c.d(qhe, (stb<? super qhe, ?>)new a8c(v7c)));
                break;
            }
            case 4: {
                o = new t7c$c$d();
                break;
            }
            case 3: {
                o = new t7c$c$c((Map)v7c.e(qhe, (stb<? super qhe, ?>)new z7c(v7c)));
                break;
            }
        }
        return (t7c$c)o;
    }
    
    public final t7c b(final qhe qhe) {
        e0e.f((Object)qhe, "jsonParser");
        final rje a = qhe.a();
        int n;
        if (a == null) {
            n = -1;
        }
        else {
            n = v7c.v7c$a.a[a.ordinal()];
        }
        String j = null;
        if (n == 3) {
            List list = null;
            Map map;
            Object o = map = null;
            while (qhe.i0() != null) {
                final rje a2 = qhe.a();
                int n2;
                if (a2 == null) {
                    n2 = -1;
                }
                else {
                    n2 = v7c.v7c$a.a[a2.ordinal()];
                }
                if (n2 != 1) {
                    if (n2 != 2) {
                        final rje e = qhe.e();
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Invalid json token encountered: ");
                        sb.append(e);
                        throw new InvalidJsonFormatException(sb.toString());
                    }
                    if (j != null) {
                        return new t7c(j, list, (List)o, (Map)map);
                    }
                    throw new InvalidJsonFormatException("Invalid json token encountered: expected FIELD with name \"message\" and found none.");
                }
                else {
                    final String d = qhe.d();
                    if (d != null) {
                        switch (d) {
                            case "message": {
                                qhe.i0();
                                final rje a3 = qhe.a();
                                int n3;
                                if (a3 == null) {
                                    n3 = -1;
                                }
                                else {
                                    n3 = v7c.v7c$a.a[a3.ordinal()];
                                }
                                if (n3 == 7) {
                                    j = qhe.j();
                                    e0e.e((Object)j, "jsonParser.text");
                                    continue;
                                }
                                final rje e2 = qhe.e();
                                final StringBuilder sb2 = new StringBuilder();
                                sb2.append("Invalid json token encountered: Expected STRING found ");
                                sb2.append(e2);
                                throw new InvalidJsonFormatException(sb2.toString());
                            }
                            case "path": {
                                qhe.i0();
                                o = this.f(qhe, (stb<? super qhe, ? extends List>)new v7c$c(this));
                                continue;
                            }
                            case "locations": {
                                qhe.i0();
                                list = this.f(qhe, (stb<? super qhe, ? extends List>)new v7c$b(this));
                                continue;
                            }
                            case "extensions": {
                                qhe.i0();
                                map = this.f(qhe, (stb<? super qhe, ? extends Map>)new v7c$d(this));
                                continue;
                            }
                            default:
                                break;
                        }
                    }
                    if (!qhe.i0().J0) {
                        continue;
                    }
                    qhe.m0();
                }
            }
            throw new InvalidJsonFormatException("Invalid json unexpected EOF");
        }
        if (n == 4) {
            return null;
        }
        final rje e3 = qhe.e();
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("Invalid json token encountered: ");
        sb3.append(e3);
        throw new InvalidJsonFormatException(sb3.toString());
    }
    
    public final int c(final qhe qhe) {
        final rje a = qhe.a();
        int n;
        if (a == null) {
            n = -1;
        }
        else {
            n = v7c.v7c$a.a[a.ordinal()];
        }
        int n2;
        if (n != 8) {
            if (n != 9) {
                final rje e = qhe.e();
                final StringBuilder sb = new StringBuilder();
                sb.append("Invalid json token encountered: Expected NUMBER found ");
                sb.append(e);
                throw new InvalidJsonFormatException(sb.toString());
            }
            n2 = (int)qhe.i();
        }
        else {
            n2 = (int)qhe.f();
        }
        return n2;
    }
    
    public final <T> List<T> d(final qhe qhe, final stb<? super qhe, ? extends T> stb) {
        final rje e = qhe.e();
        int n;
        if (e == null) {
            n = -1;
        }
        else {
            n = v7c.v7c$a.a[e.ordinal()];
        }
        if (n == 6) {
            final ArrayList<T> list = new ArrayList<T>();
            while (qhe.i0() != null) {
                final rje e2 = qhe.e();
                int n2;
                if (e2 == null) {
                    n2 = -1;
                }
                else {
                    n2 = v7c.v7c$a.a[e2.ordinal()];
                }
                if (n2 == 5) {
                    return list;
                }
                list.add((T)stb.invoke((Object)qhe));
            }
            throw new InvalidJsonFormatException("Invalid json unexpected EOF");
        }
        final rje e3 = qhe.e();
        final StringBuilder sb = new StringBuilder();
        sb.append("Invalid json token encountered: Expected ARRAY found");
        sb.append(e3);
        throw new RuntimeException(sb.toString());
    }
    
    public final <T> Map<String, T> e(final qhe qhe, final stb<? super qhe, ? extends T> stb) {
        final rje e = qhe.e();
        int n;
        if (e == null) {
            n = -1;
        }
        else {
            n = v7c.v7c$a.a[e.ordinal()];
        }
        if (n == 3) {
            final LinkedHashMap<String, T> linkedHashMap = new LinkedHashMap<String, T>();
            while (qhe.i0() != null) {
                final rje e2 = qhe.e();
                int n2;
                if (e2 == null) {
                    n2 = -1;
                }
                else {
                    n2 = v7c.v7c$a.a[e2.ordinal()];
                }
                if (n2 == 2) {
                    return linkedHashMap;
                }
                qhe.i0();
                final String d = qhe.d();
                e0e.e((Object)d, "jsonParser.currentName");
                linkedHashMap.put(d, (T)stb.invoke((Object)qhe));
            }
            throw new InvalidJsonFormatException("Invalid json unexpected EOF");
        }
        final rje e3 = qhe.e();
        final StringBuilder sb = new StringBuilder();
        sb.append("Invalid json token encountered: Expected OBJECT found ");
        sb.append(e3);
        throw new RuntimeException(sb.toString());
    }
    
    public final <T> T f(final qhe qhe, final stb<? super qhe, ? extends T> stb) {
        final rje a = qhe.a();
        int n;
        if (a == null) {
            n = -1;
        }
        else {
            n = v7c.v7c$a.a[a.ordinal()];
        }
        Object invoke;
        if (n == 4) {
            invoke = null;
        }
        else {
            invoke = stb.invoke((Object)qhe);
        }
        return (T)invoke;
    }
    
    public final /* bridge */ Object parse(final qhe qhe) {
        return this.b(qhe);
    }
}
