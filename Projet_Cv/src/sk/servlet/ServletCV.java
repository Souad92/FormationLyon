package sk.servlet;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import sk.metier.Etudiant;
import sk.metier.Formation;
import sk.metier.ListeEtudiant;
import sk.metier.ListeFormation;

/**
 * Servlet implementation class ServletCV
 */
@WebServlet("/ServletCV")
public class ServletCV extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletCV() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		ListeFormation listeFormation = (ListeFormation) session.getAttribute("ListForm");
		Formation formation = (Formation) session.getAttribute("formation");

		
		
		File file2 = new File("C:/DevFormation/Workspace/Projet_Cv/WebContent/WEB-INF/xml/CV.xml");
		final DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder documentBuilder = factory.newDocumentBuilder();
			Document document = documentBuilder.parse(file2);

			Element racine = document.getDocumentElement();
			NodeList list = racine.getChildNodes();
			int nbList = list.getLength();
			for (int i = 0; i < nbList; i++) {
				if (list.item(i).getNodeType() == Node.ELEMENT_NODE) {
					Element eFormation = (Element) list.item(i);
					NodeList lFormation = eFormation.getChildNodes();
					String sId = eFormation.getAttribute("id");
					Formation form = listeFormation.get(Integer.valueOf(sId).intValue());
					for (int j = 0; j < lFormation.getLength(); j++) {
						if (lFormation.item(j).getNodeType() == Node.ELEMENT_NODE) {

							Element eEtudiant = (Element) lFormation.item(j);
							String nom = eEtudiant.getAttribute("nom");
							String prenom = eEtudiant.getAttribute("prenom");
							String metier = eEtudiant.getAttribute("metier");
							String email = eEtudiant.getAttribute("email");
							String commentaire = eEtudiant.getTextContent();
							Etudiant e = new Etudiant(nom, prenom, metier, email);
							// listeEtudiant.add(e);
							ListeEtudiant lstEtudiant = form.getListeEtudiant();
							lstEtudiant.add(e);
							System.out.println(nom + " " + prenom + " " + metier + " " + email + " " + commentaire + " " + form);
						}
					}
				}
			}
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		PrintWriter out = response.getWriter();
		File file = new File("C:/DevFormation/Workspace/Projet_Cv/WebContent/WEB-INF/page/CV2.html");
		System.out.println(file.getAbsolutePath() + " " + file.exists());
		BufferedReader buf = null;
		String line = "";

		buf = new BufferedReader(new FileReader(file));

		line = buf.readLine();

		while (line != null) {

			line = buf.readLine();

		}
		out.println(line);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
