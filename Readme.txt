
< Rest API Server : demoRestWS >
@RequestMapping("/persons")
	@GetMapping("/all")  -- getAll
	@GetMapping("{id}")  -- getPerson
	@PostMapping("/post")  -- createNewPerson
	


< Rest API Client : demoRestConsume >
http://localhost:8080/persons/1

* curl 실행
curl http://localhost:8080/persons/1
<?xml version="1.0" encoding="UTF-8" standalone="yes"?><person><age>21</age><firstName>Steve</firstName><id>1</id><lastName>Smith</lastName></person>

ㅇ browser 에서 실행

<person>
<script src="chrome-extension://ljdobmomdgdljniojadhoplhkpialdid/page/prompt.js"/>
<script src="chrome-extension://ljdobmomdgdljniojadhoplhkpialdid/page/runScript.js"/>
<age>21</age>
<firstName>Steve</firstName>
<id>1</id>
<lastName>Smith</lastName>
</person>




