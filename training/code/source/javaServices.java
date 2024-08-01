

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class javaServices

{
	// ---( internal utility methods )---

	final static javaServices _instance = new javaServices();

	static javaServices _newInstance() { return new javaServices(); }

	static javaServices _cast(Object o) { return (javaServices)o; }

	// ---( server methods )---




	public static final void demoDocJavaServices (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(demoDocJavaServices)>> ---
		// @sigtype java 3.5
		}
				demoDocCursor.destroy();
			}// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		
			// demoDoc
			IData	demoDoc = IDataUtil.getIData( pipelineCursor, "demoDoc" );
			if ( demoDoc != null)
			{
				IDataCursor demoDocCursor = demoDoc.getCursor();
					String	PONumber = IDataUtil.getString( demoDocCursor, "PONumber" );
					String	SenderID = IDataUtil.getString( demoDocCursor, "SenderID" );
		
					// i.items
					IData	items = IDataUtil.getIData( demoDocCursor, "items" );
					if ( items != null)
					{
						IDataCursor itemsCursor = items.getCursor();
							String	Description = IDataUtil.getString( itemsCursor, "Description" );
							String	Quantity = IDataUtil.getString( itemsCursor, "Quantity" );
						itemsCursor.destroy();
					
		pipelineCursor.destroy();
		
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		
		// outdemoDoc
		IData	outdemoDoc = IDataFactory.create();
		IDataCursor outdemoDocCursor = outdemoDoc.getCursor();
		IDataUtil.put( outdemoDocCursor, "PONumber", "PONumber" );
		
		// outdemoDoc.items
		IData	items_1 = IDataFactory.create();
		IDataCursor items_1Cursor = items_1.getCursor();
		IDataUtil.put( items_1Cursor, "Description", "Description" );
		items_1Cursor.destroy();
		IDataUtil.put( outdemoDocCursor, "items", items_1 );
		outdemoDocCursor.destroy();
		IDataUtil.put( pipelineCursor_1, "outdemoDoc", outdemoDoc );
		pipelineCursor_1.destroy();
		// --- <<IS-END>> ---

                
	}



	public static final void myFirstJavaServices (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(myFirstJavaServices)>> ---
		// @sigtype java 3.5
		// [i] field:0:required inputString
		// [o] field:0:required outputString
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
			String	inputString = IDataUtil.getString( pipelineCursor, "inputString" );
		pipelineCursor.destroy();
		
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		IDataUtil.put( pipelineCursor_1, "outputString", "outputString" );
		pipelineCursor_1.destroy();
		// --- <<IS-END>> ---

                
	}



	public static final void mySecondJavaServices (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(mySecondJavaServices)>> ---
		// @sigtype java 3.5
		// [i] field:0:required inputString
		// [o] field:0:required outputString
		I
		// --- <<IS-END>> ---

                
	}



	public static final void namaPerusahaan (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(namaPerusahaan)>> ---
		// @sigtype java 3.5
		// --- <<IS-END>> ---

                
	}



	public static final void outdoc (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(outdoc)>> ---
		// @sigtype java 3.5
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		
			// demoDoc
			IData	demoDoc = IDataUtil.getIData( pipelineCursor, "demoDoc" );
			if ( demoDoc != null)
			{
				IDataCursor demoDocCursor = demoDoc.getCursor();
					String	PONumber = IDataUtil.getString( demoDocCursor, "PONumber" );
					String	SenderID = IDataUtil.getString( demoDocCursor, "SenderID" );
		
					// i.items
					IData[]	items = IDataUtil.getIDataArray( demoDocCursor, "items" );
					if ( items != null)
					{
						for ( int i = 0; i < items.length; i++ )
						{
							IDataCursor itemsCursor = items[i].getCursor();
								String	Description = IDataUtil.getString( itemsCursor, "Description" );
								String	Quantity = IDataUtil.getString( itemsCursor, "Quantity" );
							itemsCursor.destroy();
						}
					}
				demoDocCursor.destroy();
			}
		pipelineCursor.destroy();
		
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		
		// demoDoc
		IData	demoDoc_1 = IDataFactory.create();
		IDataCursor demoDoc_1Cursor = demoDoc_1.getCursor();
		IDataUtil.put( demoDoc_1Cursor, "PONumber", "PONumber" );
		
		// demoDoc.items
		IData[]	items_1 = new IData[1];
		items_1[0] = IDataFactory.create();
		IDataCursor items_1Cursor = items_1[0].getCursor();
		IDataUtil.put( items_1Cursor, "Description", "Description" );
		items_1Cursor.destroy();
		IDataUtil.put( demoDoc_1Cursor, "items", items_1 );
		demoDoc_1Cursor.destroy();
		IDataUtil.put( pipelineCursor_1, "demoDoc", demoDoc_1 );
		pipelineCursor_1.destroy();
		// --- <<IS-END>> ---

                
	}
}

