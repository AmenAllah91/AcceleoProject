package org.bd.pfe.generator.presentation.template;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


// TODO: Auto-generated Javadoc
/**
 * The Class CopyFile.
 */
public class CopyFile
{


	/**
	 * Copy.
	 *
	 * @param templae the templae
	 * @param dir           the dir
	 * @param newdir           the newdir
	 * @throws IOException            Signals that an I/O exception has occurred.
	 */
	public static void copy(String templae ,String dir, String newdir) throws IOException
	{
		Path jdkPath = Paths.get(templae+"/"+dir);
		DirectoryStream<Path> stream = null;
		try
		{
			stream = Files.newDirectoryStream(jdkPath);



			Iterator<Path> iterator = stream.iterator();

			while (iterator.hasNext())
			{
				Path p = iterator.next();

				Path monFichierCopie = Paths.get(newdir + "/" + p.getFileName());
				Files.copy(p, monFichierCopie, StandardCopyOption.REPLACE_EXISTING);
			}

		}
		catch (Exception exception)
		{

		}
		finally
		{
			if (stream != null)
				stream.close();

		}

	}

	/**
	 * Creates the repertoire.
	 *
	 * @param dir the dir
	 * @param template the template
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public static void createRepertoire(String template,String dir) throws IOException
	{
		List<String> repertoire = Arrays.asList("css",
				                                "css/fonts",
				                                "images",
				                                "images/dashboard", 
				                                "images/flags", 
				                                "images/icons", 
				                                "images/reports",
				                                "js", 
				                                "js/adapters",
				                                "js/modules",
				                                "js/themes",
				                                "images/img");
		for (String rep : repertoire)
		{
			File file = new File(dir  +"/"+ rep);
			if (!file.exists())  file.mkdirs();
			copy(template,rep, dir +"/"  + rep);

		}
	}
}
