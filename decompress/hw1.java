import android.text.SpannableStringBuilder;
import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hw1
{
    public static final qes$d d;
    public static final String e;
    public static final String f;
    public static final hw1 g;
    public static final hw1 h;
    public final boolean a;
    public final int b;
    public final pes c;
    
    static {
        final qes$d qes$d = d = qes.c;
        e = Character.toString('\u200e');
        f = Character.toString('\u200f');
        g = new hw1(false, 2, (pes)qes$d);
        h = new hw1(true, 2, (pes)qes$d);
    }
    
    public hw1(final boolean a, final int b, final pes c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static int a(final CharSequence charSequence) {
        final a a = new a(charSequence);
        final int n = 0;
        a.c = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
    Label_0347:
        while (true) {
            final int c = a.c;
            if (c < a.b && n2 == 0) {
                final char char1 = a.a.charAt(c);
                a.d = char1;
                byte b;
                if (Character.isHighSurrogate(char1)) {
                    final int codePoint = Character.codePointAt(a.a, a.c);
                    a.c += Character.charCount(codePoint);
                    b = Character.getDirectionality(codePoint);
                }
                else {
                    ++a.c;
                    final char d = a.d;
                    if (d < '\u0700') {
                        b = hw1.a.e[d];
                    }
                    else {
                        b = Character.getDirectionality(d);
                    }
                }
                if (b != 0) {
                    if (b != 1 && b != 2) {
                        if (b == 9) {
                            continue;
                        }
                        switch (b) {
                            case 18: {
                                --n4;
                                n3 = 0;
                                continue;
                            }
                            case 16:
                            case 17: {
                                ++n4;
                                n3 = 1;
                                continue;
                            }
                            case 14:
                            case 15: {
                                ++n4;
                                n3 = -1;
                                continue;
                            }
                        }
                    }
                    else if (n4 == 0) {
                        break;
                    }
                }
                else if (n4 == 0) {
                    return -1;
                }
                n2 = n4;
            }
            else {
                if (n2 == 0) {
                    return n;
                }
                int n6 = n4;
                if (n3 != 0) {
                    return n3;
                }
                while (true) {
                    final int n5 = n;
                    if (a.c <= 0) {
                        return n5;
                    }
                    switch (a.a()) {
                        default: {
                            continue;
                        }
                        case 18: {
                            ++n6;
                            continue;
                        }
                        case 16:
                        case 17: {
                            if (n2 == n6) {
                                break Label_0347;
                            }
                            break;
                        }
                        case 14:
                        case 15: {
                            if (n2 == n6) {
                                return -1;
                            }
                            break;
                        }
                    }
                    --n6;
                }
            }
        }
        return 1;
        n5 = -1;
        return n5;
    }
    
    public static int b(final CharSequence charSequence) {
        final a a = new a(charSequence);
        a.c = a.b;
        final int n = 0;
        int n2 = 0;
        int n3 = 0;
    Label_0139:
        while (true) {
            final int n4 = n;
            if (a.c <= 0) {
                return n4;
            }
            final byte a2 = a.a();
            Label_0166: {
                if (a2 != 0) {
                    if (a2 != 1 && a2 != 2) {
                        if (a2 != 9) {
                            switch (a2) {
                                default: {
                                    if (n3 == 0) {
                                        break Label_0166;
                                    }
                                    continue;
                                }
                                case 18: {
                                    ++n2;
                                    continue;
                                }
                                case 16:
                                case 17: {
                                    if (n3 == n2) {
                                        break Label_0139;
                                    }
                                    break;
                                }
                                case 14:
                                case 15: {
                                    if (n3 == n2) {
                                        return -1;
                                    }
                                    break;
                                }
                            }
                            --n2;
                            continue;
                        }
                        continue;
                    }
                    else {
                        if (n2 == 0) {
                            break;
                        }
                        if (n3 != 0) {
                            continue;
                        }
                    }
                }
                else {
                    if (n2 == 0) {
                        return -1;
                    }
                    if (n3 != 0) {
                        continue;
                    }
                }
            }
            n3 = n2;
        }
        return 1;
        n4 = -1;
        return n4;
    }
    
    public static hw1 c() {
        final Locale default1 = Locale.getDefault();
        final int a = ejs.a;
        final int a2 = ejs$a.a(default1);
        boolean b = true;
        if (a2 != 1) {
            b = false;
        }
        hw1 hw1;
        if (b) {
            hw1 = hw1.h;
        }
        else {
            hw1 = hw1.g;
        }
        return hw1;
    }
    
    public final CharSequence d(final CharSequence charSequence) {
        return this.e(charSequence, this.c);
    }
    
    public final CharSequence e(final CharSequence charSequence, final pes pes) {
        if (charSequence == null) {
            return null;
        }
        final boolean b = ((qes$c)pes).b(charSequence, charSequence.length());
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        final boolean b2 = (this.b & 0x2) != 0x0;
        final String s = "";
        if (b2) {
            qes$d qes$d;
            if (b) {
                qes$d = qes.b;
            }
            else {
                qes$d = qes.a;
            }
            final boolean b3 = ((qes$c)qes$d).b(charSequence, charSequence.length());
            String s2;
            if (!this.a && (b3 || a(charSequence) == 1)) {
                s2 = hw1.e;
            }
            else if (this.a && (!b3 || a(charSequence) == -1)) {
                s2 = hw1.f;
            }
            else {
                s2 = "";
            }
            spannableStringBuilder.append((CharSequence)s2);
        }
        if (b != this.a) {
            char c;
            if (b) {
                c = '\u202b';
            }
            else {
                c = '\u202a';
            }
            spannableStringBuilder.append(c);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append('\u202c');
        }
        else {
            spannableStringBuilder.append(charSequence);
        }
        qes$d qes$d2;
        if (b) {
            qes$d2 = qes.b;
        }
        else {
            qes$d2 = qes.a;
        }
        final boolean b4 = ((qes$c)qes$d2).b(charSequence, charSequence.length());
        String s3 = null;
        Label_0301: {
            if (!this.a && (b4 || b(charSequence) == 1)) {
                s3 = hw1.e;
            }
            else {
                s3 = s;
                if (this.a) {
                    if (b4) {
                        s3 = s;
                        if (b(charSequence) != -1) {
                            break Label_0301;
                        }
                    }
                    s3 = hw1.f;
                }
            }
        }
        spannableStringBuilder.append((CharSequence)s3);
        return (CharSequence)spannableStringBuilder;
    }
    
    public static final class a
    {
        public static final byte[] e;
        public final CharSequence a;
        public final int b;
        public int c;
        public char d;
        
        static {
            e = new byte[1792];
            for (int i = 0; i < 1792; ++i) {
                a.e[i] = Character.getDirectionality(i);
            }
        }
        
        public a(final CharSequence a) {
            this.a = a;
            this.b = a.length();
        }
        
        public final byte a() {
            final char char1 = this.a.charAt(this.c - 1);
            this.d = char1;
            if (Character.isLowSurrogate(char1)) {
                final int codePointBefore = Character.codePointBefore(this.a, this.c);
                this.c -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            --this.c;
            final char d = this.d;
            byte directionality;
            if (d < '\u0700') {
                directionality = hw1.a.e[d];
            }
            else {
                directionality = Character.getDirectionality(d);
            }
            return directionality;
        }
    }
}
