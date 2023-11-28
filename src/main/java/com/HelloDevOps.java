package com;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloDevOps {

	@GetMapping("**") //все URL
	public String getRoot() {
		String ret = "";
		ret += "<html>";
		ret += "<head>";
		ret += "<style>";
		ret += ".holder {";
		ret += "	display:flex;";
		ret += "	justify-content:center;";
		ret += "	align-items:center;";
		ret += "	width: 100vw;";
		ret += "	height: 100vh;";
		ret += "	background-color: #262626;";
		ret += "	}";
		ret += "a {";
		ret += "	text-decoration: none;";
		ret += "	}";
		ret += "h1 {";
		ret += "	color: #ffffff;";
		ret += "	font-size: 4rem;";
		ret += "	font-family: sans-serif;";
		ret += "	}";
		ret += "h2 {";
		ret += "	color: #ffffff;";
		ret += "	font-size: 3rem;";
		ret += "	font-family: sans-serif;";
		ret += "	}";
		ret += "</style>";
		ret += "</head>";
		ret += "<body>";
		ret += "<div class=holder>";
		ret += "	<div class=center>";
		ret += "		<a href='https://devops-school.ru/devops_engineer.html'>";
		ret += "		<h1>DevOps Инженер 2024</h1>";
		ret += "		<h2>(DevOps Engineer 200490-M)</h2>";
		ret += "		</a>";
		ret += "	</div>";
		ret += "</div>";
		ret += "</body>";
		ret += "</html>";
		return ret;
		}


	}
