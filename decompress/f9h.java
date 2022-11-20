import com.google.android.exoplayer2.n;

// 
// Decompiled by Procyon v0.6.0
// 

public interface f9h
{
    public static final f9h$a a = new f9h() {
        @Override
        public final boolean e(final n n) {
            final String o0 = n.O0;
            return "application/id3".equals(o0) || "application/x-emsg".equals(o0) || "application/x-scte35".equals(o0) || "application/x-icy".equals(o0) || "application/vnd.dvb.ait".equals(o0);
        }
        
        @Override
        public final e9h f(final n n) {
            final String o0 = n.O0;
            if (o0 != null) {
                int n2 = -1;
                switch (o0) {
                    case "application/x-scte35": {
                        n2 = 4;
                        break;
                    }
                    case "application/x-emsg": {
                        n2 = 3;
                        break;
                    }
                    case "application/id3": {
                        n2 = 2;
                        break;
                    }
                    case "application/x-icy": {
                        n2 = 1;
                        break;
                    }
                    case "application/vnd.dvb.ait": {
                        n2 = 0;
                        break;
                    }
                    default:
                        break;
                }
                switch (n2) {
                    case 4: {
                        return (e9h)new c2r();
                    }
                    case 3: {
                        return (e9h)new sba();
                    }
                    case 2: {
                        return (e9h)new g4d();
                    }
                    case 1: {
                        return (e9h)new d4d();
                    }
                    case 0: {
                        return (e9h)new um0();
                    }
                }
            }
            final String value = String.valueOf(o0);
            String concat;
            if (value.length() != 0) {
                concat = "Attempted to create decoder for unsupported MIME type: ".concat(value);
            }
            else {
                concat = new String("Attempted to create decoder for unsupported MIME type: ");
            }
            throw new IllegalArgumentException(concat);
        }
    };
    
    boolean e(final n p0);
    
    e9h f(final n p0);
}
