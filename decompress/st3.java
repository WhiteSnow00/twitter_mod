// 
// Decompiled by Procyon v0.6.0
// 

public abstract class st3 implements ntk<Character>
{
    public int a(final CharSequence charSequence, int i) {
        final int length = charSequence.length();
        j78.g(i, length);
        while (i < length) {
            if (this.b(charSequence.charAt(i))) {
                return i;
            }
            ++i;
        }
        return -1;
    }
    
    public abstract boolean b(final char p0);
}
