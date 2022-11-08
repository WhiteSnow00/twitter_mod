import java.util.List;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xow
{
    static {
        Objects.requireNonNull(qkr.Companion);
        Objects.requireNonNull(skr.Companion);
        Objects.requireNonNull(o12.Companion);
        Objects.requireNonNull(pr4.Companion);
        final long f = pr4.f;
        Objects.requireNonNull(lzj.Companion);
    }
    
    public static final List<rzj> a(final String s) {
        Object o;
        if (s == null) {
            o = v2a.C0;
        }
        else {
            final tzj tzj = new tzj();
            tzj.a.clear();
            int i = 1;
            int n = 0;
            while (i < s.length()) {
                while (i < s.length()) {
                    final char char1 = s.charAt(i);
                    if (((char1 - 'Z') * (char1 - 'A') <= 0 || (char1 - 'z') * (char1 - 'a') <= 0) && char1 != 'e' && char1 != 'E') {
                        break;
                    }
                    ++i;
                }
                final String substring = s.substring(n, i);
                zzd.e((Object)substring, "this as java.lang.String\u2026ing(startIndex, endIndex)");
                int n2 = substring.length() - 1;
                int j = 0;
                int n3 = 0;
                while (j <= n2) {
                    int n4;
                    if (n3 == 0) {
                        n4 = j;
                    }
                    else {
                        n4 = n2;
                    }
                    final boolean b = zzd.h((int)substring.charAt(n4), 32) <= 0;
                    if (n3 == 0) {
                        if (!b) {
                            n3 = 1;
                        }
                        else {
                            ++j;
                        }
                    }
                    else {
                        if (!b) {
                            break;
                        }
                        --n2;
                    }
                }
                final String string = substring.subSequence(j, n2 + 1).toString();
                if (string.length() > 0) {
                    float[] array2;
                    if (string.charAt(0) != 'z' && string.charAt(0) != 'Z') {
                        final int length = string.length();
                        final float[] array = new float[length];
                        final int length2 = string.length();
                        int k = 1;
                        int n5 = 0;
                        while (k < length2) {
                            int n6 = k;
                            int n7 = 0;
                            int n8 = 0;
                            int n9 = 0;
                            boolean b2 = false;
                            int n10;
                            while (true) {
                                n10 = n9;
                                if (n6 >= string.length()) {
                                    break;
                                }
                                final char char2 = string.charAt(n6);
                                boolean b3 = false;
                                Label_0369: {
                                    if (char2 != ' ') {
                                        if (char2 != ',') {
                                            b3 = false;
                                            break Label_0369;
                                        }
                                    }
                                    b3 = true;
                                }
                                Label_0484: {
                                    Label_0427: {
                                        if (!b3) {
                                            int n11 = 0;
                                            Label_0477: {
                                                if (char2 == '-') {
                                                    n11 = n7;
                                                    if (n6 == k) {
                                                        break Label_0477;
                                                    }
                                                    n11 = n7;
                                                    if (n8 != 0) {
                                                        break Label_0477;
                                                    }
                                                }
                                                else if (char2 == '.') {
                                                    if (n7 == 0) {
                                                        n11 = 1;
                                                        break Label_0477;
                                                    }
                                                }
                                                else {
                                                    boolean b4 = false;
                                                    Label_0462: {
                                                        if (char2 != 'e') {
                                                            if (char2 != 'E') {
                                                                b4 = false;
                                                                break Label_0462;
                                                            }
                                                        }
                                                        b4 = true;
                                                    }
                                                    n11 = n7;
                                                    if (b4) {
                                                        n8 = 1;
                                                        break Label_0484;
                                                    }
                                                    break Label_0477;
                                                }
                                                n9 = 1;
                                                break Label_0427;
                                            }
                                            n8 = 0;
                                            n7 = n11;
                                            break Label_0484;
                                        }
                                    }
                                    n8 = 0;
                                    b2 = true;
                                }
                                if (b2) {
                                    n10 = n9;
                                    break;
                                }
                                ++n6;
                            }
                            int n12 = n5;
                            if (k < n6) {
                                final String substring2 = string.substring(k, n6);
                                zzd.e((Object)substring2, "this as java.lang.String\u2026ing(startIndex, endIndex)");
                                array[n5] = Float.parseFloat(substring2);
                                n12 = n5 + 1;
                            }
                            if (n10 == 0) {
                                ++n6;
                            }
                            k = n6;
                            n5 = n12;
                        }
                        if (n5 < 0) {
                            throw new IllegalArgumentException();
                        }
                        if (length < 0) {
                            throw new IndexOutOfBoundsException();
                        }
                        final int n13 = n5 + 0;
                        final int min = Math.min(n13, length + 0);
                        array2 = new float[n13];
                        System.arraycopy(array, 0, array2, 0, min + 0 - 0);
                    }
                    else {
                        array2 = new float[0];
                    }
                    tzj.a(string.charAt(0), array2);
                }
                n = i;
                ++i;
            }
            if (i - n == 1 && n < s.length()) {
                tzj.a(s.charAt(n), new float[0]);
            }
            o = tzj.a;
        }
        return (List<rzj>)o;
    }
}
