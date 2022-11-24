import java.lang.reflect.Modifier;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.TreeSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ppz
{
    public static final void a(final StringBuilder sb, final int n, String s, final Object o) {
        if (o instanceof List) {
            final Iterator iterator = ((List)o).iterator();
            while (iterator.hasNext()) {
                a(sb, n, s, iterator.next());
            }
            return;
        }
        if (o instanceof Map) {
            final Iterator iterator2 = ((Map)o).entrySet().iterator();
            while (iterator2.hasNext()) {
                a(sb, n, s, iterator2.next());
            }
            return;
        }
        sb.append('\n');
        final int n2 = 0;
        final int n3 = 0;
        for (int i = 0; i < n; ++i) {
            sb.append(' ');
        }
        sb.append(s);
        if (o instanceof String) {
            sb.append(": \"");
            s = (String)o;
            final whz g0 = oiz.G0;
            sb.append(ak1.Z((oiz)new whz(s.getBytes(tmz.a))));
            sb.append('\"');
            return;
        }
        if (o instanceof oiz) {
            sb.append(": \"");
            sb.append(ak1.Z((oiz)o));
            sb.append('\"');
            return;
        }
        if (o instanceof bmz) {
            sb.append(" {");
            c((kpz)o, sb, n + 2);
            sb.append("\n");
            for (int j = n3; j < n; ++j) {
                sb.append(' ');
            }
            sb.append("}");
            return;
        }
        if (o instanceof Map.Entry) {
            sb.append(" {");
            final Map.Entry entry = (Map.Entry)o;
            final int n4 = n + 2;
            a(sb, n4, "key", entry.getKey());
            a(sb, n4, "value", entry.getValue());
            sb.append("\n");
            for (int k = n2; k < n; ++k) {
                sb.append(' ');
            }
            sb.append("}");
            return;
        }
        sb.append(": ");
        sb.append(o);
    }
    
    public static final String b(final String s) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); ++i) {
            final char char1 = s.charAt(i);
            if (Character.isUpperCase(char1)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(char1));
        }
        return sb.toString();
    }
    
    public static void c(final kpz kpz, final StringBuilder sb, final int n) {
        final HashMap hashMap = new HashMap();
        final HashMap hashMap2 = new HashMap();
        final TreeSet set = new TreeSet();
        final Method[] declaredMethods = kpz.getClass().getDeclaredMethods();
        final int length = declaredMethods.length;
        final int n2 = 0;
        for (final Method method : declaredMethods) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    set.add(method.getName());
                }
            }
        }
        for (final String s : set) {
            String substring;
            if (s.startsWith("get")) {
                substring = s.substring(3);
            }
            else {
                substring = s;
            }
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                final String concat = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1, substring.length() - 4)));
                final Method method2 = hashMap.get(s);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    a(sb, n, b(concat), bmz.o(method2, (Object)kpz, new Object[0]));
                    continue;
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                final String concat2 = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1, substring.length() - 3)));
                final Method method3 = hashMap.get(s);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    a(sb, n, b(concat2), bmz.o(method3, (Object)kpz, new Object[0]));
                    continue;
                }
            }
            if (hashMap2.get("set".concat(substring)) != null && (!substring.endsWith("Bytes") || !hashMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                final String concat3 = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1)));
                final Method method4 = hashMap.get("get".concat(substring));
                final Method method5 = hashMap.get("has".concat(substring));
                if (method4 == null) {
                    continue;
                }
                final Object o = bmz.o(method4, (Object)kpz, new Object[0]);
                Label_0772: {
                    if (method5 == null) {
                        if (o instanceof Boolean) {
                            if (!(boolean)o) {
                                continue;
                            }
                        }
                        else if (o instanceof Integer) {
                            if ((int)o == 0) {
                                continue;
                            }
                        }
                        else if (o instanceof Float) {
                            if (Float.floatToRawIntBits((float)o) == 0) {
                                continue;
                            }
                        }
                        else if (o instanceof Double) {
                            if (Double.doubleToRawLongBits((double)o) == 0L) {
                                continue;
                            }
                        }
                        else {
                            boolean b;
                            if (o instanceof String) {
                                b = o.equals("");
                            }
                            else if (o instanceof oiz) {
                                b = o.equals(oiz.G0);
                            }
                            else if (o instanceof kpz) {
                                if (o != ((npz)o).e()) {
                                    break Label_0772;
                                }
                                continue;
                            }
                            else {
                                if (!(o instanceof Enum)) {
                                    break Label_0772;
                                }
                                if (((Enum)o).ordinal() != 0) {
                                    break Label_0772;
                                }
                                continue;
                            }
                            if (b) {
                                continue;
                            }
                        }
                    }
                    else if (!(boolean)bmz.o(method5, (Object)kpz, new Object[0])) {
                        continue;
                    }
                }
                a(sb, n, b(concat3), o);
            }
        }
        if (!(kpz instanceof clz)) {
            final yrz zzc = ((bmz)kpz).zzc;
            if (zzc != null) {
                for (int j = n2; j < zzc.a; ++j) {
                    a(sb, n, String.valueOf(zzc.b[j] >>> 3), zzc.c[j]);
                }
            }
            return;
        }
        final clz clz = (clz)kpz;
        throw null;
    }
}
