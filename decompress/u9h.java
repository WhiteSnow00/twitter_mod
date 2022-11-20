import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

public final class u9h
{
    public static final String[] a;
    
    static {
        a = new String[] { "Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient" };
    }
    
    public static vr4 a(final int n, final rwj rwj) {
        final int e = rwj.e();
        if (rwj.e() == 1684108385) {
            rwj.E(8);
            final String o = rwj.o(e - 16);
            return new vr4("und", o, o);
        }
        final String value = String.valueOf(fx0.a(n));
        String concat;
        if (value.length() != 0) {
            concat = "Failed to parse comment attribute: ".concat(value);
        }
        else {
            concat = new String("Failed to parse comment attribute: ");
        }
        Log.w("MetadataUtil", concat);
        return null;
    }
    
    public static li0 b(final rwj rwj) {
        int e = rwj.e();
        if (rwj.e() != 1684108385) {
            Log.w("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        final int n = rwj.e() & 0xFFFFFF;
        String s;
        if (n == 13) {
            s = "image/jpeg";
        }
        else if (n == 14) {
            s = "image/png";
        }
        else {
            s = null;
        }
        if (s == null) {
            mw.A(41, "Unrecognized cover art flags: ", n, "MetadataUtil");
            return null;
        }
        rwj.E(4);
        e -= 16;
        final byte[] array = new byte[e];
        rwj.d(array, 0, e);
        return new li0(s, (String)null, 3, array);
    }
    
    public static gis c(int y, String o, final rwj rwj) {
        final int e = rwj.e();
        if (rwj.e() == 1684108385 && e >= 22) {
            rwj.E(10);
            final int y2 = rwj.y();
            if (y2 > 0) {
                final StringBuilder sb = new StringBuilder(11);
                sb.append(y2);
                final String string = sb.toString();
                y = rwj.y();
                String string2 = string;
                if (y > 0) {
                    final String value = String.valueOf(string);
                    final StringBuilder sb2 = new StringBuilder(value.length() + 12);
                    sb2.append(value);
                    sb2.append("/");
                    sb2.append(y);
                    string2 = sb2.toString();
                }
                return new gis((String)o, null, string2);
            }
        }
        o = String.valueOf(fx0.a(y));
        if (((String)o).length() != 0) {
            o = "Failed to parse index/count attribute: ".concat((String)o);
        }
        else {
            o = new String("Failed to parse index/count attribute: ");
        }
        Log.w("MetadataUtil", (String)o);
        return null;
    }
    
    public static gis d(final int n, String s, final rwj rwj) {
        final int e = rwj.e();
        if (rwj.e() == 1684108385) {
            rwj.E(8);
            return new gis(s, null, rwj.o(e - 16));
        }
        s = String.valueOf(fx0.a(n));
        if (s.length() != 0) {
            s = "Failed to parse text attribute: ".concat(s);
        }
        else {
            s = new String("Failed to parse text attribute: ");
        }
        Log.w("MetadataUtil", s);
        return null;
    }
    
    public static h4d e(final int n, String o, final rwj rwj, final boolean b, final boolean b2) {
        int n3;
        final int n2 = n3 = f(rwj);
        if (b2) {
            n3 = Math.min(1, n2);
        }
        if (n3 >= 0) {
            h4d h4d;
            if (b) {
                h4d = new gis((String)o, null, Integer.toString(n3));
            }
            else {
                h4d = new vr4("und", (String)o, Integer.toString(n3));
            }
            return h4d;
        }
        o = String.valueOf(fx0.a(n));
        if (((String)o).length() != 0) {
            o = "Failed to parse uint8 attribute: ".concat((String)o);
        }
        else {
            o = new String("Failed to parse uint8 attribute: ");
        }
        Log.w("MetadataUtil", (String)o);
        return null;
    }
    
    public static int f(final rwj rwj) {
        rwj.E(4);
        if (rwj.e() == 1684108385) {
            rwj.E(8);
            return rwj.t();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }
}
