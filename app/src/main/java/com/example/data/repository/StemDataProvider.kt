package com.example.data.repository

import com.example.data.model.*

object StemDataProvider {

    fun getMathematicsSubject(): Subject {
        val textbook = TextbookInfo(
            title = "Calculus: Early Transcendentals & Linear Algebra",
            authors = "James Stewart & Gilbert Strang",
            edition = "9th & 5th Edition",
            publisher = "Cengage & Wellesley-Cambridge Press",
            primarySubject = "Mathematics",
            description = "The gold-standard reference textbooks for university-level multivariable calculus, differential equations, and linear algebra applications.",
            referenceUrl = "https://ocw.mit.edu/courses/mathematics/",
            officialGuidelinesUrl = "https://mathworld.wolfram.com/",
            keyChapters = listOf(
                "Vectors & Matrix Spaces",
                "Eigenvalues & Eigenvectors",
                "Multivariable Integration & Stokes' Theorem",
                "Second-Order Differential Equations",
                "Probability Distributions & Bayes' Theorem"
            )
        )

        val calculusQuestions = listOf(
            Question(
                id = "math_calc_01",
                subjectId = "mathematics",
                topicId = "math_calc",
                topicName = "Multivariable Calculus",
                text = "State Stokes' Theorem. Evaluate the surface integral ∬_S (∇ × F) · dS where F(x, y, z) = -y i + x j + z^2 k and S is the upper hemisphere x^2 + y^2 + z^2 = 1, z ≥ 0 oriented upwards.",
                years = listOf("2024", "2021", "2018"),
                type = QuestionType.LONG_ESSAY,
                marksBreakdown = "3 + 7 = 10 Marks",
                textbookRef = "Stewart Calculus (9th Ed)",
                pageNumbers = "1138-1144",
                highYieldPoints = listOf(
                    "Stokes' Theorem: ∬_S (∇ × F) · dS = ∮_C F · dr",
                    "Boundary C is the unit circle x^2 + y^2 = 1 in the xy-plane (z = 0)",
                    "Parametrize C: r(t) = ⟨cos t, sin t, 0⟩ for t ∈ [0, 2π]",
                    "Line integral: ∮_C (-y dx + x dy) = ∫_0^2π (sin^2 t + cos^2 t) dt = 2π"
                ),
                referenceLinks = listOf(
                    ReferenceLink("MIT OCW Stokes' Theorem", "https://ocw.mit.edu/courses/mathematics/18-02sc-multivariable-calculus-fall-2010/", "Lecture")
                ),
                isRepeatQuestion = true
            ),
            Question(
                id = "math_calc_02",
                subjectId = "mathematics",
                topicId = "math_calc",
                topicName = "Multivariable Calculus",
                text = "Find and classify all local extrema and saddle points of the function f(x, y) = x^3 + y^3 - 3xy using the Second Partial Derivative Test.",
                years = listOf("2025", "2022", "2019"),
                type = QuestionType.SHORT_ESSAY,
                marksBreakdown = "2 + 6 = 8 Marks",
                textbookRef = "Stewart Calculus (9th Ed)",
                pageNumbers = "962-968",
                highYieldPoints = listOf(
                    "Critical points: f_x = 3x^2 - 3y = 0 and f_y = 3y^2 - 3x = 0 => (0,0) and (1,1)",
                    "Hessian D = f_xx f_yy - (f_xy)^2 = 36xy - 9",
                    "At (0,0): D = -9 < 0 => Saddle point at (0,0,0)",
                    "At (1,1): D = 27 > 0 and f_xx = 6 > 0 => Local Minimum at (1,1,-1)"
                ),
                referenceLinks = emptyList(),
                isRepeatQuestion = true
            ),
            Question(
                id = "math_calc_03",
                subjectId = "mathematics",
                topicId = "math_calc",
                topicName = "Multivariable Calculus",
                text = "State the Divergence Theorem (Gauss's Theorem). Use it to calculate the outward flux of F(x, y, z) = x^3 i + y^3 j + z^3 k across the surface of the unit sphere x^2 + y^2 + z^2 = 1.",
                years = listOf("2023", "2020", "2016"),
                type = QuestionType.LONG_ESSAY,
                marksBreakdown = "3 + 7 = 10 Marks",
                textbookRef = "Stewart Calculus (9th Ed)",
                pageNumbers = "1150-1156",
                highYieldPoints = listOf(
                    "Divergence Theorem: ∬_S F · dS = ∭_E (∇ · F) dV",
                    "∇ · F = ∂(x^3)/∂x + ∂(y^3)/∂y + ∂(z^3)/∂z = 3(x^2 + y^2 + z^2) = 3r^2",
                    "Using spherical coordinates: ∭_E 3r^2 dV = 3 ∫_0^2π dθ ∫_0^π sin φ dφ ∫_0^1 r^4 dr",
                    "Integral evaluates to 3 × (2π) × (2) × (1/5) = 12π / 5"
                ),
                referenceLinks = emptyList(),
                isRepeatQuestion = true
            ),
            Question(
                id = "math_calc_04",
                subjectId = "mathematics",
                topicId = "math_calc",
                topicName = "Multivariable Calculus",
                text = "Evaluate the Gaussian double integral I = ∫_(-∞)^∞ e^(-x^2) dx by transforming the product I^2 = ∬_(R^2) e^(-(x^2 + y^2)) dA into polar coordinates.",
                years = listOf("2024", "2021", "2017"),
                type = QuestionType.SHORT_ESSAY,
                marksBreakdown = "2 + 6 = 8 Marks",
                textbookRef = "Stewart Calculus (9th Ed)",
                pageNumbers = "1012-1016",
                highYieldPoints = listOf(
                    "I^2 = ∫_0^2π dθ ∫_0^∞ e^(-r^2) r dr",
                    "Substitution u = r^2, du = 2r dr yields ∫_0^∞ e^(-u) (1/2) du = 1/2",
                    "I^2 = 2π × (1/2) = π => I = √π"
                ),
                referenceLinks = emptyList()
            )
        )

        val linearAlgebraQuestions = listOf(
            Question(
                id = "math_la_01",
                subjectId = "mathematics",
                topicId = "math_linear_algebra",
                topicName = "Linear Algebra",
                text = "Explain the Diagonalization of an n × n matrix A. Diagonalize the symmetric matrix A = [[2, 1], [1, 2]]. Find an orthogonal matrix P such that P^T A P = D.",
                years = listOf("2024", "2022", "2017"),
                type = QuestionType.LONG_ESSAY,
                marksBreakdown = "3 + 7 = 10 Marks",
                textbookRef = "Strang Linear Algebra (5th Ed)",
                pageNumbers = "302-310",
                highYieldPoints = listOf(
                    "Characteristic equation det(A - λI) = (2-λ)^2 - 1 = 0 => λ_1 = 3, λ_2 = 1",
                    "Eigenvectors: v_1 = [1, 1]^T (normalized: [1/√2, 1/√2]^T), v_2 = [-1, 1]^T (normalized: [-1/√2, 1/√2]^T)",
                    "Modal matrix P = [[1/√2, -1/√2], [1/√2, 1/√2]], Diagonal matrix D = [[3, 0], [0, 1]]"
                ),
                referenceLinks = listOf(
                    ReferenceLink("Strang MIT Linear Algebra", "https://ocw.mit.edu/courses/18-06-linear-algebra-spring-2010/", "Course")
                ),
                isRepeatQuestion = true
            ),
            Question(
                id = "math_la_02",
                subjectId = "mathematics",
                topicId = "math_linear_algebra",
                topicName = "Linear Algebra",
                text = "State and prove the Rank-Nullity Theorem for a linear transformation T: V -> W. Provide a geometric interpretation in R^3.",
                years = listOf("2023", "2020", "2016"),
                type = QuestionType.SHORT_ESSAY,
                marksBreakdown = "2 + 6 = 8 Marks",
                textbookRef = "Strang Linear Algebra (5th Ed)",
                pageNumbers = "156-162",
                highYieldPoints = listOf(
                    "dim(V) = rank(T) + nullity(T) = dim(range(T)) + dim(ker(T))",
                    "Fundamental Theorem of Linear Algebra connects 4 fundamental subspaces",
                    "Row space and null space are orthogonal complements in R^n"
                ),
                referenceLinks = emptyList()
            ),
            Question(
                id = "math_la_03",
                subjectId = "mathematics",
                topicId = "math_linear_algebra",
                topicName = "Linear Algebra",
                text = "Describe the Gram-Schmidt Orthogonalization process. Transform the basis vectors v_1 = [1, 1, 0]^T, v_2 = [1, 0, 1]^T, v_3 = [0, 1, 1]^T into an orthonormal basis in R^3.",
                years = listOf("2025", "2021", "2018"),
                type = QuestionType.LONG_ESSAY,
                marksBreakdown = "3 + 7 = 10 Marks",
                textbookRef = "Strang Linear Algebra (5th Ed)",
                pageNumbers = "230-238",
                highYieldPoints = listOf(
                    "u_1 = v_1 = [1, 1, 0]^T, ||u_1|| = √2 => q_1 = [1/√2, 1/√2, 0]^T",
                    "u_2 = v_2 - (q_1 · v_2) q_1 = [1, 0, 1]^T - (1/√2)[1/√2, 1/√2, 0]^T = [1/2, -1/2, 1]^T, ||u_2|| = √(3/2) => q_2 = [1/√6, -1/√6, 2/√6]^T",
                    "u_3 = v_3 - (q_1 · v_3) q_1 - (q_2 · v_3) q_2 => yields normalized q_3 = [-1/√3, 1/√3, 1/√3]^T"
                ),
                referenceLinks = emptyList(),
                isRepeatQuestion = true
            )
        )

        val diffEqQuestions = listOf(
            Question(
                id = "math_de_01",
                subjectId = "mathematics",
                topicId = "math_diff_equations",
                topicName = "Differential Equations",
                text = "Solve the initial value problem y'' + 4y' + 13y = 0 with y(0) = 2, y'(0) = 1 using the characteristic roots method.",
                years = listOf("2025", "2021", "2019"),
                type = QuestionType.SHORT_ESSAY,
                marksBreakdown = "2 + 6 = 8 Marks",
                textbookRef = "Boyce & DiPrima ODE (11th Ed)",
                pageNumbers = "145-152",
                highYieldPoints = listOf(
                    "Characteristic equation: r^2 + 4r + 13 = 0 => r = -2 ± 3i",
                    "General solution: y(t) = e^(-2t) [C_1 cos(3t) + C_2 sin(3t)]",
                    "y(0) = 2 => C_1 = 2; y'(0) = -2(2) + 3C_2 = 1 => C_2 = 5/3",
                    "Particular solution: y(t) = e^(-2t) [2 cos(3t) + (5/3) sin(3t)]"
                ),
                referenceLinks = emptyList()
            ),
            Question(
                id = "math_de_02",
                subjectId = "mathematics",
                topicId = "math_diff_equations",
                topicName = "Differential Equations",
                text = "Use Laplace Transforms to solve y'' + 2y' + 2y = δ(t - π) with initial conditions y(0) = 0, y'(0) = 1, where δ is the Dirac delta function.",
                years = listOf("2024", "2022", "2018"),
                type = QuestionType.LONG_ESSAY,
                marksBreakdown = "3 + 7 = 10 Marks",
                textbookRef = "Boyce & DiPrima ODE (11th Ed)",
                pageNumbers = "320-328",
                highYieldPoints = listOf(
                    "L{y''} = s^2 Y(s) - sy(0) - y'(0) = s^2 Y(s) - 1; L{δ(t - π)} = e^(-πs)",
                    "(s^2 + 2s + 2) Y(s) - 1 = e^(-πs) => Y(s) = 1/((s+1)^2 + 1) + e^(-πs)/((s+1)^2 + 1)",
                    "Inverse transform: y(t) = e^(-t) sin t + u_π(t) e^(-(t-π)) sin(t - π) = e^(-t) sin t - u_π(t) e^(-(t-π)) sin t"
                ),
                referenceLinks = emptyList(),
                isRepeatQuestion = true
            )
        )

        val topics = listOf(
            Topic(
                id = "math_calc",
                subjectId = "mathematics",
                name = "Multivariable Calculus",
                description = "Gradient, Divergence, Curl, Double/Triple Integrals, Green's, Stokes', and Divergence Theorems.",
                textbookChapter = "Stewart Ch. 14-16",
                standardPages = "pp. 950-1170",
                questions = calculusQuestions
            ),
            Topic(
                id = "math_linear_algebra",
                subjectId = "mathematics",
                name = "Linear Algebra",
                description = "Vector spaces, linear transformations, eigenvalues, eigenvectors, diagonalization, and SVD.",
                textbookChapter = "Strang Ch. 3-6",
                standardPages = "pp. 140-360",
                questions = linearAlgebraQuestions
            ),
            Topic(
                id = "math_diff_equations",
                subjectId = "mathematics",
                name = "Differential Equations",
                description = "First and second order ODEs, Laplace transforms, and boundary value problems.",
                textbookChapter = "Boyce Ch. 2-6",
                standardPages = "pp. 120-290",
                questions = diffEqQuestions
            )
        )

        return Subject(
            id = "mathematics",
            name = "Mathematics",
            code = "MATH401",
            iconName = "Calculate",
            primaryColor = 0xFF1565C0,
            secondaryColor = 0xFF42A5F5,
            standardTextbook = textbook,
            theoryMarks = "Theory: 100 Marks (Paper 1 Calculus & Linear Algebra: 50, Paper 2 ODE & Analysis: 50)",
            practicalMarks = "Lab / Computational Problem Solving: 50 Marks",
            vivaMarks = "Oral Examination / Viva: 25 Marks",
            syllabusOverview = "Advanced university mathematics comprising Multivariable Calculus, Vector Fields, Linear Transformations, Eigenvalues, Orthogonal Decompositions, and Analytical Differential Equations.",
            marksDistributionDetails = listOf(
                "Section A: 2 Long Proof / Problem Solving Questions (10 Marks each)",
                "Section B: 4 Short Conceptual & Derivation Questions (8 Marks each)",
                "Section C: 6 Rapid Computation Problems (4 Marks each)"
            ),
            topics = topics
        )
    }

    fun getPhysicsSubject(): Subject {
        val textbook = TextbookInfo(
            title = "Introduction to Electrodynamics & Classical Mechanics",
            authors = "David J. Griffiths & John R. Taylor",
            edition = "4th & 1st Edition",
            publisher = "Cambridge University Press & University Science Books",
            primarySubject = "Physics",
            description = "Foundational university textbooks in electrodynamics, Maxwell's equations, Lagrangian dynamics, and wave mechanics.",
            referenceUrl = "https://ocw.mit.edu/courses/physics/",
            officialGuidelinesUrl = "https://physics.nist.gov/",
            keyChapters = listOf(
                "Lagrangian & Hamiltonian Mechanics",
                "Electrostatics & Poisson's Equation",
                "Magnetostatics & Ampere's Law",
                "Electrodynamics & Maxwell's Equations",
                "Electromagnetic Waves in Matter"
            )
        )

        val emQuestions = listOf(
            Question(
                id = "phys_em_01",
                subjectId = "physics",
                topicId = "phys_electrodynamics",
                topicName = "Electrodynamics",
                text = "Write down Maxwell's equations in differential form in vacuum. Derive the electromagnetic wave equation for E and B from Maxwell's equations and prove that the wave speed is c = 1/√(μ_0 ε_0).",
                years = listOf("2024", "2022", "2019", "2017"),
                type = QuestionType.LONG_ESSAY,
                marksBreakdown = "4 + 6 = 10 Marks",
                textbookRef = "Griffiths Electrodynamics (4th Ed)",
                pageNumbers = "386-394",
                highYieldPoints = listOf(
                    "Maxwell's 4 equations in vacuum: ∇·E = 0, ∇·B = 0, ∇×E = -∂B/∂t, ∇×B = μ_0 ε_0 ∂E/∂t",
                    "Take curl of Faraday's Law: ∇×(∇×E) = ∇(∇·E) - ∇^2 E = -∂(∇×B)/∂t",
                    "Substitute ∇·E = 0 and Ampere-Maxwell: -∇^2 E = -μ_0 ε_0 ∂^2 E/∂t^2",
                    "Yields wave equation: ∇^2 E = (1/c^2) ∂^2 E/∂t^2 with c = 1/√(μ_0 ε_0) ≈ 3 × 10^8 m/s"
                ),
                referenceLinks = listOf(
                    ReferenceLink("MIT Electromagnetism", "https://ocw.mit.edu/courses/8-02-physics-ii-electricity-and-magnetism-spring-2007/", "Course")
                ),
                isRepeatQuestion = true
            ),
            Question(
                id = "phys_em_02",
                subjectId = "physics",
                topicId = "phys_electrodynamics",
                topicName = "Electrodynamics",
                text = "Explain the boundary conditions for electric field E and magnetic field B across an interface between two dielectric media with no free charge and no free current.",
                years = listOf("2025", "2023", "2020"),
                type = QuestionType.SHORT_ESSAY,
                marksBreakdown = "4 + 4 = 8 Marks",
                textbookRef = "Griffiths Electrodynamics (4th Ed)",
                pageNumbers = "342-348",
                highYieldPoints = listOf(
                    "Normal components: D_1^⊥ - D_2^⊥ = σ_f = 0 => ε_1 E_1^⊥ = ε_2 E_2^⊥",
                    "B_1^⊥ - B_2^⊥ = 0 => Continuous normal B component",
                    "Tangential components: E_1^∥ - E_2^∥ = 0 => Continuous tangential E",
                    "H_1^∥ - H_2^∥ = K_f × n = 0 => Continuous tangential H"
                ),
                referenceLinks = emptyList()
            ),
            Question(
                id = "phys_em_03",
                subjectId = "physics",
                topicId = "phys_electrodynamics",
                topicName = "Electrodynamics",
                text = "State and derive Poynting's Theorem for conservation of electromagnetic energy. What is the physical significance of the Poynting vector S = (1/μ_0) (E × B)?",
                years = listOf("2024", "2021", "2018"),
                type = QuestionType.LONG_ESSAY,
                marksBreakdown = "3 + 7 = 10 Marks",
                textbookRef = "Griffiths Electrodynamics (4th Ed)",
                pageNumbers = "364-370",
                highYieldPoints = listOf(
                    "Work done on charges dW/dt = ∫ (E · J) dV",
                    "Poynting's Theorem: -dW/dt = d/dt ∫ u_em dV + ∮ S · da, where u_em = (1/2)(ε_0 E^2 + (1/μ_0)B^2)",
                    "Poynting vector S represents rate of energy flow per unit area (power density W/m^2) in direction of propagation"
                ),
                referenceLinks = emptyList(),
                isRepeatQuestion = true
            )
        )

        val mechanicsQuestions = listOf(
            Question(
                id = "phys_mech_01",
                subjectId = "physics",
                topicId = "phys_mechanics",
                topicName = "Classical Mechanics",
                text = "Derive Euler-Lagrange equations of motion from Hamilton's Principle of Least Action δ∫ L dt = 0. Find the equation of motion for a simple pendulum of length l and mass m using Lagrangian mechanics.",
                years = listOf("2024", "2021", "2018"),
                type = QuestionType.LONG_ESSAY,
                marksBreakdown = "5 + 5 = 10 Marks",
                textbookRef = "Taylor Classical Mechanics",
                pageNumbers = "215-225",
                highYieldPoints = listOf(
                    "Lagrangian L = T - V with kinetic energy T and potential energy V",
                    "Euler-Lagrange equation: d/dt(∂L/∂θ̇) - ∂L/∂θ = 0",
                    "For simple pendulum: T = (1/2) m l^2 θ̇^2, V = -m g l cos θ",
                    "L = (1/2) m l^2 θ̇^2 + m g l cos θ => m l^2 θ̈ + m g l sin θ = 0 => θ̈ + (g/l) sin θ = 0"
                ),
                referenceLinks = emptyList(),
                isRepeatQuestion = true
            ),
            Question(
                id = "phys_mech_02",
                subjectId = "physics",
                topicId = "phys_mechanics",
                topicName = "Classical Mechanics",
                text = "Explain the two-body central force problem. Derive Kepler's Second Law (equal areas in equal times) from conservation of angular momentum.",
                years = listOf("2025", "2022", "2017"),
                type = QuestionType.SHORT_ESSAY,
                marksBreakdown = "3 + 5 = 8 Marks",
                textbookRef = "Taylor Classical Mechanics",
                pageNumbers = "290-298",
                highYieldPoints = listOf(
                    "Central force F(r) = f(r) r̂ exerts zero torque: τ = r × F = 0",
                    "Angular momentum L = r × p is constant in magnitude and direction",
                    "Area swept: dA = (1/2) |r × dr| = (1/2) |r × v| dt = (L / 2m) dt",
                    "Areal velocity dA/dt = L / (2m) = constant => Kepler's 2nd Law"
                ),
                referenceLinks = emptyList()
            )
        )

        val quantumQuestions = listOf(
            Question(
                id = "phys_qm_01",
                subjectId = "physics",
                topicId = "phys_quantum",
                topicName = "Quantum Mechanics",
                text = "State the Time-Independent Schrödinger Equation. Solve for the energy eigenvalues and normalized wavefunctions of a particle of mass m confined in an infinite square well of width L (0 ≤ x ≤ L).",
                years = listOf("2025", "2022", "2019"),
                type = QuestionType.LONG_ESSAY,
                marksBreakdown = "3 + 7 = 10 Marks",
                textbookRef = "Griffiths Quantum Mechanics (3rd Ed)",
                pageNumbers = "29-37",
                highYieldPoints = listOf(
                    "Schrödinger equation: - (ℏ^2 / 2m) d^2ψ/dx^2 + V(x)ψ = Eψ",
                    "Boundary conditions: ψ(0) = 0 and ψ(L) = 0 => k_n = nπ / L for n = 1, 2, 3...",
                    "Energy eigenvalues: E_n = (n^2 π^2 ℏ^2) / (2m L^2)",
                    "Normalized wavefunctions: ψ_n(x) = √(2/L) sin(nπx / L)"
                ),
                referenceLinks = listOf(
                    ReferenceLink("MIT 8.04 Quantum Physics", "https://ocw.mit.edu/courses/8-04-quantum-physics-i-spring-2016/", "Lecture")
                ),
                isRepeatQuestion = true
            ),
            Question(
                id = "phys_qm_02",
                subjectId = "physics",
                topicId = "phys_quantum",
                topicName = "Quantum Mechanics",
                text = "Explain the Quantum Harmonic Oscillator using ladder operators (annihilation operator a and creation operator a†). Derive the ground state wavefunction and show [a, a†] = 1.",
                years = listOf("2024", "2020", "2016"),
                type = QuestionType.LONG_ESSAY,
                marksBreakdown = "4 + 6 = 10 Marks",
                textbookRef = "Griffiths Quantum Mechanics (3rd Ed)",
                pageNumbers = "40-52",
                highYieldPoints = listOf(
                    "Hamiltonian H = ℏω (a† a + 1/2)",
                    "Commutator [a, a†] = aa† - a†a = 1",
                    "Ground state condition: a ψ_0 = 0 => (ip + mωx) ψ_0 = 0",
                    "Ground state wavefunction: ψ_0(x) = (mω / πℏ)^(1/4) e^(-(mω / 2ℏ) x^2)",
                    "Energy eigenvalues E_n = (n + 1/2) ℏω with zero-point energy E_0 = (1/2) ℏω"
                ),
                referenceLinks = emptyList(),
                isRepeatQuestion = true
            )
        )

        val topics = listOf(
            Topic(
                id = "phys_electrodynamics",
                subjectId = "physics",
                name = "Electrodynamics",
                description = "Maxwell's Equations, Gauge Transformations, Poynting Vector, EM Waves in Media.",
                textbookChapter = "Griffiths Ch. 7-9",
                standardPages = "pp. 310-430",
                questions = emQuestions
            ),
            Topic(
                id = "phys_mechanics",
                subjectId = "physics",
                name = "Classical Mechanics",
                description = "Lagrangian dynamics, generalized coordinates, central force motion, and rigid body rotation.",
                textbookChapter = "Taylor Ch. 6-8",
                standardPages = "pp. 200-340",
                questions = mechanicsQuestions
            ),
            Topic(
                id = "phys_quantum",
                subjectId = "physics",
                name = "Quantum Mechanics",
                description = "Wave-particle duality, Schrödinger equation, bound states, operators, and uncertainty principle.",
                textbookChapter = "Griffiths QM Ch. 1-3",
                standardPages = "pp. 1-110",
                questions = quantumQuestions
            )
        )

        return Subject(
            id = "physics",
            name = "Physics",
            code = "PHYS401",
            iconName = "Bolt",
            primaryColor = 0xFF512DA8,
            secondaryColor = 0xFF7E57C2,
            standardTextbook = textbook,
            theoryMarks = "Theory: 100 Marks (Paper 1 Mechanics & Electrodynamics: 50, Paper 2 Quantum & Thermal: 50)",
            practicalMarks = "Experimental Laboratory Physics: 50 Marks",
            vivaMarks = "Comprehensive Viva: 25 Marks",
            syllabusOverview = "Core physical sciences covering Lagrangian Mechanics, Maxwell's Field Equations, Quantum Wave Mechanics, and Thermodynamics.",
            marksDistributionDetails = listOf(
                "Part I: Mathematical derivations of fundamental laws (2 × 10 Marks)",
                "Part II: Problem solving and boundary value solutions (4 × 8 Marks)",
                "Part III: Short conceptual physics reasoning (4 × 4 Marks)"
            ),
            topics = topics
        )
    }

    fun getComputerScienceSubject(): Subject {
        val textbook = TextbookInfo(
            title = "Introduction to Algorithms & Operating System Concepts",
            authors = "Cormen, Leiserson, Rivest, Stein (CLRS) & Silberschatz, Galvin, Gagne",
            edition = "4th & 10th Edition",
            publisher = "MIT Press & John Wiley & Sons",
            primarySubject = "Computer Science",
            description = "The authoritative university computer science textbooks for algorithm design, complexity analysis, and modern operating system kernels.",
            referenceUrl = "https://ocw.mit.edu/courses/electrical-engineering-and-computer-science/",
            officialGuidelinesUrl = "https://www.acm.org/education/curricula-recommendations",
            keyChapters = listOf(
                "Divide-and-Conquer & Master Theorem",
                "Dynamic Programming & Greedy Algorithms",
                "Process Synchronization & Semaphores",
                "Deadlocks & Banker's Algorithm",
                "Virtual Memory & Page Replacement"
            )
        )

        val dsaQuestions = listOf(
            Question(
                id = "cs_dsa_01",
                subjectId = "computer_science",
                topicId = "cs_algorithms",
                topicName = "Data Structures & Algorithms",
                text = "Explain the Dynamic Programming approach to solve the 0/1 Knapsack Problem. Write down the recurrence relation, state the algorithm, analyze its time and space complexity, and trace it for weights = [2, 3, 4, 5], values = [3, 4, 5, 8], and Capacity W = 8.",
                years = listOf("2024", "2022", "2020", "2018"),
                type = QuestionType.LONG_ESSAY,
                marksBreakdown = "3 + 4 + 3 = 10 Marks",
                textbookRef = "CLRS Algorithms (4th Ed)",
                pageNumbers = "415-425",
                highYieldPoints = listOf(
                    "Recurrence: K(i, w) = K(i-1, w) if w_i > w; else max(K(i-1, w), K(i-1, w - w_i) + v_i)",
                    "Time complexity: O(n × W) (pseudo-polynomial), Space complexity: O(n × W) or O(W)",
                    "Backtracking allows recovery of exact items included in the optimal set"
                ),
                referenceLinks = listOf(
                    ReferenceLink("MIT Introduction to Algorithms", "https://ocw.mit.edu/courses/6-006-introduction-to-algorithms-spring-2020/", "Course")
                ),
                isRepeatQuestion = true
            ),
            Question(
                id = "cs_dsa_02",
                subjectId = "computer_science",
                topicId = "cs_algorithms",
                topicName = "Data Structures & Algorithms",
                text = "State and prove the Master Theorem for divide-and-conquer recurrences of the form T(n) = a T(n/b) + f(n). Solve T(n) = 3 T(n/4) + n log n using the Master Theorem.",
                years = listOf("2025", "2021", "2017"),
                type = QuestionType.SHORT_ESSAY,
                marksBreakdown = "4 + 4 = 8 Marks",
                textbookRef = "CLRS Algorithms (4th Ed)",
                pageNumbers = "101-108",
                highYieldPoints = listOf(
                    "Case 1: If f(n) = O(n^(log_b(a) - ε)), T(n) = Θ(n^(log_b a))",
                    "Case 2: If f(n) = Θ(n^(log_b a) log^k n), T(n) = Θ(n^(log_b a) log^(k+1) n)",
                    "Case 3: If f(n) = Ω(n^(log_b(a) + ε)), T(n) = Θ(f(n))",
                    "For T(n) = 3T(n/4) + n log n: a = 3, b = 4 => n^(log_4 3) ≈ n^0.793 < n log n => Case 3 gives T(n) = Θ(n log n)"
                ),
                referenceLinks = emptyList()
            ),
            Question(
                id = "cs_dsa_03",
                subjectId = "computer_science",
                topicId = "cs_algorithms",
                topicName = "Data Structures & Algorithms",
                text = "Describe Dijkstra's algorithm for Single-Source Shortest Paths on weighted directed graphs with non-negative edge weights. Explain why it fails for negative edge weights and prove its time complexity using a Fibonacci Heap vs Binary Min-Heap.",
                years = listOf("2024", "2021", "2019"),
                type = QuestionType.LONG_ESSAY,
                marksBreakdown = "4 + 3 + 3 = 10 Marks",
                textbookRef = "CLRS Algorithms (4th Ed)",
                pageNumbers = "585-594",
                highYieldPoints = listOf(
                    "Greedy strategy: maintains set of vertices S whose final shortest-path weights have been determined",
                    "Fails with negative edges because once a vertex is added to S, its distance is assumed final, which may be violated by later negative cycles/edges",
                    "Binary Min-Heap time complexity: O((V + E) log V)",
                    "Fibonacci Heap time complexity: O(E + V log V) due to amortized O(1) decrease-key"
                ),
                referenceLinks = emptyList(),
                isRepeatQuestion = true
            )
        )

        val osQuestions = listOf(
            Question(
                id = "cs_os_01",
                subjectId = "computer_science",
                topicId = "cs_operating_systems",
                topicName = "Operating Systems",
                text = "What is the Critical Section problem? State the three requirements for a valid solution. Describe Peterson's algorithm for two processes and prove that it satisfies Mutual Exclusion, Progress, and Bounded Waiting.",
                years = listOf("2024", "2021", "2019", "2016"),
                type = QuestionType.LONG_ESSAY,
                marksBreakdown = "3 + 7 = 10 Marks",
                textbookRef = "Silberschatz OS Concepts (10th Ed)",
                pageNumbers = "257-268",
                highYieldPoints = listOf(
                    "3 criteria: Mutual Exclusion, Progress, Bounded Waiting",
                    "Peterson's variables: boolean flag[2], int turn",
                    "Entry: flag[i] = true; turn = j; while (flag[j] && turn == j);",
                    "Exit: flag[i] = false;",
                    "Guarantees atomicity and eliminates starvation for two processes"
                ),
                referenceLinks = listOf(
                    ReferenceLink("Silberschatz OS Resources", "https://codex.cs.yale.edu/avi/os-book/OS10/index.html", "Textbook")
                ),
                isRepeatQuestion = true
            ),
            Question(
                id = "cs_os_02",
                subjectId = "computer_science",
                topicId = "cs_operating_systems",
                topicName = "Operating Systems",
                text = "Explain Banker's Algorithm for deadlock avoidance in multi-resource systems. Given Allocation, Max, and Available matrices, describe how the Safety Algorithm determines if a state is safe.",
                years = listOf("2025", "2023", "2020"),
                type = QuestionType.SHORT_ESSAY,
                marksBreakdown = "3 + 5 = 8 Marks",
                textbookRef = "Silberschatz OS Concepts (10th Ed)",
                pageNumbers = "332-342",
                highYieldPoints = listOf(
                    "Need matrix = Max - Allocation",
                    "Work = Available, Finish[i] = false for all i",
                    "Find process i with Finish[i] == false and Need_i ≤ Work",
                    "Work = Work + Allocation_i, Finish[i] = true",
                    "If all Finish[i] == true, system is in a Safe State"
                ),
                referenceLinks = emptyList()
            ),
            Question(
                id = "cs_os_03",
                subjectId = "computer_science",
                topicId = "cs_operating_systems",
                topicName = "Operating Systems",
                text = "Explain Virtual Memory paging and the concept of Page Faults. Compare FIFO, Optimal, and LRU Page Replacement algorithms. What is Belady's Anomaly and which algorithms are immune to it?",
                years = listOf("2024", "2022", "2018"),
                type = QuestionType.LONG_ESSAY,
                marksBreakdown = "3 + 5 + 2 = 10 Marks",
                textbookRef = "Silberschatz OS Concepts (10th Ed)",
                pageNumbers = "395-412",
                highYieldPoints = listOf(
                    "Page fault occurs when referenced page is marked invalid in the Page Table (not in physical RAM)",
                    "Operating system traps to kernel, selects victim frame, writes dirty page to swap, reads requested page into frame, updates page table",
                    "Belady's Anomaly: increasing the number of page frames causes an INCREASE in the number of page faults (demonstrated in FIFO)",
                    "Stack algorithms (such as LRU and Optimal) are mathematically immune to Belady's Anomaly because the set of pages in memory for n frames is always a subset of pages for n+1 frames"
                ),
                referenceLinks = emptyList(),
                isRepeatQuestion = true
            )
        )

        val networksQuestions = listOf(
            Question(
                id = "cs_cn_01",
                subjectId = "computer_science",
                topicId = "cs_networks",
                topicName = "Computer Networks",
                text = "Explain the TCP 3-Way Handshake connection establishment and 4-Way termination process. Describe the purpose of SYN cookies against SYN flooding denial of service attacks.",
                years = listOf("2024", "2022", "2018"),
                type = QuestionType.LONG_ESSAY,
                marksBreakdown = "5 + 5 = 10 Marks",
                textbookRef = "Kurose & Ross Networking (8th Ed)",
                pageNumbers = "240-255",
                highYieldPoints = listOf(
                    "Step 1: Client sends SYN with ISN_c",
                    "Step 2: Server responds with SYN-ACK, ISN_s, and ACK = ISN_c + 1",
                    "Step 3: Client sends ACK = ISN_s + 1, connection ESTABLISHED",
                    "Termination: FIN -> ACK -> FIN -> ACK with TIME_WAIT state",
                    "SYN Cookies: Encodes client connection state into initial sequence number without storing half-open state in server RAM"
                ),
                referenceLinks = emptyList(),
                isRepeatQuestion = true
            ),
            Question(
                id = "cs_cn_02",
                subjectId = "computer_science",
                topicId = "cs_networks",
                topicName = "Computer Networks",
                text = "Explain Classless Inter-Domain Routing (CIDR) and Subnetting. An organization is granted the block 198.51.100.0/24. Divide this into 4 equal subnets. For each subnet, find the Network Address, Subnet Mask, First Usable Host, Last Usable Host, and Broadcast Address.",
                years = listOf("2025", "2023", "2019"),
                type = QuestionType.SHORT_ESSAY,
                marksBreakdown = "3 + 5 = 8 Marks",
                textbookRef = "Kurose & Ross Networking (8th Ed)",
                pageNumbers = "340-352",
                highYieldPoints = listOf(
                    "To create 4 subnets, borrow 2 bits: prefix length becomes /26 (24 + 2 = 26)",
                    "Subnet mask: 255.255.255.192. Block size = 256 / 4 = 64 addresses (62 usable hosts per subnet)",
                    "Subnet 1: Net: 198.51.100.0/26, Range: .1 to .62, Broadcast: .63",
                    "Subnet 2: Net: 198.51.100.64/26, Range: .65 to .126, Broadcast: .127",
                    "Subnet 3: Net: 198.51.100.128/26, Range: .129 to .190, Broadcast: .191",
                    "Subnet 4: Net: 198.51.100.192/26, Range: .193 to .254, Broadcast: .255"
                ),
                referenceLinks = emptyList()
            )
        )

        val topics = listOf(
            Topic(
                id = "cs_algorithms",
                subjectId = "computer_science",
                name = "Algorithms & Complexity",
                description = "Dynamic Programming, Divide & Conquer, Graph Algorithms (Dijkstra, Bellman-Ford), and NP-Completeness.",
                textbookChapter = "CLRS Ch. 4, 15, 16, 24",
                standardPages = "pp. 100-680",
                questions = dsaQuestions
            ),
            Topic(
                id = "cs_operating_systems",
                subjectId = "computer_science",
                name = "Operating Systems",
                description = "Processes, Threads, CPU Scheduling, Synchronization, Deadlocks, Virtual Memory, and File Systems.",
                textbookChapter = "Silberschatz Ch. 5-10",
                standardPages = "pp. 200-450",
                questions = osQuestions
            ),
            Topic(
                id = "cs_networks",
                subjectId = "computer_science",
                name = "Computer Networks",
                description = "TCP/IP Layering, Routing Algorithms, Congestion Control, and Network Security.",
                textbookChapter = "Kurose & Ross Ch. 3-5",
                standardPages = "pp. 200-480",
                questions = networksQuestions
            )
        )

        return Subject(
            id = "computer_science",
            name = "Computer Science",
            code = "CS401",
            iconName = "Terminal",
            primaryColor = 0xFF00796B,
            secondaryColor = 0xFF26A69A,
            standardTextbook = textbook,
            theoryMarks = "Theory: 100 Marks (Paper 1 Algorithms & Systems: 50, Paper 2 Networks & Architecture: 50)",
            practicalMarks = "Coding & System Programming Lab: 50 Marks",
            vivaMarks = "Technical Viva Voce: 25 Marks",
            syllabusOverview = "Advanced computer science fundamentals covering Algorithm Design & Analysis, Operating Systems, Concurrency, and Computer Networking.",
            marksDistributionDetails = listOf(
                "Part A: Algorithm Proofs and Complexity Derivations (2 × 10 Marks)",
                "Part B: Systems Design and Concurrency Synchronization (4 × 8 Marks)",
                "Part C: Network Protocols and Architectural Reasoning (4 × 4 Marks)"
            ),
            topics = topics
        )
    }
}
