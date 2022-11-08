import android.database.AbstractCursor;
import java.nio.channels.FileChannel;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.io.IOException;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.io.File;
import android.database.MatrixCursor;
import android.os.Build$VERSION;
import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import java.util.Iterator;
import java.util.Objects;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class he7
{
    public static void a(final tyr tyr) {
        final ArrayList list = new ArrayList();
        final qqb qqb = (qqb)tyr;
        Objects.requireNonNull(qqb);
        Object o = qqb.X((wyr)new t8q("SELECT name FROM sqlite_master WHERE type = 'trigger'"));
        try {
            while (((Cursor)o).moveToNext()) {
                list.add(((Cursor)o).getString(0));
            }
            ((Cursor)o).close();
            final Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                o = iterator.next();
                if (((String)o).startsWith("room_fts_content_sync_")) {
                    o = l7k.c("DROP TRIGGER IF EXISTS ", (String)o);
                    ((qqb)tyr).x((String)o);
                }
            }
        }
        finally {
            ((Cursor)o).close();
        }
    }
    
    public static Cursor b(gcn gcn, final wyr wyr, final boolean b) {
        final Cursor o = gcn.o(wyr);
        if (b && o instanceof AbstractWindowedCursor) {
            gcn = (gcn)o;
            final int count = ((AbstractCursor)gcn).getCount();
            int numRows;
            if (((AbstractWindowedCursor)gcn).hasWindow()) {
                numRows = ((AbstractWindowedCursor)gcn).getWindow().getNumRows();
            }
            else {
                numRows = count;
            }
            if (Build$VERSION.SDK_INT >= 23) {
                if (numRows >= count) {
                    return o;
                }
            }
            try {
                final MatrixCursor matrixCursor = new MatrixCursor(((Cursor)gcn).getColumnNames(), ((Cursor)gcn).getCount());
                while (((Cursor)gcn).moveToNext()) {
                    final Object[] array = new Object[((Cursor)gcn).getColumnCount()];
                    for (int i = 0; i < ((Cursor)gcn).getColumnCount(); ++i) {
                        final int type = ((Cursor)gcn).getType(i);
                        if (type != 0) {
                            if (type != 1) {
                                if (type != 2) {
                                    if (type != 3) {
                                        if (type != 4) {
                                            throw new IllegalStateException();
                                        }
                                        array[i] = ((Cursor)gcn).getBlob(i);
                                    }
                                    else {
                                        array[i] = ((Cursor)gcn).getString(i);
                                    }
                                }
                                else {
                                    array[i] = ((Cursor)gcn).getDouble(i);
                                }
                            }
                            else {
                                array[i] = ((Cursor)gcn).getLong(i);
                            }
                        }
                        else {
                            array[i] = null;
                        }
                    }
                    matrixCursor.addRow(array);
                }
                return (Cursor)matrixCursor;
            }
            finally {
                ((Cursor)gcn).close();
            }
        }
        return o;
    }
    
    public static int c(final File file) throws IOException {
        AbstractInterruptibleChannel channel;
        final AbstractInterruptibleChannel abstractInterruptibleChannel = channel = null;
        try {
            final ByteBuffer allocate = ByteBuffer.allocate(4);
            channel = abstractInterruptibleChannel;
            channel = abstractInterruptibleChannel;
            final FileInputStream fileInputStream = new FileInputStream(file);
            channel = abstractInterruptibleChannel;
            final FileChannel fileChannel = (FileChannel)(channel = fileInputStream.getChannel());
            fileChannel.tryLock(60L, 4L, true);
            channel = fileChannel;
            fileChannel.position(60L);
            channel = fileChannel;
            if (fileChannel.read(allocate) == 4) {
                channel = fileChannel;
                allocate.rewind();
                channel = fileChannel;
                final int int1 = allocate.getInt();
                fileChannel.close();
                return int1;
            }
            channel = fileChannel;
            channel = fileChannel;
            final IOException ex = new IOException("Bad database header, unable to read 4 bytes at offset 60");
            channel = fileChannel;
            throw ex;
        }
        finally {
            if (channel != null) {
                channel.close();
            }
        }
    }
}
